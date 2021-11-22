package ru.itsjava.iostreams;

import ru.itsjava.collections.lists.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) throws ClassNotFoundException {
//        Man man = new Man("vitalik");
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            outputStream.writeObject(man);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man = " + man);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

//        User user = new User("alex", "qwerty");
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/user.out"))) {
//            outputStream.writeObject(user);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"))) {
            Object obj = inputStream.readObject();
            User user = (User)  obj;
            System.out.println("user = " + user);
        } catch (IOException exception) {
            exception.printStackTrace();
        }



    }
}

//        1. Объект класса User (login, password) Проставить transient на password              - yes
//        Сериализовать объект. После десериализовать объект и вывести поля login и password    -
