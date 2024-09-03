package lk.tdm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Student student = new Student();
        student.setSid(1);
        student.setName("TDM");
        student.setMarks(75);
        student.getLaptop().add(laptop);

        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();


        session.save(laptop);
        session.save(student);


        session.getTransaction().commit();

        session.close();

    }
}