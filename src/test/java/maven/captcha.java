package maven;
	import org.apache.commons.mail.DefaultAuthenticator;
	import org.apache.commons.mail.Email;
	import org.apache.commons.mail.EmailException;
	import org.apache.commons.mail.SimpleEmail;

	public class captcha 
	{
		public static void main(String[] args) 
		{

			System.out.println("===================Email===================");
			Email email1 = new SimpleEmail();
			email1.setHostName("smtp.gmail.com");
			email1.setSmtpPort(587);
			email1.setAuthenticator(new DefaultAuthenticator("pradeepapandiyan20@gmail.com", "xpodglgabtzpnuwd"));
			email1.setSSLOnConnect(true);
			try {
				email1.setFrom("pradeepapandiyan20@gmail.com");
			} catch (EmailException e) {
				
				e.printStackTrace();
			}
			email1.setSubject("TestMail");
			try {
				email1.setMsg("This is a test mail. Hi Ajith, pradeepa have sent a test email to u ... :-)");
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				email1.addTo("sriram.srinivasan@aroopatech.com");
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				email1.send();
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("===================Email===================");
			
		}

	}



