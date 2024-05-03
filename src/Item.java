public class Item {
    private Food food;
    private int count;
    private String description;
    Item (Food food, int count) {
        this.count = count;
        description = "-";
    }
    Item (Food food, int count, String description) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }
    public int getCount() {
        return count;
    }
    public Food getFood() {
        return food;
    }
}
