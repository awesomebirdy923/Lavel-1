//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class SpamALot{
//private static JFrame frame;
//private static JTextField text;
//private static JPanel panel;
//private static JButton good;
//private static JButton bad;
//private final String FAKE_PASSWORD = "HOIYA123";
//private final String FAKE_USERNAME = "hoi456845@gmail.com";
//
//public SpamALot(){
//	instantsiate();
//}
//
//public void instantsiate(){
//	frame = new JFrame();
//	text = new JTextField(20);
//	text.setBackground(new Color(200,0,0));
//	panel = new JPanel();
//	good = new JButton("GOOD");
//	bad = new JButton("BAD");
//	bad.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			text.setBackground(new Color(0,200,0));
//			for (int i = 0; i < 10; i++) {
//				sendTextMessage(text.getText(), "HOI M8");
//			}
//		}
//	});
//	good.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			text.setBackground(new Color(0,200,0));
//			for(int i = 0; i < 10; i++){
//				sendSpam(text.getText(), FAKE_USERNAME, "HOLA");
//			}
//		}
//	});
//	panel.add(text);
//	panel.add(good);
//	panel.add(bad);
//	frame.add(panel);
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setVisible(true);
//	frame.pack();
//}
//
//public static void main(String[] args){
//	new SpamALot();
//}
//
//private boolean sendSpam(String recipient, String subject, String content) {
//
//	Properties props = new Properties();
//	props.put("mail.smtp.auth", "true");
//	props.put("mail.smtp.starttls.enable", "true");
//	props.put("mail.smtp.host", "smtp.gmail.com");
//	props.put("mail.smtp.port", "587");
//
//	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
//		}
//	});
//
//	try {
//
//		Message message = new MimeMessage(session);
//		message.setFrom(new InternetAddress(FAKE_USERNAME));
//		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
//		message.setSubject(subject);
//		message.setText(content);
//		Transport.send(message);
//		return true;
//
//	} catch (MessagingException e) {
//e.printStackTrace();
//return false;
//	}
//}
//
//String sendTextMessage(String phoneNumber, String message){
//	if(sendSpam(phoneNumber + "@tmomail.net", "", message)) return "T-Mobile"; 
//	if(sendSpam(phoneNumber + "@vmobl.com", "", message)) return "Virgin Mobile"; 
//	if(sendSpam(phoneNumber + "@cingularme.com", "", message)) return "Cingular"; 
//	if(sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message)) return "Sprint"; 
//	if(sendSpam(phoneNumber + "@vtext.com", "", message)) return "Verizon"; 
//	if(sendSpam(phoneNumber + "@messaging.nextel.com", "", message)) return "Nextel"; 
//	return "FAIL!";
//}
//
//}
