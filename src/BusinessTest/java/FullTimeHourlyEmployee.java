package BusinessTest.java;

public class FullTimeHourlyEmployee extends Employee{


    public FullTimeHourlyEmployee(String firstName, String lastName,  Address address) {
        super(firstName, lastName, address);
    }
    public String toString(String str){
        return  super.toString() + " This is a fulltime hourly employee " + getHourlyPay();
    }

    float computePay(int numHours ) {

        if(numHours > 40){

            float overTime = numHours - 40;
            income =  (getHourlyPay() * numHours) + getOvertimePay() ;
            return (getHourlyPay() * numHours) + getOvertimePay() ;

        }
        else {
            income = getHourlyPay() * numHours ;
            return (getHourlyPay() * numHours);
        }

    }
}
