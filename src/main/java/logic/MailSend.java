package logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import util.MailUtil;




public class MailSend {
	public static void main(String[] args) {



		int book = 0;
		
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	        
	        // 加算される現在時間の取得(Calender型)
	        Calendar calendar = Calendar.getInstance();
	        Calendar calendar2 = Calendar.getInstance();
	      System.out.println("宛先");
			String to = new java.util.Scanner(System.in).nextLine();
			
	        
	     if(book == 1) {
		        // Calendar型の日時をDate型に変換
		        //trueの場合
	    	
	
	    	 calendar2.add(Calendar.DATE, 7);
		        while(true) {
		        	calendar.add(Calendar.DATE, 1);
		        	if(calendar == calendar2){
		       // 		String to = new java.util.Scanner(System.in).nextLine();
		        		MailUtil.sendMail(to, "返却について", "貸出から7日を経過しています。返却してください。");
		        		break;
					}
		        }
		         
	    	 
	     }
	     else {
	    	 
	    		//falesの場合
	    	
	    	 calendar2.add(Calendar.DATE, 14);
	 		while(true) {
	 			calendar.add(Calendar.DATE, 1);
	 			if(calendar == calendar2){
	 			//	String to = new java.util.Scanner(System.in).nextLine();
	 				MailUtil.sendMail(to, "返却について", "貸出から14日を経過しています。返却してください。");
	 				break;
	 	}
	 }
 }
		
		//System.out.println("情報を入力");
		
		//System.out.println("宛先：");
		//String to = new java.util.Scanner(System.in).nextLine();
		
		//System.out.println("メールアドレス：");
		//String mail = new java.util.Scanner(System.in).nextLine();
		
			
		
			
			
		
		//BookDAO.BookDTO(name,mail);
		
		//%で経過日数を割り、あまりがでない場合にメールを送信する
	}
}	









