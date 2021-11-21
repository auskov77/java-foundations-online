package ru.itsjava.iostreams;

import ru.itsjava.collections.lists.arraylist.MyArrayList;

import java.io.*;

public class IOStreamsPractice_2 {
    public static void main(String[] args) {
        File file_1 = new File("src/main/resources/file_1.txt");
        File file_2 = new File("src/main/resources/file_2.txt");

        try (PrintWriter printWriter = new PrintWriter(file_1)) {
            printWriter.println("Строка_1_file_1");
            printWriter.println("Строка_2_file_1");
            printWriter.println("Строка_3_file_1");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file_1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file_2)) {
            printWriter.println("Строка_1_file_2");
            printWriter.println("Строка_2_file_2");
            printWriter.println("Строка_3_file_2");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file_2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        MyArrayList List_1 = new MyArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(file_1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                List_1.add(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        MyArrayList List_2 = new MyArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(file_2))) {
            String input;
            while ((input = reader.readLine()) != null) {
                List_2.add(input);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
//        System.out.println(List_1);
//        System.out.println(List_2);

        try (PrintWriter printWriter = new PrintWriter(file_1)) {
            printWriter.println(List_2.get(0));
            printWriter.println(List_2.get(1));
            printWriter.println(List_2.get(2));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file_2)) {
            printWriter.println(List_1.get(0));
            printWriter.println(List_1.get(1));
            printWriter.println(List_1.get(2));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

}

//  1. Даны 2 файла. В каждом файле содержится текст. Необходимо поменять местами содержимое файлов.
//  P.S. Это задание лучше выполнять считав вначале файл в коллекцию и потом записать из нее в файл.