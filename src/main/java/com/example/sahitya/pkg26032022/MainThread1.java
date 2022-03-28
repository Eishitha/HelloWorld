package com.example.sahitya.pkg26032022;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainThread1 implements Runnable {
    private static final Logger logger = LogManager.getLogger(MainThread.class);

    public static void main(String[] args) {
        MainThread1 obj = new MainThread1();
        Thread thread = new Thread(obj, "Sahitya-Thread");
        thread.start();
        //System.out.println("code is outside of the thread");git
        logger.info("code is outside of the thread");
    }

    public void run() {
        logger.info(" code is running in a thread");
    }
}



