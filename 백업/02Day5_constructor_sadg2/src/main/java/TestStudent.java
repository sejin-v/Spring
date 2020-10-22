import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:dao.xml");
		
		DeptService service=ctx.getBean("service",DeptService.class);
			
		DeptDAO dao=service.getDao();
		
		System.out.println(dao.list());
	}
}
