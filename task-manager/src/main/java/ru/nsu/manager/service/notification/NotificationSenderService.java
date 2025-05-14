package ru.nsu.manager.service.notification;

import ru.nsu.common.entity.User;
import ru.nsu.manager.data.request.notification.message.AbstractMessage;

public interface NotificationSenderService {

    void processCurrentNotifications();

    void sendNotification(AbstractMessage message, User user);

}
