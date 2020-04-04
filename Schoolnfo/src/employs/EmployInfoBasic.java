package employs;
import BasicInfo.Person;

public class EmployInfoBasic extends Person {
	int salary, years_of_work, year_joined;
	
	public void setsal(int sal)
	{
	  salary = sal;	
	}
	public int getsal()
	{
		return salary;
	}
	public void setyow(int yow)
	{
		years_of_work = yow;
	}
	public int getyow()
	{
		return years_of_work;
	}
	public void setyj(int yj)
	{
		year_joined = yj;
	}
	public int getyj()
	{
		return year_joined;
	}

}
