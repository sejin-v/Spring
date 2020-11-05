import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;


public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/config/stu2.xml");
		
		DeptService service=ctx.getBean("service",DeptService.class);
		
		try {
			service.tx();
		}catch(Exception e) {
			System.out.println("롤백돔");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		List<DeptDTO> list =service.selectAll();
		for(DeptDTO dto:list ) {
			System.out.println(dto);
		}
		
	}
}
