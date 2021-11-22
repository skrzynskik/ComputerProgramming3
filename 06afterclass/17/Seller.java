public class Seller{
    String companyName;
    int yearOfFounding;
    int noOfEmployees;
    
    public Seller(String companyName, int yearOfFounding, int noOfEmployees){
    
        this.companyName = companyName;
        this.yearOfFounding = yearOfFounding;
        this.noOfEmployees = noOfEmployees;
        
    }
    
    
    public String toString(){
        return this.companyName + ", no of employees: " + this.noOfEmployees + ", year of founding: " + this.yearOfFounding;
    }
    
    public void setCompanyName(String companyName){   
        this.companyName = companyName;
    }
    
    public void setNoOfEmployees(int noOfEmployees){   
        this.noOfEmployees = noOfEmployees;
    }
    
    public void setYearOfFounding(int yearOfFounding){
        this.yearOfFounding = yearOfFounding;
    }
}