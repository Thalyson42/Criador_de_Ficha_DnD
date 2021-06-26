package CriadorDeFicha;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Antecedentes extends Classes{
//	private FichaDoPersonagem ficha;
//	private Idiomas idiomas;
//	private Equipamentos equips;
//	private Proficiencia proficiencia;
	private SecureRandom random = new SecureRandom();
	
	public int getTIVD(int TIVD) {
		int random = 0;
		if(TIVD == 8) {
			random = this.random.nextInt((8 - 1) + 1) + 1;
		}else if(TIVD == 6) {
			random = this.random.nextInt((6 - 1) + 1) + 1;
		}
		
		return random-1;
	}
	
//	public int getTracoRandom(String antecedente) {
//		int random = 0;
//			random = getTIVD(8)-1;
//			
//			if(random != reroll) {
//				tracos.add(getTraco(antecedente, random));
//				reroll = random;
//				count--;
//			}
//		}
//		
//		return random;
//	}
	
	public String descricaoAntecedente(int i) {
		switch(i) {
		case 0:
			return getacolitoDescricao();
			
		case 1:
			return getArtesaoDaGuilda();
		
		case 2:
			return getArtista();
		
		case 3:
			return getCharlatao();
			
		case 4:
			return getCriminoso();
			
		case 5:
			return getEremita();
			
		case 6:
			return getForasteiro();
			
		case 7:
			return getHeroiDoPovo();
		
		case 8:
			return getMarinheiro();
			
		case 9:
			return getNobre();
			
		case 10:
			return getOrfao();
			
		case 11:
			return getSabio();
			
		case 12:
			return getSoldado();
		}
		
		return null;
	}
	
	public String getIdealRandom(String antecedente) {
		int random = getTIVD(6)-1;
		return getIdeal(antecedente, random);
	}
	
	public String getVinculoRandom(String antecedente) {
		int random = getTIVD(6)-1;
		return getVinculo(antecedente, random);
	}
	
	
	public String getDefeitoRandom(String antecedente) {
		int random = getTIVD(6)-1;
		return getDefeito(antecedente, random);
	}
	
	public String getTraco(String antecedente, int i) {
		String traco = null;
		switch(antecedente) {
		case "Ac�lito":
			traco = this.tracoAcolito.get(i);
		break;
		
		case "Artes�o de guilda":
			traco = this.tracoArtesao.get(i);
		break;
		
		case "Artista":
			traco = this.tracoArtista.get(i);
		break;
		
		case "Charlat�o":
			traco = this.tracoCharlatao.get(i);
		break;
		
		case "Criminoso":
			traco = this.tracoCriminoso.get(i);
		break;
		
		case "Eremita":
			traco = this.tracoEremita.get(i);
		break;
		
		case "Forasteiro":
			traco = this.tracoForasteiro.get(i);
		break;
		
		case "Her�i do povo":
			traco = this.tracoHeroi.get(i);
		break;
		
		case "Marinheiro":
			traco = this.tracoMarinheiro.get(i);
		break;
		
		case "Nobre":
			traco = this.tracoNobre.get(i);
		break;
		
		case "�rf�o":
			traco = this.tracoOrfao.get(i);
		break;
		
		case "S�bio":
			traco = this.tracoSabio.get(i);
		break;
		
		case "Soldado":
			traco = this.tracoSoldado.get(i);
		break;
		}
		return traco;
	}
	
	public List<String> getTraco(String antecedente) {
		switch(antecedente) {
		case "Ac�lito":
			return this.tracoAcolito;
			
		case "Artes�o de guilda":
			return this.tracoArtesao;
			
		case "Artista":
			return this.tracoArtista;
			
		case "Charlat�o":
			return this.tracoCharlatao;
		
		case "Criminoso":
			return this.tracoCriminoso;
			
		case "Eremita":
			return this.tracoEremita;
			
		case "Forateiro":
			return this.tracoForasteiro;
			
		case "Her�i do povo":
			return this.tracoHeroi;
			
		case "Marinheiro":
			return this.tracoMarinheiro;
			
		case "Nobre":
			return this.tracoNobre;
		
		case "�rf�o":
			return this.tracoOrfao;
			
		case "S�bio":
			return this.tracoSabio;
			
		case "Soldado":
			return this.tracoSoldado;
		}
		return null;
	}
	
	public String getIdeal(String antecedente, int i) {
		String ideal = null;
		switch(antecedente) {
		case "Ac�lito":
			ideal = this.idealAcolito.get(i);
		break;
		
		case "Artes�o de guilda":
			ideal = this.idealArtesao.get(i);
		break;
		
		case "Artista":
			ideal = this.idealArtista.get(i);
		break;
		
		case "Charlat�o":
			ideal = this.idealCharlatao.get(i);
		break;
		
		case "Criminoso":
			ideal = this.idealCriminoso.get(i);
		break;
		
		case "Eremita":
			ideal = this.idealEremita.get(i);
		break;
		
		case "Forasteiro":
			ideal = this.idealForasteiro.get(i);
		break;
		
		case "Her�i do povo":
			ideal = this.idealHeroi.get(i);
		break;
		
		case "Marinheiro":
			ideal = this.idealMarinheiro.get(i);
		break;
		
		case "Nobre":
			ideal = this.idealNobre.get(i);
		break;
		
		case "�rf�o":
			ideal = this.idealOrfao.get(i);
		break;
		
		case "S�bio":
			ideal = this.idealSabio.get(i);
		break;
		
		case "Soldado":
			ideal = this.idealSoldado.get(i);
		break;
		}
		return ideal;
	}
	
	public List<String> getIdeal(String antecedente) {
		switch(antecedente) {
		case "Ac�lito":
			return this.idealAcolito;
			
		case "Artes�o de guilda":
			return this.idealArtesao;
			
		case "Artista":
			return this.idealArtista;
			
		case "Charlat�o":
			return this.idealCharlatao;
			
		case "Criminoso":
			return this.idealCriminoso;
			
		case "Eremita":
			return this.idealEremita;
			
		case "Forasteiro":
			return this.idealForasteiro;
			
		case "Her�i do povo":
			return this.idealHeroi;
			
		case "Marinheiro":
			return this.idealMarinheiro;
			
		case "Nobre":
			return this.idealNobre;
		
		case "�rf�o":
			return this.idealOrfao;
			
		case "S�bio":
			return this.idealSabio;
			
		case "Soldado":
			return this.idealSoldado;
		}
		return null;
	}
	
	public String getVinculo(String antecedente, int i) {
		String vinculo = null;
		switch(antecedente) {
		case "Ac�lito":
			vinculo = this.vinculoAcolito.get(i);
		break;
		
		case "Artes�o de guilda":
			vinculo = this.vinculoArtesao.get(i);
		break;
		
		case "Artista":
			vinculo = this.vinculoArtista.get(i);
		break;
		
		case "Charlat�o":
			vinculo = this.vinculoCharlatao.get(i);
		break;
		
		case "Criminoso":
			vinculo = this.vinculoCriminoso.get(i);
		break;
		
		case "Eremita":
			vinculo = this.vinculoEremita.get(i);
		break;
		
		case "Forasteiro":
			vinculo = this.vinculoForasteiro.get(i);
		break;
		
		case "Her�i do povo":
			vinculo = this.vinculoHeroi.get(i);
		break;
		
		case "Marinheiro":
			vinculo = this.vinculoMarinheiro.get(i);
		break;
		
		case "Nobre":
			vinculo = this.vinculoNobre.get(i);
		break;
		
		case "�rf�o":
			vinculo = this.vinculoOrfao.get(i);
		break;
		
		case "S�bio":
			vinculo = this.vinculoSabio.get(i);
		break;
		
		case "Soldado":
			vinculo = this.vinculoSoldado.get(i);
		break;
		}
		return vinculo;
	}
	
	public List<String> getVinculo(String antecedente) {
		switch(antecedente) {
		case "Ac�lito":
			return this.vinculoAcolito;
			
		case "Artes�o de guilda":
			return this.vinculoArtesao;

		case "Artista":
			return this.vinculoArtista;

		case "Charlat�o":
			return this.vinculoCharlatao;
			
		case "Criminoso":
			return this.vinculoCriminoso;
			
		case "Eremita":
			return this.vinculoEremita;
			
		case "Forasteiro":
			return this.vinculoForasteiro;
			
		case "Her�i do povo":
			return this.vinculoHeroi;
			
		case "Marinheiro":
			return this.vinculoMarinheiro;
			
		case "Nobre":
			return this.vinculoNobre;
			
		case "�rf�o":
			return this.vinculoOrfao;
			
		case "S�bio":
			return this.vinculoSabio;
			
		case "Soldado":
			return this.vinculoSoldado;
		}
		
		return null;
	}
	
	public String getDefeito(String antecedente, int i) {
		String defeito = null;
		switch(antecedente) {
		case "Ac�lito":
			defeito = this.defeitoAcolito.get(i);
		break;
		
		case "Artes�o de guilda":
			defeito = this.defeitoArtesao.get(i);
		break;
		
		case "Artista":
			defeito = this.defeitoArtista.get(i);
		break;
		
		case "Charlat�o":
			defeito = this.defeitoCharlatao.get(i);
		break;
		
		case "Criminoso":
			defeito = this.defeitoCriminoso.get(i);
		break;
		
		case "Eremita":
			defeito = this.defeitoEremita.get(i);
		break;
		
		case "Forasteiro":
			defeito = this.defeitoForasteiro.get(i);
		break;
		
		case "Her�i do povo":
			defeito = this.defeitoHeroi.get(i);
		break;
		
		case "Marinheiro":
			defeito = this.defeitoMarinheiro.get(i);
		break;
		
		case "Nobre":
			defeito = this.defeitoNobre.get(i);
		break;
		
		case "�rf�o":
			defeito = this.defeitoOrfao.get(i);
		break;
		
		case "S�bio":
			defeito = this.defeitoSabio.get(i);
		break;
		
		case "Soldado":
			defeito = this.defeitoSoldado.get(i);
		break;
		}
		return defeito;
	}
	
	public List<String> getDefeito(String antecedente) {
		switch(antecedente) {
		case "Ac�lito":
			return this.defeitoAcolito;
			
		case "Artes�o de guilda":
			return this.defeitoArtesao;
			
		case "Artista":
			return this.defeitoArtista;
		
		case "Charlat�o":
			return this.defeitoCharlatao;
	
		case "Criminoso":
			return this.defeitoCriminoso;
		
		case "Eremita":
			return this.defeitoEremita;
		
		case "Forasteiro":
			return this.defeitoForasteiro;
		
		case "Her�i do povo":
			return this.defeitoHeroi;

		case "Marinheiro":
			return this.defeitoMarinheiro;
		
		case "Nobre":
			return this.defeitoNobre;
		
		case "�rf�o":
			return this.defeitoOrfao;
		
		case "S�bio":
			return this.defeitoSabio;
		
		case "Soldado":
			return this.defeitoSoldado;
		}
		return null;
	}
	
	public void setAntecedente(String antecedente) {
		switch(antecedente) {
		case "Ac�lito":
			setAcolito();
		break;
		
		case "Artes�o de guilda":
			setArtesaoDeGuilda();
		break;
		
		case "Artista":
			setArtista();
		break;
		
		case "Charlat�o":
			setCharlatao();
		break;
		
		case "Criminoso":
			setCriminoso();
		break;
		
		case "Eremita":
			setEremita();
		break;
		
		case "Forasteiro":
			setForasteiro();
		break;
		
		case "Her�i do povo":
			setHeroiDoPovo();
		break;
		
		case "Marinheiro":
			setMarinheiro();
		break;
		
		case "Nobre":
			setNobre();
		break;
		
		case "�rf�o":
			setOrfao();
		break;
		
		case "S�bio":
			setSabio();
		break;
		
		case "Soldado":
			setSoldado();
		break;
		}
	}
	
	public String getacolitoDescricao() {
		String descricao ="AC�LITO\r\n\n"
				+ "Voc� viveu a servi�o de um templo de algum deus\r\n"
				+ "especifico ou de um pante�o de deuses. Voc� age como um\r\n"
				+ "intermedi�rio entre o reino divino e o reino dos mortais,\r\n"
				+ "realizando rituais e ofertando sacrif�cios para conduzir\r\n"
				+ "cada vez mais pessoas a adorarem a divindade. Voc� n�o\r\n"
				+ "� necessariamente um cl�rigo � realizar ritos sagrados\r\n"
				+ "n�o � a mesma coisa que canalizar poder divino.\r\n"
				+ "Escolha um deus, um pante�o de deuses ou outro ser\r\n"
				+ "quase divino entre aqueles descritos no ap�ndice B ou\r\n"
				+ "outro especificado pelo seu Mestre para detalhar a\r\n"
				+ "natureza do seu servi�o religioso. Voc� foi um servi�al\r\n"
				+ "menor no templo, criado desde a inf�ncia para auxiliar os\r\n"
				+ "sacerdotes em ritos sagrados? Ou voc� foi um alto\r\n"
				+ "sacerdote que repentinamente sentiu o chamado para\r\n"
				+ "servir seu deus de uma maneira diferente? Talvez voc� foi\r\n"
				+ "o l�der de um pequeno culto n�o associado a templo\r\n"
				+ "algum, ou mesmo uma seita secreta que servia a uma\r\n"
				+ "entidade demon�aca que agora voc� nega.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Religi�o\r\n"
				+ "Idiomas: Dois � sua escolha\r\n"
				+ "Equipamento: Um s�mbolo sagrado (um presente dado\r\n"
				+ "quando voc� entrou no templo), um livro de preces ou\r\n"
				+ "uma conta de ora��es, 5 varetas de incenso,\r\n"
				+ "vestimentas, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 15 po\r\n\n";
		
		return descricao;
	}
	
	public String getArtesaoDaGuilda() {
		String descricao = "ARTES�O DE GUILDA\r\n"
				+ "Voc� � membro de uma guilda de artes�os, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artes�os. Voc� � uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, gra�as aos seus talentos e riqueza, das\r\n"
				+ "restri��es de uma ordem social feudal. Voc� aprendeu\r\n"
				+ "suas per�cias como aprendiz de um mestre artes�o, com o\r\n"
				+ "patroc�nio da sua guilda, at� se tornar um mestre por\r\n"
				+ "seus pr�prios m�ritos.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o\r\n"
				+ "Idiomas: Uma, � sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma carta de apresenta��o da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 poARTES�O DE GUILDA\r\n"
				+ "Voc� � membro de uma guilda de artes�os, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artes�os. Voc� � uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, gra�as aos seus talentos e riqueza, das\r\n"
				+ "restri��es de uma ordem social feudal. Voc� aprendeu\r\n"
				+ "suas per�cias como aprendiz de um mestre artes�o, com o\r\n"
				+ "patroc�nio da sua guilda, at� se tornar um mestre por\r\n"
				+ "seus pr�prios m�ritos.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o\r\n"
				+ "Idiomas: Uma, � sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma carta de apresenta��o da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 po";
		return descricao;
	}
	
	public String getArtista() {
		String descricao = "ARTISTA\r\n"
				+ "Voc� cresce em frente a uma audi�ncia. Voc� sabe como\r\n"
				+ "fascin�-los, entret�-los e, at� mesmo, inspir�-los. Suas\r\n"
				+ "poesias podem avivar o cora��o daqueles que te ouvem,\r\n"
				+ "despertando tristeza ou alegria, risadas ou ira. Sua\r\n"
				+ "m�sica ergue seus esp�ritos ou captura suas afli��es. Seus\r\n"
				+ "passos de dan�a cativam, seu humor os extasia\r\n"
				+ "rapidamente. Qualquer que sejam as t�cnicas que voc�\r\n"
				+ "use, sua arte � sua vida.\r\n"
				+ "Profici�ncia em Per�cias: Acrobacia, Atua��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce, um tipo\r\n"
				+ "de instrumento musical\r\n"
				+ "Equipamento: Um instrumento musical (� sua escolha),\r\n"
				+ "um presente de um admirador (carta de amor, mecha\r\n"
				+ "de cabelo ou uma bijuteria), um traje e uma algibeira\r\n"
				+ "contendo 15 po\r\n";
		return descricao;
	}
	
	public String getCharlatao() {
		String descricao = "CHARLAT�O\r\n"
				+ "Voc� sempre teve jeito com as pessoas. Voc� sabe o que os\r\n"
				+ "deixa extasiados, voc� pode destrinchar os desejos em\r\n"
				+ "seus cora��es ap�s alguns minutos de conversa e, com\r\n"
				+ "algumas perguntas capciosas, voc� pode l�-los como se\r\n"
				+ "eles fossem livros infantis. � um talento �til e que voc�\r\n"
				+ "est� perfeitamente disposto a usar em sua vantagem.\r\n"
				+ "Voc� sabe o que as pessoas querem e voc� as entrega\r\n"
				+ "ou, pelo menos, promete que ir� entregar. O bom senso\r\n"
				+ "deveria manter as pessoas longe de coisas que parecem\r\n"
				+ "muito boas pra serem verdade, mas o bom senso parece\r\n"
				+ "desaparecer quando voc� est� por perto. A garrafa de\r\n"
				+ "liquido cor de rosa ir�, sem d�vida, curar essa brotoeja\r\n"
				+ "horrenda, essa pomada � nada mais � que um pouco de\r\n"
				+ "banha com uma pitada de sal de prata � pode restaurar a\r\n"
				+ "juventude e vigor e existe uma ponte na cidade que\r\n"
				+ "acabar de ficar a venda. Essas maravilhas soam\r\n"
				+ "improv�veis, mas voc� as faz soar como barganhas reais.\r\n"
				+ "Profici�ncia em Per�cias: Engana��o, Prestidigita��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce, kit de\r\n"
				+ "falsifica��o\r\n"
				+ "Equipamento: Um conjunto de roupas finas, um kit de\r\n"
				+ "disfarce, ferramentas de trapa�a, � sua escolha (dez\r\n"
				+ "garrafas tampadas preenchidas com l�quidos coloridos,\r\n"
				+ "um conjunto de dados viciados, um baralho de cartas\r\n"
				+ "marcadas ou um anel de sinete de um duque\r\n"
				+ "imagin�rio), e uma algibeira contendo 15po";
		return descricao;
	}
	
	public String getCriminoso() {
		String descricao = "CRIMINOSO\r\n"
				+ "Voc� � um criminoso experiente com um hist�rico de\r\n"
				+ "contraven��es. Voc� gastou um bom tempo entre outros\r\n"
				+ "criminosos e ainda mant�m contato com eles e com o\r\n"
				+ "submundo do crime. Voc� est� mais perto do que a\r\n"
				+ "maioria do submundo do assassinato, roubo e viol�ncia\r\n"
				+ "que prevalece no ventre da sociedade, e voc� sobreviveu\r\n"
				+ "at� esse ponto desprezando a lei e os regulamentos da\r\n"
				+ "sociedade.\r\n"
				+ "Profici�ncia em Per�cias: Engana��o, Furtividade\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de kit de jogo,\r\n"
				+ "ferramentas de ladr�o\r\n"
				+ "Equipamento: Um p� de cabra, um conjunto de roupas\r\n"
				+ "escuras comuns com capuz e uma algibeira contendo\r\n"
				+ "15 po";
		return descricao;
	}
	
	public String getEremita() {
		String descricao = "EREMITA\r\n"
				+ "Voc� viveu em reclus�o � ou em uma comunidade isolada\r\n"
				+ "como um monast�rio ou completamente sozinho � por um\r\n"
				+ "per�odo importante da sua vida. No tempo em que passou\r\n"
				+ "longe do clamor da sociedade, voc� encontrou quietude,\r\n"
				+ "solid�o e, talvez, algumas das respostas que procurava.\r\n"
				+ "Profici�ncia em Per�cias: Medicina, Religi�o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de herbalismo\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um estojo de pergaminho cheio de notas\r\n"
				+ "dos seus estudos e ora��es, um cobertor de inverno,\r\n"
				+ "um conjunto de roupas comuns, um kit de herbalismo\r\n"
				+ "e 5 po.\r\n";
		return descricao;
	}
	
	public String getForasteiro() {
		String descricao = "FORASTEIRO\r\n"
				+ "Voc� cresceu em uma �rea selvagem, longe da civiliza��o\r\n"
				+ "e dos confortos da cidade e tecnologia. Voc� testemunhou\r\n"
				+ "a migra��o de manadas maiores que florestas, sobreviveu\r\n"
				+ "� climas mais extremos que qualquer citadino poderia\r\n"
				+ "compreender e � adepto da solid�o de ser a �nica criatura\r\n"
				+ "pensante em quil�metros, em qualquer dire��o. O\r\n"
				+ "isolamento est� no seu sangue, quer voc� seja um\r\n"
				+ "n�made, um explorador, um recluso, um forrageador ou\r\n"
				+ "mesmo um saqueador. Mesmo em lugares que voc� n�o\r\n"
				+ "conhe�a as caracter�sticas especificas do terreno, voc�\r\n"
				+ "vai conseguir se virar."
				+ "Profici�ncia em Per�cias: Atletismo, Sobreviv�ncia\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de\r\n"
				+ "instrumento musical\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um bord�o, uma armadilha de ca�a, um\r\n"
				+ "fetiche de um animal que voc� matou, um conjunto de\r\n"
				+ "roupas de viajante e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public String getHeroiDoPovo() {
		String descricao = "HER�I DO POVO\r\n"
				+ "Voc� veio de uma parcela humilde da sociedade, mas est�\r\n"
				+ "destinado a muito mais. O povo de sua vila j� o reconhece\r\n"
				+ "como campe�o, e seu destino o conduz a batalhas contra\r\n"
				+ "tiranos e monstros que amea�am o povo aonde quer que\r\n"
				+ "voc� v�.\r\n"
				+ "Profici�ncia em Per�cias: Adestrar Animais,\r\n"
				+ "Sobreviv�ncia\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o, ve�culos (terrestre)\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma p�, um pote de ferro, um conjunto\r\n"
				+ "de roupas comuns e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public String getMarinheiro() {
		String descricao = "MARINHEIRO\r\n"
				+ "Voc� navegou em um navio pelo mar por anos. Nesse\r\n"
				+ "per�odo, voc� enfrentou poderosas tormentas, monstros\r\n"
				+ "das profundezas e aqueles que queriam afundar o seu\r\n"
				+ "ganha-p�o para as profundezas insond�veis. Seu primeiro\r\n"
				+ "amor � a distante linha do horizonte, mas chegou a hora\r\n"
				+ "de voc� por suas m�os em algo novo.\r\n"
				+ "Converse sobre a natureza do navio que voc� navegou\r\n"
				+ "anteriormente com seu Mestre. Era um navio mercante,\r\n"
				+ "uma embarca��o naval, um navio de explora��o ou um\r\n"
				+ "navio pirata? O qu�o famoso (ou infame) ele �? Ele era\r\n"
				+ "muito viajado? Ele continua navegando, ou est�\r\n"
				+ "desaparecido e, provavelmente, perdido com seus\r\n"
				+ "tripulantes?\r\n"
				+ "Quais eram seus deveres a bordo � contramestre,\r\n"
				+ "capit�o, navegador, cozinheiro ou outra posi��o? Quem\r\n"
				+ "eram o capit�o e primeiro marinheiro? Voc� deixou o\r\n"
				+ "navio de bem com seus companheiros ou fugiu?\r\n"
				+ "Profici�ncia em Per�cias: Atletismo, Percep��o\r\n"
				+ "Profici�ncia em Ferramentas: Ferramentas de\r\n"
				+ "navegador, ve�culo (aqu�tico)\r\n"
				+ "Equipamento: Uma malagueta (clava), 15 metros de\r\n"
				+ "corda de seda, uma amuleto da sorte como um p� de\r\n"
				+ "coelho ou uma pequena pedra com um furo no centro\r\n"
				+ "(ou voc� pode rolar uma bugiganga da tabela\r\n"
				+ "Bugigangas no cap�tulo 5), um conjunto de trajes\r\n"
				+ "comuns e uma algibeira contendo 10 po";
		return descricao;
	}
	
	public String getNobre() {
		String descricao = "NOBRE\r\n"
				+ "Voc� entende de riqueza, poder e privil�gios. Voc� carrega\r\n"
				+ "um t�tulo de nobreza, sua fam�lia possui terras, coleta\r\n"
				+ "impostos e exerce uma influ�ncia pol�tica significativa.\r\n"
				+ "Voc� pode ser um aristocrata mimado pouco familiarizado\r\n"
				+ "com o trabalho ou com o desconforto, um ex-comerciante\r\n"
				+ "elevado � nobreza ou um malandro deserdado com um\r\n"
				+ "sentido desproporcional de direitos. Ou pode ser um dono\r\n"
				+ "de terra honesto e trabalhador que se preocupa com as\r\n"
				+ "pessoas que vivem e trabalham em sua terra, sutilmente\r\n"
				+ "ciente da sua responsabilidade para com eles.\r\n"
				+ "Converse com seu Mestre para chegar a um t�tulo\r\n"
				+ "adequado e determinar a quantidade de autoridade esse\r\n"
				+ "t�tulo carrega. Um t�tulo de nobreza n�o fica com voc� � �\r\n"
				+ "conectado a uma fam�lia inteira, e qualquer t�tulo que\r\n"
				+ "voc� possuir passar� para seus filhos. Voc� n�o precisa\r\n"
				+ "determinar seu t�tulo de nobreza sozinho, voc� tamb�m\r\n"
				+ "deve conversar com seu Mestre para descrever sua\r\n"
				+ "fam�lia e a influ�ncia dela sobre voc�.\r\n"
				+ "Sua fam�lia � antiga e estabelecida ou s� recentemente\r\n"
				+ "voc� foi agraciado com seu t�tulo? Qual a influ�ncia que\r\n"
				+ "sua fam�lia exerce e sobre qual �rea? Que tipo de\r\n"
				+ "reputa��o sua fam�lia tem entre os outros aristocratas da\r\n"
				+ "regi�o? Como as pessoas comuns consideram sua fam�lia?\r\n"
				+ "Qual � sua posi��o na fam�lia? Um herdeiro ou chefe\r\n"
				+ "da fam�lia? Voc� j� herdou o t�tulo? Como voc� se sente\r\n"
				+ "sobre essa responsabilidade? Voc� est� t�o abaixo da\r\n"
				+ "linha de heran�a que ningu�m se importa com o que voc�\r\n"
				+ "faz, contanto que n�o envergonhe a fam�lia? Como � que o\r\n"
				+ "chefe da fam�lia se sente sobre a sua carreira de\r\n"
				+ "aventuras? Voc� est� de bem com a fam�lia ou anda\r\n"
				+ "afastado dela?\r\n"
				+ "Sua fam�lia tem um bras�o de armas? Uma ins�gnia\r\n"
				+ "que voc� pode usar em um anel de sinete? Cores\r\n"
				+ "espec�ficas que voc� usa o tempo todo? Um animal que\r\n"
				+ "voc� considera como um s�mbolo de sua linhagem ou um\r\n"
				+ "membro espiritual da fam�lia?\r\n"
				+ "Esses detalhes ajudam a estabelecer sua fam�lia e seu\r\n"
				+ "t�tulo como caracter�sticas do mundo de campanha.\r\n"
				+ "Profici�ncia em Per�cias: Hist�ria, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de kit de jogos\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um conjunto de trajes finos, um anel de\r\n"
				+ "sinete, um pergaminho de linhagem e uma algibeira\r\n"
				+ "contendo 25 po.\r\n";
		
		return descricao;
	}
	
	public String getOrfao() {
		String descricao = "�RF�O\r\n"
				+ "Voc� cresceu nas ruas, sozinho, �rf�o e pobre. Voc� n�o\r\n"
				+ "tinha ningu�m para cuidar de voc� ou te alimentar,\r\n"
				+ "ent�o, aprendeu a se virar sozinho. Voc� lutou ferozmente\r\n"
				+ "por comida e se manteve constantemente atendo a outras\r\n"
				+ "almas desesperadas que pudessem te roubar. Voc�\r\n"
				+ "dormiu em telhados e becos, exposto aos elementos e\r\n"
				+ "suportou doen�as sem ajuda da medicina ou um lugar\r\n"
				+ "para se recuperar. Voc� sobreviveu a despeito de tudo e,\r\n"
				+ "conseguiu isso atrav�s de astucia, for�a, agilidade ou uma\r\n"
				+ "combina��o de cada.\r\n"
				+ "Voc� come�a sua carreira de aventureiro com dinheiro\r\n"
				+ "o suficiente para viver modestamente, mas em seguran�a,\r\n"
				+ "por pelo menos dez dias. Como voc� conseguiu esse\r\n"
				+ "dinheiro? O que aconteceu para que voc� conseguisse se\r\n"
				+ "libertar das circunstancias desesperadoras e embarcasse\r\n"
				+ "em uma vida melhor?\r\n"
				+ "Profici�ncia em Per�cias: Furtividade, Prestidigita��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce,\r\n"
				+ "ferramentas de ladr�o\r\n"
				+ "Equipamento: Uma faca pequena, um mapa da cidade\r\n"
				+ "em que voc� cresceu, um rato de estima��o, um\r\n"
				+ "pequeno objeto para lembrar dos seus pais, um\r\n"
				+ "conjunto de roupas comuns e uma algibeira contendo\r\n"
				+ "10 po\r\n";
		return descricao;
	}
	
	public String getSabio() {
		String descricao = "S�BIO\r\n"
				+ "Voc� ficou anos aprendendo sobre o conhecimento do\r\n"
				+ "multiverso. Voc� decorou manuscritos, estudou\r\n"
				+ "pergaminhos e escutou os grandes especialistas nos temas\r\n"
				+ "que o interessam. Seus esfor�os fizeram de voc� um\r\n"
				+ "mestre no seu campo de estudo.\r\n"
				+ "Profici�ncia em Per�cias: Arcanismo, Hist�ria\r\n"
				+ "Idiomas: Dois � sua escolha\r\n"
				+ "Equipamento: Um vidro de tinta escura, uma pena, uma\r\n"
				+ "faca pequena, uma carta de um falecido colega\r\n"
				+ "perguntando a voc� algo que voc� nunca ter� a chance\r\n"
				+ "de responder, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public String getSoldado() {
		String descricao = "SOLDADO\r\n"
				+ "A guerra esteve na sua vida desde que voc� se recorda.\r\n"
				+ "Voc� foi treinado desde jovem, estudou o uso das armas e\r\n"
				+ "armaduras, aprendeu t�cnicas b�sicas de sobreviv�ncia,\r\n"
				+ "incluindo como permanecer vivo no campo de batalha.\r\n"
				+ "Voc� pode ter feito parte de uma armada nacional, ou\r\n"
				+ "uma companhia de mercen�rios, talvez at� mesmo uma\r\n"
				+ "mil�cia local, que cresceu proeminentemente durante uma\r\n"
				+ "guerra recente.\r\n"
				+ "Quando voc� escolher esse antecedente, converse com\r\n"
				+ "seu Mestre para determinar de qual organiza��o militar\r\n"
				+ "voc� fez parte, qu�o longe voc� progrediu na hierarquia e\r\n"
				+ "que tipos de experi�ncia voc� teve na sua carreira militar?\r\n"
				+ "Foi um ex�rcito de guarda, uma patrulha de cidade ou a\r\n"
				+ "mil�cia de uma pequena vila? Ou talvez voc� tenha\r\n"
				+ "participado da defesa pessoal de um nobre, ou mercador,\r\n"
				+ "ou de um cartel de mercen�rios.\r\n"
				+ "Profici�ncia em Per�cias: Atletismo, Intimida��o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de kit de jogo,\r\n"
				+ "ve�culo (terrestre)\r\n"
				+ "Equipamento: Uma ins�gnia de patente, um fetiche\r\n"
				+ "obtido de um inimigo ca�do (uma adaga, l�mina\r\n"
				+ "partida ou tira de estandarte), um conjunto de dados\r\n"
				+ "de osso ou baralho, um conjunto de roupas comuns e\r\n"
				+ "uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setAcolito() {
		getFicha().setAntecedente("Ac�lito");
		List<String> profPericias = Arrays.asList("Intui��o", "Religi�o");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("S�mbolo sagrado", "Livro de preces", "Varetas de incenso (5)", "Vestimentas", "Conjunto de roupas comuns");
		getFicha().setTesouro("Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setArtesaoDeGuilda() {
		getFicha().setAntecedente("Artes�o de guilda");
		List<String> profPericias = Arrays.asList("Intui��o", "Persuas�o");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
//		getFicha().setIdiomas(this.idiomas.setIdioma(getFicha().getIdiomas(), getFicha().getAntecedente()));
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Carta de apresenta��o da sua guilda", "Conjunto de roupas de viajante", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setArtista() {
		getFicha().setAntecedente("Artista");
		List<String> profPericias = Arrays.asList("Acrobacia", "Atua��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
//		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
//		getFicha().setEquipamentos(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Presente de um admirador", "Traje", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setCharlatao() {
		getFicha().setAntecedente("Charlat�o");
		List<String> profPericias = Arrays.asList("Engana��o", "Prestidigita��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Kit de falsifica��o");
		List<String> equipamentos = Arrays.asList("Conjunto de roupas finas", "Kit de disfarce", "Ferramentas de trapa�a", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
//		getFicha().setEquipamentos(getEquips().setEquipsCharlatao());
	}
	
	public void setCriminoso() {
		getFicha().setAntecedente("Criminoso");
		List<String> profPericias = Arrays.asList("Engana��o", "Furtividade");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogo");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladr�o");
		List<String> equipamentos = Arrays.asList("P� de cabra", "Conjunto de roupas escuras comuns com capuz", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setEremita() {
		getFicha().setAntecedente("Eremita");
		List<String> profPericias = Arrays.asList("Medicina", "Religi�o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		List<String> equipamentos = Arrays.asList("Estojo de pergaminho cheio de notas dos seus estudos e ora��es", "Cobertor de inverno", "Conjunto de roupas comuns", "Kit de herbalismo", "5po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setForasteiro() {
		getFicha().setAntecedente("Forasteiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Sobreviv�ncia");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Bord�o", "Armadilha de ca�a", "Fetiche de um animal que voc� matou", "Conjunto de roupas de viajante", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setHeroiDoPovo() {
		getFicha().setAntecedente("Her�i do povo");
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Sobreviv�ncia");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		getFicha().setProfi_ferramentas_peri("Ve�culos (terrestre)");
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("P�", "Pote de ferro", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setMarinheiro() {
		getFicha().setAntecedente("Marinheiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Percep��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Ferramentas de navegador");
		getFicha().setProfi_ferramentas_peri("Ve�culos (aqu�tico)");
		List<String> equipamentos = Arrays.asList("Malagueta (clava)", "15M de corda de seda", "Amuleto da sorte", "Conjunto de trajes comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setNobre() {
		getFicha().setAntecedente("Nobre");
		List<String> profPericias = Arrays.asList("Hist�ria", "Persuas�o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogos");
		List<String> equipamentos = Arrays.asList("Conjunto de trajes finos", "Anel de sinete", "Pergaminho de linhagem", "Algibeira 25po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setOrfao() {
		getFicha().setAntecedente("�rf�o");
		List<String> profPericias = Arrays.asList("Furtividade", "Prestidigita��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladr�o");
		List<String> equipamentos = Arrays.asList("Faca pequena", "Mapa da cidade que voc� cresceu", "Rato de estima��o", "Pequeno objeto para lembrar dos seus pais", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setSabio() {
		getFicha().setAntecedente("S�bio");
		List<String> profPericias = Arrays.asList("Arcanismo", "Hist�ria");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Vidro de tinta escura", "Pena", "Faca pequena", "Carta de um falecido colega perguntando a voc� algo que voc� nunca ter� a chance de responder", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	public void setSoldado()  {
		getFicha().setAntecedente("Soldado");
		List<String> profPericias = Arrays.asList("Atletismo", "Intimida��o");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Ins�gnia de patente", "Fetiche obtido de um inimigo ca�do", "Conjuto de dados de osso ou baralho", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}
	
	
//	public void setIdiomas(Idiomas idiomas) {
//		this.idiomas = idiomas;
//	}
	

	
//Antecedentes
	//Acolito
	private List<String> tracoAcolito = Arrays.asList("Eu idolatro um her�i particular da minha f�, e constantemente me refiro a seus feitos e exemplos.",
			"Eu consigo encontrar semelhan�as mesmo entre os inimigos mais violentos, com empatia e sempre trabalhando pela paz.",
			"Eu vejo press�gio em cada evento e a��o. Os deuses est�o falando conosco, n�s apenas temos de ouvi-los.",
			"Nada pode abalar minha atitude otimista.",
			"Eu cito (corretamente ou n�o) textos sagrados e prov�rbios em quase qualquer situa��o.",
			"Eu sou tolerante (ou intolerante) a qualquer outra f�, e respeito (ou condeno) a adora��o a outros deuses",
			"Eu aprecio comida requintada, bebidas e a elite entre o alto escal�o de meu templo. Uma vida dura me irrita.",
			"Eu passei tanto tempo no templo que possuo pouca pr�tica em lidar com as pessoas mundo a fora.");

	private List<String> idealAcolito = Arrays.asList("Tradi��o. As tradi��es de adora��o e sacrif�cio devem ser preservadas e perpetradas. (Leal)",
			"Caridade. Eu sempre tento ajudar aqueles em necessidade, n�o importando o custo pessoal. (Bom)",
			"Mudan�a. N�s devemos ajudar a conduzir as mudan�as que os deuses est�o constantemente trabalhando para o mundo. (Ca�tico)",
			"Poder. Eu espero que um dia eu consiga chegar ao topo na hierarquia da minha religi�o. (Leal)",
			"F�. Eu acredito que minha divindade guia minhas a��es. Eu tenho f� que, se eu trabalhar duro, coisas boas acontecer�o. (Leal)",
			"Aspira��o. Eu busco ser digno de gra�a do meu deus ao corresponder minhas a��es aos seus ensinamentos. (Qualquer)");

	private List<String> vinculoAcolito = Arrays.asList("Eu morreria para recuperar um rel�quia ancestral de minha f�, perdida h� muito tempo.",
			"Eu ainda terei minha vingan�a contra o trmpo corrupto que me acusou de heresia.",
			"Eu devo minha vida ao sacerdote que me acolheu quando meus pais morreram.",
			"Tudo o que fa�o, fa�o pelo povo.",
			"Eu farei qualquer coisa para proteger o templo que sirvo.",
			"Eu busco guardar um texto sagrado que meus inimigos dizem ser her�tico e tentam destru�-lo.");
	
	private List<String> defeitoAcolito = Arrays.asList("Eu julgo os outros severamente, e a mim mesmo mais ainda.",
			"Eu deposito muita confian�a naqueles que det�m o poder na hierarquia de meu templo.",
			"Minha devo��o muitas vezes me cega perante aqueles que professam a f� do meu deus.",
			"Meu pensamento � inflex�vel.",
			"Eu suspeito de estranhos e sempre espero o pior deles.",
			"Depois de escolher um objetivo, eu fico obcecado em cumpri-lo, at� mesmo em detrimento de qualquer outra coisa em minha vida.");

	//Artes�o de guilda
	private List<String> tracoArtesao = Arrays.asList("Eu acredito que tudo que valha a pena fazer, vale a pena ser feito direito. Eu n�o posso evitar - Eu sou perfeccionista.",
			 "Eu sou um esnobe que olha de cima a baixo aqueles que n�o sabem apreciar artes requintadas.",
			 "Eu sempre quero aprender como as coisas funcionam e o que deixa as pessoas motivadas.",
			 "Eu sou cheio de aforismos espituosos e tenho um proverbio para cada ocasi�o",
			 "Eu sou grosso com as pessoas que n�o tem o mesmo comprometimento que eu com o trabalho duro e honesto.",
			 "Eu gosto de falar longamente sobre minha profiss�o.",
			 "Eu n�o gasto meu dinheiro facilmente e vou barganhar incansavelmente para conseguir o melhor acordo poss�vel.",
			 "Eu sou bem conhecido pelo meu trabalho e quero ter certeza que todos o apreciam. Eu sempre fico surpreso quando conhe�o pessoas que n�o ouviram falar de mim.");

	private List<String> idealArtesao = Arrays.asList("Comunidade. � dever de todo cidad�o civilizado fortalecer os elos da comunidade e a seguran�a da civiliza��o. (Leal)",
			"Generosidade. Meus talentos me foram dados para que eu pudesse us�-los para beneficiar o mundo. (Bom)",
			"Liberade. Todo deveriam ser livres para perseguir seus pr�prios meios de vida. (Ca�tico)",
			"Gan�ncia. Eu s� estou aqui pelo dinheiro. (Mau)",
			"Povo. Eu sou cometido com o povo com quem me importo, n�o com ideias. (Neutro)",
			"Aspira��o. Eu trabalho duro para ser o melhor no meu of�cio. (Qualquer)");
	
	private List<String> vinculoArtesao = Arrays.asList("A oficina onde aprendi meu neg�cio � o local mais importante do mundo pra mim.",
			"Eu criei um trabalho incr�vel para algu�m, mas descobri que ele n�o era merecedor de receb�-lo. Ainda estou � procurar de algu�m que seja merecedor.",
			"Eu tenho uma grande d�vida para com minha guilda por fazer de mim a pessoa que eu sou hoje.",
			"Eu busco riqueza para conseguir o amor de algu�m.",
			"Um dia eu voltarei para a minha guilda e provarei que sou o maior artes�o dentre eles.",
			"Eu irei me vingar das for�as malignas que destru�ram meu local de neg�cios e arruinaram meu estilo de vida.");

	private List<String> defeitoArtesao = Arrays.asList("Eu farei de tudo para p�r minhas m�os em algo raro ou inestim�vel.",
			"Eu rapidamente presumo que algu�m est� tentando me trapacear",
			"Ningu�m nunca poder� saber que eu, certa vez, roubei dinheiro dos cofres da guilda.",
			"Eu nunca estou satisfeito com o que eu tenho - eu sempre quero mais.",
			"Eu mataria para adquirir um t�tulo de nobreza.",
			"Eu sou terrivelmente invejoso com qualquer um que possa ofuscar meu oficio. Todo lugar que eu vou, estou cercado de rivais.");

	//Artista
	private List<String> tracoArtista = Arrays.asList("Eu conhe�o uma hist�ria relevante de praticamente todas as situa��es.",
			"Sempre que eu chego em um lugar novo, eu coleto os rumores locais e espalho fofocas.",
			"Eu sou um rom�ntico incorrig�vel, sempre em busca daquele \"algu�m especial\"",
			"Ningu�m fica com raiva de mim ou perto de mim por muito tempo, j� que eu posso acabar com qualquer tipo de tens�o.",
			"Eu amo um bom insulto, at� os direcionados a mim.",
			"Eu fico sentido se eu n�o for o centro das aten��es.",
			"Eu mudo de �nimo ou de pensamento t�o r�pido quando mudo eu mudo de nota em uma can��o.");
	
	private List<String> idealArtista = Arrays.asList("Beleza. Quando eu atuo, eu torno o mundo um lugar melhor. (Bom)",
			"Tradi��o. As hist�rias, lendas e can��es do passado nunca devem ser esquecidas, pois elas nos ensinam quem n�s somo. (Leal)",
			"Criatividade. O mundo precisa de novas ideias e a��es ousadas. (Ca�tico)",
			"Gan�ncia. Eu s� estou aqui pelo dinheiro e pela fama. (Mau)",
			"Povo. Eu gosto de ver os sorrisos nos rostos das pessoas quando eu atuo. Isso � tudo que importa. (Neutro)",
			"Honestidade. A arte deve refletir a alma; ela deve vir de dentro e revelar quem realmente somos. (Qualquer)");
	
	private List<String> vinculoArtista = Arrays.asList("Meu instrumento � meu bem mais valioso e ele me lembra de algu�m que eu amo.",
			"Algu�m roubou meu precioso instrumento e, algum dia, eu vou peg�-lo de volta.",
			"Eu quero ser famoso, custe o que custar.",
			"Eu idolatro um her�i dos contos antigos e mensuro meus feitos baseados nessa personalidade.",
			"Eu vou fazer tudo para provar que sou superior ao meu odiado rival.",
			"Eu faria qualquer coisa pelos membros da minha antiga trupe.");
	
	private List<String> defeitoArtista = Arrays.asList("Eu farei de tudo para ganhar fama e renome.",
			"Eu viro um idiota quando vejo um rosto bonito.",
			"Um esc�ndalo me impede de voltar para casa novamente. Esse tipo de problema parece me perseguir por ai.",
			"Eu certa vez, satirizei um nobre que ainda quer minha cabe�a. Foi um erro que eu adoraria repetir.",
			"Eu tenho problemas em esconder meu verdadeiros sentimentos. Minha l�ngua afiada me mete em confus�o.",
			"Apesar dos meus melhores esfor�os, meus amigos n�o me consideram confi�vel.");
	
	//Charlat�o
	private List<String> tracoCharlatao = Arrays.asList("Eu me apaixono e desapaixono facilmente, e estou sempre em busca de algu�m.",
			"Eu tenho uma piada para cada ocasi�o, especialmente ocasi�es sem que o humor � inapropriado.",
			"Bajula��o � meu truque predileto para conseguir o que eu quero.",
			"Eu sou um jogador nato que n�o consegue resistir a se arriscar por uma poss�vel recompensa.",
			"Eu minto sobre quase tudo, mesmo quando n�o existe qualquer boa raz�o.",
			"Sarcasmo e insultos s�o minhas armas prediletas.",
			"Eu tenho v�rios s�mbolos sagrados comigo, e invoco a divindade que seja mais �til em cada dado momento.",
			"Eu furto qualquer coisa que eu vejo que possa ter algum valor.");
	
	private List<String> idealCharlatao = Arrays.asList("Independ�ncia. Sou um espirito livre - ningu�m me diz o que fazer. (Ca�tico)",
			"Justi�a. Eu nunca roubo de pessoas que n�o podem perder algumas moedas. (Leal)",
			"caridade. Eu distribuo o dinheiro que adquiro com as pessoas que realmente precisam. (Bom)",
			"Criatividade. Eu nunca fa�o a mesma trapa�a duas vezes. (Ca�tico)",
			"Amizade. Bens materiais vem e v�o. Os la�os de amizade duram pra sempre. (Bom)",
			"Aspira��o. Eu estou determinado a fazer algo por mim mesmo. (Qualquer)");
	
	private List<String> vinculoCharlatao = Arrays.asList("Eu exotorqui a pessoa errada e devo trabalhar para que esse indiv�duo nunca mais cruze meu caminho ou a das pessoas com quem me importo.",
			"Eu devo tudo ao meu mentor - uma pessoa terr�vel que, provavelmente, est� apodrecendo na cadeia em algum lugar.",
			"Em algum lugar por ai, eu tenho um filho que n�o me conhece. Eu estou tornando o mundo melhor para ele.",
			"Eu vim de uma familia nobre e, um dia, irei reivindicar minhas terras e t�tulo daqueles que o roubaram de mim.",
			"Uma pessoa poderosa matou algu�m que eu amava. Algum dia, em breve, terei minha vingan�a.",
			"Eu enganei e arruinei a vida de uma pessoa que n�o merecia. Eu busco reparar meus erros, mas talvez nunca seja capaz de me perdoar.");
	
	private List<String> defeitoCharlatao = Arrays.asList("N�o resisto um rostinho bonito.",
			"Estou sempre com dividas. Eu gasto meus lucros il�citos com luxurias decadentes mais r�pido do que os ganho...",
			"Estou convencido que ningu�m pode me enganar da forma que eu engano os outros.",
			"Eu sou ganancioso demais pra meu pr�prio bem. Eu n�o consigo resistir a me arriscar se tiver dinheiro envolvido.",
			"Eu n�o resisto a enganar pessoas que s�o mais poderosas que eu.",
			"Eu odeio admitir e vou me odiar por isso, mas, eu vou correr e salvar minha pr�pria oele se as coisas engrossarem.");
	//Criminoso
	private List<String> tracoCriminoso = Arrays.asList("Eu sempre tenho um plano para quando as coisas d�o errado.",
			"Eu estou sempre calmo, n�o importa a situa��o. Eu nunca levanto minha voz ou deixo minhas emo��es me controlarem.",
			"A primeira coisa que fa�o ao chegar a um novo local � decorar a localiza��o de coisas valiosas - ou onde essas coisas podem estar escondidas.",
			"Eu prefiro fazer um novo amigo a um novo inimigo.",
			"Eu sou incrivelmente receoso em confiar. Aqueles que parecem mais amig�veis geralmente t�m mais a esconder.",
			"Eu n�o presto aten��o aos riscos envolvidos em uma situa��o, nunca me alerte sobre as probabilidades de fracasso.",
			"A melhor maneira de me levar a fazer algo � dizendo que eu n�o posso fazer.",
			"Eu explodo ao menor insulto.");
	
	private List<String> idealCriminoso = Arrays.asList("Honra. Eu n�o roubo de irm�os de profiss�o. (Leal)",
			"Liberdade. Correntes foram feitas para serem partidas, assim como aqueles que as forjaram. (Ca�tico)",
			"Caridade. Eu roubo dos ricos para dar aos que realmente precisam. (Bom)",
			"Gan�ncia. Eu farei qualquer coisa para me tornar rico. (Mal)",
			"Povo. Eu sou leal aos meus amigos, n�o a qualquer ideal, e todos sabem que posso viajar at� o Estige por aqueles que me importo. (Neutro)",
			"Renden��o. H� uma centelha de bondade em todo mundo. (Bom)");
	
	private List<String> vinculoCriminoso = Arrays.asList("Eu estou tentando quitar uma d�vida que tenho com um generoso benfeitor.",
			"Meu ganhos, honestos ou n�o, s�o para sustentar minha fam�lia.",
			"Algo importante foi roubado de mim, e eu vou recuper�-lo.",
			"Eu me tornarei o maior ladr�o que j� existiu.",
			"Algu�m que amo morreu por causa de um erro que cometi. Isso nunca acontecer� novamente.");
	
	private List<String> defeitoCriminoso = Arrays.asList("Quando vejo algo valioso, n�o consigo pensar em mais nada, al�m de roub�-lo.",
			"Quando confrontado com uma escolha entre dinheiro e amigo, eu bem que escolho o dinheiro.",
			"Se h� um plano, eu vou esquec�-lo. Se eu n�o esquec�-lo, vou ignor�-lo.",
			"Eu tenho um \"tique\" que revela se estou mentindo.",
			"Eu viro as costas em corro quando as coisas come�am a ficar ruins.",
			"Um inocente foi preso por um crime que eu cometi. Por mim tudo bem.");
	//Eremita
	private List<String> tracoEremita = Arrays.asList("Eu fiquei tanto tempo isolado que raramente falo, preferindo gestos e grunhidos ocasionais.",
			"Eu sou absurdamente sereno, mesmo em face do desespero.",
			"O l�der da minha comunidade tem algo s�bio a dizer sobre cada t�pico, eu estou ansioso para partilhar dessa sabedoria.",
			"Eu sinto uma empatia tremenda por todos que sofrem.",
			"Eu estou alheio a etiqueta e expectativas sociais.",
			"Eu relaciono tudo que acontece comigo a um grande plano c�smico.",
			"Eu, muitas vezes, me perco em meus pensamentos e contempla��o me tornando alheio ao meu redor.",
			"Eu estou trabalhando em uma grande teoria filos�fica e adoro partilhar minhas ideias.");
	
	private List<String> idealEremita = Arrays.asList("Bem Maior. Meus dons devem ser partilhados com todos, n�o usados em benef�cio pr�prio (Bom)",
			"L�gica. Emo��es n�o podem obscurecer meus sentidos do que � certo e verdade, ou meu pensamento l�gico. (Leal)",
			"Pensamento Livre. Questionamentos e curiosidade s�o os pilares do progresso. (Ca�tico)",
			"Poder. Isolamento e contempla��o s�o caminhos para poderes m�sticos e m�gicos. (Mau)",
			"Viva e Deixe Viver. Se intrometer nos assuntos dos outros s� traz problemas. (Neutro)",
			"Autoconhecimento. Se voc� conhece a si mesmo, n�o a mais nada para saber. (Qualquer)");
	
	private List<String> vinculoEremita = Arrays.asList("Nada � mais importante que os outros membros do eremit�rio, ordem ou associa��o.",
			"Eu entrei em reclus�o para me esconder daqueles que ainda devem estar me ca�ando. Algum dia irei confront�los.",
			"Eu ainda busco o esclarecimento que eu perseguia durante meu isolamento e continuo a me iludir.",
			"Eu entrei em reclus�o porque eu amava algu�m que eu n�o podia ter.",
			"Se minha descoberta vir � tona, ela poder� trazer destrui��o ao mundo.",
			"Meu isolamento me deu grande discernimento sobre um grande mal que apenas eu posso destruir.");
	
	private List<String> defeitoEremita = Arrays.asList("Agora que voltei ao mundo, eu desfruto de seus prazeres um pouco demais.",
			"Eu escondo nas sombras, pensamentos sanguin�rios que meu isolamento e medita��o n�o conseguiram apagar.",
			"Eu sou dogm�tico em meus pensamentos e filosofia.",
			"Eu deixo meu desejo de vencer discuss�es ofuscar amizades e harmonia.",
			"Eu me arrisco muito para descobrir um pouco de conhecimento perdido.\r\n",
			"Eu gosto de guardar segredos e n�o os partilho com ningu�m.");
	
	//Forasteiro
	private List<String> tracoForasteiro = Arrays.asList("Eu fui guiado por uma sede de viagens que me levou a abandonas meu lar.",
			"Eu cuido dos meus amigos como se eles fossem filhotes rec�m-nascidos.\r\n",
			"Certa vez, eu corri quarenta quil�metros sem parar alertar meu cl� da aproxima��o de uma horda orc. Eu faria de novo se fosse necess�rio.",
			"Eu tenho uma li��o pra cada situa��o, aprendida observando a natureza.",
			"Eu n�o vejo lugar para o povo rico e educado. Dinheiro e modos n�o v�o salv�-lo de um urso-coruja faminto.",
			"Estou sempre pegando coisas, distraidamente brincando com elas e, �s vezes, quebrando-as.",
			"Eu me sinto muito mais confort�vel entre animais que entre pessoas.",
			"Eu fui, de fato, criado por lobos.");
	
	private List<String> idealForasteiro = Arrays.asList("Mudan�a. A vida � como as esta��es, em constante mudan�a, e n�s devemos mudar com ela. (Ca�tico)",
			"Bem maior. � responsabilidade de todos trazer a maior felicidade para toda a tribo. (Bom)",
			"Honra. Se eu me desonrar, eu desonrarei todo o meu cl�. (Leal)",
			"For�a. O mais forte deve governar. (Mau)",
			"Natureza. O mundo natural � mais importante que todas as constru��es da civiliza��o. (Neutro)",
			"Gloria. Eu devo adquirir gloria em batalha, para mim e para meu cl�. (Qualquer)");
	
	private List<String> vinculoForasteiro = Arrays.asList("Minha fam�lia, cl� ou tribo � a coisa mais importante na minha vida, mesmo quando eles est�o longe.\r\n",
			"Uma ofensa a natureza intocada do meu lar � uma ofensa a mim.",
			"Eu trarei uma f�ria terr�vel aos malfeitores que destru�ram minha terra natal.",
			"Eu sou o �ltimo da minha tribo e cabe a mim garantir que seus nomes fa�am parte das lendas.",
			"Eu sofro de vis�es terr�veis de um desastre vindouro, e farei qualquer coisa para impedi-lo.",
			"� meu dever prover filhos para sustentar minha tribo.");
	
	private List<String> defeitoForasteiro = Arrays.asList("Sou muito apaixonado por cerveja, vinho e outras bebidas.",
			"N�o existe lugar para precau��o em uma vida vivida ao m�ximo.",
			"Eu lembro de cada insulto que sofri e nutro um ressentimento silencioso contra qualquer um que j� tenha me insultado.",
			"Eu tenho dificuldade em confiar em membros de outras ra�as, tribos ou sociedades.",
			"A viol�ncia � minha resposta para quase todos os obst�culos.",
			"N�o espere que eu salve aqueles que n�o conseguem se virar sozinhos. � a lei da natureza que os fortes prosperem e os fracos pere�am.");
	
	//Heroi do povo
	private List<String> tracoHeroi = Arrays.asList("Eu julgo as pessoas por suas a��es, n�o por suas palavras.",
			"Se algu�m est� em apuros, eu estou sempre pronto para ajudar.",
			"Quando eu fixo minha mente em algo, eu sigo esse caminho, n�o importa o que fique no caminho.",
			"Eu possuo um forte senso de justi�a e sempre tento encontrar a solu��o mais equilibrada para as discuss�es.",
			"Eu confio em minhas habilidades e farei o que for necess�rio para que os outros confiem tamb�m.",
			"Pensar � para os outros, eu prefiro agir.",
			"Eu abuso de palavras longas na tentativa de soar inteligente.",
			"Eu me entedio f�cil. Para onde devo ir para me encontrar com meu destino?");
	
	private List<String> idealHeroi = Arrays.asList("Respeito. As pessoas merecem ser tratadas com dignidade e respeito. (Bom)",
			"Justi�a. Ningu�m merece tratamento diferenciado perante a lei, muito menos estar acima dela. (Leal)",
			"Liberdade. N�o pode haver permiss�o para tiranos oprimirem o povo. (Ca�tico)",
			"For�a. Se eu ficar forte, eu posso pegar tudo o que eu quiser � o que eu desejar. (Mal)",
			"Sinceridade. N�o h� nada de bom em fingir ser algo que n�o sou. (Neutro)",
			"Destino. Nada, nem ningu�m, pode me manter longe do meu chamado. (Qualquer)");
	
	private List<String> vinculoHeroi = Arrays.asList("Eu tenho fam�lia, embora n�o fa�a a m�nima ideia de onde eles est�o, espero encontr�-los um dia.",
			"Eu trabalho a terra, eu amo a terra e eu vou defender a terra.",
			"Um nobre orgulhoso me deu uma bela surra, e eu vou ter minha vingan�a em qualquer valent�o que encontrar.",
			"Minhas ferramentas s�o s�mbolo de minha vida passada, eu as carregarei para nunca me esquecer de minhas origens.",
			"Eu devo proteger aqueles que n�o podem se defender.",
			"Gostaria que meu amor viesse comigo para seguir meu destino.");
	
	private List<String> defeitoHeroi = Arrays.asList("O tirano que comanda minha terra n�o vai parar at� ver meu cad�ver.",
			"Eu estou convencido sobre o significado do meu destino, e cego aos riscos e falhas.",
			"As pessoas que me conhecem desde crian�a sabem de um vergonhoso segredo meu, eu n�o poderei voltar para casa nunca.",
			"Eu tenho uma fraqueza pelos v�cios da cidade, especialmente a bebedeira.",
			"Secretamente, eu acredito que as coisas estariam melhores se algum tirano comandasse a regi�o.",
			"Eu tenho dificuldades em confiar em meus aliados.");
	
	//Marinheiro
	private List<String> tracoMarinheiro = Arrays.asList("Meus amigos sabem que podem contar comigo pro que der e vier.",
			"Eu trabalho duro para que possa me divertir muito quando o trabalho estiver pronto.",
			"Eu gosto de navegar para novos portos e fazer novas amizades acompanhado de uma jarra de cerveja.",
			"Eu modifico alguns fatos para o bem de uma boa hist�ria.",
			"Pra mim, uma briga de taverna � uma �tima forma de conhecer uma nova cidade.",
			"Eu nunca deixo passar uma aposta amig�vel.",
			"Meu vocabul�rio � t�o sujo quanto o covil de um otyugh.",
			"Eu gosto de trabalhos bem feitos, especialmente se eu puder convencer algu�m a faz�-los.");
	
	private List<String> idealMarinheiro = Arrays.asList("Respeito. A coisa que mantem um navio unido � o respeito m�tuo entre o capit�o e a tripula��o. (Bem)",
			"Justi�a. Todos n�s fazemos o trabalho, portanto, todos partilhamos os esp�lios. (Leal)",
			"Liberdade. O mar � liberdade � a liberdade de ir aonde quiser. (Ca�tico)",
			"Dom�nio. Eu sou um predador e os outros navios no mar s�o minhas presas. (Mau)",
			"Povo. Eu sou apegado aos meus companheiros de tripula��o, n�o a ideais. (Neutro)",
			"Aspira��o. Algum dia eu serei dono do meu pr�prio navio e tra�arei meu pr�prio destino. (Qualquer)");
	
	private List<String> vinculoMarinheiro = Arrays.asList("Eu sou leal ao meu capit�o, primeiramente, o resto vem em segundo.",
			"O navio � o mais importante � tripulantes e capit�es vem e v�o.",
			"Eu sempre me lembrarei do meu primeiro navio.",
			"Em uma cidade portu�ria, eu tenho uma amante que quase me roubou do mar.",
			"Eu fui enganado na divis�o dos esp�lios e eu quero o que me � devido.",
			"Cru�is piratas mataram meu capit�o e companheiros de tripula��o, saquearam nosso navio e me deixaram para morrer. A vingan�a ser� minha.");
	
	private List<String> defeitoMarinheiro = Arrays.asList("Eu sigo ordens, mesmo que eu ache que est�o erradas.",
			"Eu direi qualquer coisa para evitar trabalho extra.",
			"Certa vez, algu�m duvidou da minha coragem, eu nunca recuo, n�o importa o qu�o perigosa seja a situa��o.",
			"Quando come�o a beber, � dif�cil pra mim parar.",
			"Eu n�o resisto a uma sacolinha de moedas dando sopa ou outras bugigangas que encontro.",
			"Meu orgulho provavelmente levar� a minha destrui��o");
	
	//Nobre
	private List<String> tracoNobre = Arrays.asList("Minha bajula��o eloquente faz com que todos com quem eu converse se sintam a pessoa mais maravilhosa e importante do mundo.",
			"As pessoas comuns me amam por minha bondade e generosidade.",
			"Ningu�m pode duvidar, olhando para o meu porte real, que estou acima das massas plebeias.",
			"Eu tenho grande cuidado de sempre estar no meu melhor e seguir as �ltimas modas.",
			"Eu n�o gosto de sujar minhas m�os, e eu n�o vou ser pego em acomoda��es inadequadas.",
			"Apesar da minha origem nobre, eu n�o estou acima dos outros. O sangue � um s�.",
			"Meu apoio, uma vez perdido, n�o volta.",
			"Se voc� me ferir, eu irei esmag�-lo, arruinar seu nome, e salgar seus campos.");
	
	private List<String> idealNobre = Arrays.asList("Respeito. O respeito a mim � devido por causa da minha posi��o, mas todas as pessoas, independentemente da posi��o merecem ser tratados com dignidade. (Bom)",
			"Responsabilidade. � o meu dever respeitar a autoridade daqueles acima de mim, assim como aqueles abaixo de mim devem me respeitar. (Leal)",
			"Independ�ncia. Devo provar que posso me cuidar sem os mimos da minha fam�lia. (Ca�tico)",
			"Poder. Se eu puder alcan�ar mais poder, ningu�m vai me dizer o que fazer. (Mau)",
			"Fam�lia. O sangue corre mais grosso que a �gua. (Qualquer)",
			"Obriga��o Nobre. � o meu dever proteger e cuidar das pessoas abaixo de mim. (Bom)");
	
	private List<String> vinculoNobre = Arrays.asList("Eu vou encarar qualquer desafio para ganhar a aprova��o da minha fam�lia.",
			"A alian�a da minha casa com outra fam�lia nobre deve ser mantida a todo custo.",
			"Nada � mais importante do que os outros membros da minha fam�lia.",
			"Eu sou apaixonado pela herdeira de uma fam�lia que a minha fam�lia despreza.",
			"Minha lealdade ao meu soberano � inabal�vel.",
			"As pessoas comuns devem me ver como um her�i do povo");
	
	private List<String> defeitoNobre = Arrays.asList("Eu secretamente acredito que todos est�o abaixo de mim.",
			"Eu escondo um segredo verdadeiramente escandaloso que poderia arruinar minha fam�lia para sempre.",
			"Muitas vezes eu ou�o insultos e amea�as veladas em cada palavra dirigida a mim, e me irrito muito r�pido.",
			"Eu tenho um desejo insaci�vel por prazeres carnais.",
			"Na verdade, o mundo gira ao meu redor.",
			"Pelas minhas palavras e a��es, muitas vezes, envergonho minha fam�lia.");
	
	//�rf�o
	private List<String> tracoOrfao = Arrays.asList("Eu escondo peda�os de comida e bugigangas em meus bolsos.",
			"Eu pergunto um monte e coisas.",
			"Eu gosto de me espremer em locais pequenos onde ningu�m possa me alcan�ar.",
			"Eu durmo encostado em um muro ou �rvore, abra�ado com todas as minhas posses.",
			"Eu como feito um porco e tenho maus modos.",
			"Eu acho que todos que s�o gentis comigo tem segundas inten��es.",
			"Eu n�o gosto de tomar banho.",
			"Eu digo na cara o que as outras pessoas insinuam ou escondem.");
	
	private List<String> idealOrfao = Arrays.asList("Respeito. Todas as pessoas, ricas ou pobres, merecem respeito. (Bom)",
			"Comunidade. N�s temos que tomar conta uns dos outros, porque ningu�m mais o far�. (Leal)",
			"Mudan�a. Os baixos se erguer�o e os altos ir�o tombar. A mudan�a � a natureza das coisas. (Ca�tico)",
			"Retribui��o. Os ricos precisam ver como a vida e morte � nas sarjetas. (Mau)",
			"Povo. Eu ajudo as pessoas que me ajudam � � isso que nos mantem vivos. (Neutro)",
			"Aspira��o. Eu vou provar que sou merecedor de uma vida melhor. (Qualquer)");
	
	private List<String> vinculoOrfao = Arrays.asList("Minha cidade ou vila � meu lar, e eu vou lutar para defend�-lo.",
			"Eu patrocino um orfanato para que outros n�o passem pelo que fui for�ado a passar.",
			"Eu devo minha sobreviv�ncia a outros �rf�o que me ensinou a vida nas ruas.",
			"Eu tenho uma d�vida que nunca poderei pagar com uma pessoa que teve pena de mim.",
			"Eu sai da minha vida de pobreza roubando uma pessoa importante, eu sou procurado por isso.",
			"Ningu�m deveria ter suportar as dificuldades pelas quais passei.");
	
	private List<String> defeitoOrfao = Arrays.asList("Se eu estiver em desvantagem, eu vou fugir de uma briga.",
			"Ouro parece ser muito dinheiro pra mim, e eu faria praticamente qualquer coisa por mais dele.",
			"Eu nunca vou confiar em ningu�m plenamente, al�m de mim mesmo.",
			"Eu prefiro matar algu�m enquanto dorme que uma luta justa",
			"N�o � roubo se eu preciso mais que outra pessoa.",
			"As pessoas que n�o podem se virar sozinhas, tem o que merecem.");
	
	//Sabio
	private List<String> tracoSabio = Arrays.asList("Eu uso palavras polissil�bicas para endossar minha impress�o de grande erudi��o.",
			"Eu j� li todos os livros das grandes bibliotecas � ou gosto de me vangloriar e dizer que li.",
			"Eu costumo ajudar os outros que n�o s�o t�o inteligentes quanto eu, e pacientemente explico tudo quantas vezes forem necess�rias.",
			"Nada para mim � melhor que um bom mist�rio.",
			"Eu voluntariamente escuto cada lado, e seus argumentos, antes de tomar uma decis�o final.",
			"Eu...falo...lentamente...ao...conversar...com idiotas...que tentam...se comparar...comigo.",
			"E sou horr�vel e estranho em situa��es sociais",
			"Estou convencido de que todos tentam roubar os meus segredos de mim");
	
	private List<String> idealSabio = Arrays.asList("Conhecimento. O caminho para o poder e o auto aperfei�oamento � atrav�s do conhecimento. (Neutro)",
			"Beleza. O que � belo nos mostra o que est� al�m disso perto do que � verdadeiro. (Bom)",
			"Logica. Emo��es n�o devem nublar seu pensamento l�gico. (Leal)",
			"Sem Limites. Nada pode apaziguar a possibilidade infinita de toda a exist�ncia. (Ca�tico)",
			"Poder. Conhecimento � o caminho para o poder e a domina��o. (Mau)",
			"Auto Aperfei�oamento. O objetivo de uma vida de estudos � a melhoria de si mesmo. (Qualquer)");
	
	private List<String> vinculoSabio = Arrays.asList("� meu dever proteger meus estudantes.",
			"Eu guardo um texto ancestral que cont�m terr�veis segredos que n�o podem cair em m�os erradas.",
			"Eu trabalho para preservar uma biblioteca, universidade, arquivo de escribas ou monast�rio.",
			"O trabalho a da minha vida � uma s�rie de tomos relatando um campo de conhecimento espec�fico.",
			"Eu venho procurando a minha vida inteira pela resposta de certa quest�o.",
			"Eu vendi minha alma por conhecimento. Espero realizar grandes feitos para ganh�-la de volta.");
	
	private List<String> defeitoSabio = Arrays.asList("Eu me distraio facilmente com a promessa de informa��o.",
			"Muitas pessoas gritam e correm quando veem um corruptor. Eu paro e tomo notas de sua anatomia.",
			"Desvendar um mist�rio ancestral pode muito bem valer o pre�o e uma civiliza��o.",
			"E prefiro solu��es �bvias a complicadas.",
			"Eu falo sem antes pensar em minhas palavras, invariavelmente insultando outros.",
			"Eu n�o consigo guardar um segredo para salvar minha vida. Ou a vida de qualquer outra pessoa.");
	
	//Soldado
	private List<String> tracoSoldado = Arrays.asList("Eu sou sempre polido e respeitoso.",
			"Eu sou assombrado pelas mem�rias da guerra. N�o consigo tirar aquelas imagens da minha cabe�a.",
			"Eu perdi muitos amigos, e sou muito devagar para fazer novos.",
			"Eu tenho muitas hist�rias de inspira��o e cautela da �poca de minha experi�ncia militar que s�o relevantes em todas as situa��es de combate.",
			"Eu n�o consigo encarar um c�o infernal sem vacilar",
			"Eu gosto de ser forte e de quebrar coisas.",
			"Eu tenho um senso de humor grosseiro.",
			"Eu enfrento os problemas de frente. Uma solu��o direta � o melhor caminho para o sucesso.");
	
	private List<String> idealSoldado = Arrays.asList("Bem Maior. Nosso destino � dar nossas vidas em defesa de terceiros. (Bom)",
			"Responsabilidade. Eu fa�o o que tenho que fazer e obede�o apenas a autoridade. (Leal)",
			"Independ�ncia. Quando pessoas seguem ordens cegas elas apoiam um tipo de tirania. (Ca�tico)",
			"For�a. A vida � como uma guerra, o mais forte vence. (Mau)",
			"Viva e Deixa Viver. Ideais n�o valem a pena se voc� matar, ou for � guerra por eles. (Neutro)",
			"Aspira��o. Minha cidade, na��o ou meu povo, s�o tudo o que importa para mim. (Qualquer)");
	
	private List<String> vinculoSoldado = Arrays.asList("Eu ainda daria a minha vida pelas pessoas com quem servi.\r\n",
			"Algu�m salvou minha vida no campo de batalha. Desde aquele dia eu nunca deixo nenhum amigo para tr�s.",
			"Minha honra � minha vida.",
			"Eu nunca esquecerei a destruidora derrota que minha companhia sofreu ou os inimigos que a causaram.",
			"Aqueles que lutam ao meu lado s�o aqueles por quem vale a pena morrer.",
			"Eu luto por aqueles que n�o podem lutar por si mesmos.");
	
	private List<String> defeitoSoldado = Arrays.asList("O inimigo monstruoso que enfrentei em uma batalha ainda me deixa tremendo de medo.",
			"Eu tenho pouco respeito por aqueles que n�o se provam bons combatentes.",
			"Eu cometi um terr�vel erro em batalha, o que custou muitas vidas � eu farei de tudo para manter esse erro em segredo.",
			"Meu �dio por meus inimigos � cego e irracional.",
			"Eu obede�o a lei, mesmo se a lei trouxer a ang�stia.",
			"Eu prefiro comer minha armadura a admitir que estou errado.");
	
}
