
public class Address {
    double latitude;
    double longitude;
    String writtenAddress;

    Address(){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    Address(double latitude ,double longitude ,String writtenAddress ) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.writtenAddress = writtenAddress;
    }

    double distanceFrom (Address address) {
        return Math.sqrt(Math.pow(address.latitude- this.latitude,2)+Math.pow(address.longitude-this.longitude,2));
    }
}
