package BusinessTest.java;

public class Person {

     String firstName,lastName;
     int age,idNumber,socialNumber;
     String education;

     String streetName, city,state ,zipCode, streetNum;
     String payment;

    Address address = new Address(streetName , streetNum , city , zipCode , state);

    public Person(String firstName, String lastName,  Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = address.streetName;
        this.city = address.city;
        this.state = address.state;
        this.zipCode = address.zipCode;
        this.streetNum =address.streetNum;
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String toString(String str){
        return  "This is Person: " + firstName + " " + lastName + " " + socialNumber + " " + idNumber + " " + education + " "+ address;
    }

    public void introduce1(){
        System.out.println(firstName + " " + lastName + " " + age +" "+ socialNumber+ " "+ idNumber + "\nAddress is: " + getAddress());
    }

    public void introduce2(boolean flag){

        if(flag == true){
            System.out.println(firstName + " " + lastName + " age:" + age +" social-num:"+ socialNumber + " Id-num:" +idNumber  + "\nAddress is: " + getAddress()  );
        }
        else
            System.out.println(firstName + " " + lastName + " age:" + age + " social-num:" + socialNumber + " Id-num:" + idNumber + "\nAddress is: " + getAddress());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public int getIdNumber() {
        return idNumber;
    }

    public String getEducation() {
        return education;
    }

    public String getAddress() {
        return getStreetNum() + " " + getStreetName() + " " + getCity() + " " + getState() + " " + getZipCode();
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreetNum() {
        return streetNum;
    }


    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPayment() {
        return payment;
    }


    public void setSocialNumber(int socialNumber) {
        this.socialNumber = socialNumber;
    }

    public int getSocialNumber() {
        return socialNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}

