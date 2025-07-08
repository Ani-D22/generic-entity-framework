package com.generic.entity.framework.service.utils;

import jakarta.persistence.Id;

import java.lang.reflect.Field;

public class EntityUtils {

    public static Field getIdField(Class<?> clazz) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException("No @Id field found in " + clazz);
    }

    public static Object getIdValue(Object entity) {
        try {
            Field idField = getIdField(entity.getClass());
            return idField.get(entity);
        } catch (Exception e) {
            throw new RuntimeException("Could not read @Id value", e);
        }
    }

    public static void setIdValue(Object entity, Object value) {
        try {
            Field idField = getIdField(entity.getClass());
            idField.set(entity, value);
        } catch (Exception e) {
            throw new RuntimeException("Could not set @Id value", e);
        }
    }
}
