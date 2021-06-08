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
	
	//Anão
	public String anaoDescricao() {
		String anao = "ANÃO\r\n\n"
				+ "Audazes e resistentes, os anões são\r\n"
				+ "conhecidos como hábeis guerreiros,\r\n"
				+ "mineradores e trabalhadores em pedra e\r\n"
				+ "metal. Embora tenham menos de 1,50 metro\r\n"
				+ "de altura, os anões são tão largos e\r\n"
				+ "compactos que podem pesar tanto quanto\r\n"
				+ "um humano 60 centímetros mais alto. Sua\r\n"
				+ "coragem e resistência compete facilmente\r\n"
				+ "com qualquer povo mais alto. A pele dos\r\n"
				+ "anões varia do marrom escuro a um matiz\r\n"
				+ "mais pálido, tingido de vermelho, mas os tons mais\r\n"
				+ "comuns são o castanho claro ou bronzeado, como certos\r\n"
				+ "tons terrosos. O cabelo é longo, mas de estilo simples,\r\n"
				+ "geralmente negro, cinzento ou castanho, embora anões\r\n"
				+ "mais pálidos frequentemente possuem cabelos ruivos.\r\n"
				+ "Anões machos valorizam altamente suas barbas e\r\n"
				+ "preparam-nas com cuidado.\r\n\n"
				+ "TRAÇOS RACIAIS DOS ANÕES\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Constituição aumenta em 2.\r\n"
				+ "Idade. Anões tornam-se maduros na mesma proporção que os humanos, mas são considerados jovens até atingirem a idade de 50 anos. Em média, eles vivem 350 anos.\r\n"
				+ "Tendência. A maioria dos anões é leal, pois acreditam firmemente nos benefícios de uma sociedade bem organizada. Eles tendem para o bem, com um forte senso de\r\n"
				+ "honestidade e uma crença de que todos merecem compartilhar os benefícios de uma ordem social justa.\r\n"
				+ "Tamanho. Anões estão entre 1,20 e 1,50 metro de altura e pesam cerca de 75 kg. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada é de 7,5 metros. Seu deslocamento não é reduzido quando estiver usando armadura pesada.\r\n"
				+ "Visão no Escuro. Acostumado à vida subterrânea, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena,\r\n"
				+ "e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resiliência Anã. Você possui vantagem em testes de resistência contra venenos e resistência contra dano de veneno.\r\n"
				+ "Treinamento Anão em Combate. Você tem proficiência com machados de batalha, machadinhas, martelos leves e martelos de guerra.\r\n"
				+ "Proficiência com Ferramentas. Você tem proficiência em uma ferramenta de artesão à sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\r\n"
				+ "Especialização em Rochas. Sempre que você realizar um teste de Inteligência (História) relacionado à origem de um trabalho em pedra, você é considerado proficiente na perícia\r\n"
				+ "História e adiciona o dobro do seu bônus de proficiência ao teste, ao invés do seu bônus de proficiência normal.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e Anão. O idioma Anão é repleto de consoantes duras e sons guturais, e essa característica influencia, como um sotaque, qualquer\r\n"
				+ "outro idioma que o anão falar.\r\n"
				+ "Sub-raça. Existem duas sub-raças principais de anões nos mundos de D&D: anões da colina e anões da montanha. Você deve escolher uma dessas sub-raças./r/n";
		return anao;
	}
	
	public void setRacaAnao() {
		getFicha().setRaca("Anão");
		getFicha().setConstituicao(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n");
		getFicha().setTracosraciais("Resiliência Anã.\n\nVocê possui vantagem em testes de\r\n"
				+ "resistência contra venenos e resistência contra dano de\r\n"
				+ "veneno.\n\n");
		getFicha().setTracosraciais("Especialização em Rochas.\n\nSempre que você\r\n"
				+ "realizar um teste de Inteligência (História) relacionado à\r\n"
				+ "origem de um trabalho em pedra, você é considerado\r\n"
				+ "proficiente na perícia História e adiciona o dobro do seu\r\n"
				+ "bônus de proficiência ao teste, ao invés do seu bônus de\r\n"
				+ "proficiência normal.\n\n");
		getFicha().setProfi_equips("Machados de batalha");
		getFicha().setProfi_equips("Machadinhas");
		getFicha().setProfi_equips("Martelos leves");
		getFicha().setProfi_equips("Martelos de guerra");
		getFicha().setProfi_ferramentas_peri("Ferramenta de artesão");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Anão");
	}
	
	public String anaoSRcolina() {
		String anaoSRcolina = "ANÃO DA COLINA\r\n"
				+ "\n"
				+ "Como um anão da colina, você tem sentidos aguçados,\r\n"
				+ "maior intuição e notável resiliência. Os anões dourados de\r\n"
				+ "Faerûn, que vivem em seu poderoso reino ao sul do\r\n"
				+ "continente, são anões da colina, assim como os exilados\r\n"
				+ "Neidar e os depreciáveis Klar de Krynn, no cenário de\r\n"
				+ "Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Tenacidade Anã. Seu máximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o anão da colina sobe um\r\n"
				+ "nível, ele recebe 1 ponto de vida adicional.\r\n";
		return anaoSRcolina;
	}
	
	public void setanaoSRcolina() {
		getFicha().setSabedoria(1);
		getFicha().setPontos_vida(1);
		getFicha().setTracosraciais("Tenacidade Anã.\n\nSeu máximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o anão da colina sobe um\r\n"
				+ "nível, ele recebe 1 ponto de vida adicional.");
	}
	
	public String anaoSRmontanha() {
		String anaoSRmontanha = "--ANÃO DA MONTANHA--\n\n"
				+ "Como um anão da montanha, você é forte e resistente,\r\n"
				+ "acostumados a uma vida difícil em terrenos difíceis. Você,\r\n"
				+ "provavelmente tem a descendência daqueles mais altos\r\n"
				+ "(para um anão) e tende a possuir uma coloração mais\r\n"
				+ "clara. Os anões do escudo do norte de Faerûn, bem como o\r\n"
				+ "clã governante Hylar e os clãs nobres Daewar de\r\n"
				+ "Dragonlance, são anões da montanha.\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Força aumenta em 2.\r\n"
				+ "Treinamento Anão com Armaduras. Você adquire proficiência em armaduras leves e médias.\r\n\n";
		return anaoSRmontanha;
	}
	
	public void setanaoSRmontanha() {
		getFicha().setForca(2);
		getFicha().setProfi_equips("Armaduras leves");
		getFicha().setProfi_equips("Armaduras médias");
	}

//Elfo
	public String elfoDescricao() {
		String elfo = "Elfo\r\n\n"
				+ "Com a sua graça sobrenatural e seus traços finos, os elfos\r\n"
				+ "parecem assustadoramente belos para os humanos e os\r\n"
				+ "membros de muitas outras raças. Em média, eles são\r\n"
				+ "ligeiramente mais baixos do que os humanos, variando de\r\n"
				+ "pouco menos de 1,50 metro até pouco mais de 1,80 metro\r\n"
				+ "de altura. Eles são mais delgados que os humanos,\r\n"
				+ "pesando entre 50 kg a 72 kg apenas. Os machos e as\r\n"
				+ "fêmeas são quase da mesma altura, mas os machos são\r\n"
				+ "um pouco mais pesados do que as fêmeas.\r\n"
				+ "A coloração da pele dos elfos varia da mesma maneira\r\n"
				+ "que os humanos, e também incluem peles em tons de\r\n"
				+ "cobre, bronze, até o branco-azulado, os cabelos podem ser\r\n"
				+ "de tons verdes ou azuis, e os olhos podem ser como\r\n"
				+ "piscinas douradas ou prateadas. Elfos não possuem pelos\r\n"
				+ "faciais e poucos pelos no corpo. Eles preferem roupas\r\n"
				+ "elegantes em cores brilhantes, e gostam de joias simples,\r\n"
				+ "mas belas.\r\n\n"
				+ "TRAÇOS RACIAIS DOS ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Embora os elfos atinjam a maturidade física\r\n"
				+ "com praticamente a mesma idade dos humanos, a\r\n"
				+ "compreensão élfica da idade adulta vai além da\r\n"
				+ "maturidade física, abrangendo sua experiência sobre o\r\n"
				+ "mundo. Um elfo tipicamente assume a idade adulta e um\r\n"
				+ "nome adulto com cerca de 100 anos de idade e pode viver\r\n"
				+ "750 anos.\r\n"
				+ "Tendência. Elfos amam a liberdade, a diversidade e a\r\n"
				+ "expressão pessoal, então eles inclinam-se forte e\r\n"
				+ "suavemente para aspectos do caos. Eles valorizam e\r\n"
				+ "protegem a liberdade dos outros como a sua própria, e são\r\n"
				+ "geralmente mais bondosos que o contrário. Os drow são\r\n"
				+ "exceção. Seu exílio no Subterrâneo fez deles perversos e\r\n"
				+ "perigosos. Drow são geralmente mais maus que o\r\n"
				+ "contrário.\r\n"
				+ "Tamanho. Elfos medem entre 1,50 a 1,80 metro de\r\n"
				+ "altura e possuem constituição delgada. Seu tamanho é\r\n"
				+ "Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Acostumado às florestas\r\n"
				+ "crepusculares e ao céu noturno, você possui uma visão\r\n"
				+ "superior em condições de escuridão e na penumbra. Você\r\n"
				+ "pode enxergar na penumbra a até 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Você não pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\r\n"
				+ "Sentidos Aguçados. Você tem proficiência na perícia\r\n"
				+ "Percepção.\r\n"
				+ "Ancestral Feérico. Você tem vantagem nos testes de\r\n"
				+ "resistência para resistir a ser enfeitiçado e magias não\r\n"
				+ "podem colocá-lo para dormir.\r\n"
				+ "Transe. Elfos não precisam dormir. Ao invés disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal meditação é \"transe\".) Enquanto\r\n"
				+ "medita, um elfo é capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade são exercícios mentais que se tornam\r\n"
				+ "reflexos através de anos de prática. Depois de descansar\r\n"
				+ "dessa forma, você ganha os mesmos benefícios que um\r\n"
				+ "humano depois de 8 horas de sono.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "Élfico. O Élfico é um idioma fluido, com entonações sutis e\r\n"
				+ "gramática complexa. A literatura élfica é rica e diversa, e\r\n"
				+ "suas canções e poemas são famosos entre outras raças.\r\n"
				+ "Muitos bardos aprendem essa língua para que possam\r\n"
				+ "adicionar canções élficas ao seu repertório.\r\n"
				+ "Sub-raça. Antigas divisões entre os povos élficos\r\n"
				+ "resultaram em três sub-raças principais: os altos elfos, os\r\n"
				+ "elfos da floresta, e os elfos negros, que são comumente\r\n"
				+ "chamados de drow. Escolha uma dessas sub-raças. Em\r\n"
				+ "alguns mundos, essas sub-raças são ainda mais divididas\r\n"
				+ "(como os elfos do sol e elfos da lua nos Reinos Esquecidos),\r\n"
				+ "então se você desejar, você pode escolher uma sub-raça\r\n"
				+ "ainda mais específica.\r\n";
		return elfo;
	}
	
	public void setRacaElfo() {
		getFicha().setRaca("Elfo");
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado às florestas\r\n"
				+ "crepusculares e ao céu noturno, você possui uma visão\r\n"
				+ "superior em condições de escuridão e na penumbra. Você\r\n"
				+ "pode enxergar na penumbra a até 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Você não pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\n\n");
		getFicha().setTracosraciais("Sentidos Aguçados.\n\nVocê tem proficiência na perícia\r\n"
				+ "Percepção.\n\n");
		getFicha().setTracosraciais("Ancestral Feérico.\n\nVocê tem vantagem nos testes de\r\n"
				+ "resistência para resistir a ser enfeitiçado e magias não\r\n"
				+ "podem colocá-lo para dormir.\r\n\n");
		getFicha().setTracosraciais("Transe.\n\nElfos não precisam dormir. Ao invés disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal meditação é \"transe\".) Enquanto\r\n"
				+ "medita, um elfo é capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade são exercícios mentais que se tornam\r\n"
				+ "reflexos através de anos de prática. Depois de descansar\r\n"
				+ "dessa forma, você ganha os mesmos benefícios que um\r\n"
				+ "humano depois de 8 horas de sono.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Élfico");
	}
	
	public String getAltoElfo() {
		String altoElfo = "ALTO ELFO\r\n\n"
				+ "Como alto elfo, você possui uma mente afiada e um\r\n"
				+ "domínio da magia básico. Em muitos dos mundos de\r\n"
				+ "D&D, existem dois tipos de altos elfos. Um tipo (que\r\n"
				+ "inclui os elfos cinzentos e elfos do vale de Greyhawk, os\r\n"
				+ "Silvanesti de Dragonlance, e os elfos do sol dos\r\n"
				+ "Reinos Esquecidos) são arrogantes e reclusos,\r\n"
				+ "acreditando serem superiores aos não elfos e até\r\n"
				+ "mesmo a outros elfos. O outro tipo (como os altos\r\n"
				+ "elfos de Greyhawk, os Qualinesti de Dragonlance\r\n"
				+ "e os elfos da lua dos Reinos Esquecidos) são\r\n"
				+ "mais comuns e amigáveis, e muitas vezes\r\n"
				+ "encontrados entre humanos e outras raças.\r\n"
				+ "Os elfos do sol de Faerûn (também chamado de elfos\r\n"
				+ "dourados ou elfos do amanhecer) têm pele bronzeada e\r\n"
				+ "cabelos cor de cobre, negros ou louro dourado. Seus\r\n"
				+ "olhos são dourados, prateados ou negros. Os elfos da\r\n"
				+ "lua (também chamados de elfos de prata ou elfos\r\n"
				+ "cinzentos) são muito mais pálidos, com pele de\r\n"
				+ "alabastro por vezes tingida de azul. Normalmente, eles\r\n"
				+ "têm cabelos de um branco prateado, negros ou azuis,\r\n"
				+ "diversos tons de loiro, castanho e vermelho não são\r\n"
				+ "incomuns. Seus olhos são azuis ou verdes com manchas\r\n"
				+ "douradas.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 1.\r\n"
				+ "Treinamento Élfico com Armas. Você possui\r\n"
				+ "proficiência com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Truque. Você conhece um truque, à sua escolha, da\r\n"
				+ "lista de truques do mago. Inteligência é a habilidade\r\n"
				+ "usado para conjurar este truque.\r\n"
				+ "Idioma Adicional. Você pode falar, ler e escrever um\r\n"
				+ "idioma adicional à sua escolha.\r\n\n";
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
				+ "Como um elfo da floresta, você possui sentidos e intuição\r\n"
				+ "aguçados, seus pés ágeis guiam-no rápida e furtivamente\r\n"
				+ "através de suas florestas nativas. Essa categoria inclui os\r\n"
				+ "elfos selvagens (grugach) de Greyhawk e os Kagonesti de\r\n"
				+ "Dragonlance, bem como as raças chamadas de elfos da\r\n"
				+ "floresta em Greyhawk e nos Reinos Esquecidos. Em\r\n"
				+ "Faerûn, os elfos da floresta (também chamados de elfos\r\n"
				+ "selvagens, elfos verdes ou elfos do bosque) são reclusos e\r\n"
				+ "desconfiados dos não elfos.\r\n"
				+ "A pele dos elfos da floresta tende a ser de matiz\r\n"
				+ "cobreada, algumas vezes com traços esverdeados. Seu\r\n"
				+ "cabelo geralmente é castanho ou negro, mas\r\n"
				+ "ocasionalmente podem ser loiros ou cor de cobre. Seus\r\n"
				+ "olhos são verdes, castanhos ou cor de avelã.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Treinamento Élfico com Armas. Você possui\r\n"
				+ "proficiência com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Pés Ligeiros. Seu deslocamento base de caminhada\r\n"
				+ "aumenta para 10,5 metros.\r\n"
				+ "Máscara da Natureza. Você pode tentar se esconder\r\n"
				+ "mesmo quando você está apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, névoa ou outro\r\n"
				+ "fenômeno natural.\r\n\n";
				
				return elfoDaFloresta;
	}
	
	public void setElfoDaFloresta() {
		getFicha().setSabedoria(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
		getFicha().setDeslocamento("10,5");
		getFicha().setTracosraciais("Máscara da Natureza.\n\nVocê pode tentar se esconder\r\n"
				+ "mesmo quando você está apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, névoa ou outro\r\n"
				+ "fenômeno natural.\n");
	}
	
	public String getElfoNegro() {
		String elfoNegro ="ELFO NEGRO(DROW)\r\n\n"
				+ "Descendentes de uma antiga sub-raça de elfos de pele\r\n"
				+ "negra, os drow foram banidos da superfície do mundo por\r\n"
				+ "seguirem a deusa Lolth pelo caminho do mal e corrupção.\r\n"
				+ "Agora, eles construíram sua própria civilização nas\r\n"
				+ "profundezas do Subterrâneo, moldados pelo Caminho de\r\n"
				+ "Lolth. Também conhecidos como elfos negros, os drow\r\n"
				+ "possuem pele negra similar a obsidiana polida e cabelos\r\n"
				+ "brancos opacos ou amarelo pálido. Normalmente eles\r\n"
				+ "possuem olhos muito pálidos (tão pálidos que são\r\n"
				+ "confundidos com olhos brancos) com tons de lilás, prata,\r\n"
				+ "rosa, vermelho e azul. Eles costumam ser menores e mais\r\n"
				+ "magros que a maioria dos elfos.\r\n"
				+ "Aventureiros drow são raros e a raça não existe em\r\n"
				+ "todo o mundo. Verifique com seu Mestre se a raça drow\r\n"
				+ "está disponível como personagem de jogador.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Visão no Escuro Superior. Sua visão no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\r\n"
				+ "Sensibilidade à Luz Solar. Você possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percepção) relacionados a visão quando você, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que você está tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n"
				+ "Magia Drow. Você possui o truque globos de luz.\r\n"
				+ "Quando você alcança o 3° nível, você pode conjurar a\r\n"
				+ "magia fogo das fadas. Quando você alcança o 5° nível,\r\n"
				+ "você pode conjurar escuridão. Você precisa terminar um\r\n"
				+ "descanso longo para poder conjurar as magias desse traço\r\n"
				+ "novamente. Carisma é sua habilidade chave para\r\n"
				+ "conjurar essas magias.\r\n"
				+ "Treinamento Drow com Armas. Você possui\r\n"
				+ "proficiência com rapieiras, espadas curtas e bestas de mão.\r\n\n";
		return elfoNegro;
	}
	
	public void setElfoNegro() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Visão no Escuro Superior.\n\nSua visão no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\n\n");
		getFicha().setTracosraciais("Sensibilidade à Luz Solar.\n\nVocê possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percepção) relacionados a visão quando você, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que você está tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n\n");
		List<String> proficiencias_equips = Arrays.asList("Rapieiras", "Espadas curtas", "Bestas de mão");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
//Halfling
	public String halflingDescricao() {
		String halfling = "Halfling\r\n\n"
				+ "Os pequeninos halflings sobrevivem em um mundo cheio\r\n"
				+ "de criaturas maiores ao evitar serem notados, ou evitando\r\n"
				+ "o combate direto. Com uns 90 centímetros de altura, eles\r\n"
				+ "parecem inofensivos e assim conseguiram sobreviver por\r\n"
				+ "séculos às sombras dos impérios e à margem de guerras e\r\n"
				+ "conflitos políticos. Eles normalmente são robustos,\r\n"
				+ "pesando entre 20 kg e 22,5 kg.\r\n"
				+ "A pele dos halflings varia do bronzeado ao pálido com\r\n"
				+ "um tom corado, e seu cabelo é geralmente castanho ou\r\n"
				+ "castanho claro e ondulado. Eles têm olhos castanhos ou\r\n"
				+ "amendoados. Halflings do sexo masculino muitas vezes\r\n"
				+ "ostentam costeletas longas, mas barbas são raras entre\r\n"
				+ "eles e bigodes são quase inexistentes. Eles gostam de usar\r\n"
				+ "roupas simples, confortáveis e práticas, preferindo as\r\n"
				+ "cores claras.\r\n"
				+ "A praticidade dos halflings se estende para além de\r\n"
				+ "suas roupas. Eles se preocupam com as necessidades\r\n"
				+ "básicas e os prazeres simples, e não são inclinados à\r\n"
				+ "ostentação. Mesmo o mais rico dos halflings mantém seus\r\n"
				+ "tesouros trancados em um porão, em vez de expostos à\r\n"
				+ "vista de todos. Eles possuem um talento especial para\r\n"
				+ "encontrar a solução mais simples para um problema e\r\n"
				+ "têm pouca paciência para indecisões.\r\n\n"
				+ "TRAÇOS RACIAIS DOS HALFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Um halfling atinge a idade adulta aos 20 anos\r\n"
				+ "e pode chegar a 150 anos.\r\n"
				+ "Tendência. A maioria dos halflings é leal e boa. Via\r\n"
				+ "de regra, eles possuem um bom coração e são amáveis,\r\n"
				+ "odeiam ver o sofrimento dos outros e não toleram a\r\n"
				+ "opressão. Eles também são muito ordeiros e tradicionais,\r\n"
				+ "fortemente apegados à sua comunidade e ao conforto de\r\n"
				+ "suas antigas tradições.\r\n"
				+ "Tamanho. Halflings medem cerca de 0,90 metro de\r\n"
				+ "altura e pesam aproximadamente 20 kg. Seu tamanho é\r\n"
				+ "Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 7,5 metros.\r\n"
				+ "Sortudo. Quando você obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resistência, você pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\r\n"
				+ "Bravura. Você tem vantagem em testes de resistência\r\n"
				+ "contra ficar amedrontado.\r\n"
				+ "Agilidade Halfling. Você pode mover-se através do\r\n"
				+ "espaço de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "Halfling. A linguagem Halfling não é secreta, mas os\r\n"
				+ "halflings são relutantes em compartilhá-la com os outros.\r\n"
				+ "Eles escrevem muito pouco, por isso eles não possuem\r\n"
				+ "uma literatura rica. No entanto, sua tradição oral é muito\r\n"
				+ "forte. Quase todos os halflings falam o idioma Comum\r\n"
				+ "para conversar com as pessoas das terras que habitam, ou\r\n"
				+ "através das quais eles estejam viajando.\r\n"
				+ "Sub-raça. Os dois tipos principais de halflings, PésLeves e Robustos, são mais como famílias bem próximas\r\n"
				+ "do que verdadeiras sub-raças. Escolha uma destas subraças.";
		return halfling;
	}
	
	public void setHalfling() {
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Sortudo.\n\nQuando você obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resistência, você pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\n\n");
		getFicha().setTracosraciais("Bravura.\n\nVocê tem vantagem em testes de resistência\r\n"
				+ "contra ficar amedrontado.\n\n");
		getFicha().setTracosraciais("Agilidade Halfling.\n\nVocê pode mover-se através do\r\n"
				+ "espaço de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Halfling");
	}
	
	public String getPesLeves() {
		String pesLeves = "PÉS LEVES\r\n\n"
				+ "Como um halfling pés-leves, você pode esconder-se\r\n"
				+ "facilmente, mesmo usando apenas outras pessoas como\r\n"
				+ "cobertura. Você geralmente é afável e se dá muito bem\r\n"
				+ "com os outros. Nos Reinos Esquecidos, os halflings pésleves espalharam-se até os lugares mais distantes e são a\r\n"
				+ "variedade mais comum.\r\n"
				+ "Pés-leves são mais propensos à vontade de viajar do\r\n"
				+ "que os outros halflings, e muitas vezes vivem ao lado de\r\n"
				+ "outras raças ou levam uma vida nômade. No mundo de\r\n"
				+ "Greyhawk, estes halflings são chamados pés-peludos ou\r\n"
				+ "companheiros altos.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Furtividade Natural. Você pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no mínimo um tamanho maior que o seu.\r\n\n";
		return pesLeves;
	}
	
	public void setPesLeves() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Furtividade Natural.\n\nVocê pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no mínimo um tamanho maior que o seu.\n\n");
	}
	
	public String getRobusto() {
		String robusto ="ROBUSTO\r\n\n"
				+ "Um halfling robustos é mais resistente do que a média de\r\n"
				+ "sua raça e possui certa resistência aos venenos. Alguns\r\n"
				+ "dizem que os robustos têm sangue dos anões. Nos Reinos\r\n"
				+ "Esquecidos, esses halflings são chamados de austeros, e\r\n"
				+ "são mais comuns no sul.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constituição aumenta em 1.\r\n"
				+ "Resiliência dos Robustos. Você tem vantagem em\r\n"
				+ "testes de resistência contra veneno e tem resistência\r\n"
				+ "contra dano de veneno.\n\n";
		return robusto;
	}
	
	public void setRobusto() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Resiliência dos Robustos.\n\nVocê tem vantagem em\r\n"
				+ "testes de resistência contra veneno e tem resistência\r\n"
				+ "contra dano de veneno.\n\n");
	}
	
//Humano
	public String humanoDescricao() {
		String humano = "HUMANOS\r\n\n"
				+ "Os humanos são os mais adaptáveis, flexíveis e\r\n"
				+ "ambiciosos entre todas as raças comuns. Eles têm amplos\r\n"
				+ "e distintos gostos, moralidades e hábitos nas muitas\r\n"
				+ "diferentes regiões onde eles se instalaram. Quando se\r\n"
				+ "estabelecem em um lugar, eles permanecem: eles\r\n"
				+ "constroem cidades que duram por eras, e grandes reinos\r\n"
				+ "que podem persistir por longos séculos. Um único humano\r\n"
				+ "pode ter uma vida relativamente curta, mas uma nação\r\n"
				+ "ou cultura humana preserva tradições com origens muito\r\n"
				+ "além do alcance da memória de qualquer um dos\r\n"
				+ "humanos. Eles vivem plenamente o presente – tornandoos bem adaptados a uma vida de aventuras – mas\r\n"
				+ "também planejam o futuro, esforçando-se para deixar um\r\n"
				+ "legado duradouro. Individualmente e como grupo, os\r\n"
				+ "humanos são oportunistas adaptáveis, e permanecem\r\n"
				+ "alerta às dinâmicas mudanças políticas e sociais.\r\n\n"
				+ "TRAÇOS RACIAIS DOS HUMANOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Todos os seus\r\n"
				+ "valores de habilidade aumentam em 1.\r\n"
				+ "Idade. Os humanos chegam à idade adulta no final da\r\n"
				+ "adolescência e vivem menos de um século.\r\n"
				+ "Tendência. Os humanos não possuem inclinação a\r\n"
				+ "nenhuma tendência em especial. Os melhores e os piores\r\n"
				+ "são encontrados entre eles.\r\n"
				+ "Tamanho. Os humanos variam muito em altura e\r\n"
				+ "peso, podem ter quase 1,50 metro ou mais de 1,80 metro.\r\n"
				+ "Independentemente da sua posição entre esses valores, o\r\n"
				+ "seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "outro idioma adicional, à sua escolha. Os humanos\r\n"
				+ "normalmente aprendem os idiomas dos povos que\r\n"
				+ "convivem, incluindo dialetos obscuros. Eles gostam de\r\n"
				+ "rechear seu discurso com palavras emprestadas de outras\r\n"
				+ "línguas: xingamentos orcs, expressões musicais élficas,\r\n"
				+ "frases militares anãs e outros.\r\n";
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
				+ "Descendentes de dragões, como seus nomes\r\n"
				+ "demonstram, os draconatos andam orgulhosamente pelo\r\n"
				+ "mundo que os saúda com um temor incompreensível.\r\n"
				+ "Moldados por deuses dracônicos ou pelos próprios\r\n"
				+ "dragões, draconatos originalmente nasceram de ovos de\r\n"
				+ "dragão como uma raça única, combinando os melhores\r\n"
				+ "atributos de dragões e humanos. Alguns draconatos são\r\n"
				+ "servos fieis de dragões verdadeiros, outros formas as\r\n"
				+ "fileiras de soldados em grandes guerras e ainda existem\r\n"
				+ "os que encontram-se à toa, sem um objetivo claro na vida.\r\n\n"
				+ "Draconatos parecem muito com dragões que estão de pé\r\n"
				+ "em forma humanoide, apesar de não possuírem asas nem\r\n"
				+ "uma calda. O primeiro draconato possuía escamas de\r\n"
				+ "matizes brilhantes combinando com as cores do dragão de\r\n"
				+ "que descendia, mas gerações de misturas criaram uma\r\n"
				+ "aparência mais uniforme. Suas pequenas escamas finas,\r\n"
				+ "normalmente são de cor bronze ou latão, algumas vezes\r\n"
				+ "indo até tons de escarlate, ferrugem, ouro ou cobreesverdeado. Eles são altos e de constituição forte, muitas\r\n"
				+ "vezes medindo 1,95 metro de altura e pesando 150 kg ou\r\n"
				+ "mais. Suas mãos e pés são fortes, com três dedos de\r\n"
				+ "garras curvadas em cada mão.\r\n"
				+ "O sangue de um tipo particular de dragão corre\r\n"
				+ "fortemente nas veias de alguns clãs de draconatos. Esses\r\n"
				+ "draconatos muitas vezes ostentam escamas de cores mais\r\n"
				+ "similares ao seu dragão ancestral – vermelho, verde, azul\r\n"
				+ "ou branco brilhantes, preto lustroso ou ouro, prata, latão,\r\n"
				+ "cobre ou bronze metálico reluzente.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Força aumenta em 2 e seu valor de Carisma aumenta em\r\n"
				+ "1.\r\n"
				+ "Idade. Draconatos jovens crescem rapidamente. Eles\r\n"
				+ "caminham horas após nascerem, adquirindo o tamanho e\r\n"
				+ "desenvolvimento semelhante a de uma criança humana\r\n"
				+ "de 10 anos com 3 anos de idade e alcançam a maturidade\r\n"
				+ "aos 15. Eles costumam viver até os 80.\r\n"
				+ "Tendência. Os draconatos tendem aos extremos,\r\n"
				+ "realizando uma escolha consciente de um lado ou do outro\r\n"
				+ "da guerra cósmica entre o bem e o mal (representada por\r\n"
				+ "Bahamut e Tiamat, respectivamente). A maioria dos\r\n"
				+ "draconatos é boa, mas os que vão para o lado de Tiamat\r\n"
				+ "podem se tornar vilões terríveis.\r\n"
				+ "Tamanho. Os draconatos são mais altos e mais\r\n"
				+ "pesados que os humanos, geralmente possuindo mais de\r\n"
				+ "1,80 metro e normalmente pesando mais de 125 kg. Seu\r\n"
				+ "tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Ancestral Dracônico. Você possui um ancestral\r\n"
				+ "dracônico. Escolha um tipo de dragão da tabela Ancestral\r\n"
				+ "Dracônico. Sua arma de sopro e resistência a dano são\r\n"
				+ "determinadas pelo tipo de dragão, como mostrado na\r\n"
				+ "tabela.\r\n"
				+ "Arma de Sopro. Você pode usar uma ação para\r\n"
				+ "exalar energia destrutiva. Seu ancestral dracônico\r\n"
				+ "determina o tamanho, formado e tipo de dano que você\r\n"
				+ "expele.\r\n"
				+ "Quando você usa sua arma de sopro, cada criatura na\r\n"
				+ "área exalada deve realizar um teste de resistência, o tipo\r\n"
				+ "do teste é determinado pelo seu ancestral dracônico. A CD\r\n"
				+ "do teste de resistência é 8 + seu modificador de\r\n"
				+ "Constituição + seu bônus de proficiência. Uma criatura\r\n"
				+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
				+ "sucesso. O dano aumenta para 3d6 no 6° nível, 4d6 no 11°\r\n"
				+ "nível e 5d6 no 16° nível.\r\n"
				+ "Depois de usar sua arma de sopro, você não poderá\r\n"
				+ "utilizá-la novamente até completar um descanso curto ou\r\n"
				+ "longo.\r\n"
				+ "Resistência a Dano. Você possui resistência ao tipo\r\n"
				+ "de dano associado ao seu ancestral dracônico.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "Dracônico. O idioma Dracônico é conhecido por ser uma\r\n"
				+ "das mais antigas línguas e ainda é usado no estudo de\r\n"
				+ "magia. A linguagem soa áspera para a maioria das\r\n"
				+ "criaturas, incluindo várias consoantes e silabas firmes.\r\n"
				+ "\n"
				+ "ANCESTRAL DRACÔNICO\r\n"
				+ "Dragão    Tipo de Dano    Arma de Sopro\r\n"
				+ "Azul      Elétrico        Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Branco    Frio            Cone de 4,5m (teste de Con)\r\n"
				+ "Bronze    Elétrico        Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Cobre     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
				+ "Latão     Fogo            Linha de 1,5m/9m (teste de Des)\r\n"
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
			System.out.println("Ancestral Dracônico.\n\nVocê possui um ancestral\r\n"
					+ "dracônico. Escolha um tipo de dragão da tabela Ancestral\r\n"
					+ "Dracônico. Sua arma de sopro e resistência a dano são\r\n"
					+ "determinadas pelo tipo de dragão, como mostrado na\r\n"
					+ "tabela.\n\n");
			System.out.println("1 - Azul / Elétrico / Linha de 1,5m/9m (teste de Des)\n"
					+ "2 - Branco / Frio / Cone de 4,5m (teste de Con)\n"
					+ "3 - Bronze / Elétrico / Linha de 1,5m/9m (teste de Des)\n"
					+ "4 - Cobre / Acido / Linha de 1,5m/9m (teste de Des)\n"
					+ "5 - Latão / fogo / Linha 1,5m/9m (teste de Des)\n"
					+ "6 - Negro / Acido / Linha 1,5m/9m (teste de Des)\n"
					+ "7 - Ouro / Fogo / Cone de 4,5m (teste de Des)\n"
					+ "8 - Prata / Frio / Cone de 4,5m (teste de Con)\n"
					+ "9 - Verde / Veneno / Cone de 4,5m (teste de Con)\n"
					+ "10 - Vermelho / Fogo / Cone de 4,5m (teste de Des)\n");
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				ancestralDraconico = "Anccestral Dracônico.\n\nAzul / Elétrico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 2:
				ancestralDraconico = "Anccestral Dracônico.\n\nBranco / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 3:
				ancestralDraconico = "Anccestral Dracônico.\n\nBronze / Elétrico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 4:
				ancestralDraconico = "Anccestral Dracônico.\n\nCobre / Acido / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 5:
				ancestralDraconico = "Anccestral Dracônico.\n\nLatão / fogo / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 6:
				ancestralDraconico = "Anccestral Dracônico.\n\nNegro / Acido / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 7:
				ancestralDraconico = "Anccestral Dracônico.\n\nOuro / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 8:
				ancestralDraconico = "Anccestral Dracônico.\n\nPrata / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 9:
				ancestralDraconico = "Anccestral Dracônico.\n\nVerde / Veneno / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 10:
				ancestralDraconico = "Anccestral Dracônico.\n\nVermelho / Fogo / Cone de 4,5m (teste de Des)\n";
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
		getFicha().setTracosraciais("Arma de Sopro.\n\nVocê pode usar uma ação para\r\n"
				+ "exalar energia destrutiva. Seu ancestral dracônico\r\n"
				+ "determina o tamanho, formado e tipo de dano que você\r\n"
				+ "expele.\r\n"
				+ "Quando você usa sua arma de sopro, cada criatura na\r\n"
				+ "área exalada deve realizar um teste de resistência, o tipo\r\n"
				+ "do teste é determinado pelo seu ancestral dracônico. A CD\r\n"
				+ "do teste de resistência é 8 + seu modificador de\r\n"
				+ "Constituição + seu bônus de proficiência. Uma criatura\r\n"
				+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
				+ "sucesso. O dano aumenta para 3d6 no 6° nível, 4d6 no 11°\r\n"
				+ "nível e 5d6 no 16° nível.\r\n"
				+ "Depois de usar sua arma de sopro, você não poderá\r\n"
				+ "utilizá-la novamente até completar um descanso curto ou longo.\n\n");
		getFicha().setTracosraciais("Resistência a Dano.\n\nVocê possui resistência ao tipo\r\n"
				+ "de dano associado ao seu ancestral dracônico.\r\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Dracônico");
	}
	
//Gnomo
	public String gnomoDescricao() {
		String gnomo = "GNOMO\r\n\n"
				+ "A energia e entusiasmo dos gnomos pela vida brilha em\r\n"
				+ "cada pedacinho do seu pequeno corpo. Um gnomo padrão\r\n"
				+ "tem aproximadamente 90 centímetros de altura e pesa\r\n"
				+ "entre 20 e 23 kg. Seus rostos morenos ou bronzeados são\r\n"
				+ "geralmente adornados com largos sorrisos (apesar dos\r\n"
				+ "seus prodigiosos narizes) e seus olhos brilhantes vibram\r\n"
				+ "de emoção. Seus cabelos claros tendem a ser espichados,\r\n"
				+ "como se expressassem o insaciável interesse dos gnomos\r\n"
				+ "em tudo a sua volta.\r\n"
				+ "A personalidade de um gnomo é muito maior que sua\r\n"
				+ "aparência. A barba de um gnomo macho, em contraste\r\n"
				+ "com seu cabelo bagunçado, mantem se perfeitamente\r\n"
				+ "aparada, mas as vezes, tem um bigode estiloso e pontas\r\n"
				+ "curiosas. Apesar da roupa de um gnomo geralmente\r\n"
				+ "possuir tons modestos de terra, ele ostenta bordados,\r\n"
				+ "estampas ou joias reluzentes.\r\n\n"
				+ "TRAÇOS RACIAIS DOS GNOMOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 2.\r\n"
				+ "Idade. Gnomos amadurecem a mesma proporção que\r\n"
				+ "os humanos e, a maioria, atinge a idade adulta por volta\r\n"
				+ "dos 40 anos. Eles podem viver entre 350 e 500 anos.\r\n"
				+ "Tendência. Os gnomos geralmente são bons. Os que\r\n"
				+ "tendem para a ordem são sábios, engenheiros,\r\n"
				+ "pesquisadores, escolásticos, investigadores ou inventores.\r\n"
				+ "Os que tendem ao caos são menestréis, engenhoqueiros,\r\n"
				+ "andarilhos ou joalheiros caprichosos. Gnomos são bons de\r\n"
				+ "coração e, até mesmo os trapaceiros entre eles tendem a\r\n"
				+ "ser mais brincalhões que perversos.\r\n"
				+ "Tamanho. Os gnomos tem entre 0,90 e 1,20 metro e\r\n"
				+ "seu peso médio é de 20 kg. Seu tamanho é Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 7,5 metros.\r\n"
				+ "Visão no Escuro. Acostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Esperteza Gnômica. Você possui vantagem em todos\r\n"
				+ "os testes de resistência de Inteligência, Sabedoria e\r\n"
				+ "Carisma contra magia.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum e\r\n"
				+ "Gnômico. A linguagem Gnômica, que usa o alfabeto Anão,\r\n"
				+ "é conhecida por suas técnicas de dissertação e por seus\r\n"
				+ "catálogos de conhecimento sobre o mundo natural.\r\n"
				+ "Sub-raças. Duas sub-raças de gnomos são\r\n"
				+ "encontradas ao redor dos mundos de D&D: os gnomos da\r\n"
				+ "floresta e os gnomos das rochas. Escolha uma dessas subraças.\r\n";
		return gnomo;
	}
	
	public void setGnomo() {
		getFicha().setInteligencia(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTracosraciais("Esperteza Gnômica.\n\nVocê possui vantagem em todos\r\n"
				+ "os testes de resistência de Inteligência, Sabedoria e\r\n"
				+ "Carisma contra magia.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Gnômico");
	}
	
	public String getGnomoDaFloresta() {
		String gnomoDaFloresta = "GNOMO DA FLORESTA\r\n\n"
				+ "Como um gnomo da floresta, você possui um traquejo\r\n"
				+ "natural com ilusões e velocidade e furtividade naturais.\r\n"
				+ "Nos mundos de D&D, gnomos da floresta são raros e\r\n"
				+ "reservados. Eles vivem em comunidades escondidas em\r\n"
				+ "florestas silvestres, usando suas ilusões e truques para se\r\n"
				+ "esconderem das ameaças ou para mascarar sua fuga\r\n"
				+ "antes de serem detectados. Gnomos da floresta tendem a\r\n"
				+ "ser amigáveis com outros povos da floresta espirituosos e\r\n"
				+ "eles tem nos elfos e fadas bondosas como seus mais\r\n"
				+ "importantes aliados. Eles gnomos também fazem amizade\r\n"
				+ "com pequenos animais silvestres e contam com eles para\r\n"
				+ "obter informações sobre ameaças que estejam\r\n"
				+ "perambulando por suas terras.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 1.\r\n"
				+ "Ilusionista Nato. Você conhece o truque ilusão\r\n"
				+ "menor. Inteligência é a sua habilidade usada para\r\n"
				+ "conjurá-la.\r\n"
				+ "Falar com Bestas Pequenas. Através de sons e\r\n"
				+ "gestos, você pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estimação.\r\n\n";
		return gnomoDaFloresta;
	}
	
	public void setGnomoDaFloresta() {
		getFicha().setDestreza(1);
		//Ilusionista Nato. Você conhece o truque ilusão menor. Inteligência é a sua habilidade usada para conjurá-la.
		getFicha().setTracosraciais("Falar com Bestas Pequenas.\n\nAtravés de sons e\r\n"
				+ "gestos, você pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estimação.\n\n");
	}
	
	public String getGnomoDasRochas() {
		String gnomoDasRochas = "GNOMO DAS ROCHAS\r\n\n"
				+ "Como um gnomo das rochas, você possui uma\r\n"
				+ "inventividade e resistência naturais acima dos outros\r\n"
				+ "gnomos. A maioria dos gnomos nos mundos de D&D são\r\n"
				+ "gnomos das rochas, incluindo os gnomos engenhoqueiros\r\n"
				+ "do cenário de Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constituição aumenta em 1.\r\n"
				+ "Conhecimento de Artífice. Toda vez que você fizer\r\n"
				+ "um teste de Inteligência (História) relacionado a itens\r\n"
				+ "mágicos, objetos alquímicos ou mecanismos tecnológicos,\r\n"
				+ "você pode adicionar o dobro do seu bônus de proficiência,\r\n"
				+ "ao invés de qualquer bônus de proficiência que você\r\n"
				+ "normalmente use.\r\n"
				+ "Engenhoqueiro: Você possui proficiência com\r\n"
				+ "ferramentas de artesão (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, você pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Miúdo (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar após 24 horas (a\r\n"
				+ "não ser que você gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando você usa sua ação\r\n"
				+ "para desmantelá-lo; nesse momento, você pode recuperar\r\n"
				+ "o material usado para criá-lo. Você pode ter até três\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando você criar um mecanismo, escolha uma das\r\n"
				+ "seguintes opções:\r\n"
				+ "Brinquedo Mecânico. Esse brinquedo é um animal,\r\n"
				+ "monstro ou pessoa mecânica, como um sapo, rato,\r\n"
				+ "pássaro, dragão ou soldado. Quando colocado no chão,\r\n"
				+ "o brinquedo se move 1,5 metro pelo chão em cada um\r\n"
				+ "dos seus turnos em uma direção aleatória. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n"
				+ "Isqueiro Mecânico. O mecanismo produz uma\r\n"
				+ "miniatura de chama, que você pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua ação.\r\n"
				+ "Caixa de Música. Quando aberta, essa caixa de\r\n"
				+ "música toca uma canção a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcança\r\n"
				+ "o fim da música ou quando é fechada.\r\n\n";
		return gnomoDasRochas;
	}
	
	public void setGnomoDasRochas() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Conhecimento de Artífice.\n\nToda vez que você fizer\r\n"
				+ "um teste de Inteligência (História) relacionado a itens\r\n"
				+ "mágicos, objetos alquímicos ou mecanismos tecnológicos,\r\n"
				+ "você pode adicionar o dobro do seu bônus de proficiência,\r\n"
				+ "ao invés de qualquer bônus de proficiência que você\r\n"
				+ "normalmente use.\n\n");
		getFicha().setTracosraciais("Engenhoqueiro.\n\nVocê possui proficiência com\r\n"
				+ "ferramentas de artesão (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, você pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Miúdo (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar após 24 horas (a\r\n"
				+ "não ser que você gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando você usa sua ação\r\n"
				+ "para desmantelá-lo; nesse momento, você pode recuperar\r\n"
				+ "o material usado para criá-lo. Você pode ter até três\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando você criar um mecanismo, escolha uma das\r\n"
				+ "seguintes opções:\r\n\n"
				+ "Brinquedo Mecânico.\nEsse brinquedo é um animal,\r\n"
				+ "monstro ou pessoa mecânica, como um sapo, rato,\r\n"
				+ "pássaro, dragão ou soldado. Quando colocado no chão,\r\n"
				+ "o brinquedo se move 1,5 metro pelo chão em cada um\r\n"
				+ "dos seus turnos em uma direção aleatória. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n\n"
				+ "Isqueiro Mecânico.\nO mecanismo produz uma\r\n"
				+ "miniatura de chama, que você pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua ação.\r\n\n"
				+ "Caixa de Música.\nQuando aberta, essa caixa de\r\n"
				+ "música toca uma canção a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcança\r\n"
				+ "o fim da música ou quando é fechada.\n\n");
	}
	
//Meio-Elfo
	public String meio_elfoDescricao(){
		String meio_elfo = "MEIO ELFO\r\n\n"
				+ "Para os humanos, os meio-elfos parecem elfos, e para os\r\n"
				+ "elfos, eles parecem humanos. Na aparência, eles estão\r\n"
				+ "entre ambos os parentes, já que eles não são nem tão\r\n"
				+ "esbeltos quanto os elfos nem tão largos quanto os\r\n"
				+ "humanos. Eles medem entre 1,5 metro e 1,8 metro de\r\n"
				+ "altura e pesam entre 50 kg e 90 kg, sendo os homens\r\n"
				+ "apenas um pouco mais altos e pesados que as mulheres.\r\n"
				+ "Meio-elfos possuem pelos faciais e, as vezes, deixam a\r\n"
				+ "barba crescer para esconder sua ancestralidade élfica. A\r\n"
				+ "cor e características dos meio-elfos reside entre seus\r\n"
				+ "parentes humanos e elfos e possui uma variedade maior\r\n"
				+ "até que a encontrada entre ambas as raças. Eles tendem\r\n"
				+ "a ter os olhos dos seus pais elfos.\r\n"
				+ "TRAÇOS RACIAIS DOS MEIO-ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 2 e outros dois valores de\r\n"
				+ "habilidade, à sua escolha, aumentam em 1.\r\n"
				+ "Idade. Meio-elfos atingem a maturidade ao mesmo\r\n"
				+ "tempo que os humanos atingem a idade adulta, por volta\r\n"
				+ "dos 20 anos. Eles vivem muito mais que os humanos, no\r\n"
				+ "entanto, raramente ultrapassam os 180 anos.\r\n"
				+ "Tendência. Meio-elfos compartilham a veia\r\n"
				+ "caótica da sua herança élfica. Eles valorizam tanto a\r\n"
				+ "sua liberdade quanto sua expressão criativa, não\r\n"
				+ "demonstrando qualquer apresso por líderes ou seguidores.\r\n"
				+ "Eles se irritam com regras, ressentindo com exigências de\r\n"
				+ "outros e, as vezes, se provam incertos, ou pelo menos,\r\n"
				+ "imprevisíveis.\r\n"
				+ "Tamanho. Meio-elfos tem aproximadamente a mesma\r\n"
				+ "altura dos humanos, variando entre 1,50 metro e 1,80\r\n"
				+ "metro. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Graças ao seu sangue élfico, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Ancestral Feérico. Você possui vantagem em testes\r\n"
				+ "de resistência contra encantamento e magia não pode\r\n"
				+ "colocar você pra dormir.\r\n"
				+ "Versatilidade em Perícia. Você ganha proficiência\r\n"
				+ "em duas perícias, à sua escolha.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum,\r\n"
				+ "Élfico e um idioma adicional, à sua escolha.\r\n";
		return meio_elfo;
	}
	
	public void setmeio_elfoAtributos() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		List<String> lista = Arrays.asList("Força", "Destreza", "Constituição", "Inteligencia", "Sabedoria", "Carisma");
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
			case "Força":
				getFicha().setForca(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Destreza":
				getFicha().setDestreza(1);
				atributos.remove(opcao);
				count--;
			break;
			
			case "Constituição":
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
		getFicha().setTracosraciais("Visão no Escuro.\n\nGraças ao seu sangue élfico, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setTracosraciais("Ancestral Feérico.\n\nVocê possui vantagem em testes\r\n"
				+ "de resistência contra encantamento e magia não pode\r\n"
				+ "colocar você pra dormir.\r\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Élfico");
		getFicha().setIdiomas(getIdiomas().setIdioma(1));
	}
	
//Meio-Orc
	public String meio_orcDescricao() {
		String meio_orc = "MEIO ORC\r\n\n"
				+ "A pigmentação acinzentada dos meio-orcs, suas testas\r\n"
				+ "avantajadas, mandíbulas salientes, dentes proeminentes\r\n"
				+ "e corpos grandes torna sua herança orc notável para todos\r\n"
				+ "os observadores. Meio-orcs tem entre 1,80 metro e 2,10\r\n"
				+ "metros e, normalmente pesam entre 90 kg e 125 kg.\r\n"
				+ "Orcs ostentam cicatrizes de batalha como peças de\r\n"
				+ "orgulho e consideram cicatrizes ornamentais como coisas\r\n"
				+ "bonitas. Outras cicatrizes, no entanto, marcam um orc ou\r\n"
				+ "meio-orc como um ex-escravo ou um exilado desonrado.\r\n"
				+ "Qualquer meio-orc que tenha vivido entre ou próximo dos\r\n"
				+ "orcs terá cicatrizes, independentemente de serem marcas\r\n"
				+ "de humilhação ou de orgulho, recontando suas façanhas e\r\n"
				+ "ferimentos do passado. Até mesmo um meio-orc que viva\r\n"
				+ "entre os humanos deverá mostrar essas cicatrizes\r\n"
				+ "orgulhosamente ou escondê-las com vergonha.\r\n\n"
				+ "TRAÇOS RACIAIS DOS MEIO ORCS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Força aumenta em 2 e seu valor de Constituição\r\n"
				+ "aumenta em 1.\r\n"
				+ "Idade. Os meio-orcs amadurecem um pouco antes\r\n"
				+ "dos humanos, atingindo a idade adulta aos 14 anos.\r\n"
				+ "Eles envelhecem notavelmente mais rápido e, raramente,\r\n"
				+ "vivem mais de 75 anos.\r\n"
				+ "Tendência. Meio-orcs tem uma tendência inata ao\r\n"
				+ "caos devido aos seus parentes orcs e não são fortemente\r\n"
				+ "inclinados ao bem. Meio-orcs que cresceram entre orcs e\r\n"
				+ "desejam viver e estão dispostos a passar sua vida entre\r\n"
				+ "eles, tendem a ser malignos.\r\n"
				+ "Tamanho. Meio-orcs são de certa forma maiores e\r\n"
				+ "mais largos que os humanos, medindo entre 1,80 metro e\r\n"
				+ "2,10 metros. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Graças ao seu sangue orc, você tem\r\n"
				+ "uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Ameaçador. Você adquire proficiência na perícia\r\n"
				+ "Intimidação.\r\n"
				+ "Resistência Implacável. Quando você é reduzido a\r\n"
				+ "0 pontos de vida mas não é completamente morto, você\r\n"
				+ "pode voltar para 1 ponto de vida. Você não pode usar essa\r\n"
				+ "característica novamente até completar um descanso\r\n"
				+ "longo.\r\n"
				+ "Ataques Selvagens. Quando você atinge um ataque\r\n"
				+ "crítico com uma arma corpo-a-corpo, você pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicioná-lo ao\r\n"
				+ "dano extra causado pelo acerto crítico.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum, Orc.\r\n"
				+ "O Orc é um idioma ríspido, possuindo uma linguagem de\r\n"
				+ "consoantes duras. Ele não possui alfabeto próprio, mas\r\n"
				+ "usa o alfabeto Anão.\r\n";
		return meio_orc;
	}
	
	public void setMeio_orc() {
		getFicha().setForca(2);
		getFicha().setConstituicao(1);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nGraças ao seu sangue orc, você tem\r\n"
				+ "uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTem_intimidacao();
		getFicha().setTracosraciais("Resistência Implacável.\n\nQuando você é reduzido a\r\n"
				+ "0 pontos de vida mas não é completamente morto, você\r\n"
				+ "pode voltar para 1 ponto de vida. Você não pode usar essa\r\n"
				+ "característica novamente até completar um descanso longo.\n\n");
		getFicha().setTracosraciais("Ataques Selvagens.\n\nQuando você atinge um ataque\r\n"
				+ "crítico com uma arma corpo-a-corpo, você pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicioná-lo ao\r\n"
				+ "dano extra causado pelo acerto crítico.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Orc");
	}
	
//Tiefling
	public String tieflingDescricao() {
		String tiefling = "TIEFLING\r\n\n"
				+ "Ser recebido com olhares e cochichos, sofrer violência e\r\n"
				+ "insultos nas ruas, ver a desconfiança e medo em cada\r\n"
				+ "olhar: esse é o fardo do tiefling. E para completar tudo, os\r\n"
				+ "tieflings sabem que isso é graças ao pacto feito gerações\r\n"
				+ "atrás que infundiu a essência de Asmodeus – senhor\r\n"
				+ "supremo dos Nove Infernos – em sua linhagem. Sua\r\n"
				+ "aparência e natureza não é culpa deles, mas é o resultado\r\n"
				+ "de um pecado ancestral, pelo qual eles, seus filhos e os\r\n"
				+ "filhos de seus filhos serão eternamente responsabilizados.\r\n\n"
				+ "Os tieflings derivam de linhagens humanas e, no sentido\r\n"
				+ "mais amplo possível, eles ainda parecem humanos. No\r\n"
				+ "entanto, sua herança infernal deixou traços claros na sua\r\n"
				+ "aparência. Tieflings possuem grandes chifres que\r\n"
				+ "possuem os mais diversos formatos: alguns possuem\r\n"
				+ "chifres curvos, como um carneiro, outros possuem chifres\r\n"
				+ "compridos e finos, como uma gazela, e outros chifres\r\n"
				+ "espiralados e alongados, como os de um antílope. Eles\r\n"
				+ "possuem uma final calda, com uns 1,20 metro a 1,50\r\n"
				+ "metro de comprimento, que chicoteia ou se enrola em suas\r\n"
				+ "pernas quando ele fica chateado ou nervoso. Seus dentes\r\n"
				+ "caninos são afiados e pontiagudos e seus olhos possuem\r\n"
				+ "cores solidas – preto, vermelho, branco, prateado ou\r\n"
				+ "dourado – sem esclera ou pupila visíveis. Seus tons de\r\n"
				+ "pele abrangem todas as tonalidades da pele humana, mas\r\n"
				+ "também incluem variações de tons vermelho. Seus\r\n"
				+ "cabelos, escorrem atrás dos seus chifres, geralmente\r\n"
				+ "escuro, de preto ou marrom a vermelho, azul ou roxo\r\n"
				+ "escuro.\r\n"
				+ "TRAÇOS RACIAIS DOS TIEFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 1 e seu valor de Carisma\r\n"
				+ "aumenta em 2.\r\n"
				+ "Idade. Os tieflings amadurecem ao mesmo tempo que\r\n"
				+ "os humanos, mas vivem alguns anos a mais.\r\n"
				+ "Tendência. Tieflings não possuem uma tendência\r\n"
				+ "inata ao mal, mas muitos acabam por abraçá-lo. Maligno\r\n"
				+ "ou não, uma natureza independente inclina a maioria dos\r\n"
				+ "tieflings ao alinhamento caótico.\r\n"
				+ "Tamanho. Os tieflings possuem o mesmo tamanho e\r\n"
				+ "compleição dos humanos. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Graças a sua herança infernal, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resistência Infernal. Você possui resistência a dano\r\n"
				+ "de fogo.\r\n"
				+ "Legado Infernal. Você conhece o truque\r\n"
				+ "taumaturgia. Quando você atingir o 3° nível, você poderá\r\n"
				+ "conjurar a magia repreensão infernal como uma magia de\r\n"
				+ "2° nível. Quando você atingir o 5° nível, você também\r\n"
				+ "poderá conjurar a magia escuridão. Você precisa terminar\r\n"
				+ "um descanso longo para poder usar as magias desse traço\r\n"
				+ "novamente. Sua habilidade de conjuração para essas\r\n"
				+ "magias é Carisma.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum e\r\n"
				+ "Infernal.\r\n";
		return tiefling;
	}
	
	public void setTiefling() {
		getFicha().setInteligencia(1);
		getFicha().setCarisma(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nGraças a sua herança infernal, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Infernal");
	}
}
