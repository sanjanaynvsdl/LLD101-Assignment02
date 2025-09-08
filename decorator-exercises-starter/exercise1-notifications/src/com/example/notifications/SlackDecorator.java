package com.example.notifications;

public class SlackDecorator extends NotifierDecorator{
    private String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel=channel;
    }

    @Override
    public void notify(String text) {
        super.notifier.notify(text);
        System.out.println("[SLACK] notification sent to "+this.channel+" with : "+text);
    }
    
}
