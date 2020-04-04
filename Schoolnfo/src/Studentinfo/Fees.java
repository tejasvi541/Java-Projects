package Studentinfo;
public class Fees {
      String fee_status;
      int fee_left;
    public void setfee(int fee)
    {
    	fee_left = fee ;
    }
    public int getfee()
    {
    	return fee_left;
    }
    public void setfeest(String feest)
    {
    	fee_status = feest;
    }
    public String getfeest()
    {
    	return fee_status;
    }
    
    public void setval(String fee_status, int fee_left)
    {
    	setfeest(fee_status);
    	setfee(fee_left);
    }
}
																				


																											
											
																				
										
										
										
	