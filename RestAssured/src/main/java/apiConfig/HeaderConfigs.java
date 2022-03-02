package apiConfig;

import java.util.HashMap;

public class HeaderConfigs {

	public HashMap<String, String> defaultHeaders() {

		HashMap<String, String> defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "text/html");

		return defaultHeader;
	}

	public HashMap<String, String> defaultHeaders_withTokens() {

		HashMap<String, String> defaultHeader = new HashMap<String, String>();
		defaultHeader.put("Content-Type", "text/html");
		defaultHeader.put("Acess_Token", "asdsdqweqweewrasdadsdgfdh");
		defaultHeader.put("jwt_Token", "asdwgrergdfgghgasdasfgr");
		defaultHeader.put("Tenet_Token", "asdwgrergdfgghgasdasfgr");
		return defaultHeader;
	}

}
