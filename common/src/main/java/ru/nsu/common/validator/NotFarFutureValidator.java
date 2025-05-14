package ru.nsu.common.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ru.nsu.common.annotation.NotFarFuture;

import java.time.ZonedDateTime;

public class NotFarFutureValidator implements ConstraintValidator<NotFarFuture, ZonedDateTime> {

    @Override
    public boolean isValid(ZonedDateTime value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime oneYearLater = now.plusYears(1);

        return value.isAfter(now) && !value.isAfter(oneYearLater);
    }

}
