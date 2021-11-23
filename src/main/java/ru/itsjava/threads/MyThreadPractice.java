package ru.itsjava.threads;

public class MyThreadPractice {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //         A          A             A
        //         B          B             B

        PrinterThread printerThreadA = new PrinterThread("MyPrinterThread", 5000L);
        PrinterRunnable printerRunnableB = new PrinterRunnable("MyPrinterRunnable", 5000L);
        Thread threadB = new Thread(printerRunnableB);

        System.out.println("start");

        printerThreadA.start();
        threadB.start();

        threadB.join();

        System.out.println("end");

    }
}

//1. Создать 2 потока разными способами (Унаследоваться от Runnable и от класса Thread) и запустить их  - yes
//2. Написать программу, которая выводит любое сообщение раз в 5 секунд                                 - yes