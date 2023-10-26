package DesignPatterns.SingletonSingleThread;

public class Singleton {
    //eagerly loading
    //private static Singleton singleton = new Singleton();

    //Lazily loading
    private static Singleton singleton = null;

    private Singleton(){}
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
      return singleton;
    }
}
