package MyImplementations;

import MyImplementations.myMap.MyHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        MyHashMap<Integer,Integer> myHashMap = new MyHashMap<>();

        myHashMap.put(1,2);
        myHashMap.put(2,2);
        myHashMap.put(3,2);
        myHashMap.put(4,2);
        myHashMap.put(5,2);
        myHashMap.put(6,26);
        myHashMap.put(7,225);
        myHashMap.put(8,211);
        myHashMap.put(9,9);
        myHashMap.put(10,531);
        myHashMap.put(11,853);
        myHashMap.put(12,63);
        myHashMap.put(13,2512);
        myHashMap.put(14,222);
        myHashMap.put(15,22);
        myHashMap.put(16,45);
        myHashMap.put(17,76);
        myHashMap.put(18,24);
        myHashMap.put(19,81);

        System.out.println("Drukowanie hashmapy i wielkości");
        System.out.println(myHashMap);
        System.out.println("Rozmiar mapy - [" + myHashMap.size() + "]");
        System.out.println("Pobranie wartosci z klucza 3");
        System.out.println(myHashMap.get(3));
        myHashMap.remove(3);
        System.out.println("Mapa po usunieciu klucza 3");
        System.out.println(myHashMap);
        System.out.println("Rozmiar mapy po usunieciu 1 elementu - [" + myHashMap.size() +"]");

        myHashMap.put(1,20);
        myHashMap.put(2,20);
        myHashMap.put(3,20);

        System.out.println("Mapa po dodaniu takiego samego key, ale z inna wartościa");
        System.out.println(myHashMap);
        System.out.println("Rozmiar mapy przy nadpisaniu wartości - [" + myHashMap.size() + "]");

        myHashMap.clear();
        System.out.println("Mapa po wyczyszczeniu");
        System.out.println(myHashMap);
        System.out.println("Rozmiar pustej mapy - [" + myHashMap.size() + "]");

    }
}
