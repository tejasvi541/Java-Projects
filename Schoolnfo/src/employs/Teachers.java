package employs;
import employs.EmployInfoBasic;
 


public class Teachers extends EmployInfoBasic {
	String subject_teaching;
	public void setsub(String sub)
	 {
		 subject_teaching = sub;
	 }
	public String getsub()
	{
		return subject_teaching;
	}
	
	
	public void setval(String name, String father_name, String dob, String subject_teaching, int salary, int years_of_work, int year_joined, String gender, String blood_group)
	{
		super.setName(name);//setter, mutator
		super.setFname(father_name);
		super.setdob(dob);
	    setsub(subject_teaching); 
		super.setsal(salary);
		super.setyow(years_of_work);
		super.setyj(year_joined);
		super.setblood_group(blood_group);
		super.setgender(gender);
	}

}
