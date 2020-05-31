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
