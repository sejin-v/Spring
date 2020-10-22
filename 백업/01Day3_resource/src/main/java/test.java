import org.springframework.context.support.GenericXmlApplicationContext;

import com.DTO.Student;

public class test {

	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println(s);
		
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("stu.xml");
	}
}
