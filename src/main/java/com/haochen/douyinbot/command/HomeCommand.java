package com.haochen.douyinbot.command;

import com.haochen.douyinbot.Phone;

public class HomeCommand implements Command {

    private Phone phone;

    public HomeCommand(Phone phone) {
        this.phone = phone;
    }

    public void execute() {
        phone.home();
    }

}
