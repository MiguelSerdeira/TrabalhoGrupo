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


<<<<<<< HEAD

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================



    // CONSTRUTOR DEFAULT



    // CONSTRUTOR COM PARÃ‚METROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

    public String mostrarTudo() {
        String mostrar = "";
        mostrar += "======ARBITRO======" + "\n";

        mostrar += "Nome: " + this.getNome() + "\n";
        mostrar += "Contato: " + this.getContacto() + "\n";
        mostrar += "Email: " + this.getEmail() + "\n";
        mostrar += "CartÃ£o de cidadÃ£o: " + this.getNumeroCartaoCidadao() + "\n";
        mostrar += "Data de Nascimento: " + this.getDataNascimento() + "\n";


        return mostrar;
    }
=======
	// CONSTRUTOR COM PARÂMETROS

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	public String mostrarTudo() { 
        String mostrar = ""; 
        mostrar += "======ARBITRO======" + "\n"; 
 
        mostrar += "Nome: " + this.getNome() + "\n"; 
        mostrar += "Contato: " + this.getContacto() + "\n"; 
        mostrar += "Email: " + this.getEmail() + "\n"; 
        mostrar += "Cartão de cidadão: " + this.getNumeroCartaoCidadao() + "\n"; 
        mostrar += "Data de Nascimento: " + this.getDataNascimento() + "\n"; 
 
 
        return mostrar; 
    } 
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
>>>>>>> Desenvolvimento

    // =======================================================
    // ============== MÃ‰TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}