package com.example.notifications;

public abstract class NotifierDecorator implements Notifier{

    @Override
    public abstract void notify(String text);


    
}
