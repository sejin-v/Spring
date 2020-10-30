import org.springframework.context.support.GenericXmlApplicationContext;

import com.EchoBean.EchoBean;
import com.dao.DeptDAO;
import com.entity.DeptDTO;
import com.service.OneService;
import com.service.TwoService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean bean=ctx.getBean("echoBean",EchoBean.class);
		
		OneService one=bean.getOne();
		TwoService two=bean.getTwo();
		
		one.one();
		two.two();
	}

}
