package com.axgrid.logger;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AxSimpleLoggerConfiguration.class})
public @interface EnableAxSimpleLogger {
}
