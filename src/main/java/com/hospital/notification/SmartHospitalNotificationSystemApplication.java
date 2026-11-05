
package com.hospital.notification;

import com.hospital.notification.config.HospitalConfiguration;
import com.hospital.notification.processor.PatientAlertProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartHospitalNotificationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                SmartHospitalNotificationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner run(
            PatientAlertProcessor processor,
            HospitalConfiguration configuration) {

        return args -> {
            System.out.println("Hospital: "
                    + configuration.getHospitalName());

            processor.processRoutineAlert(
                    "P001", "Appointment reminder");

            processor.processEmergencyAlert(
                    "P002", "Critical ICU alert");
        };
    }
}
