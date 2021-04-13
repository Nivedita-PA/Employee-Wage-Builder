
public class DailyWageUC4 {

	public static void main(String[] args) {
		double employCheck = Math.floor(Math.random()* 10) % 2;
		int employ = (int) Math.round(employCheck); 
				//System.out.println(employ);
		switch ( employ ) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
		    System.out.println("Employee is present");
            break;
            default: 
            	System.out.println("Invalid");
		}
	}

}
