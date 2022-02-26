package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnvironment {
	
	public static Map<String, String> fileandenv = new HashMap<String, String>();
	public static Properties  propMain = new Properties();
	public static Properties propPreSet = new Properties();
	
	//Method to return File and Environment Information
	public static Map<String, String> envAndFile(){
		
		String env = System.getProperty("env");
		
		try {
			if(env.equalsIgnoreCase("dev")) {
				
				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir")+"/inputs/dev.properties");
				propMain.load(fisDev);
				fileandenv.put("ServerURL", propMain.getProperty("serverURL"));
				fileandenv.put("Port", propMain.getProperty("port"));
				fileandenv.put("Username", propMain.getProperty("username"));
				fileandenv.put("Password", propMain.getProperty("password"));
			}else if(env.equalsIgnoreCase("staging")) {
				
				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir")+"/inputs/staging.properties");
				propMain.load(fisDev);
				fileandenv.put("ServerURL", propMain.getProperty("serverURL"));
				fileandenv.put("Port", propMain.getProperty("port"));
				fileandenv.put("Username", propMain.getProperty("username"));
				fileandenv.put("Password", propMain.getProperty("password"));
			}else if(env.equalsIgnoreCase("qa")) {
				
				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir")+"/inputs/qa.properties");
				propMain.load(fisDev);
				fileandenv.put("ServerURL", propMain.getProperty("serverURL"));
				fileandenv.put("Port", propMain.getProperty("port"));
				fileandenv.put("Username", propMain.getProperty("username"));
				fileandenv.put("Password", propMain.getProperty("password"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return fileandenv;
	}
	
	//Method to read the configuration file
	public static Map<String, String> getConfigReader(){
		
		if(fileandenv == null) {
			fileandenv = envAndFile();
		}
		
		return fileandenv;
	}

}
