package com.axgrid.logger.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public interface IAxLoggerObject {

    @JsonIgnore
    String getLoggerName();
    Map<String, Object> getLoggerMap();
}
