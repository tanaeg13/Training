import java.util.*;

public class Employee {
	int empNo, basic, hra, it;
	String empName, joinDate, dept;
	char desigCode;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String empName, String joinDate, char desigCode, String dept, int basic, int hra, int it) {
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.desigCode = desigCode;
		this.dept = dept;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
	
	public List<Employee> initialise() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000));
		list.add(new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000));
		list.add(new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000));
		list.add(new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000));
		list.add(new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000));
		list.add(new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400));
		list.add(new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000));
		return list;
	}
}