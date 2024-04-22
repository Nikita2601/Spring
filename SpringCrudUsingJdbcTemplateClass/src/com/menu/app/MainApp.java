package com.menu.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.menu.dao.MenuDaoImpl;
import com.menu.entity.Menu;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	
		MenuDaoImpl dao=(MenuDaoImpl)ctx.getBean("mdao");
		
	Scanner sc=new Scanner(System.in);
	int ch=0;
	
	System.out.println("*****Welocme to Restaurant**");
	
	do {
		System.out.println("press1:Insert Menu");
		System.out.println("press2:Read Data");
		System.out.println("press3:Update Data");
		System.out.println("press4:Delete Data");
		System.out.println("press5:Read record by id ");
		System.out.println("press6:exit");
		
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		Menu m=new Menu();
		switch(ch) {
		
		case 1:
			/*System.out.println("Enter Menu Id");
			int id=sc.nextInt();*/
			System.out.println("Enter Menu Name:");
			String menuName=sc.next();
			System.out.println("Enter Menu Prise");
			int prise=sc.nextInt();
			System.out.println("Enter Menu quantity");
			int qty=sc.nextInt();
			Menu m1=new Menu(menuName,prise,qty);
			dao.createMenu(m1);
		break;
		case 2:
			System.out.println("Read All menus");

			List<Menu> menus =dao.listMenus();

			 for (Menu record : menus) {
			 System.out.print("ID : " + record.getId() );
			 System.out.print("\nMenuName : " + record.getMenuName() );
			 System.out.println("\nPrise : " + record.getPrise());
			 
			 System.out.println("\nQuantity : " + record.getQuantity());}
			break;
		case 3:
			 System.out.println("Enter id which u want update:");
   		  
   		  int id=sc.nextInt();
   		  Menu menu=dao.getMenuById(id);
   	
   		  System.out.println("Enter which menu name u want update");
   		  String mname=sc.next();
   		 
	       menu.setMenuName(mname);
   		  System.out.println("Enter which menu prise u want update");
   		  prise=sc.nextInt();
   		  
	        		menu.setPrise(prise);
   		  
   		  System.out.println("Enter which menu quantity u want update");
   		  qty=sc.nextInt();
   		
	        		menu.setQuantity(qty);
   		dao.updateMenu(menu);
   		 System.out.println("record updated successfully");
		
		break;	
		
		case 4:
			System.out.println("Enter which id u want delete");
			 id= sc.nextInt();
			 Menu e=new Menu();
				e.setId(id);
				int status=dao.deleteMenu(e);
				System.out.println(status);
			
			 System.out.println("Id deleted successfully");
		break;
		/*case 5:
			System.out.println("Enter which id u want read:");
			
			id=sc.nextInt();
			dao.getMenuById(id);
			Menu mm=new Menu();
		System.out.println(mm.getId()+" "+mm.getMenuName()+mm.getPrise()+mm.getQuantity());
			break;*/
		case 6:
			System.out.println("Bye Bye");
			break;
		
		default:
			System.out.println("Wrong choice!!!");
		}
	}while(ch!=6);
	
	}

}
