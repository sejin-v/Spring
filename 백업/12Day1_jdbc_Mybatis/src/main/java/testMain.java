import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;


public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		DeptService service=ctx.getBean("service",DeptService.class);
		
		List<DeptDTO> list =service.selectAll();
		for(DeptDTO dto:list ) {
			System.out.println(dto);
		}
		
	}
}
