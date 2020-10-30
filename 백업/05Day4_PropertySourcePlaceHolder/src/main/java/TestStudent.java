import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;


public class TestStudent {

	public static void main(String[] args) {

		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("stu.xml");
				
		DeptService service =ctx.getBean("service",DeptService.class);
		
		System.out.println(service);
		
		DeptDAO dao=service.getDao();
		
		for(String x:dao.list()) {
			System.out.println(x);
		}
	}
}
