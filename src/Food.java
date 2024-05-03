import java.util.Vector;

public class Food {
    private String name;
    private int price;
    private static Vector<Food> menu = new Vector<>();

    Food (String name, int price) {
        this.name = name;
        this.price = price;
        menu.add(this);
    }

    public static Vector<Food> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
