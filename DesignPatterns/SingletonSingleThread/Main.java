package DesignPatterns.SingletonSingleThread;

public class Main {
    public static void main(String[] args){
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        if(singleton==singleton1){
            System.out.println("Singleton & singleton1 are same objects");
        }
    }
}
