import java.util.Scanner;
public class CustomerMailApplication {
    public static CustomerFactory getCustomerTypeFromUser() {
        CustomerFactory customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = RegularCustomer.getRegularCustomer();
                break;
            case 2:
                customerType = MountainCustomer.getMountainCustomer();
                break;
            case 3:
                customerType = DelinquentCustomer.getDelinquentCustomer();
                break;
        }
        inp.close();
        return customerType;
    }
    public static void displayWidget(Mail mail, Brochure brochure) {
        brochure.createBrochure();
        mail.createMail();
    }
    
    public static void main(String[] args) {
        CustomerFactory  factory = getCustomerTypeFromUser();
        Brochure brochure = factory.createCusBrochure();
        Mail mail = factory.createCusMail(); 
        displayWidget(mail, brochure);
        
    }
}
