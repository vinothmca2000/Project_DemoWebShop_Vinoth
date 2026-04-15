package Com.DemoWEbShop_GenericUtility;

public interface FrameWorkConstants {
	
	JavaUtility javaUtil=new JavaUtility();
	
	String propertiesFilePath="./src/test/resources/testData/commmonData.properties";
	
	String excelFilePath="./src/test/resources/testData/addressData.xlsx";
	
	String listenersScreenShotPath="./listenersScreenShot/"+javaUtil.localDateAndT()+".png";
	
	String screenshotPath="./screenShot/"+javaUtil.localDateAndT()+".png";
	
	String reportspath="./reports/"+javaUtil.localDateAndT()+".html";

}
