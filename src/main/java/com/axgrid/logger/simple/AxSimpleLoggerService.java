package com.axgrid.logger.simple;

import com.axgrid.logger.dto.IAxLoggerObject;
import com.axgrid.logger.service.AxLoggerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AxSimpleLoggerService extends AxLoggerService {

    @Override
    public void log(String logger, Collection<IAxLoggerObject> loggerObjects, String message, Throwable throwable) {
        ObjectMapper m = new ObjectMapper();
        Map<String, Map<String, Object>> logResult = loggerObjects.stream().collect(Collectors.toMap(IAxLoggerObject::getLoggerName, IAxLoggerObject::getLoggerMap));
        try {
            if (throwable == null)
                log.info("{}:{}\n{}",logger, message, m.writerWithDefaultPrettyPrinter().writeValueAsString(logResult));
            else
                log.error("{}:{}\n{}",logger, message, m.writerWithDefaultPrettyPrinter().writeValueAsString(logResult), throwable);
        }catch (JsonProcessingException e) {
            log.warn(logger+": JsonProcessingException: "+ e.getMessage());
        }
    }
}
