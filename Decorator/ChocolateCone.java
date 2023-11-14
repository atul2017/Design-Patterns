package Decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents = null;

    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents==null){
            return "Chocolate Cone ";
        }
        return iceCreamConeConstituents.getDescription()+"Chocolate Cone ";
    }

    @Override
    public int getCost() {
        if(iceCreamConeConstituents==null){
            return 10;
        }
        return iceCreamConeConstituents.getCost()+10;
    }
}
