package BurgerBillGenerator;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraPatty();
        super.addExtraVeggies();
    }
    
    @Override
    public void addExtraCheese(){

    }
    
    @Override
    public void addExtraPatty(){

    }

    @Override
    public void addExtraVeggies(){

    }

}
