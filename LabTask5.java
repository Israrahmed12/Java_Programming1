    import java.util.*;  
      
    class LabTask5 {  
     public static void main(String[] args) {  
      
      String host="mail.javatpoint.com";  
      final String user="sonoojaiswal@javatpoint.com";//change accordingly  
      final String password="xxxxx";//change accordingly  
        
      String to="sonoojaiswal1987@gmail.com";//change accordingly  
      
         
       Session session = Session.getDefaultInstance(props,  
        new javax.mail.Authenticator() {  
          protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(user,password);  
          }  
        });  
      
       //Compose the message  
        try {  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(user));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("javatpoint");  
         message.setText("This is simple program of sending email using JavaMail API");  
           
        //send the message  
         Transport.send(message);  
      
         System.out.println("message sent successfully...");  
       
         } catch (MessagingException e) {e.printStackTrace();}  
     }  
    }  