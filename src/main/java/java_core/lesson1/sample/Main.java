package java_core.lesson1.sample;

import java_core.lesson1.regular.DateAndTimeNow;
import java_core.lesson1.regular.Decorator;

/** Основной класс приложения
 */
public class Main {
    public static void main(String[] args) {
        /** Точка входа в программу */
        String dateAndTimeNow = DateAndTimeNow.getDateAndTimeNow();
        System.out.println(Decorator.decorate(dateAndTimeNow));
    }
}