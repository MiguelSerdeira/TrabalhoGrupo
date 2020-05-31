package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.List;

public class Equipa {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private int codIdent;
	private String nome;
	private String escalao;
	private List<Jogador> jogador = new ArrayList<Jogador>();
	private List<Treinador> treinador = new ArrayList<Treinador>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getCodIdent() {
		return codIdent;
	}

	public void setCodIdent(int codIdent) {
		this.codIdent = codIdent;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public List<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(List<Jogador> jogador) {
		this.jogador = jogador;
	}

	public void addJogador(Jogador jogador) {
		this.jogador.add(jogador);

	}

	public List<Treinador> getTreinador() {
		return treinador;
	}

	public void setTreinador(List<Treinador> treinador) {
		this.treinador = treinador;
	}

	public void addTreinador(Treinador treinador) {
		this.treinador.add(treinador);
	}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

<<<<<<< HEAD
	// CONSTRUTOR COM PARÂMETROS
=======
	// CONSTRUTOR COM PAR�METROS
>>>>>>> Desenvolvimento

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
<<<<<<< HEAD

<<<<<<< HEAD
	public String mostrarTudo() {
=======
public String mostrarTudo() {
>>>>>>> Desenvolvimento
		String mostrar = "";
		mostrar += "======EQUIPA======" + "\n";

		mostrar += "Equipa: " + this.getNome() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";
		mostrar += "Jogadores: " + this.getJogador().size() + "\n";
		mostrar += "Treinadores: " + this.getTreinador().size() + "\n";
		return mostrar;
	}

	public String mostrarJogadores() {
		String mostrar = "";

		this.jogador.sort(null);
		for (Jogador jogador : jogador) {
			mostrar += jogador.mostrarTudo();
		}
		return mostrar;
	}

	public String mostrarTreinadores() {
		String mostrar = "";

		this.jogador.sort(null);
		for (Treinador treinador : treinador) {
			mostrar += treinador.mostrarTudo();
		}
		return mostrar;
	}

	public boolean removeJogador(int numeroCartaoCidadao) {
		int procurar = cidadaoJogador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.jogador.remove(procurar);
		return true;
	}

	public boolean removeTreinador(int numeroCartaoCidadao) {
		int procurar = cidadaoTreinador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.treinador.remove(procurar);
		return true;
	}

	public boolean editarJogador(int numeroCartaoCidadao, Jogador jogador) {
		int procurar = cidadaoJogador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.jogador.set(procurar, jogador);
		return true;
	}

	public boolean editarTreinador(int numeroCartaoCidadao, Treinador treinador) {
		int procurar = cidadaoTreinador(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.treinador.set(procurar, treinador);
		return true;
	}

	public int cidadaoJogador(int numeroCartaoCidadao) {
		for (int i = 0; i < jogador.size(); i++) {
			if (jogador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

	public int cidadaoTreinador(int numeroCartaoCidadao) {
		for (int i = 0; i < treinador.size(); i++) {
			if (treinador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

=======
	public String mostrarTudo() { 
		String mostrar = ""; 
		mostrar += "======EQUIPA======" + "\n"; 
 
		mostrar += "Equipa: " + this.getNome() + "\n"; 
		mostrar += "Codigo: " + this.getCodIdent() + "\n"; 
		mostrar += "Escalao: " + this.getEscalao() + "\n"; 
		mostrar += "Jogadores: " + this.getJogador().size() + "\n"; 
		mostrar += "Treinadores: " + this.getTreinador().size() + "\n"; 
		return mostrar; 
	} 
 
	public String mostrarJogadores() { 
		String mostrar = ""; 
 
		this.jogador.sort(null); 
		for (Jogador jogador : jogador) { 
			mostrar += jogador.mostrarTudo(); 
		} 
		return mostrar; 
	} 
 
	public String mostrarTreinadores() { 
		String mostrar = ""; 
 
		this.jogador.sort(null); 
		for (Treinador treinador : treinador) { 
			mostrar += treinador.mostrarTudo(); 
		} 
		return mostrar; 
	} 
 
	public boolean removeJogador(int numeroCartaoCidadao) { 
		int procurar = cidadaoJogador(numeroCartaoCidadao); 
		if (procurar == -1) 
			return false; 
		this.jogador.remove(procurar); 
		return true; 
	} 
 
	public boolean removeTreinador(int numeroCartaoCidadao) { 
		int procurar = cidadaoTreinador(numeroCartaoCidadao); 
		if (procurar == -1) 
			return false; 
		this.treinador.remove(procurar); 
		return true; 
	} 
 
	public boolean editarJogador(int numeroCartaoCidadao, Jogador jogador) { 
		int procurar = cidadaoJogador(numeroCartaoCidadao); 
		if (procurar == -1) 
			return false; 
		this.jogador.set(procurar, jogador); 
		return true; 
	} 
 
	public boolean editarTreinador(int numeroCartaoCidadao, Treinador treinador) { 
		int procurar = cidadaoTreinador(numeroCartaoCidadao); 
		if (procurar == -1) 
			return false; 
		this.treinador.set(procurar, treinador); 
		return true; 
	} 
 
	public int cidadaoJogador(int numeroCartaoCidadao) { 
		for (int i = 0; i < jogador.size(); i++) { 
			if (jogador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao) 
				return i; 
		} 
		return -1; 
	} 
 
	public int cidadaoTreinador(int numeroCartaoCidadao) { 
		for (int i = 0; i < treinador.size(); i++) { 
			if (treinador.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao) 
				return i; 
		} 
		return -1; 
	} 
 
>>>>>>> Desenvolvimento
	// =======================================================
<<<<<<< HEAD
	// ============== MÉTODOS COMPLEMENTARES ==============
=======
	// ============== M�TODOS COMPLEMENTARES ==============
>>>>>>> Desenvolvimento
	// =======================================================

	// ----> toString()
	@Override
	public String toString() {
		String mostrar = "";

		mostrar += "Equipa: " + this.getNome() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";
		mostrar += "Jogadores: " + this.getJogador().size() + "\n";
		mostrar += "Treinadores: " + this.getTreinador().size() + "\n";
		return mostrar;
	}

	// ----> equals()
}
