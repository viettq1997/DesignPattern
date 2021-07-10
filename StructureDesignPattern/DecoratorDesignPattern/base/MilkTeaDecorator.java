package StructureDesignPattern.DecoratorDesignPattern.base;

public abstract class MilkTeaDecorator implements IMilkTea {

    private IMilkTea milkTea;

    
    protected MilkTeaDecorator(IMilkTea inner) {
        this.milkTea = inner;
    }


    @Override
    public double cost() {
        return milkTea.cost();
    }
    
}
