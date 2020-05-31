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

	// CONSTRUTOR COM PAR�METROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()
	@Override
	public String toString() {
		return "\r\n" + "Equipa [codIdent=" + codIdent + ", nome=" + nome + ", escalao=" + escalao + "\r\n" + "Jogador="
				+ jogador + "\r\n" + "Treinador=" + treinador + "]" + "\r\n";
	}

	// ----> equals()
}
