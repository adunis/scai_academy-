package corso.hibernateHelloWorld.service;

import org.hibernate.Session;

import corso.hibernateHelloWorld.model.Student;

public class StudentService {

public int saveStudent(String firstName, String lastName, String section ){
Student student = new Student(); 
student.setFirstName(firstName); 
student.setLastName(lastName); 
student.setSection(section); 

Session session = HibernateManagerUtil.getSessionFactory().openSession();
session.beginTransaction();
int id = (Integer) session.save(student);
session.getTransaction().commit();
session.close();
return id;
}

}
