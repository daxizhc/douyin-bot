package com.haochen.douyinbot;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Phone {

    private static final String adbBin;

    static {
        Properties properties = new Properties();
        URL url = DouyinBotApplication.class.getClassLoader()
                .getResource("application.properties");
        if(url == null) {
            throw new RuntimeException("can't find application.properties");
        }
        try {
            properties.load(new FileInputStream(url.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        adbBin = properties.getProperty("douyinbot.adb.bin");
        //        Runtime.getRuntime().exec(adbBin + "-s PNXGAM48A1101329 shell input keyevent 64");
        //        Runtime.getRuntime().exec(adbBin + " devices");
    }

    private String name;

    Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void home() {
        try {
            Runtime.getRuntime().exec(adbBin + " -s " + this.name + " shell input keyevent 3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finish home");
    }

    public void openApp(String appActivity) {
        try {
            Runtime.getRuntime().exec(adbBin + " -s " + this.name + " shell am start -n " + appActivity);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finish openApp");
    }

    public void slide(int startX, int startY, int endX, int endY) {
        try {
            Runtime.getRuntime().exec(adbBin + " -s " + this.name + " shell input swipe " +
                    startX + " " + startY + " " + endX + " " + endY);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------------下一条--------------------");
    }

}
