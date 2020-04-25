package com.axgrid.logger.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public abstract class AxLoggerObject implements IAxLoggerObject {
    final static ObjectMapper oMapper = new ObjectMapper();

    @JsonIgnore
    public Map<String, Object> getLoggerMap() {
        return oMapper.convertValue(this, new TypeReference<Map<String, Object>>() {});
    }
}
