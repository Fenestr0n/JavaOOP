package hw_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/*
 * Добавить Comparable и/или Comparator к приложению
 */
public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("Barsik"),
                                new Cat("Matilda"),
                                new Cat("Garfield"),
                                new Cat("Tom"),
                                new Cat("Barsik"), 
                                new Cat("Tom")));
        
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().getName());
        }
        System.out.println();

        HashSet<String> dublicates = new HashSet<String>();
        HashSet<String> namesakes = new HashSet<String>();
        
        for (int i = 0; i < cats.getCatList().size(); i++) {
            for (int j = 0; j < cats.getCatList().size(); j++) {
                if (cats.getCatList().get(i).compareTo(cats.getCatList().get(j)) == 0) {
                    if (!dublicates.add(cats.getCatList().get(i).getName())){
                        namesakes.add(cats.getCatList().get(i).getName());
                    } 
                }
            }
        }
        System.out.println(namesakes.toString());
    }
}
