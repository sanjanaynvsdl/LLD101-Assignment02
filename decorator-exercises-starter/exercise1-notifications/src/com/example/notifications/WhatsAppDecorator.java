package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {

    private int num;

    public WhatsAppDecorator(Notifier notifier, int num) {
       super(notifier);
        this.num = num;
    }

    @Override
    public void notify(String text) {
        super.notifier.notify(text);
        System.out.println("[WHATSAPP] Notification Sent to " + num + "with text " + text);

    }

}
