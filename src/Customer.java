public class Customer {
    private static int customerNumber = 0;
    private String name;
    private Address address;

    Customer(String customerName,Address newAddress) {
        this.name = customerName;
        this.address = newAddress;
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
    public Address getAddress() {
        return address;
    }
}
