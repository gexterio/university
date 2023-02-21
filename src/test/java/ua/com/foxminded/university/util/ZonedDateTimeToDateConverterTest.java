package ua.com.foxminded.university.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;
import java.util.Date;

@SpringBootTest
class ZonedDateTimeToDateConverterTest {

    @Autowired
    ZonedDateTimeToDateConverter converter;

    @Test
    void zonedDateTimeToDate_returnDate_inputNotNull() {
        ZonedDateTime now = ZonedDateTime.now();
        String expected = now.toString();
        Date actualDate = converter.ZonedDateTimeToDate(now);
        String actual = actualDate.toString();
        Assertions.assertEquals(expected, actual);

    }
}