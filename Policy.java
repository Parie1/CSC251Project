public class Policy
{

   private double policyNumber;       
   private String providerName;                 
   private String firstName;  
   private String lastName;               
   private double age;       
   private String smokerStats; 
   private double height;
   private double weight;
   
   public Policy()
   {
      policyNumber =0;
      providerName = " ";
      firstName = " ";
      lastName = " ";
      age = 0;
      smokerStats = " ";
      height = 0;
      weight = 0;
   }
   
   public Policy(double pNum, String pName, String fName, String lName, double ag, String sStats, double ht, double wt)
   {
      policyNumber = pNum;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = ag;
      smokerStats = sStats;
      height = ht;
      weight = wt;
   }
   
   public void setPolicyNumber(double pNum)
    {
       policyNumber = pNum;
    }

   public void setProviderName(String pName)
    {
       providerName = pName;
    }

   public void setFirstName(String fName)
    {
       firstName = fName;
    }
    
    public void setLastName(String lName)
    {
       lastName = lName;
    }
    
    public void setAge(double ag)
    {
       age = ag;
    }
    
    public void setSmokerStats(String sStats)
    {
       smokerStats = sStats;
    }

    public void setHeight(double ht)
    {
       height = ht;
    }
    
    public void setWeight(double wt)
    {
       weight = wt;
    }
    
    public double getPolicyNumber()
    {
       return policyNumber;
    }
    
    public String getProviderName()
    {
       return providerName;
    } 
    
    public String getFirstName()
    {
       return firstName;
    } 
    
    public String getLastName()
    {
       return lastName;
    } 
    
    public double getAge()
    {
       return age;
    } 
    
    public String getSmokerStats()
    {
       return smokerStats;
    } 
    
    public double getHeight()
    {
       return height;
    } 
    
    public double getWeight()
    {
       return weight;
    } 

    public double getBMI()
    {
       double bmi = (weight * 703) / (height * height);
       return bmi;
    }
    
}









