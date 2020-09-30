import java.util.*;

public class CompanyEmpWage {
	public final String company;
	public final int empWagePerHr;
	public final int maxWorkingDays;
	public final int maxHrsInMonth;
	public int totalEmpWage;
	public List<Integer> dailyWages;

	public CompanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrsInMonth) {
		this.company = company;
		this.empWagePerHr = empWagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
		dailyWages = new ArrayList<Integer>();
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public void setDailyEmpWage(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}	

	public String toString() {
		String str = "Total Emp Wage for company '"+company+"' is : "+totalEmpWage;
		str += "\nDaily Wages :";
		for(int i = 0; i < dailyWages.size(); i++) {
			str = str + " " + dailyWages.get(i);
		}
		return str;
	}
}