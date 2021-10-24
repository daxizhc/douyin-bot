package com.haochen.douyinbot.command;

import com.haochen.douyinbot.Phone;

public class SlideCommand implements Command {

    private Phone phone;

    int startX, startY, endX, endY;

    public SlideCommand(Phone phone, int startX, int startY, int endX, int endY) {
        this.phone = phone;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void execute() {
        phone.slide(startX, startY, endX, endY);
    }

}
