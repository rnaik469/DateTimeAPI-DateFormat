package in.co.cg.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//This class format date and return it
public class DateFormat {
	
	//returns valid date
	public Date validDate(String inputDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
		Date date = format.parse(inputDate);
		return date;
	}

	//return date in dd/MM/yyyy format
	public String dateFormatByBackSlash(Date date){
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		return format1.format(date);

	}
	//return date in dd MMMM, yyyy format
	public String dateFormatByWeek(Date date){
		SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM, yyyy");
		return format1.format(date);

	}

}
