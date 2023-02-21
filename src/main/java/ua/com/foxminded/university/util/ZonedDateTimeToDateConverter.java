package ua.com.foxminded.university.util;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

@Component
public class ZonedDateTimeToDateConverter {

    public Date ZonedDateTimeToDate(ZonedDateTime objectToConvert) {
        Assert.notNull(objectToConvert, "objectToConvert is Null");
        Date from = Date.from(objectToConvert.toInstant());
        return from;
    }
}
