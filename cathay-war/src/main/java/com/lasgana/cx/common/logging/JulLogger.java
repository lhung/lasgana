package com.lasgana.cx.common.logging;

import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ch594u on 8/30/14.
 */
@Component
public class JulLogger implements LogInterface {

    private final static Logger LOGGER = Logger.getLogger(JulLogger.class.getName());

    public void debug(String message) {
        LOGGER.log(Level.FINE, message);
    }

    public void info(String message) {
        LOGGER.log(Level.INFO, message);
    }

    public void warn(String message) {
        LOGGER.log(Level.WARNING, message);
    }

    public void error(String message) {
        LOGGER.log(Level.SEVERE, message);
    }

    public void error(String message, Throwable e) {
        LOGGER.log(Level.SEVERE, message, e);
    }
}
