package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:C:/windows/temp/token.properties",
        "classpath:config/token.properties"
})
public interface ApiConfig extends Config {

    @Key("username")
    String username();

    @Key("token")
    String token();

}
