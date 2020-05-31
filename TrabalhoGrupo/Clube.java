package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clube {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private int codIdent;
	private String nome;
	private Date dataFundacao;
	private String corEquipamento;
	private int contato;
	private String email;
	private String morada;
	private List<Equipa> equipa = new ArrayList<Equipa>();

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

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCorEquipamento() {
		return corEquipamento;
	}

	public void setCorEquipamento(String corEquipamento) {
		this.corEquipamento = corEquipamento;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int i) {
		this.contato = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
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

	public void removeEquipas(int codIdent) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodIdent() == codIdent) {
				this.equipa.remove(codIdent);
			}
		}

	}

	public int nTotalJogadores() {
		int nmrJogadores = 0;
		for (Equipa equipa : this.equipa) {
			nmrJogadores += equipa.getJogador().size();
		}
		return nmrJogadores;
	}

	public int nTotalTreinadores() {
		int nmrTreinadores = 0;
		for (Equipa equipa : this.equipa) {
			nmrTreinadores += equipa.getTreinador().size();
		}
		return nmrTreinadores;
	}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	// CONSTRUTOR COM PAR�METROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
public boolean removeEquipa(int codIdent) {
        int procurar = codIdentEquipa(codIdent);
        if (procurar == -1)
            return false;
        this.equipa.remove(procurar);
        return true;
    }

    public boolean editarEquipa(int codIdent, Equipa equipa) {
        int procurar = codIdentEquipa(codIdent);
        if (procurar == -1)
            return false;
        this.equipa.set(procurar, equipa);
        return true;
    }

    public int codIdentEquipa(int codIdent) {
        for (int i = 0; i < equipa.size(); i++) {
            if (equipa.get(i).getCodIdent() == codIdent)
                return i;
        }
        return -1;
    }
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Clube [codIdent=" + codIdent + ", nome=" + nome + ", dataFundacao=" + dataFundacao + ", corEquipamento="
				+ corEquipamento + ", contato=" + contato + ", email=" + email + ", morada=" + morada + ", equipa="
				+ equipa + "]\r\n";
	}

	// ----> equals()

}
