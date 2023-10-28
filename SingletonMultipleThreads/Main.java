package SingletonMultipleThreads;

public class Main {

    public static void main(String[] args){
        Customer cs = new Customer();
        for(int i=1;i<=1000;i++){
            Thread td = new Thread(cs);
            td.start();
        }
    }
}
