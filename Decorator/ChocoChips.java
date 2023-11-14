package Decorator;

public class ChocoChips implements IceCreamConeConstituents{

    private IceCreamConeConstituents iceCreamConeConstituents = null;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituents==null){
            return "Choco Chips ";
        }
        return iceCreamConeConstituents.getDescription() + "Choco Chips ";
    }

    @Override
    public int getCost() {
        if(iceCreamConeConstituents==null){
            return 50;
        }
        return iceCreamConeConstituents.getCost() + 50;
    }
}
