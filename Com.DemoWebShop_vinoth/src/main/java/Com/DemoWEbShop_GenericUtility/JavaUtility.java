package Com.DemoWEbShop_GenericUtility;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class JavaUtility {
	@Test
	public String localDateAndT() {
		// TODO Auto-generated method stub
		String date= LocalDateTime.now().toString().replace(":", "").replace("-", "").replace(".", "");
		return date;
	}

}
