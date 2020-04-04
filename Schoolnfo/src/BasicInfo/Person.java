package BasicInfo;

 public class Person {
	 
   private String name , dob, blood_group, gender, father_name;
    
    public void setName(String n)
	{
		name=n;
	}
    public String getName()//getter / accessor
	{
		return name;
	}
    public void setFname(String fname)
	{
		father_name=fname;
	}
    public String getFname()
	{
		return father_name;
	}
    public void setdob(String db)
	{
		dob=db;
	}
    public String getdob()
	{
		return dob;
	}
	public void setblood_group(String bg)
	{
		blood_group=bg;
	}
	public String getblood_group()
	{
		return blood_group;
	}
	public void setgender(String gen)
	{
		gender = gen;
	}
	public String getgender()
	{
		return gender;
	}
 }

	
	
	
	
	
	
	
	
	
	/* public interface Input
   {
	 public void setval();
   }
 public interface Output
 
   {
	 public void show();
   }
}*/
	

 


