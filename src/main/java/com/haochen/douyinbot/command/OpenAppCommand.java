package com.haochen.douyinbot.command;

import com.haochen.douyinbot.Phone;

public class OpenAppCommand implements Command {

    private Phone phone;

    private String appActivity;

    public OpenAppCommand(Phone phone, String appActivity) {
        this.phone = phone;
        this.appActivity = appActivity;
    }

    public void execute() {
        phone.openApp(appActivity);
    }
}
