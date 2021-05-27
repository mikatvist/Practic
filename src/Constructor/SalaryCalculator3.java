package Constructor;

public class SalaryCalculator3 {
    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator3(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHour * 48;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public  double federalTax(){
        return salary()*federalTaxRate;
        }
        public double salaryAftertax(){
        return salary() - federalTax() - stateTax();
        }
        public  String toString(){
        return "hourly rate: "+hourlyRate+"\n weekly hours: "+ weeklyHour+"\n full salary: "+salary()+"\n salary after tax: "+ salaryAftertax() ;
        }

}
