import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/test.xml");
		
		TestDAO dao=ctx.getBean("testDAO",TestDAO.class);
		
		ArrayList<TestDTO> list= dao.select();
		for(TestDTO dto:list) {
			System.out.println(dto);
		}
	}
}
