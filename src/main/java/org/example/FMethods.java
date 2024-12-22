package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Другие полезные свойства и методы
 * <br>
 * .valueOf - перевод пользовательского
 * ввода в объект перечисления
 * <br>
 * .ordinal - индекс перечисления
 * (у SOME = 3)
 * <br>
 * .values - возможность перебирать перечисления
 * - сделано через стрим
 * <br>
 * Другой вариант стрима
 *
 */
public enum FMethods {
    ONE, TWO, THREE, SOME;

    public static void main(String[] args) {

        System.out.println(FMethods.valueOf("ONE").name());

        System.out.println(SOME.ordinal());

        Arrays.stream(FMethods.values())
                .forEach(System.out::println);

        Stream.of(FMethods.values())
                .forEach(System.out::println);
    }
}
