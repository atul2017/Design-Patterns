package SingletonMultipleThreads;

public class Singleton {

    //Eagerly loading or initialization - not recommended when there is heavy lifting or logic required during the initialization in constructor.
    //Not recommended when you don't need object at the begining
//    private static Singleton singleton = new Singleton() ;

    //Lazily loading or initialization
    private static Singleton singleton = null;
    private  Singleton(){}

    //Eagerly loading
//     public static Singleton getSingleton(){
//            return singleton;
//        }

    //Lazily loading - Double - checked locking
    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized(Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
      return singleton;
    }

    //Lazily loading
//    public static Singleton getSingleton(){
//        if(singleton==null){
//            singleton = new Singleton();
//        }
//      return singleton;
//    }
}
