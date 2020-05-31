package TrabalhoGrupo;

import java.util.Date;

public class Treinador extends Pessoa{



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



    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

    public String mostrarTudo() {
        String mostrar = "";
        mostrar += "======TREINADOR======" + "\n";

        mostrar += "Nome: " + this.getNome() + "\n";
        mostrar += "Contato: " + this.getContacto() + "\n";
        mostrar += "Email: " + this.getEmail() + "\n";
        mostrar += "Cartão de cidadão: " + this.getNumeroCartaoCidadao() + "\n";
        mostrar += "Data Nascimento: " + this.getDataNascimento() + "\n";

        return mostrar;
    }


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()
}