package TrabalhoGrupo;

import java.util.Date;

public class main {

	public static void main(String[] args) {

		Competicao competicao = new Competicao();
		competicao.setCodIdent(123);
		competicao.setDataInicio(new Date("12/10/2020  12:00:00"));
		competicao.setDataFim(new Date("12/10/2020  12:00:00"));
		competicao.setEscalao("Juvenil");
		competicao.setNome("teste");
		competicao.setParticipantes(24);

		Jogo jogos1 = new Jogo();
		Arbitro arbitro1 = new Arbitro();
		jogos1.addArbitros(arbitro1);
		competicao.addJogos(jogos1);

		arbitro1.setContacto(911111111);
		arbitro1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		arbitro1.setNumeroCartaoCidadao(12345);
		arbitro1.setEmail("teste@gmail.com");
		arbitro1.setNome("Manel");

		jogos1.setData(new Date("12/10/2020  12:00:00"));
		jogos1.setEquipaVisitada("Barcelona");
		jogos1.setEquipaVisitante("Real Madrid");
		jogos1.setGolosVisitada(1);
		jogos1.setGolosVisitante(2);
		jogos1.setJornada(3);

		Equipa equipa1 = new Equipa();
		competicao.addEquipas(equipa1);

		equipa1.setCodIdent(123);
		equipa1.setEscalao("Juvenil");
		equipa1.setNome("Barcelona");

		Treinador treinador1 = new Treinador();
		equipa1.addTreinador(treinador1);

		treinador1.setContacto(930000000);
		treinador1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		treinador1.setNumeroCartaoCidadao(1234);
		treinador1.setEmail("teste@gmail.com");
		treinador1.setNome("Frederico");

		Jogador jogador1 = new Jogador();
		equipa1.addJogador(jogador1);

		jogador1.setContacto(964342572);
		jogador1.setDataNascimento(new Date("12/10/2020  12:00:00"));
		jogador1.setEmail("teste@gmail.com");
		jogador1.setNome("Miguel");
		jogador1.setNumeroCartaoCidadao(321);
		jogador1.setPe("D");
		jogador1.setPosicao("Médio");

		Clube clube1 = new Clube();

		clube1.setCodIdent(123);
		clube1.setContato(932222222);
		clube1.setCorEquipamento("Verde");
		clube1.setDataFundacao(new Date("12/10/2020  12:00:00"));
		clube1.setEmail("teste@gmail.com");
		clube1.addEquipas(equipa1);
		clube1.setMorada("teste");
		clube1.setNome("Barcelona");

//	System.out.println(competicao);
//	System.out.println(clube1);
//	System.out.println(clube1.nTotalJogadores());
//	System.out.println(clube1.nTotalTreinadores());

	}

}
