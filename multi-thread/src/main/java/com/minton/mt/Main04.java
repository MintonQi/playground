package com.minton.mt;

public class Main04 {
    public static void main(String[] args) throws Exception {
        var add = new AddThread();
        var dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        System.out.println("add is dead");
        dec.join();
        System.out.println("dec is dead");
        System.out.println(Counter.count);
    }
}

class Counter {
    public static int count = 0;
}

class AddThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) {
            Counter.count += 1;
//            System.out.println(com.minton.mt.Counter.count);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("add finished");
    }
}

class DecThread extends Thread {
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0; i<10000; i++) {
            Counter.count -= 1;
//            System.out.println(com.minton.mt.Counter.count);
        }
        System.out.println("dec finished");
    }
}