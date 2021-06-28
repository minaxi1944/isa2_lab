package testingLogin;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.CascadeType;
import javax.persistence.Column;
@Entity
@Table(name="student_marks")
public class course_marks {
	//@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "resource"))
	
	@Id @GeneratedValue(generator="newg")
	@GenericGenerator(name="newg",strategy="foreign",parameters= {@Parameter(value="student",name="property")})
	private int roll_no;
	private String coursenm;
	
	private float marks1,marks2,marks3,endmarks,total;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roll_no")
	private Student_info student;
	
	public Student_info getStudent() {
		return student;
	}
	public void setStudent(Student_info student) {
		this.student = student;
	}
	public int getStudent_id() {
		return roll_no;
	}
	public void setStudent_id(int student_id) {
		roll_no = student_id;
	}
	public course_marks(String coursenm, float marks1, float marks2, float marks3, float endmarks) {
		super();
		this.coursenm = coursenm;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.endmarks = endmarks;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
}
