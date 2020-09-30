import java.util.*;

public class EmpWageBuilderArrayList implements InterfaceToCalculateWage{
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private List<CompanyEmpWage> companyEmpWageArrayList;
	
	
	public EmpWageBuilderArrayList() {
		companyEmpWageArrayList = new ArrayList<>();
	}
	
	public void addCompanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrsInMonth) {
		companyEmpWageArrayList.add(new CompanyEmpWage(company, empWagePerHr, maxWorkingDays, maxHrsInMonth));
		
	}
	
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageArrayList.size(); i++) {
			companyEmpWageArrayList.get(i).setTotalEmpWage(calculateEmpWage(companyEmpWageArrayList.get(i)));
			System.out.println(companyEmpWageArrayList.get(i));
		}
	}
	//Method to calculate employee wage
	private int calculateEmpWage(CompanyEmpWage com) {
		//variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		int dailyWage = 0;
		List<Integer> dailyWages = new ArrayList<Integer>();
		
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
			dailyWage = empHrs * com.empWagePerHr;
			dailyWages.add(empHrs * com.empWagePerHr);
			System.out.println("Day : "+totalWorkingDays+" Emp Hrs : "+empHrs);
		}
		
		com.setDailyEmpWage(dailyWages);
		totalEmpWage = totalEmpHrs * com.empWagePerHr;
		return totalEmpWage;
	}
	
	public int getTotalWage(String companyName) {
		int totWage = 0;
		for(int i = 0; i < companyEmpWageArrayList.size(); i++) {
			if(companyEmpWageArrayList.get(i).company.equalsIgnoreCase(companyName)) {
				totWage = companyEmpWageArrayList.get(i).totalEmpWage;
			}
		}
		return totWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		InterfaceToCalculateWage empWageBuilder = new EmpWageBuilderArrayList();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
			
	}
}