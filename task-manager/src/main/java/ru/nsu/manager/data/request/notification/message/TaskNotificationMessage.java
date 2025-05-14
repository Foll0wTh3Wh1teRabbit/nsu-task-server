package ru.nsu.manager.data.request.notification.message;

import com.google.firebase.messaging.Message;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.mail.SimpleMailMessage;

@Data
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class TaskNotificationMessage extends AbstractMessage {



    @Override
    public Message toPushMessage() {
        return null;
    }

    @Override
    public SimpleMailMessage toEmailMessage() {
        return null;
    }
}
