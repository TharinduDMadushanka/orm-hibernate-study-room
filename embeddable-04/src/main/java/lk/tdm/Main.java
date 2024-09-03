package lk.tdm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // object
        AlienName name = new AlienName();
        name.setFname("Tharindu");
        name.setLname("Madushanka");
        name.setMname("Dilshan");

        Alien a1 = new Alien();

        a1.setId(1);
        a1.setColor("Green");
        a1.setName(name);


        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();

        session.save(a1);

        session.getTransaction().commit();


        session.close();
    }
}