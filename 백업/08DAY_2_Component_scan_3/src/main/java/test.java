import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("config.xml");
		
		DeptService service =ctx.getBean("service",DeptService.class);
		
	}

}
