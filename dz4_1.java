import java.util.*;
import java.util.Random;

public class dz4_1 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами.
        //Реализуйте метод, который вернет “перевернутый” список. 
        // Постараться не обращаться к листу по индексам.
                LinkedList<Integer> linkedList = new LinkedList<>();

        getList(linkedList, 1, 11);
        System.out.println(linkedList);
        System.out.println(getReverseList(linkedList));
    }

    
 public static void getList(LinkedList<Integer> linkedList, int min, int max) {
        Random random = new Random();
        int range = max - min + 1;
        
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(range) + min;
            linkedList.add(randomNumber);
        }
        
    }

    public static List<Integer> getReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> resultList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            resultList.add(iterator.previous());
        }
        return resultList;
    }
    
}


