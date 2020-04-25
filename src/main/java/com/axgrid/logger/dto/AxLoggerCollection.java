package com.axgrid.logger.dto;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

public class AxLoggerCollection extends ArrayList<IAxLoggerObject> {

    public AxLoggerCollection(IAxLoggerObject o1) {
        this.add(o1);
    }

    public AxLoggerCollection(IAxLoggerObject o1, IAxLoggerObject o2) {
        this(o1);
        this.add(o2);
    }

    public AxLoggerCollection(IAxLoggerObject o1, IAxLoggerObject o2, IAxLoggerObject o3) {
        this(o1,o2);
        this.add(o3);
    }

    public AxLoggerCollection(IAxLoggerObject o1, IAxLoggerObject o2, IAxLoggerObject o3, IAxLoggerObject o4) {
        this(o1,o2,o3);
        this.add(o4);
    }

    public AxLoggerCollection(IAxLoggerObject o1, IAxLoggerObject o2, IAxLoggerObject o3, IAxLoggerObject o4, IAxLoggerObject o5) {
        this(o1,o2,o3,o4);
        this.add(o5);
    }
}
