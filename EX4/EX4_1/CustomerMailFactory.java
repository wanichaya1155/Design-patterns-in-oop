public interface CustomerMailFactory {
    public static Customer createCustomer(String custype){
        if(custype.equals("Regular")){
            return new RegularCustomer();
        }
        else if(custype.equals("Mountain")){
            return new MountainCustomer();
        }
        else if(custype.equals("Mountain")){
            return new DelinquentCustomer();
        }
        return null; 
    }
    
}
