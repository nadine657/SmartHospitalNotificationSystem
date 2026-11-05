
package com.hospital.notification.processor;

import com.hospital.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    private final NotificationService defaultService;
    private final NotificationService emergencyService;

    @Autowired
    public PatientAlertProcessor(
            NotificationService defaultService,
            @Qualifier("emergencyService")
            NotificationService emergencyService) {

        this.defaultService = defaultService;
        this.emergencyService = emergencyService;
    }

    public void processRoutineAlert(String patientId, String message) {
        defaultService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {
        emergencyService.sendNotification(patientId, message);
    }
}
