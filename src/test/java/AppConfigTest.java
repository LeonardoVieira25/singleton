import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppConfigTest {

    @Test
    void testGetSetApiUrl() {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        appConfig1.setApiUrl("https://api.example.com");
        assertEquals("https://api.example.com", appConfig2.getApiUrl());
    }

    @Test
    void testGetSetApiKey() {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        appConfig1.setApiKey("my-api-key");
        assertEquals("my-api-key", appConfig2.getApiKey());
    }

    @Test
    void testGetInstance() {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        assertEquals(appConfig1, appConfig2);
    }

}
