package BusinessTest.java;

public class Address {

    String streetNum;
    String streetName;
    String city;
    String zipCode;
    String state;

    public Address(String streetNUm, String streetName, String cityName,String zipCode, String state) {
        this.streetNum = streetNUm;
        this.streetName = streetName;
        this.city = cityName;
        this.zipCode = zipCode;
        this.state = state;
    }


    public String toString(String str){
        return "This is an address!";
    }
}
