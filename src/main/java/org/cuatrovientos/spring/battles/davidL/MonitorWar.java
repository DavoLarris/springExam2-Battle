package org.cuatrovientos.spring.battles.davidL;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MonitorWar {
	@Before("execution(* org.cuatrovientos.spring.battles.davidL.Battle.engage(org.cuatrovientos.spring.battles.davidL.Soldier, org.cuatrovientos.spring.battles.davidL.Soldier))")
	public void engage(JoinPoint joinPoint) {
		// join.Point.getThis : the caller object
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		//System.out.println(joinPoint.getThis().toString()
				//+ " Soldier 1: " + soldier.toString() + "\nSoldier 2: " + soldier2.toString());
	}
	
	@AfterReturning(value = "execution(* org.cuatrovientos.spring.battles.davidL.Battle.engage(*))", returning = "soldier")
	public void engage(JoinPoint joinPoint, Soldier soldier) {
		System.out.println("Adios");
		// join.Point.getThis : the caller object
		//System.out.println(joinPoint.getThis().toString()
			//	+ " Victorious soldier: " + soldier.toString());
	}
}
