package ru.itsjava.threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        // напечатать букву А раз в 2-3 секунды
//        for (int i = 0; i < 10; i++) { //напечатать букву А 10 раз с задержкой
//            for (int j = 0; j < 1_000_000_000L; j++) {
//
//            }
//            System.out.println("A");
//        }

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000L);
//            System.out.println("A");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000L);
//            System.out.println("B");
//        }

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //   A   A   A   A   A
        //     B     B     B        B        B

        PrinterThread printerThreadA = new PrinterThread("A", 2000L);
//        PrinterThread printerThreadB = new PrinterThread("B", 3000L);
        PrinterRunnable printerRunnableB = new PrinterRunnable("B", 3000L);
        Thread threadB = new Thread(printerRunnableB);

        System.out.println("start");

        printerThreadA.start();
        threadB.start();

        threadB.join();

        System.out.println("end");

    }
}
