package com.star.sud;
import java.net.Socket;
import java.util.Properties;    
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;  
import com.sun.mail.smtp.SMTPTransport;

class JavaMailTest{  
    public static void send(String from,String password,String to,String sub,String msg){  
    	Properties props = new Properties(); 
    	props.put("mail.smtp.auth", "true");
    	props.put("mail.smtp.port", "587");  
    	props.put("mail.smtp.host", "smtp.gmail.com"); 
        props.put("mail.debug", "true");  
        props.put("mail.smtp.socketFactory.port", "587");  
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
       // props.put("mail.smtp.socketFactory.fallback", "true"); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true"); 
        props.put("mail.smtp.ssl.trust", "*");
        props.put(" EMAIL_USE_TLS", true);
       props.put("EMAIL_HOST_PASSWORD", "etn uyyl pztt temr");
       
        
        Session session = Session.getInstance(props,  
        new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {  
           return new PasswordAuthentication(from,password);  
       }  
       });  
        SMTPTransport transport;
		
        try {    
       //session.setDebug(true);  
        	
       transport = (SMTPTransport)session.getTransport("smtp");
       //Transport transport = session.getTransport("smtp");  
       InternetAddress addressFrom = new InternetAddress(from);  
       MimeMessage message = new MimeMessage(session);  
       message.setHeader("Content-Type", "text/html; charset=UTF-8");
      // message.setSender();  
       message.setFrom(addressFrom);  
     //  message.setSubject("Result");
      // message.setText("Shalom");
       //message.setContent(msg, "text/plain");  
      // message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));  
       Address address = new InternetAddress("umesh_pandey87@yahoo.co.in");
       message.setRecipient(RecipientType.TO,address );
       //transport.connect();
       //transport.send(message);
       message.setSubject("Result", "UTF-8");
       message.setContent("Shalom", "text/html; charset=UTF-8");
      Socket socket = new Socket("smtp.gmail.com",587);
      transport.connect(socket);
      //SMTPTransport.send(message, message.getAllRecipients());
     SMTPTransport.send(message, "umesh.pandey87@gmail.com", "ugqh xqkk yjkl svln");
      // transport.sendMessage(message, message.getAllRecipients());
       System.out.println("message sent successfully");    
    }  
       
    catch (Exception e) {throw new RuntimeException(e);
    }  
    }
        public static void main(String args[]) {
        JavaMailTest.send("umesh.pandey87@gmail.com","ugqh xqkk yjkl svln","umesh_pandey87@yahoo.co.in",
          		 "Result","Shalom");  
        }
   
    }  


