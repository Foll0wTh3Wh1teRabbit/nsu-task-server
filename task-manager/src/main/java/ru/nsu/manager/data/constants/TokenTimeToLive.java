package ru.nsu.manager.data.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TokenTimeToLive {

    public final Long SHORT_TIME_TO_LIVE = 1000 * 60 * 10L;

    public final Long LONG_TIME_TO_LIVE = 1000 * 60 * 60 * 24 * 31L;

}
