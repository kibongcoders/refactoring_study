package com.kibong.refactoring_study.alternative_class_with_different_interfaces;

public class NotificationAlertService implements NotificationService{
    private AlertService alertService;
    public void sendNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle());
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);
    }
}
