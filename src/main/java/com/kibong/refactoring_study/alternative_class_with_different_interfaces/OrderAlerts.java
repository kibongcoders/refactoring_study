package com.kibong.refactoring_study.alternative_class_with_different_interfaces;

public class OrderAlerts {

    private NotificationService notificationService;

    public OrderAlerts(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void alertShipped(Order order) {
        Notification notification = Notification.newNotification(order.toString() + " is shipped").receiver(order.getEmail());
        sendNotification(notification);
    }

    private void sendNotification(Notification notification) {
        notificationService.sendNotification(notification);
    }
}
