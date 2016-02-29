package com.springInAction.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jay
 * @date Feb 29, 2016
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer performer = (Performer)context.getBean("duke");
		performer.perform();
		Performer performer2 = context.getBean("duke2", Performer.class);
		
		performer2.perform();
		System.out.println(performer.hashCode());
		System.out.println(performer2.hashCode());
		System.out.println( context.getBean("duke", Performer.class).hashCode());
		
		System.out.println( context.getBean("duke3", Performer.class).hashCode());
		System.out.println( context.getBean("duke3", Performer.class).hashCode());
		
		System.out.println( context.getBean("duke4", Performer.class).hashCode());
		System.out.println( context.getBean("duke4", Performer.class).hashCode());
	
		System.out.println("----------------------------------------------");
		PoeticJuggler poeticDuke = context.getBean("poeticDuke", PoeticJuggler.class);
		poeticDuke.perform();
	}
}
