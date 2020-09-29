public class CompanyEmpWageUC10{
	private String company;
	private int ratePerHour;
	static int noOfWorkingDays;
	static int noOfWorkingHours;
	private int totalEmployeeWage;
	
	public practice1(String company, int ratePerHour, int noOfWorkingDays, int noOfWorkingHours){
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.noOfWorkingHours = noOfWorkingHours;
	}
	public void setTotalEmpWage(int totalEmpWage){
        	this.totalEmployeeWage = totalEmpWage;
      	}	

	@Override
	public String toString(){
		return "Total Employee Wage in company " + company + " is " + totalEmployeeWage;
	}

}