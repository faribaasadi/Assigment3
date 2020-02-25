package BusinessTest.java;

public class Customer extends FullTimeHourlyEmployee {

    String paymentMethod;

    public Customer(String firstName, String lastName , Address address){
        super(firstName, lastName, address);

    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String toString(String str){
        return  super.toString() + " This is customer!" + getPaymentMethod();
    }

    String makePayment(String paymentMethod){

        payment= paymentMethod;
        System.out.println("Your perefered method of payment is : " + paymentMethod);
        return paymentMethod;
    }


}
