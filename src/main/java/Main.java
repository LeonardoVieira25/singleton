
public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setApiUrl("https://api.example.com");
        appConfig.setApiKey("my-api-key");

        System.out.println("API URL: " + appConfig.getApiUrl());
        System.out.println("API Key: " + appConfig.getApiKey());
    }
}
