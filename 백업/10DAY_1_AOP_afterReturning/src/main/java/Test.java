import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("stu.xml");
		
		Student stu=ctx.getBean("stu",Student.class);
		System.out.println(stu.sayEcho());
//		System.out.println(stu.callEcho());
//		stu.callEcho();
//		stu.sayEcho();
	}
}
