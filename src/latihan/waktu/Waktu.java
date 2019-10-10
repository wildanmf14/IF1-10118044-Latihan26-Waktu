package latihan.waktu;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Waktu {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
		String formattedDate = date.format(dateFormatted);
		System.out.println("Hari ini adalah hari : "+formattedDate);
	    
	  }
}
