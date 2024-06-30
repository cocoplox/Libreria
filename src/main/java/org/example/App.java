package org.example;


import org.example.Interfaz.Ui;
import org.example.entidades.Libro;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.run();
    }
    public void run(){
        //Abres la session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();


        new Ui();


        //InsertTest(session,transaction);
        session.close();
        HibernateUtil.shutdown();
    }
    public void InsertTest(Session session,Transaction transaction){
        //Creo una entidad test
        Libro libroTest = new Libro(
                "Camino de los reyes",
                "Brandon Sanderson",
                1400,
                "Norma",
                4.9f,
                "Sinopsis"
        );

        session.persist(libroTest);
        transaction.commit();
    }
}
