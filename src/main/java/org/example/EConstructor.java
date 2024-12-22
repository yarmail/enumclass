package org.example;

/**
 * Конструктор, геттер, сеттер, toString
 * <br>
 * Конструктор по умолчанию будет приватным
 * <br>
 * Так же как и при создании  объектов мы можем
 * использовать разные конструкторы при создании перечислений
 * <br>
 * Также можно использовать геттеры и сеттеры
 * <br>
 * Также можно вывести название класса (два способа)
 * <br>
 * Также можно переопределять toString
 */
public enum EConstructor {
    ONE,
    TWO("один"),
    THREE(5);

    private String text;
    private int num;

    EConstructor() {
    }

    EConstructor(String text) {
        this.text = text;
    }

    EConstructor(int num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public int getNum() {
        return num;
    }

    public static void main(String[] args) {
        System.out.println(TWO.getText());
        System.out.println(THREE.getNum());

        System.out.println(ONE);
        System.out.println(ONE.name());
    }
}