package TrabalhoGrupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arbitro extends Pessoa{

	 // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================



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
		mostrar += "======ARBITRO======" + "\n";

		mostrar += "Nome: " + this.getNome() + "\n";
		mostrar += "Contato: " + this.getContacto() + "\n";
		mostrar += "Email: " + this.getEmail() + "\n";
		mostrar += "Cart�o de cidad�o: " + this.getNumeroCartaoCidadao() + "\n";
		mostrar += "Data de Nascimento: " + this.getDataNascimento() + "\n";

		
		return mostrar;
	}

    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}
