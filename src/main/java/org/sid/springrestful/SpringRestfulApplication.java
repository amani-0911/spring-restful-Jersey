package org.sid.springrestful;

import org.sid.springrestful.entities.Compte;
import org.sid.springrestful.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class SpringRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestfulApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration){
        return args->{
            restConfiguration.exposeIdsFor(Compte.class);
            compteRepository.save(new Compte(null,70000,new Date(),"actived"));
            compteRepository.save(new Compte(null,4770,new Date(),"actived"));
            compteRepository.save(new Compte(null,3000,new Date(),"bloched"));

           compteRepository.findAll().forEach(c->{
               System.out.println(c);
           });
        };
    }

}
