import org.springframework.context.support.GenericXmlApplicationContext;

import com.DTO.Student;

public class test {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/stu.xml",
						"com/config/person.xml");
				
	}
}
