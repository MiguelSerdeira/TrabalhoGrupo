package com.projetofinal.caracteristicas;

/**
 * <H1>Classe da API</H1>
 * <H2>Objetivos:</H2>
 * <ul style="list-style-type:square">
 * </ul>
 * <br> 
 * 
 * @author Hugo, Manuel e Miguel
 * 
 * 
 */
public class CaracteristicasAPI {
	
	
	/**
	 * Esta classe tem com fun��o mostrar o p�  preferido do jogador
	 * @param pePreferido
	 * @return Retorna o p� direito se a string for "d", ou retorna o p� esquerdo se for "e"
	 */
	public static String pePreferido(String pePreferido) {
		
		String d = "Direito";
		String e = "Esquerdo";
		
		if(pePreferido == "d") {
			return d;
		} else {
			return e;
		}
		
			
	}
	/**
	 * Esta classe tem com fun��o mostrar a posi��o do jogador
	 * @param posicao
	 * @return Retorna a posi��o do jogador conforme o que a string tiver
	 */
	public static String posicao(String posicao) {
		
		String g = "Guarda-Redes";
		String d = "Defesa";
		String m = "M�dio";
		String a = "Avan�ado";
		
		if(posicao == "g") {
			return posicao = g;
		} else if(posicao == "d"){
			return posicao = d;
		} else if(posicao == "m") {
			return posicao = m;
		} else {
			return posicao = a;
		}

	}
	/**
	 * Esta classe tem com fun��o mostrar o escal�o do jogador
	 * @param escalao
	 * @return Retorna o escalao do jogador conforme o que a string tiver
	 */
	public static String escalao(String escalao) {
		
		String inf = "Infantil";
		String ini = "Iniciado";
		String juv = "Juvenil";
		
		if(escalao == "inf") {
			return escalao = inf;
		}else if(escalao == "ini") {
			return escalao = ini;
		}else {
			return escalao = juv;
		}

	}
}
