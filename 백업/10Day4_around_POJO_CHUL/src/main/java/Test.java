

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class Test {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/spring/person.xml");
		
		Person person=ctx.getBean("person",Person.class);
//		System.out.println(stu.sayEcho());
//		System.out.println(person.getInfo());
		Object p=person.getInfo();
		System.out.println(p);
	}

}
