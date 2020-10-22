import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
//		GenericXmlApplicationContext ctx=
//				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
//		
//		Student stu=ctx.getBean("aa", Student.class);
//		System.out.println(stu);
//		Student stu3 =ctx.getBean("bb",Student.class);
//		System.out.println(stu==stu3);
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		Student stu = ctx.getBean("aa",Student.class);
		Student stu1 =ctx.getBean("aa", Student.class);
		Student stu2 =ctx.getBean("bb",Student.class);
		
		System.out.println(stu1==stu2);
		System.out.println(stu==stu1);
				
	}

}
