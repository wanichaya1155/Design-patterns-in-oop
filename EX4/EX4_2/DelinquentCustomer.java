//make this class a subclass of customer
public class DelinquentCustomer implements CustomerFactory{
    private static DelinquentCustomer factory = new DelinquentCustomer();
    DelinquentCustomer() {

    }
    public static DelinquentCustomer getDelinquentCustomer() {
        return factory;
    }

    @Override
    public Mail createCusMail() {
        return new DelinquentMail();
    }

    @Override
    public Brochure createCusBrochure() {
        return new DelinquentBrochure();
    }
   
}
