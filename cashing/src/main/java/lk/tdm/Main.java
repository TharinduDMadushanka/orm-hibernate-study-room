package lk.tdm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Alien a1 ;

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session1 = sf.openSession();
        session1.beginTransaction();

        a1 = session1.get(Alien.class, 1);
        System.out.println(a1);

        session1.getTransaction().commit();
        session1.close();

        Session session2 = sf.openSession();
        session2.beginTransaction();

        a1 = session2.get(Alien.class, 1);
        System.out.println(a1);

        session2.getTransaction().commit();
        session2.close();



    }
}