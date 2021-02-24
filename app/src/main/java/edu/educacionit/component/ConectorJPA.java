package edu.educacionit.component;

import javax.persistence.*;

public class ConectorJPA {
    private EntityManager entityManager;

    public ConectorJPA() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("mariadb");

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
