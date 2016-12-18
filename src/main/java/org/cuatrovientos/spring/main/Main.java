package org.cuatrovientos.spring.main;


import org.cuatrovientos.spring.battles.davidL.Battle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Battle battle = (Battle) contexto.getBean("battle");
		
		battle.makeWar();
		System.out.println(battle.toString());
		
	}

}
