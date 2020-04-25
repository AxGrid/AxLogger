package com.axgrid.logger.service;

import com.axgrid.logger.dto.IAxLoggerObject;

import java.util.Collection;
import java.util.Collections;

public abstract class AxLoggerService {
    public void log(String logger, IAxLoggerObject loggerObject) { this.log(logger, Collections.singletonList(loggerObject), null, null); }
    public void log(String logger, Collection<IAxLoggerObject> loggerObjects, String message) { this.log(logger, loggerObjects, null, null); }
    public abstract void log(String logger, Collection<IAxLoggerObject> loggerObjects, String message, Throwable throwable);
}
