package com.generic.entity.framework.dto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

public class GenericMapper {

    // PATCH: Apply fields map from DTO to existing entity instance
    public static <T> void patchEntity(GenericDTO<T> dto, T entity) {
        Map<String, Object> fields = dto.getFields();
        Class<?> clazz = entity.getClass();
        for (Map.Entry<String, Object> entry : fields.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(entity, entry.getValue());
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException("Failed to patch field: " + entry.getKey(), e);
            }
        }
    }

    // Converts DTO to Entity using reflection
    public static <T> T toEntity(GenericDTO<T> dto, Class<T> entityClass) {
        try {
            T entity = entityClass.getDeclaredConstructor().newInstance();

            Field[] dtoFields = dto.getClass().getDeclaredFields();
            for (Field dtoField : dtoFields) {
                if (Modifier.isStatic(dtoField.getModifiers()) || Modifier.isTransient(dtoField.getModifiers())) continue;

                dtoField.setAccessible(true);
                Object value = dtoField.get(dto);

                // Skip embedded DTO fields
                if (value != null && GenericDTO.class.isAssignableFrom(dtoField.getType())) continue;

                try {
                    Field entityField = entityClass.getDeclaredField(dtoField.getName());
                    entityField.setAccessible(true);
                    entityField.set(entity, value);
                } catch (NoSuchFieldException ignored) {
                    System.out.println("Failed to patch field: " + dtoField.getName() + "/tNo such field exists!");
                    // If entity does not have this field, skip
                }
            }

            return entity;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert DTO to Entity", e);
        }
    }

    // Converts Entity to DTO using reflection
    public static <T, D extends GenericDTO<T>> D toDto(T entity, Class<D> dtoClass) {
        try {
            Constructor<D> constructor = dtoClass.getDeclaredConstructor();
            D dto = constructor.newInstance();

            Field[] entityFields = entity.getClass().getDeclaredFields();
            for (Field entityField : entityFields) {
                if (Modifier.isStatic(entityField.getModifiers()) || Modifier.isTransient(entityField.getModifiers())) continue;

                entityField.setAccessible(true);
                Object value = entityField.get(entity);

                try {
                    Field dtoField = dtoClass.getDeclaredField(entityField.getName());

                    // Skip embedded DTOs (handled separately)
                    if (GenericDTO.class.isAssignableFrom(dtoField.getType())) continue;

                    dtoField.setAccessible(true);
                    dtoField.set(dto, value);
                } catch (NoSuchFieldException e) {
                    dto.set(entityField.getName(), value); // fallback to map
                }
            }

            return dto;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Entity to DTO", e);
        }
    }
}
