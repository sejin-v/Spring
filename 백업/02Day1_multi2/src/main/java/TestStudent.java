import org.springframework.context.support.GenericXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/stu.xml");
	}

}
