package be.intecbrussel;

import java.util.*;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        // maak een array van string met een aantal waardes
        // maak een instantie van MyCollection -> geef array van hierboven mee
        // vraag de size op van de MyCollection instantie
        // voeg een item toe met de add methode
        // vraag nogmaal de size op
        // druk alle waardes af met een loop
        // verwijder een item uit myCollection instantie
        // druk nogmaals alle waarden af

        // String [] words=new String[]{"Nikita", "Halil", "Avi","Ruben"};
        // MyCollection myCollection = new MyCollection(words);
        MyCollection myCollection1 = new MyCollection(new String[]{"Nikita", "Halil", "Avi", "Ruben"});
        System.out.println(myCollection1.size());
        myCollection1.add("Aleksey");
        System.out.println(myCollection1.size());
        for (int i = 0; i < myCollection1.size(); i++) {
            System.out.println(myCollection1.get(i));
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        //of
        ArrayList<String> list1 = new ArrayList<>() {
            {
                add("first");
                add("second");
            }
        };
        list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.size());
        //list.remove(0);
        // System.out.println(list.size());

        list.add(0, "3de");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);

        list.set(0, "eerste");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        list.clear();
        System.out.println(list.size());
        list1.add("test");
        list1.add("test");
        for (String n : list1) {
            System.out.println(n);
        }
        System.out.println("---------------------------------");
        // list.forEach((n)-> System.out.println(n));
        HashSet<String> words = new HashSet<String>();
        System.out.println(words.add("Test"));
        System.out.println(words.add("Test"));      //duplicate
        words.add("test");


        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("------------");
        words.remove("Test");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.size());
        System.out.println("Exists?"+words.contains("test"));
        System.out.println("Exists?"+words.contains("Test"));
        System.out.println("---------------$$$$$$$$$$$$$$$$--------");
        Queue<Integer>numbers=new PriorityQueue<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(21);
        numbers.add(9);
        System.out.println("Queue:"+numbers);
        numbers.offer(1);
        System.out.println("Queue update:"+numbers);
    }
}



