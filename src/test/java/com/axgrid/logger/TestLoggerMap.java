package com.axgrid.logger;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

@Slf4j
public class TestLoggerMap {

    @Test
    public void testObject() {
        AxLoggerTestObjectClass lc = new AxLoggerTestObjectClass();
        Map<String, Object> map = lc.getLoggerMap();
        Assert.assertNotNull(map);
        Assert.assertFalse(map.containsKey("password"));
        Assert.assertTrue(map.containsKey("id"));
        log.info("MAP:{}", map);
    }
}
