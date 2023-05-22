package org.example;

public class MultiThread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

    }
}


class MyTread extends Thread{

    @Override
    public void run() {
        System.out.println("my thread is here");

    }
}
