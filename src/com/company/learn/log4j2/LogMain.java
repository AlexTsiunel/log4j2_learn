package com.company.learn.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {
    static Logger logger = LogManager.getLogger("FileZip");

    public static void main(String[] args) {
        logger.info("info first prg");
        logger.log(Level.WARN, "Watning ! Loggers !");

        try {
            throw new RuntimeException("Exception runtime");
        } catch (RuntimeException e) {
            logger.log(Level.ERROR, "first runtime", e);
        }
    }
}
