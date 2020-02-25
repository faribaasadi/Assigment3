package BusinessTest.java;

public class FullTimeSalaryEmployee extends Employee{


    public FullTimeSalaryEmployee(String firstName, String lastName,Address address) {
        super(firstName, lastName,address);
    }

    public String toString(String str){
        return  super.toString() + " This is full-time salary emoloyee: " + getHourlyPay();
    }

    float computePay(int numHours){

        float pay;
        pay = getHourlyPay()* numHours;
        income = pay;
        return pay;
    }
}
