package SingletonMultipleThreads;

public class Customer implements Runnable{
    private int order;

    @Override
    public void run() {
        System.out.println("GetInstance->"+Singleton.getSingleton());
    }
}
