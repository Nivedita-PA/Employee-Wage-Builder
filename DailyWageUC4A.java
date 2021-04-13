public class DailyWageUC4A {

	public static void main(String[] args) {
		int wage_Per_Hr = 20;
		
		int working_Hrs_Day = 4;
		int daily_Wage = wage_Per_Hr * working_Hrs_Day;
		
		switch(working_Hrs_Day) {
		case 4:
		System.out.println("Daily full time wage for each employee");
		System.out.println(daily_Wage);
		break;
		case 8:
			System.out.println("Daily part time wage for each employee");
	        System.out.println(daily_Wage);	
	}
  }
}
