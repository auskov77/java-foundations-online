package ru.itsjava.threads.lecture2;

public class MyThreadPractice_lecture_2 {
    public static void main(String[] args) {

        Runnable myRunnable = () -> {
            System.out.println("Привет я Runnable");
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        Runnable myRunnable_2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread myThread_2 = new Thread(myRunnable_2);
        myThread_2.setDaemon(true);
        myThread_2.start();
    }
}

//1. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения) И вывести "Привет я Runnable" - yes
//2. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения)
//          Который печатает раз в 4 секунда "Привет я проснулся после 4 секунд" И сделать его демоном.     - yes