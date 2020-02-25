package BusinessTest.java;

import java.util.Scanner;

public class Executive extends Employee {

    float yearlyBouns;

    public Executive(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
    }

    public float getYearlyBouns() {
        return yearlyBouns;
    }

    public void setYearlyBouns(float yearlyBouns) {
        this.yearlyBouns = yearlyBouns;
    }

    public String toString(String str){
        return  super.toString() + " This is executive: " + getYearlyBouns() ;
    }

    float computePay(float salary) {

            income = salary + getYearlyBouns();
            return salary + getYearlyBouns();

        }




}
