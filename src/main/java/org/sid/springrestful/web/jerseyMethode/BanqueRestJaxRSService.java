package org.sid.springrestful.web.jerseyMethode;

import org.sid.springrestful.entities.Compte;
import org.sid.springrestful.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/jaxrs")
public class BanqueRestJaxRSService {
    @Autowired
    private CompteRepository compteRepository;

     @Path("/comptes")
     @GET
     @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }


    @Path("/comptes/{code}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Compte findCompte(@PathParam("code") Long code){
        return compteRepository.findById(code).get();
    }

    @Path("/comptes")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Compte save(Compte compte){
        return compteRepository.save(compte);
    }

    @Path("/comptes/{code}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Compte update(@PathParam("code") Long code,Compte cp){
        cp.setId(code);
        return compteRepository.save(cp);
    }

    @Path("/comptes/{code}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("code") Long code){
        compteRepository.deleteById(code);
    }


}
