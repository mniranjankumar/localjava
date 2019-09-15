package com.server;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {

	public static void send(String to, String subject, String msg, String user, String pass) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		//below mentioned mail.smtp.port is optional
	     props.put("mail.smtp.port", "587");		
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.smtp.starttls.enable", "true");
	     
	     Session session = null;
	     try
	     {
	   
	   	/* Create an instance of MimeMessage, 
	   	      it accept MIME types and headers 
	   	   */
	   
	      MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(user));
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	         message.setSubject(subject);
	         message.setText(msg);

	         /* Transport class is used to deliver the message to the recipients */
	         
	         Transport.send(message);
	   
	      }
	      catch(Exception e)
	      {
	      	 e.printStackTrace();
	      }
	}
}
