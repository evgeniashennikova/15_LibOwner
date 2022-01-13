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
        assertThat(apiConfig.token()).isEqualTo("1A5S8g13h");
        assertThat(apiConfig.username()).isEqualTo("testQA");

    }

    @Test
    void apiConfigRemoteFile() throws IOException {

        String content = "username=testQA\ntoken=1A5S8g13h";
        Path props = Paths.get("C:/windows/temp/token.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.token()).isEqualTo("1A5S8g13h");
        assertThat(apiConfig.username()).isEqualTo("testQA");

        Files.delete(props);

    }
}
