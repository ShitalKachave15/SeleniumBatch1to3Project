package basicpgm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Date obj=new Date();
		  System.out.println(obj);
		  
		   LocalDate date= LocalDate.now();
		   System.out.println(date);
		   
		   LocalTime time=LocalTime.now();
		   System.out.println(time);
		   
		   LocalDateTime dt=LocalDateTime.now();
		   System.out.println("beforeformatting"+dt);
		   
		   DateTimeFormatter dtformat=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		   
		   String newformatdate=dtformat.format(dt);
		   System.out.println("after formatting "+newformatdate);
		   
		  
	}

}
