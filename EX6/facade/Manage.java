public class Manage {
    private ScheduleServer scheduleServer;

    private StartServer startserver;
    private StopServer stopServer;
    
    public Manage(){
        this.startserver = new StartServer();
        this.stopServer = new StopServer();
        
    }

    public void startserver(){
        this.startserver.startserver();

    }
    public void stopserver(){
        this.stopServer.stopserver();
        
    }
  
        
    
    
}
