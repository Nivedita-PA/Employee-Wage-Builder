public class DailyWageUC6 {

        public static void main(String[] args) {

                int wage_Per_Hr = 20;
                int working_Hrs_Day = 8;
                int working_Days = 20;
                int daily_Wage = 0;
                int total_Wage = 0;
                daily_Wage = wage_Per_Hr * working_Hrs_Day;

                for (int i = 0; i <= working_Days; i++) {
                        daily_Wage = wage_Per_Hr * working_Hrs_Day * i;
                }
                        System.out.println(daily_Wage);

        }

}

