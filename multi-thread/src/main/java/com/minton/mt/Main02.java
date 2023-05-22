package com.minton.mt;

public class Main02 {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(() -> {
//            System.out.println("hello");
//        });
//        System.out.println("start");
//        t.start();
////        t.join();
//        System.out.println("end");
//    }
        Thread t = new MyThread();
        t.start();
        Thread.sleep(10); // 暂停5毫秒
        t.interrupt(); // 中断t线程
//        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}
class MyThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }
}