package application;
import entities.enums.OrderStatus;
import entities.Order;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		
		Order order = new Order(1080, new Date(), OrderStatus.valueOf("AGUARDANDO_PAG"));
	
		System.out.println(order);
	}
	
	

}
