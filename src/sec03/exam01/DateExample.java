package sec03.exam01;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E a:hh:mm:ss");
		String data = sdf.format(date);
		System.out.println(data);
	}

}
