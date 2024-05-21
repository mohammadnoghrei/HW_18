package q1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PersonService {
    //    public Person saveOrUpdate(Person entity) {
//        SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
//
//        Transaction transaction = null;
//        try (Session session = sessionFactory.getCurrentSession()) {
//            transaction = session.beginTransaction();
//            PersonRepository.
//            transaction.commit();
//            return t;
//        } catch (Exception e) {
//            assert transaction != null;
//            transaction.rollback();
//            return null;
//        }
//    }
    private final PersonRepository personRepository = new PersonRepository();

    public void save(Person person) {
        personRepository.save(person);
    }
    public void saveList(List<Person> personList) {
        personList.forEach(a->personRepository.save(a));

    }
}
