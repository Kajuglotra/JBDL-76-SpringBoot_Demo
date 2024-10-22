package org.gfg.JBDL_76_Spring_boot_demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Temp {

    private static final Log logger = LogFactory.getLog(Temp.class);

    public static void temp(){
        logger.warn("warning ...");
        logger.debug("debuging...");
        logger.info("info ... ");
        logger.error("error ...");
        logger.trace("tracing ...");

    }
}
