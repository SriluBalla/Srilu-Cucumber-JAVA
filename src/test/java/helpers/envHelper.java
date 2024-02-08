package helpers;

public class envHelper {

    private static String env;

    public static String getBaseURL()  {
        return chooseURL();
    }

    public static String chooseEnv(){

        env = System.getProperty("ENV");

        if (env == null){
            env = System.getenv("ENV");
            if (env == null){
                env = "qa";
            }
        }
        return env;
    }

    private static String chooseURL() {
        switch (chooseEnv())
        {
            case "dev":    env = "https://demodev.com/elements";     break;
            case "uat":     env = "https://demouat.com/elements";    break;
            case "qa":      env = "https://demoqa.com/elements";
        }
        return env;
    }
}
