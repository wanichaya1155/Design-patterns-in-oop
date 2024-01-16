public class StartServer {
    private ScheduleServer scheduleServer;

    public StartServer(){
        scheduleServer = new ScheduleServer();
    }
    
    public void startserver(){
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }
}
