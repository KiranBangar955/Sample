package com.test;

public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("1");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("2");
	}

}
