import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu= ctx.getBean("fristStudent",Student.class);
		Student stu2= ctx.getBean("secondStudent",Student.class);
		Student stu3= ctx.getBean("thirdStudent",Student.class);
		System.out.println(stu.getInfo());
		System.out.println(stu2.getInfo());
		System.out.println(stu.getInfo());
	}

}
