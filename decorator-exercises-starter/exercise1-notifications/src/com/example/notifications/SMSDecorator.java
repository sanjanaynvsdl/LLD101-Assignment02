package com.example.notifications;

public class SMSDecorator extends NotifierDecorator{
    NotifierDecorator notifierDecorator;

    private int num;
    public SMSDecorator(NotifierDecorator notifierDecorator, int num) {
        this.emailNotifier=notifierDecorator;
        this.num=num;
    }

    @Override
    public void notify(String text) {
        this.notifierDecorator.notify(text);
        ///SmS
        System.out.println("[SMS] sent with to "+num+" with text : "+text);
    }
}
