package com.kafka.demo.service;

import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * Created by chargerlink on 2017/1/5.
 */
public class ObjectDeserializer implements Deserializer<Object> {
    public void configure(Map<String, ?> map, boolean b) {

    }

    public Object deserialize(String s, byte[] bytes) {
        return SerializeUtils.deserialize(bytes);
    }

    public void close() {

    }
}
