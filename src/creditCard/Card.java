import java.util.ArrayList;
import java.util.List;

public class Card {
    private double limit;
    private double balance;
    private List<Purchase> purchases;

    public Card(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }
    public boolean toBuy(Purchase purchase){
        if(this.balance > purchase.getValue()) {
            this.balance -= purchase.getValue();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

}
