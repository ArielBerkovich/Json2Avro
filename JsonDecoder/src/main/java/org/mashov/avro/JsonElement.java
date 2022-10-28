package org.mashov.avro;

import com.fasterxml.jackson.core.JsonToken;

public class JsonElement {
    public static final JsonElement NULL_JSON_ELEMENT = new JsonElement(null);

    public final JsonToken token;
    public final String value;

    public JsonElement(JsonToken t, String value) {
        this.token = t;
        this.value = value;
    }

    public JsonElement(JsonToken t) {
        this(t, null);
    }
}
