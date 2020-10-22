import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		Student stu=ctx.getBean("stu", Student.class);
		System.out.println(stu);
		Student stu3 =ctx.getBean("stu",Student.class);
		System.out.println(stu==stu3);//true
		
		Student stu2 =ctx.getBean("stu2",Student.class);
		System.out.println(stu==stu2);//false
	}

}
