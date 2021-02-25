package edu.educacionit;

import com.github.javafaker.Faker;
import edu.educacionit.component.ConectorJPA;
import edu.educacionit.model.TipoDeUsuario;
import edu.educacionit.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Random;
import java.util.UUID;

public class EjemploInsercion implements Runnable {
    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();

        Faker fkr = new Faker();

        for (int x : new int[10]){
            Usuario usu = new Usuario();
            usu.id = UUID.randomUUID().toString();
            usu.nombre = fkr.address().firstName();
            usu.apellido = fkr.address().lastName();
            usu.domicilio = fkr.address().streetName() + " " + fkr.address().streetAddressNumber();
            usu.pais = fkr.address().country();
            usu.tipoDeUsuario = (new Random().nextInt() % 2 == 0 ) ?
                    TipoDeUsuario.USUARIO_ESTANDAR :
                    TipoDeUsuario.USUARIO_ROOT;

            EntityTransaction tx =  em.getTransaction();
            tx.begin();
            em.persist(usu);
            tx.commit();
        }
    }
}
