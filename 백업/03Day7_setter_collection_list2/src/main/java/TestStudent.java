import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu=ctx.getBean("firstStudent",Student.class);
		List<Cat> list=stu.getListCat();
		
		for(Cat cat: list ) {
			System.out.println(cat);
		}
	}

}
