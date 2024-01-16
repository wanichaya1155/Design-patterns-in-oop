//make this class a subclass of customer
public class RegularCustomer implements CustomerFactory {
    private static RegularCustomer factory = new RegularCustomer();
    RegularCustomer() {

    }
    public static RegularCustomer getRegularCustomer() {
        return factory;
    }

    @Override
    public Mail createCusMail() {
        return new RegularMail();
    }

    @Override
    public Brochure createCusBrochure() {
        return new RegularBrochure();
    }   
}
