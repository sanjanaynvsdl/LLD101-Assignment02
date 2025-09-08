package com.example.notifications;


public class SMSDecorator extends NotifierDecorator {

    private int num;

    public SMSDecorator(Notifier notifier, int num) {
        super(notifier);
        this.num = num;
    }

    @Override
    public void notify(String text) {
        System.out.println("----notify in the sms called!");
        super.notifier.notify(text);
        /// SmS
        System.out.println("[SMS] sent with to " + num + " with text : " + text);
    }
}
