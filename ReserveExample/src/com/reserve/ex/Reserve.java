package com.reserve.ex;

import java.util.concurrent.SynchronousQueue;

public class Reserve implements Runnable {

	public Reserve() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	int wanted;
	int available = 1;
	
	public Reserve(int wanted) {
		super();
		this.wanted = wanted;
	}


	@Override
	public void run() {
		synchronized(this){
			if(available >= wanted){
				String name = Thread.currentThread().getName();
				System.out.println(wanted+" berths reserved for "+name);
				try{
					Thread.sleep(1500);
					available -= wanted;
				} catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}else{
				System.out.println( "no berth available");
			}
		}

	}

}
