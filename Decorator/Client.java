package Decorator;

public class Client {
    public static void main(String[] args){
        IceCreamConeConstituents IceCreamConeConstituents = new ChocolateCone(new ChocoChips(new OrangeCone()));
        System.out.println("Get description->"+IceCreamConeConstituents.getDescription());
        System.out.println("Get cost->"+IceCreamConeConstituents.getCost());
    }
}
