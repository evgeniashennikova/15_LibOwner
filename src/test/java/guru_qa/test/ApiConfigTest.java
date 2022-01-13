package guru_qa.test;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiConfigTest {

    @Test
    void apiConfigLocalFile() {

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://test.example.com");
        assertThat(apiConfig.username()).isEqualTo("testQA");
        assertThat(apiConfig.token()).isEqualTo("1A5S8g13h");

    }

    @Test
    void apiConfigRemoteFile() throws IOException {

        String content = "baseUrl=https://test.example.com\nusername=testQA\ntoken=1A5S8g13h";
        Path props = Paths.get("/tmp/token.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseUrl()).isEqualTo("https://test.example.com");
        assertThat(apiConfig.username()).isEqualTo("testQA");
        assertThat(apiConfig.token()).isEqualTo("1A5S8g13h");

        Files.delete(props);

    }
}
