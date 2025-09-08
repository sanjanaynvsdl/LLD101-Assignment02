package com.example.notifications;

public class SlackDecorator extends NotifierDecorator{
    NotifierDecorator notifierDecorator;
    private String channel;

    public SlackDecorator(NotifierDecorator notifierDecorator, String channel) {
        this.NotifierDecorator=notifierDecorator;
        this.channel=channel;
    }

    @Override
    public void notify(String text) {
        this.notifierDecorator.notify(text);
        System.out.println("[SLACK] notification sent to "+this.channel+" with : "+text);
    }
    
}
