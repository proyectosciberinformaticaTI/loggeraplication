package com.example.demo.service;

import com.example.demo.exception.ConfigurationException;
import com.example.demo.exception.NotFoundException;

import java.io.IOException;
import java.sql.SQLException;

public interface IloggerService {
    boolean isInfoEnabled();

    void info(String message);

    boolean isWarnEnabled();

    void warn(String message);

    boolean isErrorEnabled();

    void error(String message);

    void logMessage(String messageText, Boolean message, Boolean warning, Boolean error)
            throws NotFoundException, ConfigurationException, SQLException, IOException;

}
