import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:dao.xml");
		
		DeptService service=ctx.getBean("service",DeptService.class);

		List<String> list=service.list();
		
		for(String x:list) {
			System.out.println(x);
		}
	}

}
