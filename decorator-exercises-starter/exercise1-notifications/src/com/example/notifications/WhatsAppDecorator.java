package com.example.notifications;

public class WhatsAppDecorator extends EmailNotifier  {

    NotifierDecorator notifierDecorator;
    private int num;

    public WhatsAppDecorator(NotifierDecorator notifierDecorator, int num) {
        this.emailNotifier=notifierDecorator;
        this.num=num;
    }


    @Override 
    public void notify(String text) {
        this.notifierDecorator.notify(text);
        System.out.println("[WHATSAPP] Notification Sent to "+num+ "with text "+text);

    }
    
}
