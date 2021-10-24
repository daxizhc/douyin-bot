package com.haochen.douyinbot;

import java.io.IOException;

import com.haochen.douyinbot.command.Command;
import com.haochen.douyinbot.command.HomeCommand;
import com.haochen.douyinbot.command.OpenAppCommand;
import com.haochen.douyinbot.command.SlideCommand;

public class DouyinBotApplication {

    public static void main(String[] args) throws IOException {
        Phone testPhone = new Phone("PNXGAM48A1101329");

//        Command homeCommand = new HomeCommand(testPhone);
//        homeCommand.execute();
//        sleep(3000);

//        Command openDouyinCommend = new OpenAppCommand(testPhone, "com.ss.android.ugc.aweme/.splash.SplashActivity");
//        openDouyinCommend.execute();
        sleep(3000);

        while (true) {
            SlideCommand slideCommand = new SlideCommand(testPhone, 100, 1120, 800, 1120);
            slideCommand.execute();
            sleep(500);
        }

    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
