package BurgerBillGenerator;

public class Burger {
    private int price;
    private boolean veg;

    private int extraCheese=10;
    private int extraVeggies=10;
    private int extraPatty=15;
    private int backPack=5;

    private int normalBurger;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraVeggieAdded= false;
    private boolean isTakeAway= false;
    private boolean isExtraPattyAdded = false;

    public Burger(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=100;
        }
        else{
            this.price=200;
        }
        normalBurger=this.price;
    }

    // public void getBurgerPrice(){
    //     System.out.println(this.price);
    // }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese Added!");
        this.price+=extraCheese;
    }

    public void addExtraVeggies(){
        isExtraVeggieAdded= true;
        System.out.println("Extra Veggies Added!");
        this.price+=extraVeggies;

    }

    public void addExtraPatty(){
        isExtraPattyAdded = true;
        System.out.println("Extra Patty Added!");
        this.price+=extraPatty;

    }


    public void takeAway(){
        isTakeAway=true;
        System.out.println("Burger Ready for TakeAway!");
        this.price+=extraPatty;

    }

    public void getBill(){
        String bill="";
        System.out.println("Burger: "+normalBurger);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+ extraCheese+"\n"; 
        }
        if(isExtraPattyAdded){
            bill+="Extra Patty Added: "+ extraPatty+"\n";
        }
        if(isExtraVeggieAdded){
            bill+="Extra Veggie Added"+ extraVeggies+"\n";
        }
        if(isTakeAway){
            bill+="Take Away"+ backPack+"\n";
        }
        bill+="Bill: "+this.price+"\n";
        System.out.println(bill);

    }
}
