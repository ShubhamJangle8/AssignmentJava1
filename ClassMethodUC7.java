public class ClassMethodUC7{
	static final int part_time = 1;
	static final int full_time = 2;
	static final int max_working_days = 20;
	static final int total_working_hours = 100;
	static int RATE_PER_HOUR = 2;
	
	public static int computeEmpWage(){
		int total_employee_wage = 0;
		int hours_worked = 0;
		int days_worked = 0;
		int total_hours_worked = 0;
		while(total_hours_worked < total_working_hours && days_worked < max_working_days){
			
			days_worked++;
			int attendance = (int)Math.floor(Math.random()*10)%3;
			
			switch(attendance){
				case part_time:
					hours_worked = 4;
					break;
					
				case full_time:
					hours_worked = 8;
					break;
					
				default:
					hours_worked = 0;
			}
			total_hours_worked += hours_worked;
			
			total_employee_wage += total_hours_worked * RATE_PER_HOUR;
			System.out.println("Day " + days_worked + " with no of hours worked " + hours_worked);
		}

		System.out.println("Total Employee Wage is " + total_employee_wage);
		return total_employee_wage;
	}
	
	
	public static void main(String[] args){
			computeEmpWage();
	}
}
