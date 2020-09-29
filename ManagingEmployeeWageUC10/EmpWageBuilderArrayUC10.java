public class EmpWageBuilderArrayUC10{

	public static final int partTime = 1;
  	public static final int fullTime = 2;
  	private int numOfCompany = 0;
  	private CompanyEmpWageUC10 companyEmpWageArray[];
  	public EmpWageBuilderArrayUC10(){
      		companyEmpWageArray = new CompanyEmpWageUC10[5];
	}
	private void addCompanyEmpWage(String company, int empRatePerHour, int numofWorkingDays, int numofWorkingHours){
      		companyEmpWageArray[numofcompany] = new CompanyEmpWageUC10(company, empRatePerHour, numOfWorkingDays, numofWorkingHours);
       		numOfCompany++;
   	}
	private void computeEmpWage( ) {
     		for(int i = 0; i < numofcompany; i++) {
       			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
       			System.out.println(companyEmpWageArray[i]);
     		}
   	}
	public void computeEmpWage(CompanyEmpWageUC10 companyEmpWage){
		
		int hoursWorked = 0;
		int daysWorked = 0;
		int totalHoursWorked = 0;
		while(totalHoursWorked < CompanyEmpWageUC10.noOfWorkingHours && CompanyEmpWageUC10.daysWorked < noOfWorkingDays){
			
			daysWorked++;
			int attendance = (int)Math.floor(Math.random()*10)%3;
			
			switch(attendance){
				case partTime:
					hoursWorked = 4;
					break;
					
				case fulTime:
					hoursWorked = 8;
					break;
					
				default:
					hoursWorked = 0;
			}
			totalHoursWorked += hoursWorked;
			
			totalEmployeeWage = totalHoursWorked * ratePerHour;
			System.out.println("Day " + daysWorked + " with no of hours worked " + hoursWorked);
		}

	}

	public static void main(String[] args){
		EmpWageBuilderArrayUC10 EmpWageBuilder = new EmpWageBuilderArrayUC10();
            	EmpWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
            	EmpWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
            	EmpWageBuilder.addCompanyEmpWage("Bigbasket",10,3,10);
            	EmpWageBuilder.computeEmpWage();
	}

}