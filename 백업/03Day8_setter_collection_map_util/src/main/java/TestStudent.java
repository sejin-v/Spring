import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu=ctx.getBean("firstStudent",Student.class);
		 Map<String, Cat> map=stu.getMapCat();
		
		 Set<String> keys=map.keySet();
		 System.out.println(keys);
		for(String key:keys) {
			System.out.println(map.get(key).getCatInfo());
		}
	}

}
