package lab_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> streets = new ArrayList<String>();
        streets.add("Беляево");
        streets.add("Калужская");
        streets.add("Технопарк");
        streets.add("Крестьянская застава");
        for(int i=0;i<streets.size();i++)
            System.out.println(streets.get(i));
        ArrayList<String> Towns = new ArrayList<String>();
        streets.add("Москва");
        streets.add("Питер");
        streets.add("Ростов");
        streets.add("Донецк");
        streets.addAll(4,Towns);
        System.out.println(streets.get(2));
        System.out.println(streets.indexOf("Москва"));
        System.out.println(streets.lastIndexOf("Калужская"));
        System.out.println(streets.remove("Технопарк")+": Объект удален");
        System.out.println("Вывод списка на экран :");
        for(int i=0;i<streets.size();i++)
            System.out.println(streets.get(i));
        streets.set(1,"Саратов");
        System.out.println("Вывод списка на экран :");
        for(int i=0;i<streets.size();i++)
            System.out.println(streets.get(i));
        List<String> A = streets.subList(1, 5);
        System.out.println("Вывод списка на экран :");
        for(int i =0;i<A.size();i++)
            System.out.println(A.get(i));
    }
}
