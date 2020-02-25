package BusinessTest.java;

public class PartTimeHourlyEmployee extends Employee {


    public PartTimeHourlyEmployee(String firstName, String lastName, Address address) {
        super(firstName, lastName,address);
    }

    public String toString(String str){
        return  super.toString() + " This is part-time hourly employee: " + getHourlyPay();
    }

    float computePay(int numHours ) {

        if (numHours > 40) {                // check the number of weeks that exceed 40

            System.out.println("Number of hours can not exceed 40!");
            return -1;
        }
        else

            income = getHourlyPay() * numHours ;
            return (getHourlyPay() * numHours);

    }
}
