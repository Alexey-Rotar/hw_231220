/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция.
*/

package org.example;

public class Calculator {

    public static void main(String[] args) {
        Number a = 5;
        Number b = 6.1989F;

        System.out.println(sum(a, b));
        System.out.println(divide(a, b));
        System.out.println(multiply(a, b));
        System.out.println(subtract(a, b));
    }

    public static <A extends Number, B extends Number> Number sum(A a, B b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public static <A extends Number, B extends Number> Number multiply(A a, B b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() * b.longValue();
        } else {
            return a.intValue() * b.intValue();
        }
    }

    public static <A extends Number, B extends Number> Number divide(A a, B b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() / b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() / b.longValue();
        } else {
            return a.intValue() / b.intValue();
        }
    }

    public static <A extends Number, B extends Number> Number subtract(A a, B b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

}