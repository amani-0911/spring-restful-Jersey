package org.sid.springrestful.web.jerseyMethode;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig {

    @Bean
    public ResourceConfig enregesterWS(){
        ResourceConfig resourceConfig=new ResourceConfig();
        resourceConfig.register(BanqueRestJaxRSService.class);
        return resourceConfig;
    }
}
