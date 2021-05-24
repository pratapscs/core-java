package com.corejava.DesignPatterns;

public class SingletonPattern 
{
	static class Singleton 
	{
		private static Singleton instance = new Singleton();

		private Singleton() {
		}

		public static Singleton getSingleInstance() {
			return instance;
		}

	}
}