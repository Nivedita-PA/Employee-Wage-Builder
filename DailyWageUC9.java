
public class DailyWageUC9 {
	public static final int full_Time = 1;
   public static final int half_Time = 2;
    
   private final String company;
   private final int empRatePerHr;
   private final int numOfWorkingDays;
   private final int maxHrsPerMonth;
   private int total_Wage;
   
   public EmpWageOOP3(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
	   this.company = company;
	   this.empRatePerHr = empRatePerHr;
	   this.numOfWorkingDays = numOfWorkingDays;
	   this.maxHrsPerMonth = maxHrsPerMonth;	   
   }

  public void EmpWage() {

	int empHrs = 0, total_Hrs = 0, total_Days = 0;
	
	while(total_Hrs <= maxHrsPerMonth && total_Days < numOfWorkingDays) {
		total_Days++;
double empCheck = Math.floor(Math.random() * 10) % 3;
	switch ((int)empCheck) {
	case full_Time:
		empHrs = 8;
		break;
	case half_Time:
		empHrs = 4;
		break;
	default:
		empHrs = 0; 
	}	
	total_Hrs += empHrs;
	System.out.println("Day#: " + total_Days + " Emp Hrs: " +empHrs);
}
	 total_Wage = total_Hrs * empRatePerHr;
	//System.out.println("Total employee Wage: " + total_Wage + " " + company);
     //return total_Wage;
}
  
  @Override
  public String toString() {
	  return "Total employee wage for the company " + company + "  is " + total_Wage;  
  }
   
public static void main(String[] args) {
	EmpWageOOP3 Dmart = new EmpWageOOP3("Dmart", 90, 30, 500);
	EmpWageOOP3 Reliance = new EmpWageOOP3("Reliance", 30, 28, 440);
	Dmart.EmpWage();
	System.out.println(Dmart);
	System.out.println("----------------");
	Reliance.EmpWage();
	System.out.println(Reliance);
	
}
}	

