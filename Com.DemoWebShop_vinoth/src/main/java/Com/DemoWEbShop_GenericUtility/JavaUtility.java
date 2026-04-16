package Com.DemoWEbShop_GenericUtility;

import java.time.LocalDateTime;



public class JavaUtility {
	
	public String localDateAndT() {
		// TODO Auto-generated method stub
		String date= LocalDateTime.now().toString().replace(":", "").replace("-", "").replace(".", "");
		return date;
	}

}
