package TrabalhoGrupo;

import java.util.Date;

public class Jogador extends Pessoa{

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	
	private String posicao;
	private String pe;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getPe() {
		return pe;
	}
	public void setPe(String pe) {
		this.pe = pe;
	}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PAR�METROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public String mostrarTudo() {
		String mostrar = "";
		mostrar +=  "======JOGADOR======" + "\n";

		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Contato: " + this.getContacto() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Cart�o de cidad�o: " + this.getNumeroCartaoCidadao() + "\n";
		mostrar += "P� preferido: " + this.getPe() + "\n";
		mostrar += "Posi��o: " + this.getPosicao() + "\n" ;
		mostrar += "\n" ;

		return mostrar;
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Jogador [posicao=" + posicao + ", pe=" + pe + "]";
	}

    // ----> equals()
}
