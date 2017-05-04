package exemplos.colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	
public static void main(String[] args) {
		
		Map<String, String> mapa = new HashMap<String,String>();
		String nome1 = new String("Heider");
		String nome2 = new String("Ana Paula");
		String nome3 = new String("Pedro Henrique");
		mapa.put("pai", nome1);
		mapa.put("mae", nome2);
		mapa.put("filho", nome3);		
		System.out.println(mapa.get("mae"));		
		
	}

}
