public class AppConfig {
    private static AppConfig instance = new AppConfig();

    private AppConfig() {
    }

    private String apiUrl;
    private String apiKey;

    public static AppConfig getInstance() {
        return instance;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
