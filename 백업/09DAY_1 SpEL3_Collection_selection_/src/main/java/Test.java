import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.ListStudent;
import com.dto.Student;

public class Test {

   public static void main(String[] args) {
      GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
      ListStudent stu =ctx.getBean("list",ListStudent.class);
      List<Student> list = stu.getList();
      for(Student s:list) {
         System.out.println(s);
      }
      
   }

}