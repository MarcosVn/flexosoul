package br.com.flexosoul.servlets;

import java.util.Map;
import java.util.Set;

/**
 * 
 * @author marcos
 *
 */
public class ServletUtils {
	
	/**
	 * 
	 * @param mapa
	 * @return
	 */
	public static boolean temParametroNulo(Map<String, String[]> mapa){
		Set<String> keys = mapa.keySet();
		if(keys.size() == 0) return true;
		
		for (String key : keys) {
			for(int i = 0; i < mapa.get(key).length; i++) {
				if(mapa.get(key)[i] == null) return true;
			}
		}
		return false;
	}
	
	
	
	
}
