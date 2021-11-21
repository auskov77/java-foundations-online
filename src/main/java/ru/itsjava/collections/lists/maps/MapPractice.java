package ru.itsjava.collections.lists.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");

        men.put(ivanov, "futbolka");
        men.put(sidorov, "suitshot");
        men.put(javov,"switer");

        for (Map.Entry<Man, String> pair : men.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("---------------------");
        for (Man keyMan : men.keySet()){
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        men.remove(ivanov);
        System.out.println("After delete Ivanov");
        for (Man keyMan : men.keySet()){
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        System.out.println("men.replace(javov, \"switer\", \"perchatki\") = " + men.replace(javov, "switer", "perchatki"));
        System.out.println("men.get(javov) = " + men.get(javov));

        men.clear();
        System.out.println("men.size() = " + men.size());
    }
}
