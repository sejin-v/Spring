import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Man;
import com.dto.Woman;

public class TestStudent {

	public static void main(String[] args) {


		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("stu.xml");
		
		Woman woman=ctx.getBean("woman",Woman.class);
		Man man=ctx.getBean("man",Man.class);
		System.out.println(woman);
		System.out.println(man);
		ctx.close();
	}

}
