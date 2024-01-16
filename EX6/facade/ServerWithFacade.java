public class ServerWithFacade {
    public static void main(String[] args) {
        Manage manage = new Manage();
        manage.startserver();
        manage.stopserver();
    }
    
}
