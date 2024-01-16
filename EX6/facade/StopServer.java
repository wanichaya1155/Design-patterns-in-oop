public class StopServer {
    private ScheduleServer scheduleServer;

    public StopServer(){
        scheduleServer = new ScheduleServer();
    }

    public void stopserver(){
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();

    }
    
}
