

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
	
		Student stu=ctx.getBean("stu",Student.class);
		Student firstStudent=ctx.getBean("firstStudent",Student.class);
		
		System.out.println(stu);
		System.out.println(firstStudent);
	}

}
