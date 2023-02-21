package ua.com.foxminded.university.persistance.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.foxminded.university.persistance.model.LessonEntity;
import ua.com.foxminded.university.util.ZonedDateTimeToDateConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

class LessonRepositoryTest extends RepositoryTestBase {

    @Autowired
    LessonRepository repository;

    @Autowired
    ZonedDateTimeToDateConverter converter;

    private final Long student_id = 1L;


    @Test
    void findAllLessonsForDayByStudentAndDate_returnLessonsList_ifExists() throws ParseException {
        ZonedDateTime date = ZonedDateTime.now().plusDays(1);
//        Date date = converter.ZonedDateTimeToDate(now);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
//        Date date = format.parse("2023.02.21");
        List<LessonEntity> result = repository.findAllLessonsForDayByStudentIdAndDate(student_id, date);
        System.out.println();
    }

    @Test
    void findAllLessonsForMonthByStudentIdAndDate_returnLessonsList_ifExists() {

    }

    @Test
    void findAllLessonsForDayByTeacherAndDate_returnLessonsList_ifExists() {

    }

    @Test
    void findAllLessonsForMonthByTeacherIdAndDate_returnLessonsList_ifExists() {

    }

}
