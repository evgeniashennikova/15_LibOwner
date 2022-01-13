package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/temp/token.properties",
        "classpath:config/token.properties"
})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://test.example.com")
    String baseUrl();

    @Key("username")
    String username();

    @Key("token")
    String token();

}
