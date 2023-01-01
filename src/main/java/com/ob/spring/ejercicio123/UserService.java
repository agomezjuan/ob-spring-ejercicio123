package com.ob.spring.ejercicio123;

public class UserService {
    private NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification() {
        notificationService.sendNotification();
    }
}
