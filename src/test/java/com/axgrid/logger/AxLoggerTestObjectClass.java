package com.axgrid.logger;

import com.axgrid.logger.dto.AxLoggerObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class AxLoggerTestObjectClass extends AxLoggerObject {

    long id;
    String firstName = "unnamed";
    String lastName = "unnamed";

    @JsonIgnore
    String password = "secret";


    @Override
    public String getLoggerName() {
        return "TestObject";
    }
}
