package ru.itsjava.threads;

public class MyThreadPractice {
    public static void main(String[] args) throws InterruptedException{
        // 1 2 3 4 5      6 7 8 9 10    11 12 13 14 15
        //         First          First             First
        //         Second         Second            Second

        PrinterThread printerThreadMyFirst = new PrinterThread("First", 5000L);
        PrinterRunnable printerRunnableMySecond = new PrinterRunnable("Second", 5000L);
        Thread threadB = new Thread(printerRunnableMySecond);

        System.out.println("start");

        printerThreadMyFirst.start();
        threadB.start();

        threadB.join();

        System.out.println("end");

    }
}

//1. Создать 2 потока разными способами (Унаследоваться от Runnable и от класса Thread) и запустить их  - yes
//2. Написать программу, которая выводит любое сообщение раз в 5 секунд                                 - yes