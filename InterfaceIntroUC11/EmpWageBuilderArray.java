public class EmpWageBuilderArray implements InterfaceToCalculateWage{
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	public void addCompanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrsInMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empWagePerHr, maxWorkingDays, maxHrsInMonth);
		numOfCompany++;
	}
	
	public void computeEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(calculateEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	//Method to calculate employee wage
	private int calculateEmpWage(CompanyEmpWage com) {
		//variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		
		//computation
		while(totalEmpHrs <= com.maxHrsInMonth && totalWorkingDays < com.maxWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case is_part_time:
				empHrs = 4;
				break;
			case is_full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : "+totalWorkingDays+" Emp Hrs : "+empHrs);
		}
		
		
		totalEmpWage = totalEmpHrs * com.empWagePerHr;
		return totalEmpWage;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		InterfaceToCalculateWage empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();	
	}
}