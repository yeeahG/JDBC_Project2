package step02.db;

import java.util.HashMap;

public class DB {
	static HashMap<String, String> hash = new HashMap<String, String>() {{
		put("kim", "김 힘내");
		put("son", "손 기운내");
		put("ban", "반 화이팅");
	}};
	
	public static String getHash(String str) {
		return hash.get(str);
	}
	
} 
