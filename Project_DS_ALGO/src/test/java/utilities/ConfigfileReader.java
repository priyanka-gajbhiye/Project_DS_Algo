package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileReader {
	
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/config/config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(" Not found Configuration.properties " + propertyFilePath);
		}
	}
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not available. ");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not available. ");
	}


	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not available in the Config.properties file.");
	}
	
	public static String getHomePage() {
		String homeurl = properties.getProperty("homeurl");
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not available in the Config.properties file.");
	}
	
	public static String getarrayprevious() {
		String arraybackurl = properties.getProperty("arraybackurl");
		if (arraybackurl != null)
			return arraybackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}

	public static String getLinkedListpreviuos() {
		String linkedlistbackurl = properties.getProperty("linkedlistbackurl");
		if (linkedlistbackurl != null)
			return linkedlistbackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
	
	public static String gettreepreviuos() {
		String treebackurl = properties.getProperty("treebackurl");
		if (treebackurl != null)
			return treebackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}
	
	public static String getgraphprevious() {
		String graphbackurl = properties.getProperty("graphbackurl");
		if (graphbackurl != null)
			return graphbackurl;
		else
			throw new RuntimeException("This url not available in the Config.properties file.");
	}


}
