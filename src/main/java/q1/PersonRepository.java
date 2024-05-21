package q1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    public void save(Person person){
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.merge(person);
        transaction.commit();
        session.close();
    }

}
