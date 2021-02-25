package edu.educacionit;

import edu.educacionit.component.ConectorJPA;
import edu.educacionit.model.Usuario;

import javax.persistence.EntityManager;
import javax.swing.*;

public class EjemploQueryPorId implements Runnable {

    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();

        Usuario u = em.find(Usuario.class,
                "3d2f6274-1e29-4017-9a59-ed240657ae5d");
        if (u == null) {
            System.out.println("El usuario no existe...");
        return;
        }
        System.out.println(u);
    }
}
