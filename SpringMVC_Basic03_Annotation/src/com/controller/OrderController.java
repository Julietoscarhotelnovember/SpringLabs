package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	//두 개의 함수를 같은 요청으로 처리 가능하다
	
	//화면출력(ui: get)
	@RequestMapping(method=RequestMethod.GET)
	public String form(){	
		return "order/OrderForm";
	}
	
	/* 이것을 자동처리 해보자 > ui단에서 name을 독특하게 처리
	 * OrderCommand command=new OrderCommand();
	 * List<OrderItem> list=new ArrayList<OrderItem>();
	 * list.add(new OrderItem(1,10,"신발");
	 * list.add(new OrderItem(2,100,"남성옷");
	 * list.add(new OrderItem(3,4,"냉장고");
	 * command.setOrderItem(list)
	 * 
	 * public String submit(OrderCommand orderCommand) 이거 한줄이 다함
	 * 단, 뷰단에서 name 지정이 orderItem[0].itemid 와 같이 되어있다면
	 */
	
	//로직처리(post)
	@RequestMapping(method=RequestMethod.POST)
	public String submit(OrderCommand orderCommand){
		System.out.println("orderCommand: "+orderCommand.toString());
		System.out.println("orderCommand: "+orderCommand.getOrderItem());
		
		//검증하기
		List<OrderItem> items=orderCommand.getOrderItem();
		for(OrderItem item: items){
			System.out.println(item.getItemid()+"/"+item.getNumber()+"/"+item.getRemark());
		}
		
		return "order/OrderCommitted";
		
	}
}
