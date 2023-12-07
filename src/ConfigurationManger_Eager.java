public class ConfigurationManger_Eager {
    //declare private static variable
    private static ConfigurationManger_Eager instance = new ConfigurationManger_Eager();

    //private constructor
    private ConfigurationManger_Eager(){}

    //static method to access
    public  static  ConfigurationManger_Eager getInstance(){
        return instance;
    }

    //different method
    public static void API_Calling(){
        System.out.println("Calling to the backend API");
    }
}
