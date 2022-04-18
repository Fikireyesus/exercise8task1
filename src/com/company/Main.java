package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Staff s= new Staff();
        s.initialize1();
        s.Bancha1_56351();

        double salary= s.salaryToPay(180,40);
        System.out.println("The employee received the salary in the amount of "+ salary);
        double salaryForOverTime=s.salaryForOverTime(10,40);
        System.out.println("The employee received the salary for overtime "+ salaryForOverTime);
        int bonus= SalaryFikireyesus.bonus_Fikireyesus(6);
        s.initialize();
        s.Bancha_56351();
    }
}
interface SalaryFikireyesus {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate) {
        return 1;
    }

    static int bonus_Fikireyesus(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}

class Staff extends Person implements SalaryFikireyesus{
    String education;
    String position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void Bancha_56351()
    {

        Bancha1_56351();
        System.out.println("Education :" + education);
        System.out.println("Position :" + position);
    }
    @Override
    public double salaryToPay(double hours, double rate){return  hours*rate;}
    @Override
    public double salaryForOverTime(double overtime, double rate){return  overtime*(1.5*rate);};
}
