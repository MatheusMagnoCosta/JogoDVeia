import java.util.LinkedHashMap;
import java.util.Map;

public class Historico {
	
	Map<String,String> mapaJogadas = new LinkedHashMap<String,String>();
		
	public Map<String, String> getMapaJogadas() {
		return mapaJogadas;
	}

	public void addJogada(String player, String posicao, String numJogadas) {
		String valor = player + posicao;
		mapaJogadas.put(numJogadas, valor);
	}
	
	public void mostrarJogadas() {
		System.out.println("HISTÓRICO");
		for(String key : mapaJogadas.keySet()) {
			System.out.println(mapaJogadas.get(key));
		}
	}
}

