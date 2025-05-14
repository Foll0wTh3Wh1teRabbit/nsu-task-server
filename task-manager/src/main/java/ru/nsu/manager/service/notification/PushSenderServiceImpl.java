package ru.nsu.manager.service.notification;

import com.google.firebase.messaging.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PushSenderServiceImpl implements PushSenderService {

    @Override
    public void sendPush(Message message) {

    }

}
