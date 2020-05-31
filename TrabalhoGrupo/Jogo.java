package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private String equipaVisitada;
	private String equipaVisitante;
	private int golosVisitada;
	private int golosVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitros = new ArrayList<Arbitro>();
	private int codIdent;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getEquipaVisitada() {
		return equipaVisitada;
	}

	public void setEquipaVisitada(String equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}

	public int getCodIdent() {
		return codIdent;
	}

	public void setCodIdent(int codIdent) {
		this.codIdent = codIdent;
	}

	public String getEquipaVisitante() {
		return equipaVisitante;
	}

	public void setEquipaVisitante(String equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	}

	public int getGolosVisitada() {
		return golosVisitada;
	}

	public void setGolosVisitada(int golosVisitada) {
		this.golosVisitada = golosVisitada;
	}

	public int getGolosVisitante() {
		return golosVisitante;
	}

	public void setGolosVisitante(int golosVisitante) {
		this.golosVisitante = golosVisitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public List<Arbitro> getArbitros() {
		return arbitros;
	}

	public void setArbitros(List<Arbitro> arbitros) {
		this.arbitros = arbitros;
	}

	public void addArbitros(Arbitro arbitro) {
		this.arbitros.add(arbitro);

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
		return "Jogo [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante + ", golosVisitada="
				+ golosVisitada + ", golosVisitante=" + golosVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitros + "]\r\n";
	}

	// ----> equals()
}
