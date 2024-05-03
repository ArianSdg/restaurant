import java.util.Vector;

public class Invoice {
    private int state;
    private Customer customer;
    private final Vector<Item> allItems;
    private static final float taxRate = 0.094f;
    private static float totalPrice;

    Invoice(Customer customer) {
        this.customer = customer;
        state = -1;
        this.allItems = new Vector<>();
    }

    public int getState() {
        return state;
    }
    public Customer getCustomer() {
        return customer;
    }
    public boolean addItem(Item item) { // adding the chosen item
        if (state == -1) {
            allItems.add(item);
            calculatePrice();
            return true;
        }
        else {
            return false;
        }
    }
    public boolean removeItem(Item item) { //removing the chosen item
        int i = 0;
        if (state == -1) {
            for (Item chosenItem : allItems) {
                if (chosenItem.getFood().equals(item.getFood())) {
                    allItems.remove(i);
                    calculatePrice();
                    return true;
                }
                i++;
            }
        }
        return false;
    }
    public Vector<Item> getItems() {
        return allItems;
    }
    public int nextStage() {
        return state++;
    }

    private void calculatePrice() { //calculating all the item's prices
        totalPrice = 0.0f;
        for (Item item : allItems) {
            totalPrice += item.getCount()*item.getFood().getPrice();
        }
        totalPrice += totalPrice*taxRate;
    }
    public int getTotalPrice() {
        return (int)Math.ceil(totalPrice);
    }
}
