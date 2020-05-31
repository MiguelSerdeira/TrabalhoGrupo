package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int golosVisitada;
	private int golosVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitro = new ArrayList<Arbitro>();
	private int codIdent;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	}

	public void setEquipaVisitada(Equipa equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}

	public int getCodIdent() {
		return codIdent;
	}

	public void setCodIdent(int codIdent) {
		this.codIdent = codIdent;
	}

	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	}

	public void setEquipaVisitante(Equipa equipaVisitante) {
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
		return arbitro;
	}

	public void setArbitros(List<Arbitro> arbitros) {
		this.arbitro = arbitros;
	}

	public void addArbitros(Arbitro arbitro) {
		this.arbitro.add(arbitro);

	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

<<<<<<< HEAD
	// CONSTRUTOR COM PARÃ‚METROS
=======
	// CONSTRUTOR COM PARÂMETROS
>>>>>>> Desenvolvimento

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
<<<<<<< HEAD

	public String mostrarTudo() {
		String mostrar = "";
	
		mostrar += "======JOGO======"+ "\n";

		mostrar += "Jornada: " + this.getJornada() + "\n";
		mostrar += "Codigo: " + this.getCodIdent() + "\n";
		mostrar += "Data: " + this.getData() + "\n";
		mostrar += "Arbitros: " + this.getArbitros().size() + "\n";
		mostrar += "\n";
		mostrar += "======EQUIPA VISITADA======";
		mostrar += this.getEquipaVisitada() + "\n";
		mostrar += "======EQUIPA VISITANTE======";
		mostrar += this.getEquipaVisitante() + "\n";
		mostrar += "======GOLOS======"+ "\n";
		mostrar += "Golos Equipa Visitada: " + this.getGolosVisitada() + "\n";
		mostrar += "Golos Equipa Visitante: " + this.getGolosVisitante() + "\n";
		
		return mostrar;
	}

	public boolean removerArbitro(int numeroCartaoCidadao) {
		int procurar = cidadaoArbitro(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.arbitro.remove(procurar);
		return true;
	}

	public boolean editarArbitro(int numeroCartaoCidadao, Arbitro arbitro) {
		int procurar = cidadaoArbitro(numeroCartaoCidadao);
		if (procurar == -1)
			return false;
		this.arbitro.set(procurar, arbitro);
		return true;
	}

	private int cidadaoArbitro(int numeroCartaoCidadao) {
		for (int i = 0; i < arbitro.size(); i++) {
			if (arbitro.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao)
				return i;
		}
		return -1;
	}

	public void addGoloVisitada(int codIdent) {
		if (codIdent == this.equipaVisitada.getCodIdent()) {
			if (this.getEquipaVisitada().getCodIdent() == codIdent)
				this.golosVisitada += 1;
		}
	}

	public void removerGoloVisitada(int codIdent) {
		if (codIdent == this.equipaVisitada.getCodIdent()) {
			if (this.getEquipaVisitada().getCodIdent() == codIdent)
				this.golosVisitada -= 1;
		}
	}

	public void addGoloVisitante(int codIdent) {
		if (codIdent == this.equipaVisitante.getCodIdent()) {
			if (this.getEquipaVisitante().getCodIdent() == codIdent)
				this.golosVisitante += 1;
		}
	}

	public void removerGoloVisitante(int codIdent) {
		if (codIdent == this.equipaVisitante.getCodIdent()) {
			if (this.getEquipaVisitante().getCodIdent() == codIdent)
				this.golosVisitante -= 1;
		}
	}

	public boolean codIdentVisitada(int codIdent) {
		boolean procurar = false;
		if (codIdent == this.equipaVisitada.getCodIdent()) {
			procurar = true;
		} else {
			if (codIdent == this.equipaVisitada.getCodIdent()) {
				procurar = true;
			}
		}
		return procurar;
	}
	
	public boolean codIdentVisitante(int codIdent) {
		boolean procurar = false;
		if (codIdent == this.equipaVisitante.getCodIdent()) {
			procurar = true;
		} else {
			if (codIdent == this.equipaVisitante.getCodIdent()) {
				procurar = true;
			}
		}
		return procurar;
	}

	// =======================================================
	// ============== MÃ‰TODOS COMPLEMENTARES ==============
=======
	public boolean removerArbitro(int numeroCartaoCidadao) { 
        int procurar = cidadaoArbitro(numeroCartaoCidadao); 
        if (procurar == -1) 
            return false; 
        this.arbitro.remove(procurar); 
        return true; 
    } 
 
    public boolean editarArbitro(int numeroCartaoCidadao, Arbitro arbitro) { 
        int procurar = cidadaoArbitro(numeroCartaoCidadao); 
        if (procurar == -1) 
            return false; 
        this.arbitro.set(procurar, arbitro); 
        return true; 
    } 
 
    private int cidadaoArbitro(int numeroCartaoCidadao) { 
        for (int i = 0; i < arbitro.size(); i++) { 
            if (arbitro.get(i).getNumeroCartaoCidadao() == numeroCartaoCidadao) 
                return i; 
        } 
        return -1; 
    } 
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
>>>>>>> Desenvolvimento
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Jogo [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante + ", golosVisitada="
				+ golosVisitada + ", golosVisitante=" + golosVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitro + "]";
	}

	// ----> equals()
}