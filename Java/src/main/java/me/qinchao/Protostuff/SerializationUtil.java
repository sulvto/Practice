package me.qinchao.Protostuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sulvto on 16-5-12.
 */
public class SerializationUtil {
    private final static Map<Class, Schema> schemaMap = new ConcurrentHashMap<>();

    public static <T> byte[] serialize(T t) {
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        Schema schema = getSchema(t.getClass());
        try {
            return ProtostuffIOUtil.toByteArray(t, schema, buffer);
        } finally {
            buffer.clear();
        }
    }

    public static <T> T deserialize(byte[] bytes, Class<T> aClass) {
        Schema<T> schema = getSchema(aClass);
        T message = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(bytes, message, schema);
        return message;
    }


    private static <T> Schema<T> getSchema(Class<T> typeClass) {
        if (schemaMap.containsKey(typeClass)) {
            return schemaMap.get(typeClass);
        } else {
            RuntimeSchema<T> from = RuntimeSchema.createFrom(typeClass);
            schemaMap.put(typeClass, from);
            return from;
        }
    }
}
