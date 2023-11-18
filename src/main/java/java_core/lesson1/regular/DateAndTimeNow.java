package java_core.lesson1.regular;

import java.util.Date;

public class DateAndTimeNow {

    public static String getDateAndTimeNow() {
        /** Метод для получения текущего времени и даты
         * @return возвращает время и дату в виде строки
         */
        Date date = new Date();
        return date.toString();
    }

}
