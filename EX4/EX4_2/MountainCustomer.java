//make this class a subclass of customer
public class MountainCustomer implements CustomerFactory {
    private static MountainCustomer factory = new MountainCustomer();
    MountainCustomer() {

    }
    public static MountainCustomer getMountainCustomer() {
        return factory;
    }

    @Override
    public Mail createCusMail() {
        return new MountaintMail();
    }

    @Override
    public Brochure createCusBrochure() {
        return new MountainBrochure();
    }

}
