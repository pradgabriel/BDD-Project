package helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		
	}

}
