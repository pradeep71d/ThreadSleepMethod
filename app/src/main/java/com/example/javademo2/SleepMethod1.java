package com.example.javademo2;

public class SleepMethod1 extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
