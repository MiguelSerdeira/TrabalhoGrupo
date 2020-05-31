package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicao {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private int codIdent;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private String escalao;
	private int participantes;
	private List<Equipa> equipa = new ArrayList<Equipa>();
	private List<Jogo> jogos = new ArrayList<Jogo>();

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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public int getParticipantes() {
		return participantes;
	}

	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public void addJogos(Jogo jogos) {
		this.jogos.add(jogos);
	}

	public List<Equipa> getEquipa() {
		return equipa;
	}

	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}

	public void addEquipas(Equipa equipa) {
		this.equipa.add(equipa);
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	// CONSTRUTOR COM PARÂMETROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Competicao [codIdent=" + codIdent + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", escalao=" + escalao + ", participantes=" + participantes + "equipa=" + equipa
				+ ", jogos=" + jogos + "]";
	}

	// ----> equals()

}
