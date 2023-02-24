package logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Date型のフォーマットの設定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 加算される現在時間の取得(Calender型)
        Calendar calendar = Calendar.getInstance();
        
        // 日時を加算する
       
        	calendar.add(Calendar.DATE, 1);
        
              
        // Calendar型の日時をDate型に変換
        Date d1 = calendar.getTime();
        System.out.println(sdf.format(d1));

        
        
        
	}
	
	
	
	}



