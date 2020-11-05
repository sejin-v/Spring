import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class testMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("dept.xml");
		
		ProductService service =ctx.getBean("deptService",ProductService.class);
		
		List<ProductDTO> list= service.selectProduct();
		for(ProductDTO dto:list) {
			System.out.println(dto);
		}
		
		List<OrderDTO> list2 =service.selectOrder();
		for(OrderDTO dto:list2) {
			System.out.println(dto);
		}
		
		System.out.println("p01 상품 5개 주문");
		try {
			service.addOrder("p01", 5);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		List<ProductDTO> list3= service.selectProduct();
		for(ProductDTO dto:list) {
			System.out.println(dto);
		}
		
		List<OrderDTO> list4 =service.selectOrder();
		for(OrderDTO dto:list2) {
			System.out.println(dto);
		}
		
	}
}
