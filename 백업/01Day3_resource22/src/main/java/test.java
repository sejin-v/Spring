import org.springframework.context.support.GenericXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("com/config/stu.xml");
	}

}
