package ru.nsu.manager.service.notification;

import com.google.firebase.messaging.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.nsu.common.entity.PushToken;
import ru.nsu.common.entity.User;
import ru.nsu.manager.data.request.notification.message.AbstractMessage;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationSenderServiceImpl implements NotificationSenderService {

    private final PushSenderService pushSenderService;

    private final EmailSenderService emailSenderService;

    @Override
    @Scheduled(cron = "0 0/5 * * * *")
    public void processCurrentNotifications() {
        log.debug("processCurrentNotifications <- ");


    }

    @Override
    public void sendNotification(AbstractMessage message, User user) {
        log.debug("sendNotification <- message: {}", message);

        if (user.getIsPushAllowed()) {
            List<Message> pushMessages = user.getPushTokens().stream()
                .map(PushToken::getToken)
                .map(token -> message.toBuilder().to(token).build())
                .map(AbstractMessage::toPushMessage)
                .toList();

            pushMessages.forEach(pushSenderService::sendPush);
        }

        SimpleMailMessage mailMessage = message.toBuilder()
            .to(user.getEmail())
            .build()
            .toEmailMessage();

        emailSenderService.sendEmail(mailMessage);
    }


}
