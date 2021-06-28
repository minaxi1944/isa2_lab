package testingLogin;

import com.m1944.hibernate.course_marks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total=0;
		Student_info student=new Student_info();
		student.setName("Minaxi");
		
		
		course_marks obj1=new course_marks("Webtech",20,20,20,30);
		total=20+20+20+30;
		obj1.setTotal(total);
		obj1.setStudent(student);
		
		
		course_marks obj2=new course_marks("Java",20,20,20,30);
		total=20+20+20+30;
		obj2.setTotal(total);
		obj2.setStudent(student);
		//System.out.println(sd.getStudent());
		SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(obj1);
	
		session.getTransaction().commit();
		
		session.close();
		sessionfactory.close();

	}

}
