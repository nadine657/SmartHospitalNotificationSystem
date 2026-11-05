
package com.hospital.notification.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("EMAIL Notification");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
    }
}
