package com.test;

public class WaitNoParaMethod {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable,"Thread-1");
		thread.start();
	}

}
