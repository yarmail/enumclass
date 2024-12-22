package org.example;

/**
 * Наследование
 * Все классы наследуют Object
 * Object -> Class
 * <br>
 * Перечисления наследуются так:
 * Object -> Enum -> OurEnum
 * покажем это
 * Вывод: везде будет true
 * <br>
 * Также мы можем показать, что перечисления
 * являеются объектами "класса" в котором
 * они находятся
 */
public enum CInheritance {
    SOME;

    public static void main(String[] args) {
        CInheritance variable = CInheritance.SOME;
        System.out.println(variable instanceof CInheritance);
        System.out.println(variable instanceof Enum);
        System.out.println(variable instanceof Object);

        System.out.println(variable.getClass());
        System.out.println(SOME.getClass());
    }
}