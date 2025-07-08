package com.aniket.genericentitydemo.dto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Map;

public class GenericMapper {

    public static <T> void patchEntity(GenericDTO<T> dto, T entity) {
        Map<String, Object> fields = dto.getFields();
        Class<?> clazz = entity.getClass();
        for (Map.Entry<String, Object> entry : fields.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(entity, entry.getValue());
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException("Failed to set field: " + entry.getKey(), e);
            }
        }
    }

    public static <T> T toEntity(GenericDTO<T> dto, Class<T> entityClass) {
        try {
            T entity = entityClass.getDeclaredConstructor().newInstance();
            Field[] dtoFields = dto.getClass().getDeclaredFields();

            for (Field dtoField : dtoFields) {
                dtoField.setAccessible(true);
                Object value = dtoField.get(dto);

                if (value != null && GenericDTO.class.isAssignableFrom(dtoField.getType())) {
                    continue;
                }

                try {
                    Field entityField = entityClass.getDeclaredField(dtoField.getName());
                    entityField.setAccessible(true);
                    entityField.set(entity, value);
                } catch (NoSuchFieldException ignored) {
                    // If the entity doesn't have the field, ignore
                }
            }

            return entity;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert DTO to entity", e);
        }
    }

    public static <T> GenericDTO<T> toDto(T entity, Class<? extends GenericDTO<T>> dtoClass) {
        try {
            Constructor<? extends GenericDTO<T>> constructor = dtoClass.getDeclaredConstructor();
            GenericDTO<T> dto = constructor.newInstance();

            Field[] entityFields = entity.getClass().getDeclaredFields();
            for (Field entityField : entityFields) {
                entityField.setAccessible(true);
                Object value = entityField.get(entity);

                try {
                    Field dtoField = dto.getClass().getDeclaredField(entityField.getName());

                    if (GenericDTO.class.isAssignableFrom(dtoField.getType())) {
                        // Skip embedded DTO fields
                        continue;
                    }

                    dtoField.setAccessible(true);
                    dtoField.set(dto, value);
                } catch (NoSuchFieldException e) {
                    dto.set(entityField.getName(), value); // fallback to fields map
                }
            }

            return dto;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert entity to DTO", e);
        }
    }
}
