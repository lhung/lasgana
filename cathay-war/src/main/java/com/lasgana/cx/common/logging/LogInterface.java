package com.lasgana.cx.common.logging;

/**
 * Created by ch594u on 8/30/14.
 *
 * This interface is created to make it easy for the application to switch to
 * other better logging mechanism than the default JUL.
 */
public interface LogInterface {

    public void debug(String message);
    public void info(String message);
    public void warn(String message);
    public void error(String message);
    public void error(String message, Throwable e);
}
