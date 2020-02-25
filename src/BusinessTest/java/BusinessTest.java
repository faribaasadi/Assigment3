package BusinessTest.java;
/*
Fariba Asadi
Assigment 3
CS 151 FEB 2020
 */

public class BusinessTest {

    public static void main(String[] args) {

        Address add1 = new Address("123" , "Coleman-Ave" , "San-Jose" , "95124" , "CA" );
        FullTimeSalaryEmployee fullTimeSalaryEmployee = new FullTimeSalaryEmployee("Adam" , "Scot" , add1 );
        fullTimeSalaryEmployee.idNumber = 54;
        fullTimeSalaryEmployee.socialNumber = 483659349;
        fullTimeSalaryEmployee.education = "Bachlor";
        fullTimeSalaryEmployee.age = 40;
        fullTimeSalaryEmployee.hourlyPay = 30f;
        System.out.println("Full-time salary employee1: ");
        fullTimeSalaryEmployee.computePay(30);
        fullTimeSalaryEmployee.introduce3(true , true);

        Address add2 = new Address("654" , "Alma-Ave" , "San-Jose" , "95654" , "CA" );
        FullTimeSalaryEmployee fullTimeSalaryEmployee1 = new FullTimeSalaryEmployee("James" , "Band" , add2 );
        fullTimeSalaryEmployee1.idNumber = 643;
        fullTimeSalaryEmployee1.socialNumber = 5736285;
        fullTimeSalaryEmployee1.education = "Master";
        fullTimeSalaryEmployee1.age = 45;
        fullTimeSalaryEmployee1.hourlyPay = 45f;
        System.out.println("Full-time salary employee2: ");
        fullTimeSalaryEmployee1.computePay(40);
        fullTimeSalaryEmployee1.introduce3(true , false);

        Address add3 = new Address("535" , "Persian-Ave" , "San Fransico" , "95863" , "CA" );
        FullTimeHourlyEmployee fullTimeHourlyEmployee = new FullTimeHourlyEmployee("Ann" , "Waker" , add3);
        fullTimeHourlyEmployee.idNumber = 126;
        fullTimeHourlyEmployee.socialNumber = 2577495;
        fullTimeHourlyEmployee.age = 30;
        fullTimeHourlyEmployee.education = "Bachlor";
        fullTimeHourlyEmployee.hourlyPay = 34f;
        fullTimeHourlyEmployee.overtimePay = 20f;
        System.out.println("\nFull-time Hourly employee1: ");
        fullTimeHourlyEmployee.computePay(35);
        fullTimeHourlyEmployee.introduce3(true, true);

        Address add4 = new Address("764" , "Jarvis-Ave" , "Los Gatos" , "91234" , "CA" );
        FullTimeHourlyEmployee fullTimeHourlyEmployee1 = new FullTimeHourlyEmployee("Hanna" , "Kil" , add4);
        fullTimeHourlyEmployee1.idNumber = 734;
        fullTimeHourlyEmployee1.socialNumber = 3574788;
        fullTimeHourlyEmployee1.age = 25;
        fullTimeHourlyEmployee1.education = "Diploma";
        fullTimeHourlyEmployee1.hourlyPay = 30f;
        fullTimeHourlyEmployee1.overtimePay = 10f;
        System.out.println("Full-time Hourly employee2: ");
        fullTimeHourlyEmployee1.computePay(43);
        fullTimeHourlyEmployee1.introduce3(false, true);

        Address add5 = new Address("890" , "Wineyard-Ave" , "Palo Alto" , "95342" , "CA" );
        Executive executive = new Executive("Mehran" , "Sedigh" , add5);
        executive.idNumber = 432;
        executive.socialNumber = 9375736;
        executive.age = 53;
        executive.education = "PHD";
        executive.yearlyBouns = 12000f;
        System.out.println("\nExecutive employee1: ");
        executive.computePay(240000);
        executive.introduce3(true,true);

        Address add6 = new Address("342" , "Andrews-Ave" , "San Jose" , "95124" , "CA" );
        Executive executive2 = new Executive("John" , "Almi" , add6);
        executive2.idNumber = 908;
        executive.socialNumber = 4938258;
        executive2.age = 58;
        executive2.education = "PHD";
        executive2.yearlyBouns = 17000f;
        System.out.println("Executive employee2: ");
        executive2.computePay(280000);
        executive2.introduce3(false,false);

        Address add7 = new Address("1857" , "Makan-Ave" , "Cupertino" , "95151" , "CA" );
        PartTimeHourlyEmployee partTimeHourlyEmployee = new PartTimeHourlyEmployee("Hanna" , "Jaki" , add7);
        partTimeHourlyEmployee.idNumber = 134;
        partTimeHourlyEmployee.socialNumber = 43579532;
        partTimeHourlyEmployee.age = 24;
        partTimeHourlyEmployee.education = "Bachlor";
        partTimeHourlyEmployee.hourlyPay = 23f;
        System.out.println("\nPart-time hourly employee1: ");
        partTimeHourlyEmployee.computePay(28);
        partTimeHourlyEmployee.introduce3(false,true);

        Address add8 = new Address("3442" , "Cornel-Ave" , "San Jose" , "95124" , "CA" );
        PartTimeHourlyEmployee partTimeHourlyEmployee2 = new PartTimeHourlyEmployee("Bill" , "Boas" , add8);
        partTimeHourlyEmployee2.idNumber = 875;
        partTimeHourlyEmployee2.socialNumber = 5654883;
        partTimeHourlyEmployee2.age = 32;
        partTimeHourlyEmployee2.education = "Associate";
        partTimeHourlyEmployee2.hourlyPay = 26f;
        System.out.println("Part-time hourly employee2: ");
        partTimeHourlyEmployee2.computePay(43);
        partTimeHourlyEmployee2.introduce3(false,false);

        Address add9 = new Address("987" , "Meridian" , "Santa Cruz" , "93421" , "CA");
        Contractor contractor = new Contractor("Bryan" , "Balis" , add9);
        contractor.idNumber = 234;
        contractor.socialNumber = 3568954;
        contractor.age = 43;
        contractor.education = "Diploma";
        contractor.hourlyPay = 28f;
        contractor.overtimePay = 45f;
        System.out.println("\nContractor employee1: ");
        contractor.computePay(38);
        contractor.introduce3(true,true);

        Address add10 = new Address("5425" , "Camden" , "Santa Clara" , "95151" , "CA");
        Contractor contractor2 = new Contractor("Kate" , "Malin" , add10);
        contractor2.idNumber = 732;
        contractor2.socialNumber = 3643792;
        contractor2.age = 50;
        contractor2.education = "Certificate";
        contractor2.hourlyPay = 34f;
        contractor2.overtimePay = 65f;
        System.out.println("Contractor employee2: ");
        contractor2.computePay(38);
        contractor2.introduce3(false,true);

        Address add11 = new Address("12364" , "Almedan" , "San Jose" , "95234" , "CA");
        Customer customer = new Customer("Alis" , "Sadi",add11);
        customer.idNumber = 6537;
        customer.socialNumber = 2345742;
        customer.age = 49;
        System.out.println("\nCustomer 1: ");
        customer.makePayment("Cash");
        customer.introduce2(true);

        Address add12 = new Address("143" , "Burnard" , "San Carlos" , "95324" , "CA");
        Customer customer2 = new Customer("James" , "Ansiton",add12);
        customer2.idNumber = 4357;
        customer2.socialNumber = 5468843;
        customer2.age = 64;
        System.out.println("Customer 2: ");
        customer2.makePayment("Credit");
        customer2.introduce2(false);

















    }
}
