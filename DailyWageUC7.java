public class DailyWageUC7 {
		
		public static final int full_Time = 1;
		public static final int half_Time = 2;
		public static final int emp_Rate_Per_Hr = 20;
		public static final int num_Of_Working_Days = 20;
		public static final int max_Hrs_Month = 100;

		public static int EmpWage() {

			int empHrs = 0, total_Hrs = 0, total_Days = 0;
			
			while(total_Hrs <= max_Hrs_Month && total_Days < num_Of_Working_Days) {
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
			System.out.println("Day#: " + total_Days + "Emp Hrs: " +empHrs);
		}
			int total_Wage = total_Hrs * emp_Rate_Per_Hr;
			System.out.println("Total employee Wage: " +total_Wage);
			return total_Wage;
	}
		public static void main(String[] args) {
			EmpWage();
		}
	}	
