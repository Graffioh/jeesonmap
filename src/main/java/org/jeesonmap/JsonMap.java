package org.jeesonmap;

import java.util.HashMap;
import java.util.Map;

public class JsonMap extends HashMap<String, Object> {
    public JsonMap() {
        super();
    }

    public JsonMap(Map<String, Object> map) {
        super(map);
    }
}

