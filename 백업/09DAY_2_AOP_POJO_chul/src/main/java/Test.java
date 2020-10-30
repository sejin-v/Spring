import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("stu.xml");
		
		Person p=ctx.getBean("person",Person.class);
		p.getInfo();
	}
}
