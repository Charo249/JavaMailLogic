package logic;

import util.MailUtil;

public class kadai22 {

		public static void main(String[] args) {
		System.out.print("宛先：");
		String to = new java.util.Scanner(System.in).nextLine();
		
		System.out.print("件名：");
		String	subject = new java.util.Scanner(System.in).nextLine();
			
		System.out.print("本文：");
		String	body = new java.util.Scanner(System.in).nextLine();	
			
			MailUtil.sendMail(to,subject,body);
		}
		
	}


