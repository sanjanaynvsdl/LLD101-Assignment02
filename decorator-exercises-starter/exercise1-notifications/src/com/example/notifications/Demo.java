package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // === YOUR TASKS ===
        // 1) Create a base decorator class: NotifierDecorator implements Notifier and
        // wraps another Notifier.
        // 2) Create concrete decorators:
        // - SmsDecorator (adds SMS send)
        // - WhatsAppDecorator (adds WhatsApp send)
        // - SlackDecorator (adds Slack send)
        // 3) Compose at runtime to achieve these combinations:
        // a) Email + SMS
        // b) Email + WhatsApp
        // c) Email + Slack
        // d) Email + WhatsApp + Slack
        //
        // Example (after you implement):
        // Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        // smsAndEmail.notify("Build green ✅");
        //
        // Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"),
        // "deployments");
        // full.notify("Deployment completed 🚀");

        // Email + SMS
        // - Email + WhatsApp
        // - Email + Slack
        // - Email + WhatsApp + Slack

        // Email+SMS
        System.out.println("-------------Email+SMS-----------------");
        Notifier smsNotifier = new EmailNotifier("sanju@gmail.com");
        smsNotifier = new SMSDecorator(smsNotifier, 98867);
        smsNotifier.notify("Thankyou for shopping <3");

        // Email+WhatsAPp
        System.out.println("--------------------Email+WhatsApp---------------");
        Notifier whatsAPpNotifier = new EmailNotifier("sanju@gmail.com");
        whatsAPpNotifier = new WhatsAppDecorator(whatsAPpNotifier, 78160);
        whatsAPpNotifier.notify("keep Shopping!");

        // EMail+Slack+
        System.out.println("----------------------Email+Slack-------------------------------");
        Notifier slackNotifier = new EmailNotifier("sanju@gmail.com");
        slackNotifier = new SlackDecorator(slackNotifier, "sst-assignments");
        slackNotifier.notify("your feedback is valuable!");

        System.out.println("-------------------------Email+Slack+WhatsApp------------------------");
        // Email+slack+WhatsApp
        Notifier threeNotifiers = new EmailNotifier("sanju@gmail.com");
        threeNotifiers = new SlackDecorator(threeNotifiers, "sst-assignments");
        threeNotifiers = new WhatsAppDecorator(threeNotifiers, 7816071);
        threeNotifiers.notify("testing!");

    }
}
