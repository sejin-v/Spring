import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("person.xml");
		
		Person person=ctx.getBean("person",Person.class);
		Person person2=ctx.getBean("person2",Person.class);
		
		System.out.println(person);
		System.out.println(person2);
	}

}
