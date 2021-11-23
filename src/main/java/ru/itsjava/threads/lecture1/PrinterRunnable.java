package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterRunnable implements Runnable{
    private final String message;
    private final long delay;

    @Override
    @SneakyThrows
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(delay);
            System.out.print(message + " ");
        }
    }
}
