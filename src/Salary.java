interface SalaryFikireyesus {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate)

    {
        return 1;
    }

    static int bonus_Fikireyesus ( int yearsOfExperience)
    {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}