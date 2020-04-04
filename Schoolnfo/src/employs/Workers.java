package employs;
import employs.EmployInfoBasic;


public class Workers extends EmployInfoBasic {
	
	 public void setfield(String field)
	 {
		 work_field = field;
	 }
	 public String getfield()
	 {
		 return work_field;
	 }
	String work_field;
	public void setval(String name, String father_name, String dob, String work_field, int salary, int years_of_work, int year_joined, String gender, String blood_group)
	{
		super.setName(name);//setter, mutator
		super.setFname(father_name);
		super.setdob(dob);
	    setfield(work_field); 
		super.setsal(salary);
		super.setyow(years_of_work);
		super.setyj(year_joined);
		super.setblood_group(blood_group);
		super.setgender(gender);
	}

}
