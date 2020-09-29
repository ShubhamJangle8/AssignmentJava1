public class MultipleCompaniesProcedureUC8{
	static final int part_time = 1;
	static final int full_time = 2;
	
	
	
	
	public static int computeEmpWage(String company, int ratePerHour, int noOfWorkingDays, int noOfWorkingHours){
		int total_employee_wage = 0;
		int hours_worked = 0;
		int days_worked = 0;
		int total_hours_worked = 0;
		while(total_hours_worked < noOfWorkingHours && days_worked < noOfWorkingDays){
			
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
			
			total_employee_wage += total_hours_worked * ratePerHour;
			System.out.println("Day " + days_worked + " with no of hours worked " + hours_worked);
		}

		System.out.println("Total Employee Wage in company " + company + " is " + total_employee_wage + "\n");
		return total_employee_wage;
	}
	
	
	public static void main(String[] args){
			computeEmpWage("Dmart",20,10,100);
			computeEmpWage("Reliance",10,20,80);
	}
}
