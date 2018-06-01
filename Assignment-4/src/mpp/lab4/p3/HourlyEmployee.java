package mpp.lab4.p3;

import java.time.YearMonth;
import java.util.Date;

public class HourlyEmployee extends Employee {

	double hourlyRate = 15.5;
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcGrossPay(int month) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		YearMonth yearMonthObject = YearMonth.of(dt.getYear(), month);
		int daysInMonth = yearMonthObject.lengthOfMonth(); //28  
		return daysInMonth * 8 * hourlyRate;
	}

}
