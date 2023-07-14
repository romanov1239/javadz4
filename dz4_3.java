

import java.util.*;


public class dz4_3 {
  
    public static void main(String[] args) {
//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// //        Используйте итератор
                LinkedList<Integer> linkedList = new LinkedList<>();

        getList(linkedList, 1, 11);
        System.out.println(linkedList);
        System.out.println(getSumm(linkedList));
    }

    
 public static void getList(LinkedList<Integer> linkedList, int min, int max) {
        Random random = new Random();
        int range = max - min + 1;
        
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(range) + min;
            linkedList.add(randomNumber);
        }
        
    }

    public static int getSumm(LinkedList<Integer> l) {
        int sum = 0;
        
        for (Integer number : l) {
            sum +=number;
        }
        return sum;
    }
        
    }
    
