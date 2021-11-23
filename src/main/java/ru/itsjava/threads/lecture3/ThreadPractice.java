package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
//
//        synchronized (obj) {
//            obj.notify();
//        }

//        ThreadPractice threadPractice = new ThreadPractice();
//        MyThread thread_1 = new MyThread(1, threadPractice);
//        MyThread thread_2 = new MyThread(2, threadPractice);
//        MyThread thread_3 = new MyThread(3, threadPractice);
//
//        thread_1.start();
//        thread_2.start();
//        thread_3.start();

        // де блок - есть 2 ресурса - 2 файла, хотим считать из одного и записать в другой
        // а другим потоком наоборот
        // как это происходит - д.б. 2 synchronized блока - один должен заблокировать один ресурс и другой ресурс
        // после этого сделать операцию чтение - копирование
        // и другой synchronized должен также сделать
        // возникает ситуация, когда один заблокирован одним, другой заблокирован другим и ...
        // ничего не работает, программа повисла

        // вот самый просто де блок
        Thread.currentThread().join(); // программа зависла - мы ждем пока мы сами же завершимся, а мы не завершаемся

    }

    @SneakyThrows
    public synchronized void printNum(int num) {
//    public void printNum(int num) {
//        System.out.println(num);
//        synchronized (this) {
        System.out.println("Begin " + num);
            this.wait(3000L);
//        Thread.sleep(3000L);
        System.out.println("End " + num);
//        }
    }
}
