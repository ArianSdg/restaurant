public class Food {
    private String name;
    private int price;
    static int counter = 0;
    private static String[] menu = new String[0];
    Food (String name, int price) {
        this.name = name;
        this.price = price;
        menu = increaseSize(menu);
        menu[counter] = name;
        counter++;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    public int getPrice() {
        return price;
    }
    public static String[] getMenu() {
        return menu;
    }
    public String[] increaseSize(String[] menu) {
        String[] temp = new String[menu.length + 1];

        System.arraycopy(menu, 0, temp, 0, menu.length);
        return temp;
    }
}
