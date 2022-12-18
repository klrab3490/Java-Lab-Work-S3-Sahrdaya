import java.util.Scanner;
//Parent Class
class Employee
{
	String EmpName;
	int EmpAge, EmpSalary;
	long EmpMobile;
	String EmpAddress;
//Setting
	void setName(String Name)
	{
		this.EmpName = Name;
	}
	void setAge(int Age)
	{
		this.EmpAge = Age;
	}
	void setMobile(long Mobile)
	{
		this.EmpMobile = Mobile;
	}
	void setAddress(String Address)
	{
		this.EmpAddress = Address;
	}
	void setSalary(int Salary)
	{
		this.EmpSalary = Salary;
	}
//Function
	String getname()
	{
		return EmpName;
	}
	int getage()
	{
		return EmpAge;
	}
	long getmobile()
	{
		return EmpMobile;
	}
	String getAddress()
	{
		return EmpAddress;
	}
	int getsalary()
	{
		return EmpSalary;
	}	
}

//Child Classs
class Officer extends Employee
{
	String EmpDepartment;
	String EmpSpecialization;
	void setDepartment(String Department)
	{
		this.EmpDepartment= Department;
	}
	void setSpec(String Specialization)
	{
		this.EmpSpecialization=Specialization;
	}

	String getSpecialization()
	{
		return EmpSpecialization;
	}
	String getDepartment()
	{
		return EmpDepartment;
	}
};

class Manager extends Employee
{
	String EmpTeritory;
	int EmpNum;
	void setTeritory(String Teritory)
	{
		this.EmpTeritory = Teritory;
	}
	void setNumber(int Num)
	{
		this.EmpNum = Num;
	}
	String getTeritory()
	{
		return EmpTeritory;
	}
	int getEmpNum()
	{
		return EmpNum;
	}
	
}

public class Inheritance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Officer o = new Officer();
		Manager m = new Manager();
		System.out.print("Enter officer details\nName : ");
		o.setName(sc.nextLine());
		System.out.print("Age : ");
		o.setAge(sc.nextInt());
		System.out.print("Department : ");
		o.setDepartment(sc.next());
		System.out.print("Mobile : ");
		o.setMobile(sc.nextLong());
		System.out.print("Address : ");
		o.setAddress(sc.next());
		System.out.print("Salary : ");
		o.setSalary(sc.nextInt());
		System.out.print("Specialization : ");
		o.setSpec(sc.next());
		System.out.print("Enter Manager Details\nTeritory : ");
		m.setTeritory(sc.next());
		System.out.print("Number Of Employees : ");
		m.setNumber(sc.nextInt());
		System.out.print("\ndetails are"+"\nName :"+o.getname()+"\nAge :"+o.getage()+"\nMobile :"+o.getmobile()+"\nAddress :"+o.getAddress()+"\nSalary :"+o.getsalary()+"\nSpecialization :"+o.getSpecialization()+"\nDepartment :"+o.getDepartment()+"\nTeritory :"+m.getTeritory()+"\nNo. of Employee :"+m.getEmpNum()+"\n");
		sc.close();
	}
}

