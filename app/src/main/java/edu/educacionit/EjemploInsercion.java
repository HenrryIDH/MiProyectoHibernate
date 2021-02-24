package edu.educacionit;

import edu.educacionit.component.ConectorJPA;

public class EjemploInsercion implements Runnable {
    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        conectorJPA.getEntityManager();
    }
}
