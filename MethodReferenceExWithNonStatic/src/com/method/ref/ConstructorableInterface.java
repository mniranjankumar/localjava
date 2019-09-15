package com.method.ref;

interface Messageable {
	Message getmessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

public class ConstructorableInterface {

	public static void main(String[] args) {
		Messageable message = Message::new;
		message.getmessage("Hello");
	}

}
