package ru.nsu.manager.service.notification;

import com.google.firebase.messaging.Message;

public interface PushSenderService {

    void sendPush(Message message);

}
