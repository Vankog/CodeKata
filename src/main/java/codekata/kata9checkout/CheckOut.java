package codekata.kata9checkout;


public class CheckOut {

    private int total = 0;

    public CheckOut() {
    }

    public int getTotal() {
        return total;
    }

    public void scan(Item item) {
        total += item.getPrice();
    }
}
