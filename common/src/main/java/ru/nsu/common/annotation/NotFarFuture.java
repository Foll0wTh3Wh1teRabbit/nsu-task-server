package ru.nsu.common.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ru.nsu.common.validator.NotFarFutureValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = NotFarFutureValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotFarFuture {

    String message() default "Дата и время должны быть в будущем и не более, чем на год вперед";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
