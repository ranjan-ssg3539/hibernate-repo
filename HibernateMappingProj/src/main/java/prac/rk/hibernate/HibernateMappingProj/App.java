package prac.rk.hibernate.HibernateMappingProj;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import prac.rk.models._1_1_2.Address;
import prac.rk.models._1_1_2.Student;
import prac.rk.util.HibernateUtil;

public class App {
    public static void main( String[] args ) {
    	
    	
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        
        /*Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	Session session = factory.openSession();
        */
  
        
        Transaction transaction = null;
        try {
        	transaction = session.beginTransaction();
        	/*// One to One Unidirectional 
        	Address a1 = new Address("3rd cross", "Bangalore", "Karnataka", "560078");
        	Student s1 = new Student("Ranjan", a1);
        	session.save(s1);
        	*/
        	
        	Student student = new Student("Sam","Disilva","Maths");
            Address address = new Address("10 Silver street","NYC","USA");
            
            student.setAddress(address);
            address.setStudent(student);
            session.save(student);
            ///session.save(address);
        	
        	/*List<Student> students = (List<Student>)session.createQuery("from Student ").list();
            for(Student s: students){
                System.out.println("Details : "+s);
            }*/
            
            List<Address> addresses = (List<Address>)session.createQuery("from Address ").list();
            for(Address a: addresses){
                System.out.println("Details : "+a);
            }
        	
        	
        	transaction.commit();
        } catch (HibernateException he) {
        	transaction.rollback();
        	he.printStackTrace();
        } finally {
			session.close();
		}
        
    }
}
