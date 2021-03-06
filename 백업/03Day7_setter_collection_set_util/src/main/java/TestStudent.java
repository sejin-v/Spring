import java.util.List;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu=ctx.getBean("firstStudent",Student.class);
		Set<Cat> set=stu.getSetCat();
		
		for(Cat cat: set ) {
			System.out.println(cat);
		}
	}
}
