package com.softwaredesign;

public class SoftwareDesign {

	/* 1. Design a Concurrent Rule pipeline in Java?
	 * 
	 * Concurrent programming or concurrent design is very hot now days to leverage power of ever increasing 
	 * cores in advanced processor and Java being a multi-threaded language has benefit over others.
	 * 
	 * Do design a concurrent system key point to note is thread-safety, immutability, local variables and 
	 * avoid using static or instance variables.
	 * 
	 * you just to think that one class can be executed by multiple thread a same time, So best approach is 
	 * that every thread work on its own data, doesn't interfere on other data and have minimal 
	 * synchronization preferred at start of pipeline.
	 * 
	 * This question can lead from initial discussion to full coding of classes and interface but if you 
	 * remember key points and issues around concurrency e.g. race condition, deadlock, memory interference, 
	 * atomicity, ThreadLocal variables etc you can get around it.
	 * 
	 * ------------------------------------------------------------------------
	 * 2. Design a Vending Machine which can accept different coins, deliver different products?
	 * 
	 * Ans : http://javarevisited.blogspot.in/2016/06/design-vending-machine-in-java.html#axzz4txMsJWBL
	 * 
	 * ---------------------------------------------------------------------------------
	 * 3. You have a Smartphone class and will have derived classes like IPhone, AndroidPhone,
	 *    WindowsMobilePhone can be even phone names with brand, how would you design this system of 
	 *    Classes.
	 *    
	 * 4. Design ATM Machine ?
	 * 
	 * 5. You are writing classes to provide Market Data and you know that you can switch to different 
	 * vendors overtime like Reuters, wombat and may be even to direct exchange feed , how do you design 
	 * your Market Data system.
	 * 
	 * 6. Design for a chess game
	 * 
	 * 7. Design for a generic card game
	 * 
	 */
}
