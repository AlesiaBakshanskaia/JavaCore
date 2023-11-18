package java_core.lesson1.regular;


public class Decorator {
    /**
     * Декорирует текущую дату и время для вывода в консоль
     *
     * @param date текущее время и дата
     * @return отформатированная строка.
     */
    public static String decorate(String date) {
        /**
         * Метод декорирует дату и время, добавляя к ним пояснения
         */
        return String.format("Time and date now: %s.", date);
    }
}
