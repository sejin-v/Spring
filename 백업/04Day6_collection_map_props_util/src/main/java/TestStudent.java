import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:stu.xml");

		Student stu=ctx.getBean("firstStudent",Student.class);

		System.out.println(stu);
		System.out.println(stu.getMapCat());
		
		Map<String, Cat> map =stu.getMapCat();
		Set<String> keys =map.keySet();
		
		
		for(String key :keys) {
			System.out.println(map.get(key));
		}
		
		Properties phones=stu.getPhones();
		Set<String> xxx=phones.stringPropertyNames();
		for(String key :xxx) {
			System.out.println(key+"\t"+phones.getProperty(key));
		}
	}
}
