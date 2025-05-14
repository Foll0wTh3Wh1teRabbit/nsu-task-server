package ru.nsu.manager.service.notification;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {

    void sendEmail(SimpleMailMessage mailMessage);

}
