package lk.tdm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        /**
         * Creating an Instance of Alien
         */
        Alien a1 = new Alien();
        a1.setId(1);
        a1.setName("TDM");
        a1.setColor("Green");

        /**
         * Configuring Hibernate
         * Load the Hibernate configuration and build the SessionFactory
         * Configuration Initialization: The Configuration object is initialized. This is used to set up Hibernate.
         * configure() Method: This method loads the default Hibernate configuration from hibernate.cfg.xml.
            If you have custom configurations or a different XML file, you can specify the file name
            within the configure() method (e.g., configure("myhibernate.cfg.xml")).
         * addAnnotatedClass(Alien.class): This adds the Alien class to the Hibernate configuration.
         * Hibernate uses this to understand how to map the Alien class to a database table.
         */
//        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        /**
         * Building the SessionFactory
         * SessionFactory: This is a factory for Session objects. It is a thread-safe,
         * immutable object and is used to create Session instances.
         * Building the SessionFactory involves reading the Hibernate configuration and setting up the connection pool,
         * among other things.
         */
        SessionFactory sf = con.buildSessionFactory();

        /**
         * Opening a Session
         * Open a session, begin transaction, save the object, and commit the transaction
         * Session: This is a single-threaded unit of work. It is used to interact with the database, including performing CRUD operations.
         * You open a session from the SessionFactory.
         */
        Session session = sf.openSession();

        /**
         * Beginning a Transaction
         * Transaction: A transaction is a set of operations that should be executed together. It ensures data integrity and consistency.
         * By starting a transaction, you are preparing to make changes to the database.
         */
        session.beginTransaction();

        /**
         * Saving the Object
         */
        session.save(a1);
//        session.delete(a1);

        /**
         *  Committing the Transaction
         *  Commit: This finalizes the transaction, making all changes made during the transaction permanent in the database.
         */
        session.getTransaction().commit();

        /**
         * Closing the Session
         * Close: This closes the Session and releases the resources associated with it.
         * It's important to close the session to prevent resource leaks.
         */
        session.close();
    }
}