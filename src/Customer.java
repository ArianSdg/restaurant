public class Customer {
    private static int customerNumber = 0;
    private String name;
    private Address address = new Address();

    Customer(String customerName,Address newAddress) {
        this.name = customerName;
    }
    public int getCustomerNumber() {
        customerNumber++;
        return customerNumber;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public void setAddress(Address newAddress) {
        this.address = newAddress;
    }
    public String getAddress() {
        return address.toString();
    }
}
