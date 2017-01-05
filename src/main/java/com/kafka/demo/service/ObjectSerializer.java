package com.kafka.demo.service;

import org.apache.kafka.common.serialization.Serializer;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by chargerlink on 2017/1/5.
 */
public class ObjectSerializer implements Serializer<Object> {

    public void configure(Map<String, ?> map, boolean b) {

    }

    public byte[] serialize(String s, Object o) {
        return SerializeUtils.serialize(o);
    }

    public void close() {

    }
}
