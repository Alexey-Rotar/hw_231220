/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
*/

package org.example;

public class Pair <F, S> {

    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("Alexey", "Irina");
        Pair<Integer, Float> pair2 = new Pair<>(11, 3.14F);
        Pair<String, Double> pair3 = new Pair<>("exponent", 2.718D);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }

    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public String toString() {
        return "pair: " + this.first + " - " + this.second;
    }
}