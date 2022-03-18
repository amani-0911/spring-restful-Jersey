package org.sid.springrestful.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Compte.class)
public interface CompteProjection {
    public double getSolde();
}
