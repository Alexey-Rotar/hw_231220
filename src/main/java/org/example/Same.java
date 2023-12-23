/*
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа попарно.
*/

package org.example;

import java.util.ArrayList;

public class Same {

    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<>();
        ArrayList<Object> a2 = new ArrayList<>();
        ArrayList<Object> a3 = new ArrayList<>();

        a1.add("First array"); // String
        a1.add(456123);        // Integer
        a1.add(5.78F);         // Float
        a1.add('a');           // Character
        a1.add(20.034D);       // Double

        a2.add(new String("Second array"));
        a2.add(new Integer(9));
        a2.add(new Float(0.00003F));
        a2.add(new Character('b'));
        a2.add(new Double(0.01D));

        a3.add("Third array");
        a3.add(1112F);
        a3.add(4F);
        a3.add('c');
        a3.add(78D);

        System.out.println("Массивы a1 и a2 одинаковые - " + compareArrays(a1, a2));
        System.out.println("Массивы a1 и a3 одинаковые - " + compareArrays(a1, a3));
        System.out.println("Массивы a1 и a3 одинаковые - " + compareArrays(a1, a3));
    }

    public static <A1, A2> boolean compareArrays(ArrayList<A1> a1, ArrayList<A2> a2) {
        if (!(a1.size() == a2.size()))
            return false;
        for (int i = 0; i < a1.size(); i++) {
            if (!(a1.get(i).getClass().getTypeName().equals(a2.get(i).getClass().getTypeName())))
                return false;
        }
        return true;
    }
}
