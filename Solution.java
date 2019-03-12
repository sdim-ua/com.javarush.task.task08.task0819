
/* 
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.

*/




import java.util.HashSet;
import java.util.Set;
import java.util.Iterator; 


public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
         Iterator iterator = cats.iterator();
         cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat()); 
        cats.add(new Cat()); 
        
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats){
            System.out.println(cats);
        }
    
    }

    // step 1 - пункт 1
    
    public static class Cat{
        
     
    }
}
