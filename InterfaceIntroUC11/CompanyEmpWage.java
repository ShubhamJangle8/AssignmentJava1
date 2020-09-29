public class CompanyEmpWage {
	public final String company;
	public final int empWagePerHr;
	public final int maxWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrsInMonth) {
		this.company = company;
		this.empWagePerHr = empWagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString() {
		return "Total Emp Wage for company '"+company+"' is : "+totalEmpWage;
	}
}