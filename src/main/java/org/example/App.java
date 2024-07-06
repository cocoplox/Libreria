package org.example;


import org.example.Interfaz.Ui;
import org.example.entidades.Libro;
import org.hibernate.Session;
import org.hibernate.Transaction;

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


        try {
            InsertTest(session, transaction);
            System.out.println("Se ha insertado el libro satisfactoriamente");
        } catch (Exception e) {
            System.out.println("Ha habido un error a la hora de insertar el libro");
        }


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
