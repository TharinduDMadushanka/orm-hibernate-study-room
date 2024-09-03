package lk.tdm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setId(3);
        a1.setName("Madu");
        a1.setColor("Blue");


        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();

        session.save(a1);
//        session.delete(a1);

        session.getTransaction().commit();

        session.close();
    }
}