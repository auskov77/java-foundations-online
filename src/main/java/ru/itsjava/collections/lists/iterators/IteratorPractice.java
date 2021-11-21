package ru.itsjava.collections.lists.iterators;

import ru.itsjava.collections.lists.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");

        men.put(ivanov, "futbolka");
        men.put(sidorov, "suitshot");
        men.put(javov,"switer");

        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

    }
}
