class DatabaseConnection{
    private static volatile DatabaseConnection instance;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(instance==null){
            synchronized (DatabaseConnection.class){
                if(instance==null){
                    instance=new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}