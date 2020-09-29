public class MultipleCompaniesOopsUC9{
	public static final int part_time = 1;
	public static final int full_time = 2;
	private String company;
	private int ratePerHour;
	static int noOfWorkingDays;
	static int noOfWorkingHours;
	private int total_employee_wage;
	
	public MultipleCompaniesOopsUC9(String company, int ratePerHour, int noOfWorkingDays, int noOfWorkingHours){
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.noOfWorkingHours = noOfWorkingHours;
	}

	public void computeEmpWage(){
		
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

	}
	@Override
	public String toString(){
		return "Total Employee Wage in company " + company + " is " + total_employee_wage;
	}
	
	
	public static void main(String[] args){
		MultipleCompaniesOopsUC9 c1 = new MultipleCompaniesOopsUC9("Reliance",10,20,80);
		MultipleCompaniesOopsUC9 c2 = new MultipleCompaniesOopsUC9("Dmart",20,10,100);
		c1.computeEmpWage();
		System.out.println(c1);
		c2.computeEmpWage();
		System.out.println(c2);
	}
}
