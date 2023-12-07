public class Database {
    public static void main(String[] args) {
        // Get the instance of ConfigurationManager_lazy
        ConfigurationManager_lazy configurationManager = ConfigurationManager_lazy.getInstance();

        //get the instance of Eager Configuration Manager
        ConfigurationManger_Eager configuration1 = ConfigurationManger_Eager.getInstance();

        //accessing different methods using that single instance
        configurationManager.getDatabaseUrl();
        configuration1.API_Calling();
    }
}
