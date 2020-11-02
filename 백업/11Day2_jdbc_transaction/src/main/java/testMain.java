import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/test.xml");
		
		TestDAO dao=ctx.getBean("testDAO",TestDAO.class);
		
		dao.insert(7, "바오밥", "나무");
		List<TestDTO> list= dao.select();
		for(TestDTO dto:list) {
			System.out.println(dto);
		}
		
	}
}
