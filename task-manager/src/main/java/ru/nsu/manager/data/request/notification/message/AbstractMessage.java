package ru.nsu.manager.data.request.notification.message;

import com.google.firebase.messaging.Message;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.mail.SimpleMailMessage;

@Data
@SuperBuilder(toBuilder = true)
public abstract class AbstractMessage {

    protected String from;

    protected String to;

    public abstract Message toPushMessage();

    public abstract SimpleMailMessage toEmailMessage();

    public abstract AbstractMessageBuilder<?, ?> toBuilder();

}
