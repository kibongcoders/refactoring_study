package com.kibong.refactoring_study.alternative_class_with_different_interfaces;

public class NotificationEmailService implements NotificationService{
    private EmailService emailService;
    @Override
    public void sendNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        emailService.sendEmail(emailMessage);
    }
}
