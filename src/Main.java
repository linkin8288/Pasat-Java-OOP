public class Main {
    public static void main(String[] args) {

        Pasta basePasta = new Pasta(true);
        basePasta.addExtraToppings();
        basePasta.addExtraCheese();
        basePasta.takeAway();
        basePasta.getBill();

        DeluxPasta dp = new DeluxPasta(false);
        dp.getBill();
        dp.addExtraCheese();
        dp.addExtraToppings();
    }
}