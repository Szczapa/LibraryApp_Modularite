package com.emailNotification;

import com.notificationService.NotificationService;

public class EmailNotification {
    private  final NotificationService notificationService = new NotificationService();
    public void sendEmail(String message) {
        notificationService.sendNotification("email", message);
    }
}
