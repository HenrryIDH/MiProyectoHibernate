package edu.educacionit;

import edu.educacionit.component.ConectorJPA;
import edu.educacionit.model.VistaTotalPromedioSaldos;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EjemploAgrupar implements Runnable {

    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();

        String strSQLJpa = "SELECT count(u),avg(saldo) from Usuario u";
        Query query = em.createQuery(strSQLJpa);
        List<Object[]> listaArrObj = query.getResultList();
        List<VistaTotalPromedioSaldos> lstTotalPromedioSaldos =
                new ArrayList<>();
        for (Object[] arrRes : listaArrObj) {
            lstTotalPromedioSaldos.add(new VistaTotalPromedioSaldos(
                            (Long) arrRes[0], (Double) arrRes[1]
                    )
            );
        }
        System.out.println(lstTotalPromedioSaldos.get(0));

    }
}
