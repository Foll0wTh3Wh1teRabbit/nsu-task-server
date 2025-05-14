package ru.nsu.manager.data.request.notification;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nsu.common.annotation.NotFarFuture;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateNotificationRequest {

    @NotNull
    private Long taskId;

    @NotFarFuture
    private ZonedDateTime notificationDateTime;

}
