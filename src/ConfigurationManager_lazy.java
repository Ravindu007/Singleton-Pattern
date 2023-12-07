public class ConfigurationManager_lazy {
    //private static variable to store the instance
    private static ConfigurationManager_lazy instance;

    //private constructor
    private ConfigurationManager_lazy(){}

    //public static variable
    public static ConfigurationManager_lazy getInstance(){
        if(instance == null){
            instance = new ConfigurationManager_lazy();
        }
        return  instance;
    }
    public void getDatabaseUrl() {
        // Replace this with the actual logic to get the database URL
        System.out.println("Database url connected");
    }
}
