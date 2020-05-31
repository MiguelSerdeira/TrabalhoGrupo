package TrabalhoGrupo;

import java.util.Date;

public abstract class Pessoa implements Comparable <Pessoa> {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private int numeroCartaoCidadao;
	private String nome;
	private int contacto;
	private String email;
	private Date dataNascimento;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	}
	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public int compareTo(Pessoa obj) {
		return obj.nome.compareTo(this.nome) * -1;
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Pessoa [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", contacto=" + contacto
				+ ", email=" + email + ", dataNascimento=" + dataNascimento + "]";
	}

    // ----> equals()
}
