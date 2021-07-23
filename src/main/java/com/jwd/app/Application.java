package com.jwd.app;

import  com.jwd.math.BasicMath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application{

    private final static Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args){
        LOG.trace("Program start");
        if (args.length!=3) {
            LOG.error("Not enough arguments");
            System.exit(-1);
        }
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int operation = Integer.valueOf(args[2]);
        int result;
        switch (operation) {
            case 1:
                result = BasicMath.add(a, b);
                LOG.info("Result is {}", result);
                break;
            case 2:
                result = BasicMath.substract(a, b);
                LOG.info("Result is {}", result);
                break;
            default:
                LOG.info("Incorrect argument, no such operation");
                break;
        }
        LOG.trace("Program end");
    }
}