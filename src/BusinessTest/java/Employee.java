package BusinessTest.java;

public abstract class Employee extends Person {

    float hourlyPay;
    float overtimePay;
    float income;

   public Employee(String firstName, String lastName , Address address){
       super(firstName , lastName , address);

   }

    public String toString(String str){
        return super.toString() + " This is employee: " + getHourlyPay() + " " + getIncome() + " " + getOvertimePay();
    }

   public void introduce3(boolean flagSocial , boolean flagPay){
        if(flagSocial == true && flagPay == true){
            System.out.println(firstName + " " + lastName +" age:" + age + " Social-num:" +socialNumber + " Id-num:" +idNumber + " Education:" + education + " Income:$" + income + "\nAddress is: " + getAddress());

        }
        else if (flagSocial == true && flagPay == false){
            System.out.println(firstName + " " + lastName + " age:" + age + " Social-num:"+socialNumber + " Id-num:"  +idNumber + " Education:" + education+ "\nAddress is: " + getAddress());
        }
        else if (flagSocial == false && flagPay == true){
            System.out.println(firstName + " " + lastName + " age:" + age + " Social-num:" +socialNumber + " Id-num:" +idNumber + " Education:" + education +" Income:$" + income + "\nAddress is: " + getAddress() );
        }
        else if (flagSocial == false && flagPay == false){
            System.out.println(firstName + " " + lastName + " age:" +age +" Social-num:"+socialNumber + " Id-num:"  +idNumber + " Education:" + education +  "\nAddress is: " + getAddress() );
        }

   }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getHourlyPay() {
        return hourlyPay;
    }

    public float getOvertimePay() {
        return overtimePay;
    }

    public void setHourlyPay(float hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setOvertimePay(float overtimePay) {
        this.overtimePay = overtimePay;
    }

}
