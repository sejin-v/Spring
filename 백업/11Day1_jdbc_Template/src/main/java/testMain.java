import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/test.xml");
		
		TestDAO dao=ctx.getBean("testDAO",TestDAO.class);
		List<TestDTO> list= dao.select();
		for(TestDTO dto:list) {
			System.out.println(dto);
		}
		
//		List<TestDTO> list2= dao.selectByName("박세진");
//		for(TestDTO dto:list2) {
//			System.out.println(dto);
//		}
	}
}
