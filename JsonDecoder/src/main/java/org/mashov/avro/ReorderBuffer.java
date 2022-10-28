package org.mashov.avro;

import com.fasterxml.jackson.core.JsonParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderBuffer {
    public final Map<String, List<JsonElement>> savedFields = new HashMap<>();
    public JsonParser origParser = null;
}
