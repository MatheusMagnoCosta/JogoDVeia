import java.util.LinkedHashMap;
import java.util.Map;

public class Historico {
	Map<String, String> mapaJogadas;
	
	public Historico() {
		mapaJogadas = new LinkedHashMap<>();
	}
	
	
	public Map<String, String> getMapaJogadas() {
		return mapaJogadas;
	}


	public void setMapaJogadas(Map<String, String> mapaJogadas) {
		this.mapaJogadas = mapaJogadas;
	}


	public void addJogada(String player, String posicao) {
		mapaJogadas.put(player, posicao);
	}
	
	public void mostrarJogadas() {
		
		System.out.println("HISTÓRICO DE JOGADAS");
		for(String pos : mapaJogadas.keySet()) {
			System.out.println(pos + " " + mapaJogadas.get(pos));
		}
	}
}

