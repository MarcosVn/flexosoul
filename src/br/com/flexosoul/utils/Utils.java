package br.com.flexosoul.utils;

import java.util.Map;

/**
 * 
 * @author marcos
 *
 */
public class Utils {
	
	/**
	 * 
	 * @param mapa
	 * @return
	 */
	public static boolean temParametroNulo(Map<String, String> mapa){
		return mapa.entrySet().contains(null);
	}
}
