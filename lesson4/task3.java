//  В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.

package lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);

        int sum = 0;
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            int num = iter.next();
            sum += num;
        }
        System.out.println("Сумма всех элементов списка: " + sum);
    }
}
