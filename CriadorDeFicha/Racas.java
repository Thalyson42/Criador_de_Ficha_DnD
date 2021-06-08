package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Racas extends Classes{
	private String nome_raca;
	private String Sub_racas_nome;
//	private FichaDoPersonagem ficha;
//	private Idiomas idiomas;
	
	public String getNome_raca() {
		return nome_raca;
	}

	public void setNome_raca(String nome_raca) {
		this.nome_raca = nome_raca;
	}

	public String getSub_racas_nome() {
		return Sub_racas_nome;
	}

	public void setSub_racas_nome(String sub_racas_nome) {
		Sub_racas_nome = sub_racas_nome;
	}
	
//	public void setficha(FichaDoPersonagem ficha) {
//		this.ficha = ficha;
//	}
	
//	public FichaDoPersonagem getficha() {
//		return ficha;
//	}
	
	public void salvarRaca(int raca, int subraca) {
		switch(raca) {
		case 0:
			setRacaAnao();
			if(subraca == 0) {
				setanaoSRcolina();
			}else {
				setanaoSRmontanha();
			}
		break;
		
		case 1:
			setRacaElfo();
			if(subraca == 0) {
				setAltoElfo();
			}else if(subraca == 1) {
				setElfoDaFloresta();
			}else {
				setElfoNegro();
			}
		break;
		
		case 2:
			setHalfling();
			if(subraca == 0) {
				setPesLeves();
			}else {
				setRobusto();
			}
		break;
		
		case 3:
			setDraconato();
		break;

		case 4:
			setHumano();
		break;
		
		case 5:
			setGnomo();
			if(subraca == 0) {
				setGnomoDaFloresta();
			}else {
				setGnomoDasRochas();
			}
		break;
		
		case 6:
			setMeio_elfo();
		break;
		
		case 7:
			setMeio_orc();
		break;
		
		case 8:
			setTiefling();
		break;
		}
	}
	
	public void salvarRaca(String raca) {
		switch(raca) {
	
		case "Draconato":
			setDraconato();
		break;

		case "Humano":
			setHumano();
		break;
				
		case "Meio_elfo":
			setMeio_elfo();
		break;
		
		case "Meio_orc":
			setMeio_orc();
		break;
		
		case "Tiefling":
			setTiefling();
		break;
		}
	}
	
	public String descricaoRaca(int i) {
		switch(i) {
		case 0:
			return anaoDescricao();
			
		case 1:
			return elfoDescricao();
		
		case 2:
			return halflingDescricao();
		
		case 3:
			return humanoDescricao();
			
		case 4:
			return draconatoDescricao();
			
		case 5:
			return gnomoDescricao();
			
		case 6:
			return meio_elfoDescricao();
			
		case 7:
			return meio_orcDescricao();
		
		case 8:
			return tieflingDescricao();
		}
		
		return null;
	}
	
	public String descricaoSubRaca(String raca, int subraca) {
		switch(raca) {
		case "Anao":
			if(subraca == 0) {
				return anaoSRcolina();
			}
			return anaoSRmontanha();
			
		case "Elfo":
			if(subraca == 0) {
				return getAltoElfo();
			}else if(subraca == 1) {
				return getElfoDaFloresta();
			}
			return getElfoNegro();
			
		case "Halfling":
			if(subraca == 0) {
				return getPesLeves();
			}
			return getRobusto();
			
		case "Gnomo":
			if(subraca == 0) {
				return getGnomoDaFloresta();
			}
			return getGnomoDasRochas();
		}
		return null;
	}
	
	//An�o
	public String anaoDescricao() {
		String anao = "AN�O\r\n\n"
				+ "Audazes e resistentes, os an�es s�o\r\n"
				+ "conhecidos como h�beis guerreiros,\r\n"
				+ "mineradores e trabalhadores em pedra e\r\n"
				+ "metal. Embora tenham menos de 1,50 metro\r\n"
				+ "de altura, os an�es s�o t�o largos e\r\n"
				+ "compactos que podem pesar tanto quanto\r\n"
				+ "um humano 60 cent�metros mais alto. Sua\r\n"
				+ "coragem e resist�ncia compete facilmente\r\n"
				+ "com qualquer povo mais alto. A pele dos\r\n"
				+ "an�es varia do marrom escuro a um matiz\r\n"
				+ "mais p�lido, tingido de vermelho, mas os tons mais\r\n"
				+ "comuns s�o o castanho claro ou bronzeado, como certos\r\n"
				+ "tons terrosos. O cabelo � longo, mas de estilo simples,\r\n"
				+ "geralmente negro, cinzento ou castanho, embora an�es\r\n"
				+ "mais p�lidos frequentemente possuem cabelos ruivos.\r\n"
				+ "An�es machos valorizam altamente suas barbas e\r\n"
				+ "preparam-nas com cuidado.\r\n\n"
				+ "TRA�OS RACIAIS DOS AN�ES\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Constitui��o aumenta em 2.\r\n"
				+ "Idade. An�es tornam-se maduros na mesma propor��o que os humanos, mas s�o considerados jovens at� atingirem a idade de 50 anos. Em m�dia, eles vivem 350 anos.\r\n"
				+ "Tend�ncia. A maioria dos an�es � leal, pois acreditam firmemente nos benef�cios de uma sociedade bem organizada. Eles tendem para o bem, com um forte senso de\r\n"
				+ "honestidade e uma cren�a de que todos merecem compartilhar os benef�cios de uma ordem social justa.\r\n"
				+ "Tamanho. An�es est�o entre 1,20 e 1,50 metro de altura e pesam cerca de 75 kg. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada � de 7,5 metros. Seu deslocamento n�o � reduzido quando estiver usando armadura pesada.\r\n"
				+ "Vis�o no Escuro. Acostumado � vida subterr�nea, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena,\r\n"
				+ "e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resili�ncia An�. Voc� possui vantagem em testes de resist�ncia contra venenos e resist�ncia contra dano de veneno.\r\n"
				+ "Treinamento An�o em Combate. Voc� tem profici�ncia com machados de batalha, machadinhas, martelos leves e martelos de guerra.\r\n"
				+ "Profici�ncia com Ferramentas. Voc� tem profici�ncia em uma ferramenta de artes�o � sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\r\n"
				+ "Especializa��o em Rochas. Sempre que voc� realizar um teste de Intelig�ncia (Hist�ria) relacionado � origem de um trabalho em pedra, voc� � considerado proficiente na per�cia\r\n"
				+ "Hist�ria e adiciona o dobro do seu b�nus de profici�ncia ao teste, ao inv�s do seu b�nus de profici�ncia normal.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e An�o. O idioma An�o � repleto de consoantes duras e sons guturais, e essa caracter�stica influencia, como um sotaque, qualquer\r\n"
				+ "outro idioma que o an�o falar.\r\n"
				+ "Sub-ra�a. Existem duas sub-ra�as principais de an�es nos mundos de D&D: an�es da colina e an�es da montanha. Voc� deve escolher uma dessas sub-ra�as./r/n";
		return anao;
	}
	
	public void setRacaAnao() {
		getFicha().setRaca("An�o");
		getFicha().setConstituicao(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n");
		getFicha().setTracosraciais("Resili�ncia An�.\n\nVoc� possui vantagem em testes de\r\n"
				+ "resist�ncia contra venenos e resist�ncia contra dano de\r\n"
				+ "veneno.\n\n");
		getFicha().setTracosraciais("Especializa��o em Rochas.\n\nSempre que voc�\r\n"
				+ "realizar um teste de Intelig�ncia (Hist�ria) relacionado �\r\n"
				+ "origem de um trabalho em pedra, voc� � considerado\r\n"
				+ "proficiente na per�cia Hist�ria e adiciona o dobro do seu\r\n"
				+ "b�nus de profici�ncia ao teste, ao inv�s do seu b�nus de\r\n"
				+ "profici�ncia normal.\n\n");
		getFicha().setProfi_equips("Machados de batalha");
		getFicha().setProfi_equips("Machadinhas");
		getFicha().setProfi_equips("Martelos leves");
		getFicha().setProfi_equips("Martelos de guerra");
		getFicha().setProfi_ferramentas_peri("Ferramenta de artes�o");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("An�o");
	}
	
	public String anaoSRcolina() {
		String anaoSRcolina = "AN�O DA COLINA\r\n"
				+ "\n"
				+ "Como um an�o da colina, voc� tem sentidos agu�ados,\r\n"
				+ "maior intui��o e not�vel resili�ncia. Os an�es dourados de\r\n"
				+ "Faer�n, que vivem em seu poderoso reino ao sul do\r\n"
				+ "continente, s�o an�es da colina, assim como os exilados\r\n"
				+ "Neidar e os depreci�veis Klar de Krynn, no cen�rio de\r\n"
				+ "Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Tenacidade An�. Seu m�ximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o an�o da colina sobe um\r\n"
				+ "n�vel, ele recebe 1 ponto de vida adicional.\r\n";
		return anaoSRcolina;
	}
	
	public void setanaoSRcolina() {
		getFicha().setSabedoria(1);
		getFicha().setPontos_vida(1);
		getFicha().setTracosraciais("Tenacidade An�.\n\nSeu m�ximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o an�o da colina sobe um\r\n"
				+ "n�vel, ele recebe 1 ponto de vida adicional.");
	}
	
	public String anaoSRmontanha() {
		String anaoSRmontanha = "--AN�O DA MONTANHA--\n\n"
				+ "Como um an�o da montanha, voc� � forte e resistente,\r\n"
				+ "acostumados a uma vida dif�cil em terrenos dif�ceis. Voc�,\r\n"
				+ "provavelmente tem a descend�ncia daqueles mais altos\r\n"
				+ "(para um an�o) e tende a possuir uma colora��o mais\r\n"
				+ "clara. Os an�es do escudo do norte de Faer�n, bem como o\r\n"
				+ "cl� governante Hylar e os cl�s nobres Daewar de\r\n"
				+ "Dragonlance, s�o an�es da montanha.\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de For�a aumenta em 2.\r\n"
				+ "Treinamento An�o com Armaduras. Voc� adquire profici�ncia em armaduras leves e m�dias.\r\n\n";
		return anaoSRmontanha;
	}
	
	public void setanaoSRmontanha() {
		getFicha().setForca(2);
		getFicha().setProfi_equips("Armaduras leves");
		getFicha().setProfi_equips("Armaduras m�dias");
	}

//Elfo
	public String elfoDescricao() {
		String elfo = "Elfo\r\n\n"
				+ "Com a sua gra�a sobrenatural e seus tra�os finos, os elfos\r\n"
				+ "parecem assustadoramente belos para os humanos e os\r\n"
				+ "membros de muitas outras ra�as. Em m�dia, eles s�o\r\n"
				+ "ligeiramente mais baixos do que os humanos, variando de\r\n"
				+ "pouco menos de 1,50 metro at� pouco mais de 1,80 metro\r\n"
				+ "de altura. Eles s�o mais delgados que os humanos,\r\n"
				+ "pesando entre 50 kg a 72 kg apenas. Os machos e as\r\n"
				+ "f�meas s�o quase da mesma altura, mas os machos s�o\r\n"
				+ "um pouco mais pesados do que as f�meas.\r\n"
				+ "A colora��o da pele dos elfos varia da mesma maneira\r\n"
				+ "que os humanos, e tamb�m incluem peles em tons de\r\n"
				+ "cobre, bronze, at� o branco-azulado, os cabelos podem ser\r\n"
				+ "de tons verdes ou azuis, e os olhos podem ser como\r\n"
				+ "piscinas douradas ou prateadas. Elfos n�o possuem pelos\r\n"
				+ "faciais e poucos pelos no corpo. Eles preferem roupas\r\n"
				+ "elegantes em cores brilhantes, e gostam de joias simples,\r\n"
				+ "mas belas.\r\n\n"
				+ "TRA�OS RACIAIS DOS ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Embora os elfos atinjam a maturidade f�sica\r\n"
				+ "com praticamente a mesma idade dos humanos, a\r\n"
				+ "compreens�o �lfica da idade adulta vai al�m da\r\n"
				+ "maturidade f�sica, abrangendo sua experi�ncia sobre o\r\n"
				+ "mundo. Um elfo tipicamente assume a idade adulta e um\r\n"
				+ "nome adulto com cerca de 100 anos de idade e pode viver\r\n"
				+ "750 anos.\r\n"
				+ "Tend�ncia. Elfos amam a liberdade, a diversidade e a\r\n"
				+ "express�o pessoal, ent�o eles inclinam-se forte e\r\n"
				+ "suavemente para aspectos do caos. Eles valorizam e\r\n"
				+ "protegem a liberdade dos outros como a sua pr�pria, e s�o\r\n"
				+ "geralmente mais bondosos que o contr�rio. Os drow s�o\r\n"
				+ "exce��o. Seu ex�lio no Subterr�neo fez deles perversos e\r\n"
				+ "perigosos. Drow s�o geralmente mais maus que o\r\n"
				+ "contr�rio.\r\n"
				+ "Tamanho. Elfos medem entre 1,50 a 1,80 metro de\r\n"
				+ "altura e possuem constitui��o delgada. Seu tamanho �\r\n"
				+ "M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Acostumado �s florestas\r\n"
				+ "crepusculares e ao c�u noturno, voc� possui uma vis�o\r\n"
				+ "superior em condi��es de escurid�o e na penumbra. Voc�\r\n"
				+ "pode enxergar na penumbra a at� 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Voc� n�o pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\r\n"
				+ "Sentidos Agu�ados. Voc� tem profici�ncia na per�cia\r\n"
				+ "Percep��o.\r\n"
				+ "Ancestral Fe�rico. Voc� tem vantagem nos testes de\r\n"
				+ "resist�ncia para resistir a ser enfeiti�ado e magias n�o\r\n"
				+ "podem coloc�-lo para dormir.\r\n"
				+ "Transe. Elfos n�o precisam dormir. Ao inv�s disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal medita��o � \"transe\".) Enquanto\r\n"
				+ "medita, um elfo � capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade s�o exerc�cios mentais que se tornam\r\n"
				+ "reflexos atrav�s de anos de pr�tica. Depois de descansar\r\n"
				+ "dessa forma, voc� ganha os mesmos benef�cios que um\r\n"
				+ "humano depois de 8 horas de sono.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "�lfico. O �lfico � um idioma fluido, com entona��es sutis e\r\n"
				+ "gram�tica complexa. A literatura �lfica � rica e diversa, e\r\n"
				+ "suas can��es e poemas s�o famosos entre outras ra�as.\r\n"
				+ "Muitos bardos aprendem essa l�ngua para que possam\r\n"
				+ "adicionar can��es �lficas ao seu repert�rio.\r\n"
				+ "Sub-ra�a. Antigas divis�es entre os povos �lficos\r\n"
				+ "resultaram em tr�s sub-ra�as principais: os altos elfos, os\r\n"
				+ "elfos da floresta, e os elfos negros, que s�o comumente\r\n"
				+ "chamados de drow. Escolha uma dessas sub-ra�as. Em\r\n"
				+ "alguns mundos, essas sub-ra�as s�o ainda mais divididas\r\n"
				+ "(como os elfos do sol e elfos da lua nos Reinos Esquecidos),\r\n"
				+ "ent�o se voc� desejar, voc� pode escolher uma sub-ra�a\r\n"
				+ "ainda mais espec�fica.\r\n";
		return elfo;
	}
	
	public void setRacaElfo() {
		getFicha().setRaca("Elfo");
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado �s florestas\r\n"
				+ "crepusculares e ao c�u noturno, voc� possui uma vis�o\r\n"
				+ "superior em condi��es de escurid�o e na penumbra. Voc�\r\n"
				+ "pode enxergar na penumbra a at� 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Voc� n�o pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\n\n");
		getFicha().setTracosraciais("Sentidos Agu�ados.\n\nVoc� tem profici�ncia na per�cia\r\n"
				+ "Percep��o.\n\n");
		getFicha().setTracosraciais("Ancestral Fe�rico.\n\nVoc� tem vantagem nos testes de\r\n"
				+ "resist�ncia para resistir a ser enfeiti�ado e magias n�o\r\n"
				+ "podem coloc�-lo para dormir.\r\n\n");
		getFicha().setTracosraciais("Transe.\n\nElfos n�o precisam dormir. Ao inv�s disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal medita��o � \"transe\".) Enquanto\r\n"
				+ "medita, um elfo � capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade s�o exerc�cios mentais que se tornam\r\n"
				+ "reflexos atrav�s de anos de pr�tica. Depois de descansar\r\n"
				+ "dessa forma, voc� ganha os mesmos benef�cios que um\r\n"
				+ "humano depois de 8 horas de sono.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("�lfico");
	}
	
	public String getAltoElfo() {
		String altoElfo = "ALTO ELFO\r\n\n"
				+ "Como alto elfo, voc� possui uma mente afiada e um\r\n"
				+ "dom�nio da magia b�sico. Em muitos dos mundos de\r\n"
				+ "D&D, existem dois tipos de altos elfos. Um tipo (que\r\n"
				+ "inclui os elfos cinzentos e elfos do vale de Greyhawk, os\r\n"
				+ "Silvanesti de Dragonlance, e os elfos do sol dos\r\n"
				+ "Reinos Esquecidos) s�o arrogantes e reclusos,\r\n"
				+ "acreditando serem superiores aos n�o elfos e at�\r\n"
				+ "mesmo a outros elfos. O outro tipo (como os altos\r\n"
				+ "elfos de Greyhawk, os Qualinesti de Dragonlance\r\n"
				+ "e os elfos da lua dos Reinos Esquecidos) s�o\r\n"
				+ "mais comuns e amig�veis, e muitas vezes\r\n"
				+ "encontrados entre humanos e outras ra�as.\r\n"
				+ "Os elfos do sol de Faer�n (tamb�m chamado de elfos\r\n"
				+ "dourados ou elfos do amanhecer) t�m pele bronzeada e\r\n"
				+ "cabelos cor de cobre, negros ou louro dourado. Seus\r\n"
				+ "olhos s�o dourados, prateados ou negros. Os elfos da\r\n"
				+ "lua (tamb�m chamados de elfos de prata ou elfos\r\n"
				+ "cinzentos) s�o muito mais p�lidos, com pele de\r\n"
				+ "alabastro por vezes tingida de azul. Normalmente, eles\r\n"
				+ "t�m cabelos de um branco prateado, negros ou azuis,\r\n"
				+ "diversos tons de loiro, castanho e vermelho n�o s�o\r\n"
				+ "incomuns. Seus olhos s�o azuis ou verdes com manchas\r\n"
				+ "douradas.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 1.\r\n"
				+ "Treinamento �lfico com Armas. Voc� possui\r\n"
				+ "profici�ncia com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Truque. Voc� conhece um truque, � sua escolha, da\r\n"
				+ "lista de truques do mago. Intelig�ncia � a habilidade\r\n"
				+ "usado para conjurar este truque.\r\n"
				+ "Idioma Adicional. Voc� pode falar, ler e escrever um\r\n"
				+ "idioma adicional � sua escolha.\r\n\n";
		return altoElfo;
	}
	
	public void setAltoElfo() {
		getFicha().setInteligencia(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
		getFicha().setIdiomas(getIdiomas().setIdioma(1));
	}
	
	public String getElfoDaFloresta() {
		String elfoDaFloresta = "ELFO DA FLORESTA\r\n\n"
				+ "Como um elfo da floresta, voc� possui sentidos e intui��o\r\n"
				+ "agu�ados, seus p�s �geis guiam-no r�pida e furtivamente\r\n"
				+ "atrav�s de suas florestas nativas. Essa categoria inclui os\r\n"
				+ "elfos selvagens (grugach) de Greyhawk e os Kagonesti de\r\n"
				+ "Dragonlance, bem como as ra�as chamadas de elfos da\r\n"
				+ "floresta em Greyhawk e nos Reinos Esquecidos. Em\r\n"
				+ "Faer�n, os elfos da floresta (tamb�m chamados de elfos\r\n"
				+ "selvagens, elfos verdes ou elfos do bosque) s�o reclusos e\r\n"
				+ "desconfiados dos n�o elfos.\r\n"
				+ "A pele dos elfos da floresta tende a ser de matiz\r\n"
				+ "cobreada, algumas vezes com tra�os esverdeados. Seu\r\n"
				+ "cabelo geralmente � castanho ou negro, mas\r\n"
				+ "ocasionalmente podem ser loiros ou cor de cobre. Seus\r\n"
				+ "olhos s�o verdes, castanhos ou cor de avel�.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Treinamento �lfico com Armas. Voc� possui\r\n"
				+ "profici�ncia com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "P�s Ligeiros. Seu deslocamento base de caminhada\r\n"
				+ "aumenta para 10,5 metros.\r\n"
				+ "M�scara da Natureza. Voc� pode tentar se esconder\r\n"
				+ "mesmo quando voc� est� apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, n�voa ou outro\r\n"
				+ "fen�meno natural.\r\n\n";
				
				return elfoDaFloresta;
	}
	
	public void setElfoDaFloresta() {
		getFicha().setSabedoria(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
		getFicha().setDeslocamento("10,5");
		getFicha().setTracosraciais("M�scara da Natureza.\n\nVoc� pode tentar se esconder\r\n"
				+ "mesmo quando voc� est� apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, n�voa ou outro\r\n"
				+ "fen�meno natural.\n");
	}
	
	public String getElfoNegro() {
		String elfoNegro ="ELFO NEGRO(DROW)\r\n\n"
				+ "Descendentes de uma antiga sub-ra�a de elfos de pele\r\n"
				+ "negra, os drow foram banidos da superf�cie do mundo por\r\n"
				+ "seguirem a deusa Lolth pelo caminho do mal e corrup��o.\r\n"
				+ "Agora, eles constru�ram sua pr�pria civiliza��o nas\r\n"
				+ "profundezas do Subterr�neo, moldados pelo Caminho de\r\n"
				+ "Lolth. Tamb�m conhecidos como elfos negros, os drow\r\n"
				+ "possuem pele negra similar a obsidiana polida e cabelos\r\n"
				+ "brancos opacos ou amarelo p�lido. Normalmente eles\r\n"
				+ "possuem olhos muito p�lidos (t�o p�lidos que s�o\r\n"
				+ "confundidos com olhos brancos) com tons de lil�s, prata,\r\n"
				+ "rosa, vermelho e azul. Eles costumam ser menores e mais\r\n"
				+ "magros que a maioria dos elfos.\r\n"
				+ "Aventureiros drow s�o raros e a ra�a n�o existe em\r\n"
				+ "todo o mundo. Verifique com seu Mestre se a ra�a drow\r\n"
				+ "est� dispon�vel como personagem de jogador.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Vis�o no Escuro Superior. Sua vis�o no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\r\n"
				+ "Sensibilidade � Luz Solar. Voc� possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percep��o) relacionados a vis�o quando voc�, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que voc� est� tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n"
				+ "Magia Drow. Voc� possui o truque globos de luz.\r\n"
				+ "Quando voc� alcan�a o 3� n�vel, voc� pode conjurar a\r\n"
				+ "magia fogo das fadas. Quando voc� alcan�a o 5� n�vel,\r\n"
				+ "voc� pode conjurar escurid�o. Voc� precisa terminar um\r\n"
				+ "descanso longo para poder conjurar as magias desse tra�o\r\n"
				+ "novamente. Carisma � sua habilidade chave para\r\n"
				+ "conjurar essas magias.\r\n"
				+ "Treinamento Drow com Armas. Voc� possui\r\n"
				+ "profici�ncia com rapieiras, espadas curtas e bestas de m�o.\r\n\n";
		return elfoNegro;
	}
	
	public void setElfoNegro() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Vis�o no Escuro Superior.\n\nSua vis�o no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\n\n");
		getFicha().setTracosraciais("Sensibilidade � Luz Solar.\n\nVoc� possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percep��o) relacionados a vis�o quando voc�, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que voc� est� tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n\n");
		List<String> proficiencias_equips = Arrays.asList("Rapieiras", "Espadas curtas", "Bestas de m�o");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
//Halfling
	public String halflingDescricao() {
		String halfling = "Halfling\r\n\n"
				+ "Os pequeninos halflings sobrevivem em um mundo cheio\r\n"
				+ "de criaturas maiores ao evitar serem notados, ou evitando\r\n"
				+ "o combate direto. Com uns 90 cent�metros de altura, eles\r\n"
				+ "parecem inofensivos e assim conseguiram sobreviver por\r\n"
				+ "s�culos �s sombras dos imp�rios e � margem de guerras e\r\n"
				+ "conflitos pol�ticos. Eles normalmente s�o robustos,\r\n"
				+ "pesando entre 20 kg e 22,5 kg.\r\n"
				+ "A pele dos halflings varia do bronzeado ao p�lido com\r\n"
				+ "um tom corado, e seu cabelo � geralmente castanho ou\r\n"
				+ "castanho claro e ondulado. Eles t�m olhos castanhos ou\r\n"
				+ "amendoados. Halflings do sexo masculino muitas vezes\r\n"
				+ "ostentam costeletas longas, mas barbas s�o raras entre\r\n"
				+ "eles e bigodes s�o quase inexistentes. Eles gostam de usar\r\n"
				+ "roupas simples, confort�veis e pr�ticas, preferindo as\r\n"
				+ "cores claras.\r\n"
				+ "A praticidade dos halflings se estende para al�m de\r\n"
				+ "suas roupas. Eles se preocupam com as necessidades\r\n"
				+ "b�sicas e os prazeres simples, e n�o s�o inclinados �\r\n"
				+ "ostenta��o. Mesmo o mais rico dos halflings mant�m seus\r\n"
				+ "tesouros trancados em um por�o, em vez de expostos �\r\n"
				+ "vista de todos. Eles possuem um talento especial para\r\n"
				+ "encontrar a solu��o mais simples para um problema e\r\n"
				+ "t�m pouca paci�ncia para indecis�es.\r\n\n"
				+ "TRA�OS RACIAIS DOS HALFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Um halfling atinge a idade adulta aos 20 anos\r\n"
				+ "e pode chegar a 150 anos.\r\n"
				+ "Tend�ncia. A maioria dos halflings � leal e boa. Via\r\n"
				+ "de regra, eles possuem um bom cora��o e s�o am�veis,\r\n"
				+ "odeiam ver o sofrimento dos outros e n�o toleram a\r\n"
				+ "opress�o. Eles tamb�m s�o muito ordeiros e tradicionais,\r\n"
				+ "fortemente apegados � sua comunidade e ao conforto de\r\n"
				+ "suas antigas tradi��es.\r\n"
				+ "Tamanho. Halflings medem cerca de 0,90 metro de\r\n"
				+ "altura e pesam aproximadamente 20 kg. Seu tamanho �\r\n"
				+ "Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 7,5 metros.\r\n"
				+ "Sortudo. Quando voc� obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resist�ncia, voc� pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\r\n"
				+ "Bravura. Voc� tem vantagem em testes de resist�ncia\r\n"
				+ "contra ficar amedrontado.\r\n"
				+ "Agilidade Halfling. Voc� pode mover-se atrav�s do\r\n"
				+ "espa�o de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "Halfling. A linguagem Halfling n�o � secreta, mas os\r\n"
				+ "halflings s�o relutantes em compartilh�-la com os outros.\r\n"
				+ "Eles escrevem muito pouco, por isso eles n�o possuem\r\n"
				+ "uma literatura rica. No entanto, sua tradi��o oral � muito\r\n"
				+ "forte. Quase todos os halflings falam o idioma Comum\r\n"
				+ "para conversar com as pessoas das terras que habitam, ou\r\n"
				+ "atrav�s das quais eles estejam viajando.\r\n"
				+ "Sub-ra�a. Os dois tipos principais de halflings, P�sLeves e Robustos, s�o mais como fam�lias bem pr�ximas\r\n"
				+ "do que verdadeiras sub-ra�as. Escolha uma destas subra�as.";
		return halfling;
	}
	
	public void setHalfling() {
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Sortudo.\n\nQuando voc� obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resist�ncia, voc� pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\n\n");
		getFicha().setTracosraciais("Bravura.\n\nVoc� tem vantagem em testes de resist�ncia\r\n"
				+ "contra ficar amedrontado.\n\n");
		getFicha().setTracosraciais("Agilidade Halfling.\n\nVoc� pode mover-se atrav�s do\r\n"
				+ "espa�o de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Halfling");
	}
	
	public String getPesLeves() {
		String pesLeves = "P�S LEVES\r\n\n"
				+ "Como um halfling p�s-leves, voc� pode esconder-se\r\n"
				+ "facilmente, mesmo usando apenas outras pessoas como\r\n"
				+ "cobertura. Voc� geralmente � af�vel e se d� muito bem\r\n"
				+ "com os outros. Nos Reinos Esquecidos, os halflings p�sleves espalharam-se at� os lugares mais distantes e s�o a\r\n"
				+ "variedade mais comum.\r\n"
				+ "P�s-leves s�o mais propensos � vontade de viajar do\r\n"
				+ "que os outros halflings, e muitas vezes vivem ao lado de\r\n"
				+ "outras ra�as ou levam uma vida n�made. No mundo de\r\n"
				+ "Greyhawk, estes halflings s�o chamados p�s-peludos ou\r\n"
				+ "companheiros altos.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Furtividade Natural. Voc� pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no m�nimo um tamanho maior que o seu.\r\n\n";
		return pesLeves;
	}
	
	public void setPesLeves() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Furtividade Natural.\n\nVoc� pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no m�nimo um tamanho maior que o seu.\n\n");
	}
	
	public String getRobusto() {
		String robusto ="ROBUSTO\r\n\n"
				+ "Um halfling robustos � mais resistente do que a m�dia de\r\n"
				+ "sua ra�a e possui certa resist�ncia aos venenos. Alguns\r\n"
				+ "dizem que os robustos t�m sangue dos an�es. Nos Reinos\r\n"
				+ "Esquecidos, esses halflings s�o chamados de austeros, e\r\n"
				+ "s�o mais comuns no sul.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constitui��o aumenta em 1.\r\n"
				+ "Resili�ncia dos Robustos. Voc� tem vantagem em\r\n"
				+ "testes de resist�ncia contra veneno e tem resist�ncia\r\n"
				+ "contra dano de veneno.\n\n";
		return robusto;
	}
	
	public void setRobusto() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Resili�ncia dos Robustos.\n\nVoc� tem vantagem em\r\n"
				+ "testes de resist�ncia contra veneno e tem resist�ncia\r\n"
				+ "contra dano de veneno.\n\n");
	}
	
//Humano
	public String humanoDescricao() {
		String humano = "HUMANOS\r\n\n"
				+ "Os humanos s�o os mais adapt�veis, flex�veis e\r\n"
				+ "ambiciosos entre todas as ra�as comuns. Eles t�m amplos\r\n"
				+ "e distintos gostos, moralidades e h�bitos nas muitas\r\n"
				+ "diferentes regi�es onde eles se instalaram. Quando se\r\n"
				+ "estabelecem em um lugar, eles permanecem: eles\r\n"
				+ "constroem cidades que duram por eras, e grandes reinos\r\n"
				+ "que podem persistir por longos s�culos. Um �nico humano\r\n"
				+ "pode ter uma vida relativamente curta, mas uma na��o\r\n"
				+ "ou cultura humana preserva tradi��es com origens muito\r\n"
				+ "al�m do alcance da mem�ria de qualquer um dos\r\n"
				+ "humanos. Eles vivem plenamente o presente � tornandoos bem adaptados a uma vida de aventuras � mas\r\n"
				+ "tamb�m planejam o futuro, esfor�ando-se para deixar um\r\n"
				+ "legado duradouro. Individualmente e como grupo, os\r\n"
				+ "humanos s�o oportunistas adapt�veis, e permanecem\r\n"
				+ "alerta �s din�micas mudan�as pol�ticas e sociais.\r\n\n"
				+ "TRA�OS RACIAIS DOS HUMANOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Todos os seus\r\n"
				+ "valores de habilidade aumentam em 1.\r\n"
				+ "Idade. Os humanos chegam � idade adulta no final da\r\n"
				+ "adolesc�ncia e vivem menos de um s�culo.\r\n"
				+ "Tend�ncia. Os humanos n�o possuem inclina��o a\r\n"
				+ "nenhuma tend�ncia em especial. Os melhores e os piores\r\n"
				+ "s�o encontrados entre eles.\r\n"
				+ "Tamanho. Os humanos variam muito em altura e\r\n"
				+ "peso, podem ter quase 1,50 metro ou mais de 1,80 metro.\r\n"
				+ "Independentemente da sua posi��o entre esses valores, o\r\n"
				+ "seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "outro idioma adicional, � sua escolha. Os humanos\r\n"
				+ "normalmente aprendem os idiomas dos povos que\r\n"
				+ "convivem, incluindo dialetos obscuros. Eles gostam de\r\n"
				+ "rechear seu discurso com palavras emprestadas de outras\r\n"
				+ "l�nguas: xingamentos orcs, express�es musicais �lficas,\r\n"
				+ "frases militares an�s e outros.\r\n";
		return humano;
	}
	
	public void setHumano() {
		getFicha().setForca(1);
		getFicha().setDestreza(1);
		getFicha().setConstituicao(1);
		getFicha().setInteligencia(1);
		getFicha().setSabedoria(1);
		getFicha().setCarisma(1);
		getFicha().setDeslocamento("9");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas(getIdiomas().setIdioma(1));
	}
	
//Draconato
	public String draconatoDescricao() {
		String draconato = "DRACONATO\r\n\n"
				+ "Descendentes de drag�es, como seus nomes\r\n"
				+ "demonstram, os draconatos andam orgulhosamente pelo\r\n"
				+ "mundo que os sa�da com um temor incompreens�vel.\r\n"
				+ "Moldados por deuses drac�nicos ou pelos pr�prios\r\n"
				+ "drag�es, draconatos originalmente nasceram de ovos de\r\n"
				+ "drag�o como uma ra�a �nica, combinando os melhores\r\n"
				+ "atributos de drag�es e humanos. Alguns draconatos s�o\r\n"
				+ "servos fieis de drag�es verdadeiros, outros formas as\r\n"
				+ "fileiras de soldados em grandes guerras e ainda existem\r\n"
				+ "os que encontram-se � toa, sem um objetivo claro na vida.\r\n\n"
				+ "Draconatos parecem muito com drag�es que est�o de p�\r\n"
				+ "em forma humanoide, apesar de n�o possu�rem asas nem\r\n"
				+ "uma calda. O primeiro draconato possu�a escamas de\r\n"
				+ "matizes brilhantes combinando com as cores do drag�o de\r\n"
				+ "que descendia, mas gera��es de misturas criaram uma\r\n"
				+ "apar�ncia mais uniforme. Suas pequenas escamas finas,\r\n"
				+ "normalmente s�o de cor bronze ou lat�o, algumas vezes\r\n"
				+ "indo at� tons de escarlate, ferrugem, ouro ou cobreesverdeado. Eles s�o altos e de constitui��o forte, muitas\r\n"
				+ "vezes medindo 1,95 metro de altura e pesando 150 kg ou\r\n"
				+ "mais. Suas m�os e p�s s�o fortes, com tr�s dedos de\r\n"
				+ "garras curvadas em cada m�o.\r\n"
				+ "O sangue de um tipo particular de drag�o corre\r\n"
				+ "fortemente nas veias de alguns cl�s de draconatos. Esses\r\n"
				+ "draconatos muitas vezes ostentam escamas de cores mais\r\n"
				+ "similares ao seu drag�o ancestral � vermelho, verde, azul\r\n"
				+ "ou branco brilhantes, preto lustroso ou ouro, prata, lat�o,\r\n"
				+ "cobre ou bronze met�lico reluzente.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "For�a aumenta em 2 e seu valor de Carisma aumenta em\r\n"
				+ "1.\r\n"
				+ "Idade. Draconatos jovens crescem rapidamente. Eles\r\n"
				+ "caminham horas ap�s nascerem, adquirindo o tamanho e\r\n"
				+ "desenvolvimento semelhante a de uma crian�a humana\r\n"
				+ "de 10 anos com 3 anos de idade e alcan�am a maturidade\r\n"
				+ "aos 15. Eles costumam viver at� os 80.\r\n"
				+ "Tend�ncia. Os draconatos tendem aos extremos,\r\n"
				+ "realizando uma escolha consciente de um lado ou do outro\r\n"
				+ "da guerra c�smica entre o bem e o mal (representada por\r\n"
				+ "Bahamut e Tiamat, respectivamente). A maioria dos\r\n"
				+ "draconatos � boa, mas os que v�o para o lado de Tiamat\r\n"
				+ "podem se tornar vil�es terr�veis.\r\n"
				+ "Tamanho. Os draconatos s�o mais altos e mais\r\n"
				+ "pesados que os humanos, geralmente possuindo mais de\r\n"
				+ "1,80 metro e normalmente pesando mais de 125 kg. Seu\r\n"
				+ "tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Ancestral Drac�nico. Voc� possui um ancestral\r\n"
				+ "drac�nico. Escolha um tipo de drag�o da tabela Ancestral\r\n"
				+ "Drac�nico. Sua arma de sopro e resist�ncia a dano s�o\r\n"
				+ "determinadas pelo tipo de drag�o, como mostrado na\r\n"
				+ "tabela.\r\n"
				+ "Arma de Sopro. Voc� pode usar uma a��o para\r\n"
				+ "exalar energia destrutiva. Seu ancestral drac�nico\r\n"
				+ "determina o tamanho, formado e tipo de dano que voc�\r\n"
				+ "expele.\r\n"
				+ "Quando voc� usa sua arma de sopro, cada criatura na\r\n"
				+ "�rea exalada deve realizar um teste de resist�ncia, o tipo\r\n"
				+ "do teste � determinado pelo seu ancestral drac�nico. A CD\r\n"
				+ "do teste de resist�ncia � 8 + seu modificador de\r\n"
				+ "Constitui��o + seu b�nus de profici�ncia. Uma criatura\r\n"
				+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
				+ "sucesso. O dano aumenta para 3d6 no 6� n�vel, 4d6 no 11�\r\n"
				+ "n�vel e 5d6 no 16� n�vel.\r\n"
				+ "Depois de usar sua arma de sopro, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� completar um descanso curto ou\r\n"
				+ "longo.\r\n"
				+ "Resist�ncia a Dano. Voc� possui resist�ncia ao tipo\r\n"
				+ "de dano associado ao seu ancestral drac�nico.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "Drac�nico. O idioma Drac�nico � conhecido por ser uma\r\n"
				+ "das mais antigas l�nguas e ainda � usado no estudo de\r\n"
				+ "magia. A linguagem soa �spera para a maioria das\r\n"
				+ "criaturas, incluindo v�rias consoantes e silabas firmes.\r\n"
				+ "\n"
				+ "ANCESTRAL DRAC�NICO\r\n"
				+ "Drag�o    Tipo de Dano    Arma de Sopro\r\n"
				+ "Azul      El�trico        Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Branco    Frio            Cone de 4,5m (teste de Con)\r\n"
				+ "Bronze    El�trico        Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Cobre     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Lat�o     Fogo            Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Negro     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Ouro      Fogo            Cone de 4,5m (teste de Des)\r\n"
				+ "Prata     Frio            Cone de 4,5m (teste de Con)\r\n"
				+ "Verde     Veneno          Cone de 4,5m (teste de Con)\r\n"
				+ "Vermelho  Fogo            Cone de 4,5m (teste de Des)\r\n";
				
				return draconato;
	}
	
	
	public String getAncestralDraconico() {
		Scanner entrada = new Scanner(System.in);
		int menu;
		boolean menuLoop = false;
		String ancestralDraconico = null;
		while(menuLoop == false) {
			System.out.println("Ancestral Drac�nico.\n\nVoc� possui um ancestral\r\n"
					+ "drac�nico. Escolha um tipo de drag�o da tabela Ancestral\r\n"
					+ "Drac�nico. Sua arma de sopro e resist�ncia a dano s�o\r\n"
					+ "determinadas pelo tipo de drag�o, como mostrado na\r\n"
					+ "tabela.\n\n");
			System.out.println("1 - Azul / El�trico / Linha de 1,5m/9m (teste de Des)\n"
					+ "2 - Branco / Frio / Cone de 4,5m (teste de Con)\n"
					+ "3 - Bronze / El�trico / Linha de 1,5m/9m (teste de Des)\n"
					+ "4 - Cobre / Acido / Linha de 1,5m/9m (teste de Des)\n"
					+ "5 - Lat�o / fogo / Linha 1,5m/9m (teste de Des)\n"
					+ "6 - Negro / Acido / Linha 1,5m/9m (teste de Des)\n"
					+ "7 - Ouro / Fogo / Cone de 4,5m (teste de Des)\n"
					+ "8 - Prata / Frio / Cone de 4,5m (teste de Con)\n"
					+ "9 - Verde / Veneno / Cone de 4,5m (teste de Con)\n"
					+ "10 - Vermelho / Fogo / Cone de 4,5m (teste de Des)\n");
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				ancestralDraconico = "Anccestral Drac�nico.\n\nAzul / El�trico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 2:
				ancestralDraconico = "Anccestral Drac�nico.\n\nBranco / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 3:
				ancestralDraconico = "Anccestral Drac�nico.\n\nBronze / El�trico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 4:
				ancestralDraconico = "Anccestral Drac�nico.\n\nCobre / Acido / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 5:
				ancestralDraconico = "Anccestral Drac�nico.\n\nLat�o / fogo / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 6:
				ancestralDraconico = "Anccestral Drac�nico.\n\nNegro / Acido / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 7:
				ancestralDraconico = "Anccestral Drac�nico.\n\nOuro / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 8:
				ancestralDraconico = "Anccestral Drac�nico.\n\nPrata / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 9:
				ancestralDraconico = "Anccestral Drac�nico.\n\nVerde / Veneno / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 10:
				ancestralDraconico = "Anccestral Drac�nico.\n\nVermelho / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			default:
			break;
			}
		}
		return ancestralDraconico;
	}
	
	public void setDraconato() {
		getFicha().setForca(2);
		getFicha().setCarisma(1);
		getFicha().setTracosraciais(getAncestralDraconico());
		getFicha().setTracosraciais("Arma de Sopro.\n\nVoc� pode usar uma a��o para\r\n"
				+ "exalar energia destrutiva. Seu ancestral drac�nico\r\n"
				+ "determina o tamanho, formado e tipo de dano que voc�\r\n"
				+ "expele.\r\n"
				+ "Quando voc� usa sua arma de sopro, cada criatura na\r\n"
				+ "�rea exalada deve realizar um teste de resist�ncia, o tipo\r\n"
				+ "do teste � determinado pelo seu ancestral drac�nico. A CD\r\n"
				+ "do teste de resist�ncia � 8 + seu modificador de\r\n"
				+ "Constitui��o + seu b�nus de profici�ncia. Uma criatura\r\n"
				+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
				+ "sucesso. O dano aumenta para 3d6 no 6� n�vel, 4d6 no 11�\r\n"
				+ "n�vel e 5d6 no 16� n�vel.\r\n"
				+ "Depois de usar sua arma de sopro, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� completar um descanso curto ou longo.\n\n");
		getFicha().setTracosraciais("Resist�ncia a Dano.\n\nVoc� possui resist�ncia ao tipo\r\n"
				+ "de dano associado ao seu ancestral drac�nico.\r\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Drac�nico");
	}
	
//Gnomo
	public String gnomoDescricao() {
		String gnomo = "GNOMO\r\n\n"
				+ "A energia e entusiasmo dos gnomos pela vida brilha em\r\n"
				+ "cada pedacinho do seu pequeno corpo. Um gnomo padr�o\r\n"
				+ "tem aproximadamente 90 cent�metros de altura e pesa\r\n"
				+ "entre 20 e 23 kg. Seus rostos morenos ou bronzeados s�o\r\n"
				+ "geralmente adornados com largos sorrisos (apesar dos\r\n"
				+ "seus prodigiosos narizes) e seus olhos brilhantes vibram\r\n"
				+ "de emo��o. Seus cabelos claros tendem a ser espichados,\r\n"
				+ "como se expressassem o insaci�vel interesse dos gnomos\r\n"
				+ "em tudo a sua volta.\r\n"
				+ "A personalidade de um gnomo � muito maior que sua\r\n"
				+ "apar�ncia. A barba de um gnomo macho, em contraste\r\n"
				+ "com seu cabelo bagun�ado, mantem se perfeitamente\r\n"
				+ "aparada, mas as vezes, tem um bigode estiloso e pontas\r\n"
				+ "curiosas. Apesar da roupa de um gnomo geralmente\r\n"
				+ "possuir tons modestos de terra, ele ostenta bordados,\r\n"
				+ "estampas ou joias reluzentes.\r\n\n"
				+ "TRA�OS RACIAIS DOS GNOMOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 2.\r\n"
				+ "Idade. Gnomos amadurecem a mesma propor��o que\r\n"
				+ "os humanos e, a maioria, atinge a idade adulta por volta\r\n"
				+ "dos 40 anos. Eles podem viver entre 350 e 500 anos.\r\n"
				+ "Tend�ncia. Os gnomos geralmente s�o bons. Os que\r\n"
				+ "tendem para a ordem s�o s�bios, engenheiros,\r\n"
				+ "pesquisadores, escol�sticos, investigadores ou inventores.\r\n"
				+ "Os que tendem ao caos s�o menestr�is, engenhoqueiros,\r\n"
				+ "andarilhos ou joalheiros caprichosos. Gnomos s�o bons de\r\n"
				+ "cora��o e, at� mesmo os trapaceiros entre eles tendem a\r\n"
				+ "ser mais brincalh�es que perversos.\r\n"
				+ "Tamanho. Os gnomos tem entre 0,90 e 1,20 metro e\r\n"
				+ "seu peso m�dio � de 20 kg. Seu tamanho � Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 7,5 metros.\r\n"
				+ "Vis�o no Escuro. Acostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Esperteza Gn�mica. Voc� possui vantagem em todos\r\n"
				+ "os testes de resist�ncia de Intelig�ncia, Sabedoria e\r\n"
				+ "Carisma contra magia.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum e\r\n"
				+ "Gn�mico. A linguagem Gn�mica, que usa o alfabeto An�o,\r\n"
				+ "� conhecida por suas t�cnicas de disserta��o e por seus\r\n"
				+ "cat�logos de conhecimento sobre o mundo natural.\r\n"
				+ "Sub-ra�as. Duas sub-ra�as de gnomos s�o\r\n"
				+ "encontradas ao redor dos mundos de D&D: os gnomos da\r\n"
				+ "floresta e os gnomos das rochas. Escolha uma dessas subra�as.\r\n";
		return gnomo;
	}
	
	public void setGnomo() {
		getFicha().setInteligencia(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTracosraciais("Esperteza Gn�mica.\n\nVoc� possui vantagem em todos\r\n"
				+ "os testes de resist�ncia de Intelig�ncia, Sabedoria e\r\n"
				+ "Carisma contra magia.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Gn�mico");
	}
	
	public String getGnomoDaFloresta() {
		String gnomoDaFloresta = "GNOMO DA FLORESTA\r\n\n"
				+ "Como um gnomo da floresta, voc� possui um traquejo\r\n"
				+ "natural com ilus�es e velocidade e furtividade naturais.\r\n"
				+ "Nos mundos de D&D, gnomos da floresta s�o raros e\r\n"
				+ "reservados. Eles vivem em comunidades escondidas em\r\n"
				+ "florestas silvestres, usando suas ilus�es e truques para se\r\n"
				+ "esconderem das amea�as ou para mascarar sua fuga\r\n"
				+ "antes de serem detectados. Gnomos da floresta tendem a\r\n"
				+ "ser amig�veis com outros povos da floresta espirituosos e\r\n"
				+ "eles tem nos elfos e fadas bondosas como seus mais\r\n"
				+ "importantes aliados. Eles gnomos tamb�m fazem amizade\r\n"
				+ "com pequenos animais silvestres e contam com eles para\r\n"
				+ "obter informa��es sobre amea�as que estejam\r\n"
				+ "perambulando por suas terras.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 1.\r\n"
				+ "Ilusionista Nato. Voc� conhece o truque ilus�o\r\n"
				+ "menor. Intelig�ncia � a sua habilidade usada para\r\n"
				+ "conjur�-la.\r\n"
				+ "Falar com Bestas Pequenas. Atrav�s de sons e\r\n"
				+ "gestos, voc� pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estima��o.\r\n\n";
		return gnomoDaFloresta;
	}
	
	public void setGnomoDaFloresta() {
		getFicha().setDestreza(1);
		//Ilusionista Nato. Voc� conhece o truque ilus�o menor. Intelig�ncia � a sua habilidade usada para conjur�-la.
		getFicha().setTracosraciais("Falar com Bestas Pequenas.\n\nAtrav�s de sons e\r\n"
				+ "gestos, voc� pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estima��o.\n\n");
	}
	
	public String getGnomoDasRochas() {
		String gnomoDasRochas = "GNOMO DAS ROCHAS\r\n\n"
				+ "Como um gnomo das rochas, voc� possui uma\r\n"
				+ "inventividade e resist�ncia naturais acima dos outros\r\n"
				+ "gnomos. A maioria dos gnomos nos mundos de D&D s�o\r\n"
				+ "gnomos das rochas, incluindo os gnomos engenhoqueiros\r\n"
				+ "do cen�rio de Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constitui��o aumenta em 1.\r\n"
				+ "Conhecimento de Art�fice. Toda vez que voc� fizer\r\n"
				+ "um teste de Intelig�ncia (Hist�ria) relacionado a itens\r\n"
				+ "m�gicos, objetos alqu�micos ou mecanismos tecnol�gicos,\r\n"
				+ "voc� pode adicionar o dobro do seu b�nus de profici�ncia,\r\n"
				+ "ao inv�s de qualquer b�nus de profici�ncia que voc�\r\n"
				+ "normalmente use.\r\n"
				+ "Engenhoqueiro: Voc� possui profici�ncia com\r\n"
				+ "ferramentas de artes�o (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, voc� pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Mi�do (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar ap�s 24 horas (a\r\n"
				+ "n�o ser que voc� gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando voc� usa sua a��o\r\n"
				+ "para desmantel�-lo; nesse momento, voc� pode recuperar\r\n"
				+ "o material usado para cri�-lo. Voc� pode ter at� tr�s\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando voc� criar um mecanismo, escolha uma das\r\n"
				+ "seguintes op��es:\r\n"
				+ "Brinquedo Mec�nico. Esse brinquedo � um animal,\r\n"
				+ "monstro ou pessoa mec�nica, como um sapo, rato,\r\n"
				+ "p�ssaro, drag�o ou soldado. Quando colocado no ch�o,\r\n"
				+ "o brinquedo se move 1,5 metro pelo ch�o em cada um\r\n"
				+ "dos seus turnos em uma dire��o aleat�ria. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n"
				+ "Isqueiro Mec�nico. O mecanismo produz uma\r\n"
				+ "miniatura de chama, que voc� pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua a��o.\r\n"
				+ "Caixa de M�sica. Quando aberta, essa caixa de\r\n"
				+ "m�sica toca uma can��o a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcan�a\r\n"
				+ "o fim da m�sica ou quando � fechada.\r\n\n";
		return gnomoDasRochas;
	}
	
	public void setGnomoDasRochas() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Conhecimento de Art�fice.\n\nToda vez que voc� fizer\r\n"
				+ "um teste de Intelig�ncia (Hist�ria) relacionado a itens\r\n"
				+ "m�gicos, objetos alqu�micos ou mecanismos tecnol�gicos,\r\n"
				+ "voc� pode adicionar o dobro do seu b�nus de profici�ncia,\r\n"
				+ "ao inv�s de qualquer b�nus de profici�ncia que voc�\r\n"
				+ "normalmente use.\n\n");
		getFicha().setTracosraciais("Engenhoqueiro.\n\nVoc� possui profici�ncia com\r\n"
				+ "ferramentas de artes�o (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, voc� pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Mi�do (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar ap�s 24 horas (a\r\n"
				+ "n�o ser que voc� gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando voc� usa sua a��o\r\n"
				+ "para desmantel�-lo; nesse momento, voc� pode recuperar\r\n"
				+ "o material usado para cri�-lo. Voc� pode ter at� tr�s\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando voc� criar um mecanismo, escolha uma das\r\n"
				+ "seguintes op��es:\r\n\n"
				+ "Brinquedo Mec�nico.\nEsse brinquedo � um animal,\r\n"
				+ "monstro ou pessoa mec�nica, como um sapo, rato,\r\n"
				+ "p�ssaro, drag�o ou soldado. Quando colocado no ch�o,\r\n"
				+ "o brinquedo se move 1,5 metro pelo ch�o em cada um\r\n"
				+ "dos seus turnos em uma dire��o aleat�ria. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n\n"
				+ "Isqueiro Mec�nico.\nO mecanismo produz uma\r\n"
				+ "miniatura de chama, que voc� pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua a��o.\r\n\n"
				+ "Caixa de M�sica.\nQuando aberta, essa caixa de\r\n"
				+ "m�sica toca uma can��o a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcan�a\r\n"
				+ "o fim da m�sica ou quando � fechada.\n\n");
	}
	
//Meio-Elfo
	public String meio_elfoDescricao(){
		String meio_elfo = "MEIO ELFO\r\n\n"
				+ "Para os humanos, os meio-elfos parecem elfos, e para os\r\n"
				+ "elfos, eles parecem humanos. Na apar�ncia, eles est�o\r\n"
				+ "entre ambos os parentes, j� que eles n�o s�o nem t�o\r\n"
				+ "esbeltos quanto os elfos nem t�o largos quanto os\r\n"
				+ "humanos. Eles medem entre 1,5 metro e 1,8 metro de\r\n"
				+ "altura e pesam entre 50 kg e 90 kg, sendo os homens\r\n"
				+ "apenas um pouco mais altos e pesados que as mulheres.\r\n"
				+ "Meio-elfos possuem pelos faciais e, as vezes, deixam a\r\n"
				+ "barba crescer para esconder sua ancestralidade �lfica. A\r\n"
				+ "cor e caracter�sticas dos meio-elfos reside entre seus\r\n"
				+ "parentes humanos e elfos e possui uma variedade maior\r\n"
				+ "at� que a encontrada entre ambas as ra�as. Eles tendem\r\n"
				+ "a ter os olhos dos seus pais elfos.\r\n"
				+ "TRA�OS RACIAIS DOS MEIO-ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 2 e outros dois valores de\r\n"
				+ "habilidade, � sua escolha, aumentam em 1.\r\n"
				+ "Idade. Meio-elfos atingem a maturidade ao mesmo\r\n"
				+ "tempo que os humanos atingem a idade adulta, por volta\r\n"
				+ "dos 20 anos. Eles vivem muito mais que os humanos, no\r\n"
				+ "entanto, raramente ultrapassam os 180 anos.\r\n"
				+ "Tend�ncia. Meio-elfos compartilham a veia\r\n"
				+ "ca�tica da sua heran�a �lfica. Eles valorizam tanto a\r\n"
				+ "sua liberdade quanto sua express�o criativa, n�o\r\n"
				+ "demonstrando qualquer apresso por l�deres ou seguidores.\r\n"
				+ "Eles se irritam com regras, ressentindo com exig�ncias de\r\n"
				+ "outros e, as vezes, se provam incertos, ou pelo menos,\r\n"
				+ "imprevis�veis.\r\n"
				+ "Tamanho. Meio-elfos tem aproximadamente a mesma\r\n"
				+ "altura dos humanos, variando entre 1,50 metro e 1,80\r\n"
				+ "metro. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Gra�as ao seu sangue �lfico, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Ancestral Fe�rico. Voc� possui vantagem em testes\r\n"
				+ "de resist�ncia contra encantamento e magia n�o pode\r\n"
				+ "colocar voc� pra dormir.\r\n"
				+ "Versatilidade em Per�cia. Voc� ganha profici�ncia\r\n"
				+ "em duas per�cias, � sua escolha.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum,\r\n"
				+ "�lfico e um idioma adicional, � sua escolha.\r\n";
		return meio_elfo;
	}
	
	public void setmeio_elfoAtributos() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		List<String> lista = Arrays.asList("For�a", "Destreza", "Constitui��o", "Inteligencia", "Sabedoria", "Carisma");
		ArrayList<String> atributos = new ArrayList<String>();
		atributos.addAll(lista);
		int count = 2;
		while(count != 0) {
			for(int i = 0; i < atributos.size(); i++) {
				System.out.println(i +" - "+atributos.get(i));
			}
			System.out.println("Escolha " +count +" Atributo(s) para receber +1: ");
			do {
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > atributos.size());
			
			switch(atributos.get(opcao)) {
			case "For�a":
				getFicha().setForca(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Destreza":
				getFicha().setDestreza(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Constitui��o":
				getFicha().setConstituicao(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Inteligencia":
				getFicha().setInteligencia(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Sabedoria":
				getFicha().setSabedoria(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Carisma":
				getFicha().setCarisma(1);
				atributos.remove(opcao);
				count--;
			break;
			}
		}
		
	}
	
	public void setMeio_elfo() {
		getFicha().setCarisma(2);
		setmeio_elfoAtributos();
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nGra�as ao seu sangue �lfico, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setTracosraciais("Ancestral Fe�rico.\n\nVoc� possui vantagem em testes\r\n"
				+ "de resist�ncia contra encantamento e magia n�o pode\r\n"
				+ "colocar voc� pra dormir.\r\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("�lfico");
		getFicha().setIdiomas(getIdiomas().setIdioma(1));
	}
	
//Meio-Orc
	public String meio_orcDescricao() {
		String meio_orc = "MEIO ORC\r\n\n"
				+ "A pigmenta��o acinzentada dos meio-orcs, suas testas\r\n"
				+ "avantajadas, mand�bulas salientes, dentes proeminentes\r\n"
				+ "e corpos grandes torna sua heran�a orc not�vel para todos\r\n"
				+ "os observadores. Meio-orcs tem entre 1,80 metro e 2,10\r\n"
				+ "metros e, normalmente pesam entre 90 kg e 125 kg.\r\n"
				+ "Orcs ostentam cicatrizes de batalha como pe�as de\r\n"
				+ "orgulho e consideram cicatrizes ornamentais como coisas\r\n"
				+ "bonitas. Outras cicatrizes, no entanto, marcam um orc ou\r\n"
				+ "meio-orc como um ex-escravo ou um exilado desonrado.\r\n"
				+ "Qualquer meio-orc que tenha vivido entre ou pr�ximo dos\r\n"
				+ "orcs ter� cicatrizes, independentemente de serem marcas\r\n"
				+ "de humilha��o ou de orgulho, recontando suas fa�anhas e\r\n"
				+ "ferimentos do passado. At� mesmo um meio-orc que viva\r\n"
				+ "entre os humanos dever� mostrar essas cicatrizes\r\n"
				+ "orgulhosamente ou escond�-las com vergonha.\r\n\n"
				+ "TRA�OS RACIAIS DOS MEIO ORCS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "For�a aumenta em 2 e seu valor de Constitui��o\r\n"
				+ "aumenta em 1.\r\n"
				+ "Idade. Os meio-orcs amadurecem um pouco antes\r\n"
				+ "dos humanos, atingindo a idade adulta aos 14 anos.\r\n"
				+ "Eles envelhecem notavelmente mais r�pido e, raramente,\r\n"
				+ "vivem mais de 75 anos.\r\n"
				+ "Tend�ncia. Meio-orcs tem uma tend�ncia inata ao\r\n"
				+ "caos devido aos seus parentes orcs e n�o s�o fortemente\r\n"
				+ "inclinados ao bem. Meio-orcs que cresceram entre orcs e\r\n"
				+ "desejam viver e est�o dispostos a passar sua vida entre\r\n"
				+ "eles, tendem a ser malignos.\r\n"
				+ "Tamanho. Meio-orcs s�o de certa forma maiores e\r\n"
				+ "mais largos que os humanos, medindo entre 1,80 metro e\r\n"
				+ "2,10 metros. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Gra�as ao seu sangue orc, voc� tem\r\n"
				+ "uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Amea�ador. Voc� adquire profici�ncia na per�cia\r\n"
				+ "Intimida��o.\r\n"
				+ "Resist�ncia Implac�vel. Quando voc� � reduzido a\r\n"
				+ "0 pontos de vida mas n�o � completamente morto, voc�\r\n"
				+ "pode voltar para 1 ponto de vida. Voc� n�o pode usar essa\r\n"
				+ "caracter�stica novamente at� completar um descanso\r\n"
				+ "longo.\r\n"
				+ "Ataques Selvagens. Quando voc� atinge um ataque\r\n"
				+ "cr�tico com uma arma corpo-a-corpo, voc� pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicion�-lo ao\r\n"
				+ "dano extra causado pelo acerto cr�tico.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum, Orc.\r\n"
				+ "O Orc � um idioma r�spido, possuindo uma linguagem de\r\n"
				+ "consoantes duras. Ele n�o possui alfabeto pr�prio, mas\r\n"
				+ "usa o alfabeto An�o.\r\n";
		return meio_orc;
	}
	
	public void setMeio_orc() {
		getFicha().setForca(2);
		getFicha().setConstituicao(1);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nGra�as ao seu sangue orc, voc� tem\r\n"
				+ "uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTem_intimidacao();
		getFicha().setTracosraciais("Resist�ncia Implac�vel.\n\nQuando voc� � reduzido a\r\n"
				+ "0 pontos de vida mas n�o � completamente morto, voc�\r\n"
				+ "pode voltar para 1 ponto de vida. Voc� n�o pode usar essa\r\n"
				+ "caracter�stica novamente at� completar um descanso longo.\n\n");
		getFicha().setTracosraciais("Ataques Selvagens.\n\nQuando voc� atinge um ataque\r\n"
				+ "cr�tico com uma arma corpo-a-corpo, voc� pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicion�-lo ao\r\n"
				+ "dano extra causado pelo acerto cr�tico.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Orc");
	}
	
//Tiefling
	public String tieflingDescricao() {
		String tiefling = "TIEFLING\r\n\n"
				+ "Ser recebido com olhares e cochichos, sofrer viol�ncia e\r\n"
				+ "insultos nas ruas, ver a desconfian�a e medo em cada\r\n"
				+ "olhar: esse � o fardo do tiefling. E para completar tudo, os\r\n"
				+ "tieflings sabem que isso � gra�as ao pacto feito gera��es\r\n"
				+ "atr�s que infundiu a ess�ncia de Asmodeus � senhor\r\n"
				+ "supremo dos Nove Infernos � em sua linhagem. Sua\r\n"
				+ "apar�ncia e natureza n�o � culpa deles, mas � o resultado\r\n"
				+ "de um pecado ancestral, pelo qual eles, seus filhos e os\r\n"
				+ "filhos de seus filhos ser�o eternamente responsabilizados.\r\n\n"
				+ "Os tieflings derivam de linhagens humanas e, no sentido\r\n"
				+ "mais amplo poss�vel, eles ainda parecem humanos. No\r\n"
				+ "entanto, sua heran�a infernal deixou tra�os claros na sua\r\n"
				+ "apar�ncia. Tieflings possuem grandes chifres que\r\n"
				+ "possuem os mais diversos formatos: alguns possuem\r\n"
				+ "chifres curvos, como um carneiro, outros possuem chifres\r\n"
				+ "compridos e finos, como uma gazela, e outros chifres\r\n"
				+ "espiralados e alongados, como os de um ant�lope. Eles\r\n"
				+ "possuem uma final calda, com uns 1,20 metro a 1,50\r\n"
				+ "metro de comprimento, que chicoteia ou se enrola em suas\r\n"
				+ "pernas quando ele fica chateado ou nervoso. Seus dentes\r\n"
				+ "caninos s�o afiados e pontiagudos e seus olhos possuem\r\n"
				+ "cores solidas � preto, vermelho, branco, prateado ou\r\n"
				+ "dourado � sem esclera ou pupila vis�veis. Seus tons de\r\n"
				+ "pele abrangem todas as tonalidades da pele humana, mas\r\n"
				+ "tamb�m incluem varia��es de tons vermelho. Seus\r\n"
				+ "cabelos, escorrem atr�s dos seus chifres, geralmente\r\n"
				+ "escuro, de preto ou marrom a vermelho, azul ou roxo\r\n"
				+ "escuro.\r\n"
				+ "TRA�OS RACIAIS DOS TIEFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 1 e seu valor de Carisma\r\n"
				+ "aumenta em 2.\r\n"
				+ "Idade. Os tieflings amadurecem ao mesmo tempo que\r\n"
				+ "os humanos, mas vivem alguns anos a mais.\r\n"
				+ "Tend�ncia. Tieflings n�o possuem uma tend�ncia\r\n"
				+ "inata ao mal, mas muitos acabam por abra��-lo. Maligno\r\n"
				+ "ou n�o, uma natureza independente inclina a maioria dos\r\n"
				+ "tieflings ao alinhamento ca�tico.\r\n"
				+ "Tamanho. Os tieflings possuem o mesmo tamanho e\r\n"
				+ "complei��o dos humanos. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Gra�as a sua heran�a infernal, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resist�ncia Infernal. Voc� possui resist�ncia a dano\r\n"
				+ "de fogo.\r\n"
				+ "Legado Infernal. Voc� conhece o truque\r\n"
				+ "taumaturgia. Quando voc� atingir o 3� n�vel, voc� poder�\r\n"
				+ "conjurar a magia repreens�o infernal como uma magia de\r\n"
				+ "2� n�vel. Quando voc� atingir o 5� n�vel, voc� tamb�m\r\n"
				+ "poder� conjurar a magia escurid�o. Voc� precisa terminar\r\n"
				+ "um descanso longo para poder usar as magias desse tra�o\r\n"
				+ "novamente. Sua habilidade de conjura��o para essas\r\n"
				+ "magias � Carisma.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum e\r\n"
				+ "Infernal.\r\n";
		return tiefling;
	}
	
	public void setTiefling() {
		getFicha().setInteligencia(1);
		getFicha().setCarisma(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nGra�as a sua heran�a infernal, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Infernal");
	}
}
