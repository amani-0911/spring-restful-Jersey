package org.sid.springrestful.repositories;

import org.sid.springrestful.entities.Compte;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.annotation.Resource;
import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    @RestResource(path = "/byetat")
    Page<Compte> findByEtat(@Param("e") String etat, Pageable pageable);
}

