package Studentinfo;
import BasicInfo.Person;

public class Student extends Person  
{
	private int clas, roll_no;
	public void setclas(int cls)
	{
		clas = cls;
	}
	public int getclas()
	{
		return clas;
	}
	public void setroll_no(int roll)
	{
		roll_no = roll;
	}
	public int getroll_no()
	{
		return roll_no;
	}
	/*----------------------------
	 -----------------------------*/
	protected void setval(String name, String father_name,String dob, int clas, int roll_no, String gender, String blood_group)
	 {
		super.setName(name);//setter, mutator
		super.setFname(father_name);
		super.setdob(dob);
	     setclas(clas);
	     setroll_no(roll_no);
		super.setblood_group(blood_group);
		super.setgender(gender);
		
	 }
	Fees obj00 = new Fees();	
}
