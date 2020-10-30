import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.entity.DeptDTO;
import com.service.DeptService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:echo.xml");
		
		DeptService service =ctx.getBean("service",DeptService.class);
		DeptDTO mesg=service.getInfo();
		System.out.println(mesg);
		
		DeptService service2 =ctx.getBean("service",DeptService.class);
		DeptDTO mesg2=service2.getInfo();
		System.out.println(service==service2);
		
		
		DeptDAO xx=ctx.getBean("dao",DeptDAO.class);
		System.out.println(xx.getInfo());
	}

}
