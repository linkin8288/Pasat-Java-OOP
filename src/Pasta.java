public class Pasta {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 160;
    private int backPack = 20;
    private int basePastaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;
    public Pasta(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
    }
     public void addExtraCheese() {
        isExtraCheeseAdded = true;
         System.out.println("Extra cheese added");
         this.price += extraCheesePrice;
     }
     public void addExtraToppings() {
        isExtraToppingsAdded = true;
         System.out.println();
         this.price += extraToppingsPrice;
     }
    public void takeAway() {
        isOptedForTakeaway = true;
        System.out.println("Take away opted");
        this.price += backPack;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Pasta price: " + basePastaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice;
        }
        if(isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice;
        }
        if(isOptedForTakeaway) {
            bill += "Take away: " + basePastaPrice;
        }
        bill += "Bill: " + this.price;
        System.out.println(bill);
    }
}
