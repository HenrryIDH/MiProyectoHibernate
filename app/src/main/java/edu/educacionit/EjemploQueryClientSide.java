package edu.educacionit;

import edu.educacionit.component.ConectorJPA;
import edu.educacionit.model.TipoDeUsuario;
import edu.educacionit.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class EjemploQueryClientSide implements Runnable {
    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();

        String query = "SELECT u FROM Usuario u";
        TypedQuery<Usuario> tQuery = em.createQuery(query, Usuario.class);

        tQuery.getResultStream()
                .filter(u -> u.tipoDeUsuario == TipoDeUsuario.USUARIO_ROOT)
                .filter(u -> u.apellido.startsWith("P"))
                .forEach(u -> {
                    System.out.println(u);
                });
    }
}
