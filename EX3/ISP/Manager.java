public class Manager implements Salary,Hire,Train,AddBonus{
    @Override
	public void salary(){
		System.out.println("Getting the Salary...");
	}

    @Override
    public void train() {
       System.out.println("Train employee....");
    }

    @Override
    public void hire() {
       System.out.println("Hiring employee..");
    }

    @Override
    public void addBonus() {
       System.out.println("Adding bonus at the end of the year...");
    }
    
  
    
}
