package com.minton.mt;
//public class com.minton.mt.Main01 {
//    public static void main(String[] args) {
//        com.minton.mt.MyThread01 t1 = new com.minton.mt.MyThread01();
//        Thread t = new Thread(t1);
//        t.start();
//        for(int i = 0; i < 100; i++) {
//            System.out.println("helloWorld");
//        }
//    }
//}
//


import static java.lang.Thread.sleep;

public class Main01{
    public static void main(String[] args) throws InterruptedException {
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }

        //实现Runnable
        new Thread(new MyThread01()).start();

        //匿名内部类
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("匿名内部类Thread：" + i);
                }
            }
        }.start();


        // 用Lambda表达式创建线程，()为参数, {}中为方法体，返回值如果有的话return就行，不需要声明，整个lambda表达式相当于实例化了这个接口
        new Thread(() -> {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i = 0; i < 100; i++){
                System.out.println("Lambda's here");
            }
        }).start();

        for(int i = 0; i < 100; i++){
            System.out.println(i);
            sleep(20);
        }

    }
}

class MyThread01 implements Runnable {
    @Override
    public void run() {
        System.out.println("eihei~");
        for(int i = 0; i < 100; i++){
            System.out.println("com.minton.mt.MyThread01" + i);

        }
    }
}