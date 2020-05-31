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
	private List<Jogo> jogo = new ArrayList<Jogo>();

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
		return jogo;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogo = jogos;
	
	}

	public void addJogos(Jogo jogos) {
		
	
		this.jogo.add(jogos);
	}

	public List<Equipa> getEquipa() {
		return equipa;
	}

	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}

	public void addEquipas(Equipa equipa) {

		if (codIdentEquipa(equipa.getCodIdent()) >= 0) {
			throw new IllegalArgumentException("A equipa com o código:" + equipa.getCodIdent() + " já existe");

		}

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
	
	public String mostrarTudo() {
		
		String mostrar = "";
		mostrar += "======COMPETICAO======" + "\n";

		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Escalao: " + this.getEscalao() + "\n";

		mostrar += this.mostrarEquipas() + "\n";

		return mostrar;

	}

	public String mostrarEquipas() {
		String mostrar = "";
		
		for (Equipa equipa : equipa) {
		

			mostrar += equipa.mostrarTudo()+"\n";
		}
		return mostrar;
	}

	public String mostrarJogosJornada (int jornada) {
		String mostrar = "";
		
		for (Jogo jogo: jogo) {
			if (jogo.getJornada() == jornada)
				mostrar += "======JOGOS======" + "\n";
				mostrar += jogo.mostrarTudo()+"\n";
		}
		return mostrar;
	}
	
	public boolean removeEquipas(int codIdent) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		equipa.remove(procurar);
		return true;
	}

	public boolean removeJogos(int codIdent) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		equipa.remove(procurar);
		return true;
	}
	
	public boolean editarEquipa(int codIdent, Equipa equipa) {
		int procurar = codIdentEquipa(codIdent);
		if (procurar == -1)
			return false;
		this.equipa.set(procurar, equipa);
		return true;
	}
	
	public boolean editarJogo(int codIdent, Jogo jogo) {
		int procurar = codIdentJogo(codIdent);
		if (procurar == -1)
			return false;
		this.jogo.set(procurar, jogo);
		return true;
	}
	
	public int codIdentEquipa(int codIdent) {
		for (int i = 0; i < equipa.size(); i++) {
			if (equipa.get(i).getCodIdent() == codIdent)
				return i;
		}
		return -1;
	}
	
	public int codIdentJogo(int codIdent) {
		for (int i = 0; i < jogo.size(); i++) {
			if (jogo.get(i).getCodIdent() == codIdent)
				return i;
		}
		return -1;
	}

	public boolean jornadaJogo (Jogo jogo1) {
		for (Jogo jogo : jogo) {
			if (jogo.getJornada() == jogo.getJornada()) {
				if (jogo.getEquipaVisitada().getCodIdent() == jogo.getEquipaVisitada().getCodIdent())
					return true;
				if (jogo.getEquipaVisitante().getCodIdent() == jogo.getEquipaVisitante().getCodIdent());
					return true;
				
			}
		}
		return false;
	}

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Competicao [codIdent=" + codIdent + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", escalao=" + escalao + ", participantes=" + participantes + "equipa=" + equipa
				+ ", jogos=" + jogo + "]";
	}

	// ----> equals()

}