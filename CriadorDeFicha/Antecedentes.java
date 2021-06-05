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
	private Idiomas idiomas;
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
		
		return random;
	}
	
	public List<String> getTracoRandom(String antecedente) {
		List<String> tracos = new ArrayList<String>();
		
		int random = 0;
		int reroll = 0;
		int count = 2;
		while(count != 0) {
			random = getTIVD(8)-1;
			
			if(random != reroll) {
				tracos.add(getTraco(antecedente, random));
				reroll = random;
				count--;
			}
		}
		
		return tracos;
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
		case "Acólito":
			traco = this.tracoAcolito.get(i);
		break;
		
		case "Artesão de guilda":
			traco = this.tracoArtesao.get(i);
		break;
		
		case "Artista":
			traco = this.tracoArtista.get(i);
		break;
		
		case "Charlatão":
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
		
		case "Herói do povo":
			traco = this.tracoHeroi.get(i);
		break;
		
		case "Marinheiro":
			traco = this.tracoMarinheiro.get(i);
		break;
		
		case "Nobre":
			traco = this.tracoNobre.get(i);
		break;
		
		case "Órfão":
			traco = this.tracoOrfao.get(i);
		break;
		
		case "Sábio":
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
		case "Acólito":
			return this.tracoAcolito;
			
		case "Artesão de guilda":
			return this.tracoArtesao;
			
		case "Artista":
			return this.tracoArtista;
			
		case "Charlatão":
			return this.tracoCharlatao;
		
		case "Criminoso":
			return this.tracoCriminoso;
			
		case "Eremita":
			return this.tracoEremita;
			
		case "Forateiro":
			return this.tracoForasteiro;
			
		case "Herói do povo":
			return this.tracoHeroi;
			
		case "Marinheiro":
			return this.tracoMarinheiro;
			
		case "Nobre":
			return this.tracoNobre;
		
		case "Órfão":
			return this.tracoOrfao;
			
		case "Sábio":
			return this.tracoSabio;
			
		case "Soldado":
			return this.tracoSoldado;
		}
		return null;
	}
	
	public String getIdeal(String antecedente, int i) {
		String ideal = null;
		switch(antecedente) {
		case "Acólito":
			ideal = this.idealAcolito.get(i);
		break;
		
		case "Artesão de guilda":
			ideal = this.idealArtesao.get(i);
		break;
		
		case "Artista":
			ideal = this.idealArtista.get(i);
		break;
		
		case "Charlatão":
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
		
		case "Herói do povo":
			ideal = this.idealHeroi.get(i);
		break;
		
		case "Marinheiro":
			ideal = this.idealMarinheiro.get(i);
		break;
		
		case "Nobre":
			ideal = this.idealNobre.get(i);
		break;
		
		case "Órfão":
			ideal = this.idealOrfao.get(i);
		break;
		
		case "Sábio":
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
		case "Acólito":
			return this.idealAcolito;
			
		case "Artesão de guilda":
			return this.idealArtesao;
			
		case "Artista":
			return this.idealArtista;
			
		case "Charlatão":
			return this.idealCharlatao;
			
		case "Criminoso":
			return this.idealCriminoso;
			
		case "Eremita":
			return this.idealEremita;
			
		case "Forasteiro":
			return this.idealForasteiro;
			
		case "Herói do povo":
			return this.idealHeroi;
			
		case "Marinheiro":
			return this.idealMarinheiro;
			
		case "Nobre":
			return this.idealNobre;
		
		case "Órfão":
			return this.idealOrfao;
			
		case "Sábio":
			return this.idealSabio;
			
		case "Soldado":
			return this.idealSoldado;
		}
		return null;
	}
	
	public String getVinculo(String antecedente, int i) {
		String vinculo = null;
		switch(antecedente) {
		case "Acólito":
			vinculo = this.vinculoAcolito.get(i);
		break;
		
		case "Artesão de guilda":
			vinculo = this.vinculoArtesao.get(i);
		break;
		
		case "Artista":
			vinculo = this.vinculoArtista.get(i);
		break;
		
		case "Charlatão":
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
		
		case "Herói do povo":
			vinculo = this.vinculoHeroi.get(i);
		break;
		
		case "Marinheiro":
			vinculo = this.vinculoMarinheiro.get(i);
		break;
		
		case "Nobre":
			vinculo = this.vinculoNobre.get(i);
		break;
		
		case "Órfão":
			vinculo = this.vinculoOrfao.get(i);
		break;
		
		case "Sábio":
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
		case "Acólito":
			return this.vinculoAcolito;
			
		case "Artesão de guilda":
			return this.vinculoArtesao;

		case "Artista":
			return this.vinculoArtista;

		case "Charlatão":
			return this.vinculoCharlatao;
			
		case "Criminoso":
			return this.vinculoCriminoso;
			
		case "Eremita":
			return this.vinculoEremita;
			
		case "Forasteiro":
			return this.vinculoForasteiro;
			
		case "Herói do povo":
			return this.vinculoHeroi;
			
		case "Marinheiro":
			return this.vinculoMarinheiro;
			
		case "Nobre":
			return this.vinculoNobre;
			
		case "Órfão":
			return this.vinculoOrfao;
			
		case "Sábio":
			return this.vinculoSabio;
			
		case "Soldado":
			return this.vinculoSoldado;
		}
		
		return null;
	}
	
	public String getDefeito(String antecedente, int i) {
		String defeito = null;
		switch(antecedente) {
		case "Acólito":
			defeito = this.defeitoAcolito.get(i);
		break;
		
		case "Artesão de guilda":
			defeito = this.defeitoArtesao.get(i);
		break;
		
		case "Artista":
			defeito = this.defeitoArtista.get(i);
		break;
		
		case "Charlatão":
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
		
		case "Herói do povo":
			defeito = this.defeitoHeroi.get(i);
		break;
		
		case "Marinheiro":
			defeito = this.defeitoMarinheiro.get(i);
		break;
		
		case "Nobre":
			defeito = this.defeitoNobre.get(i);
		break;
		
		case "Órfão":
			defeito = this.defeitoOrfao.get(i);
		break;
		
		case "Sábio":
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
		case "Acólito":
			return this.defeitoAcolito;
			
		case "Artesão de guilda":
			return this.defeitoArtesao;
			
		case "Artista":
			return this.defeitoArtista;
		
		case "Charlatão":
			return this.defeitoCharlatao;
	
		case "Criminoso":
			return this.defeitoCriminoso;
		
		case "Eremita":
			return this.defeitoEremita;
		
		case "Forasteiro":
			return this.defeitoForasteiro;
		
		case "Herói do povo":
			return this.defeitoHeroi;

		case "Marinheiro":
			return this.defeitoMarinheiro;
		
		case "Nobre":
			return this.defeitoNobre;
		
		case "Órfão":
			return this.defeitoOrfao;
		
		case "Sábio":
			return this.defeitoSabio;
		
		case "Soldado":
			return this.defeitoSoldado;
		}
		return null;
	}
	
	public void getacolitoDescricao() {
		System.out.println("ACÓLITO\r\n\n"
				+ "Você viveu a serviço de um templo de algum deus\r\n"
				+ "especifico ou de um panteão de deuses. Você age como um\r\n"
				+ "intermediário entre o reino divino e o reino dos mortais,\r\n"
				+ "realizando rituais e ofertando sacrifícios para conduzir\r\n"
				+ "cada vez mais pessoas a adorarem a divindade. Você não\r\n"
				+ "é necessariamente um clérigo – realizar ritos sagrados\r\n"
				+ "não é a mesma coisa que canalizar poder divino.\r\n"
				+ "Escolha um deus, um panteão de deuses ou outro ser\r\n"
				+ "quase divino entre aqueles descritos no apêndice B ou\r\n"
				+ "outro especificado pelo seu Mestre para detalhar a\r\n"
				+ "natureza do seu serviço religioso. Você foi um serviçal\r\n"
				+ "menor no templo, criado desde a infância para auxiliar os\r\n"
				+ "sacerdotes em ritos sagrados? Ou você foi um alto\r\n"
				+ "sacerdote que repentinamente sentiu o chamado para\r\n"
				+ "servir seu deus de uma maneira diferente? Talvez você foi\r\n"
				+ "o líder de um pequeno culto não associado a templo\r\n"
				+ "algum, ou mesmo uma seita secreta que servia a uma\r\n"
				+ "entidade demoníaca que agora você nega.\r\n"
				+ "Proficiência em Perícias: Intuição, Religião\r\n"
				+ "Idiomas: Dois à sua escolha\r\n"
				+ "Equipamento: Um símbolo sagrado (um presente dado\r\n"
				+ "quando você entrou no templo), um livro de preces ou\r\n"
				+ "uma conta de orações, 5 varetas de incenso,\r\n"
				+ "vestimentas, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 15 po\r\n\n"
				+ "CARACTERÍSTICA: ABRIGO DOS FIÉIS\r\n\n"
				+ "Como um acólito, você detém o respeito daqueles que\r\n"
				+ "compartilham de sua fé, e você pode realizar cerimônias\r\n"
				+ "de sua divindade. Você e seus companheiros de aventura\r\n"
				+ "podem até receber cura e caridade de um templo,\r\n"
				+ "santuário ou outro posto de sua fé, embora devam\r\n"
				+ "fornecer quaisquer componentes materiais necessários\r\n"
				+ "para as magias. Aqueles que compartilham de sua\r\n"
				+ "religião vão garantir a você (mas apenas você), custeando\r\n"
				+ "um estilo de vida modesto.\r\n"
				+ "Você também pode possuir laços com um templo\r\n"
				+ "específico devotado à sua divindade ou panteão, e fixar\r\n"
				+ "residência nele. Pode ser o templo que você está\r\n"
				+ "acostumado a servir, se ainda tiver boas relações com ele,\r\n"
				+ "ou um templo no qual você encontrou um novo lar.\r\n"
				+ "Enquanto frequentar as redondezas desse templo, você\r\n"
				+ "pode solicitar os sacerdotes para assisti-lo, desde que essa\r\n"
				+ "assistência não seja de alguma forma perigosa e que você\r\n"
				+ "sempre esteja em uma boa relação com seu templo.\r\n\n"
				+ "CARACTERÍSTICAS SUGERIDAS\r\n\n"
				+ "Acólitos são moldados pela sua experiência em templos ou\r\n"
				+ "comunidades religiosas. Seu estudo da história e dogmas\r\n"
				+ "de sua fé, e sua relação com os templos, santuários ou\r\n"
				+ "hierarquias afetam seus maneirismos e ideais. Seus\r\n"
				+ "defeitos podem ser uma hipocrisia oculta ou ideias\r\n"
				+ "hereges, ou um ideal ou vínculo visto como fanatismo.\r\n\n");
	}
		
	public void setAcolito() throws IOException {
		getFicha().setAntecedente("Acólito");
		List<String> profPericias = Arrays.asList("Intuição", "Religião");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setIdiomas(this.idiomas.setIdioma(getFicha().getIdiomas(), getFicha().getAntecedente()));
		List<String> equipamentos = Arrays.asList("Símbolo sagrado", "Livro de preces", "Varetas de incenso (5)", "Vestimentas", "Conjunto de roupas comuns");
		getFicha().setTesouro("Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setArtesaoDeGuilda() throws IOException {
		getFicha().setAntecedente("Artesão de guilda");
		List<String> profPericias = Arrays.asList("Intuição", "Persuasão");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		getFicha().setIdiomas(this.idiomas.setIdioma(getFicha().getIdiomas(), getFicha().getAntecedente()));
		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Carta de apresentação da sua guilda", "Conjunto de roupas de viajante", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setArtista() throws IOException {
		getFicha().setAntecedente("Artista");
		List<String> profPericias = Arrays.asList("Acrobacia", "Atuação");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		getFicha().setEquipamentos(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Presente de um admirador", "Traje", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setCharlatao() throws IOException {
		getFicha().setAntecedente("Charlatão");
		List<String> profPericias = Arrays.asList("Enganação", "Prestidigitação");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Kit de falsificação");
		List<String> equipamentos = Arrays.asList("Conjunto de roupas finas", "Kit de disfarce", "Ferramentas de trapaça", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
		getFicha().setEquipamentos(getEquips().setEquipsCharlatao());
		setAntecedente();
	}
	
	public void setCriminoso() throws IOException {
		getFicha().setAntecedente("Criminoso");
		List<String> profPericias = Arrays.asList("Enganação", "Furtividade");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de jogo");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladrão");
		List<String> equipamentos = Arrays.asList("Pé de cabra", "Conjunto de roupas escuras comuns com capuz", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setEremita() throws IOException {
		getFicha().setAntecedente("Eremita");
		List<String> profPericias = Arrays.asList("Medicina", "Religião");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		getFicha().setIdiomas(this.idiomas.setIdioma(1));
		List<String> equipamentos = Arrays.asList("Estojo de pergaminho cheio de notas dos seus estudos e orações", "Cobertor de inverno", "Conjunto de roupas comuns", "Kit de herbalismo", "5po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setForasteiro() throws IOException {
		getFicha().setAntecedente("Forasteiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Sobrevivência");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		getFicha().setIdiomas(this.idiomas.setIdioma(1));
		List<String> equipamentos = Arrays.asList("Bordão", "Armadilha de caça", "Fetiche de um animal que você matou", "Conjunto de roupas de viajante", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setHeroiDoPovo() throws IOException {
		getFicha().setAntecedente("Herói do povo");
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Sobrevivência");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		getFicha().setProfi_ferramentas_peri("Veículos (terrestre)");
		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Pá", "Pote de ferro", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setMarinheiro() throws IOException {
		getFicha().setAntecedente("Marinheiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Percepção");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Ferramentas de navegador");
		getFicha().setProfi_ferramentas_peri("Veículos (aquático)");
		List<String> equipamentos = Arrays.asList("Malagueta (clava)", "15M de corda de seda", "Amuleto da sorte", "Conjunto de trajes comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setNobre() throws IOException {
		getFicha().setAntecedente("Nobre");
		List<String> profPericias = Arrays.asList("História", "Persuasão");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de jogos");
		getFicha().setIdiomas(this.idiomas.setIdioma(1));
		List<String> equipamentos = Arrays.asList("Conjunto de trajes finos", "Anel de sinete", "Pergaminho de linhagem", "Algibeira 25po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setOrfao() throws IOException {
		getFicha().setAntecedente("Órfão");
		List<String> profPericias = Arrays.asList("Furtividade", "Prestidigitação");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladrão");
		List<String> equipamentos = Arrays.asList("Faca pequena", "Mapa da cidade que você cresceu", "Rato de estimação", "Pequeno objeto para lembrar dos seus pais", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setSabio() throws IOException {
		getFicha().setAntecedente("Sábio");
		List<String> profPericias = Arrays.asList("Arcanismo", "História");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		getFicha().setIdiomas(this.idiomas.setIdioma(2));
		List<String> equipamentos = Arrays.asList("Vidro de tinta escura", "Pena", "Faca pequena", "Carta de um falecido colega perguntando a você algo que você nunca terá a chance de responder", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setSoldado() throws IOException {
		getFicha().setAntecedente("Soldado");
		List<String> profPericias = Arrays.asList("Atletismo", "Intimidação");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().setPericias(profPericias);
//		getFicha() = this.proficiencia.getFicha();
		List<String> equipamentos = Arrays.asList("Insígnia de patente", "Fetiche obtido de um inimigo caído", "Conjuto de dados de osso ou baralho", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
		setAntecedente();
	}
	
	public void setAntecedente() throws IOException {
		Scanner entrada = new Scanner(System.in);

		boolean caracterLoop = false;
		while(caracterLoop == false) {
			int caracterMenu;
			System.out.println("--Caracteristicas--");
			System.out.println("Você deseja escolher as caracteristicas ou rolar o dado?\n1 - Rolar o dado.\n2 - Manual.");
			
			caracterMenu = entrada.nextInt();
			switch(caracterMenu) {
			case 1:
				System.out.println("--Traços de Personalidade sorteadors--\n");
				getFicha().setTracos_personalidade(getTracoRandom(getFicha().getAntecedente()));
				System.out.println(getFicha().getTracos_personalidade().get(0) +"\n");
				System.out.println(getFicha().getTracos_personalidade().get(1) +"\n");
				System.out.println("Aperte qualquer tecla para continuar...");
				System.in.read();
				System.out.println("--Ideal sorteado--\n");
				getFicha().setIdeal(getIdealRandom(getFicha().getAntecedente()));
				System.out.println(getFicha().getIdeal() +"\n");
				System.out.println("Aperte qualquer tecla para continuar...");
				System.in.read();
				System.out.println("--Vínculo--\n");
				getFicha().setVinculo(getVinculoRandom(getFicha().getAntecedente()));
				System.out.println(getFicha().getVinculo());
				System.out.println("Aperte qualquer tecla para continuar...");
				System.in.read();
				System.out.println("--Defeito--\n");
				getFicha().setDefeito(getDefeitoRandom(getFicha().getAntecedente()));
				System.out.println(getFicha().getDefeito());
				System.out.println("Aperte qualquer tecla para continuar...");
				System.in.read();
				caracterLoop = true;
			break;
			
			case 2:
				int caracterMenu2 = 1;
				boolean caracterMenu2Loop = false;
				while(caracterMenu2Loop == false) {
					switch(caracterMenu2) {
					case 1:
						ArrayList<String> tracos = new ArrayList<String>();
						tracos.addAll(getTraco(getFicha().getAntecedente()));
						List<String> tracosEscolhidos = new ArrayList<String>();
						int opcao;
						int count = 2;
						
						while(count != 0) {
							System.out.println("--Traços de Personalidade--\n");
							System.out.println("Escolha " +count +" Traços de Personalidade:\n");
							do{
								for(int i = 0; i < tracos.size(); i++) {
									System.out.println(i +tracos.get(i));
									
								}
								
								while(!entrada.hasNextInt()) {
									System.out.println("Digite um numero!");
									entrada.next();
								}
								
								opcao = entrada.nextInt();
							}while(opcao < 0 || opcao > tracos.size());
							
							if(confirmarDecisao(tracos.get(opcao)) == true) {
								count--;
								tracosEscolhidos.add(tracos.get(opcao));
								tracos.remove(opcao);
							}
						}
						getFicha().setTracos_personalidade(tracosEscolhidos);
						
						caracterMenu2 = 2;
					break;
					
					case 2:
						int opIdeal = 0;
						boolean case2Loop = false;
						while(case2Loop == false) {
							do {
								System.out.println("--Ideal--\n");
								System.out.println("Escolha seu ideal:\n");
								for(int i = 0; i < getIdeal(getFicha().getAntecedente()).size(); i++) {
									System.out.println(i +getIdeal(getFicha().getAntecedente()).get(i));
								}
								
								while(!entrada.hasNextInt()) {
									System.out.println("Digite um numero!");
									entrada.next();
								}
								
								opIdeal = entrada.nextInt();
							}while(opIdeal < 0 || opIdeal > getIdeal(getFicha().getAntecedente()).size());
							if(confirmarDecisao(getIdeal(getFicha().getAntecedente()).get(opIdeal)) == true) case2Loop = true;
							
						}
						
						getFicha().setIdeal(getIdeal(getFicha().getAntecedente()).get(opIdeal));
						caracterMenu2 = 3;
					break;
					
					case 3:
						int opVinculo = 0;
						boolean case3Loop = false;
						while(case3Loop == false) {
							do {
								System.out.println("--Vinculo--\n");
								System.out.println("Escolha seu Vinculo:\n");
								for(int i = 0; i < getVinculo(getFicha().getAntecedente()).size(); i++) {
									System.out.println(i +getVinculo(getFicha().getAntecedente()).get(i));
								}
								
								while(!entrada.hasNextInt()) {
									System.out.println("Digite um numero!");
									entrada.next();
								}
								
								opVinculo = entrada.nextInt();
							}while(opVinculo < 0 || opVinculo > getVinculo(getFicha().getAntecedente()).size());
							
							if(confirmarDecisao(getVinculo(getFicha().getAntecedente()).get(opVinculo)) == true) case3Loop = true;
						}
						
						getFicha().setVinculo(getVinculo(getFicha().getAntecedente()).get(opVinculo));
						caracterMenu2 = 4;
					break;
					
					case 4:
						int opDefeito = 0;
						boolean case4Loop = false;
						while(case4Loop == false) {
							do {
								System.out.println("--Defeito--\n");
								System.out.println("Escolha seu defeito:\n");
								for(int i = 0; i < getDefeito(getFicha().getAntecedente()).size(); i++) {
									System.out.println(i +getDefeito(getFicha().getAntecedente()).get(i));
								}
								
								while(!entrada.hasNextInt()) {
									System.out.println("Digite um numero!");
									entrada.next();
								}
								
								opDefeito = entrada.nextInt();
							}while(opDefeito  < 0 || opDefeito  > getDefeito(getFicha().getAntecedente()).size());
							
							if(confirmarDecisao(getDefeito(getFicha().getAntecedente()).get(opDefeito)) == true) case4Loop = true;
						}
						
						getFicha().setDefeito(getDefeito(getFicha().getAntecedente()).get(opDefeito));
						caracterMenu2Loop = true;
					break;
					}
					
				}
			break;
			}
			
			caracterLoop = true;
		}
		
	}
	
	public boolean confirmarDecisao(String opcao) {
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		do {
			System.out.println("\nTem certeza que deseja " +opcao +"? (Y/N)");
			
			decisao = entrada.next().charAt(0);
		}while((Objects.equals(decisao, 'Y') || Objects.equals(decisao, 'y')  || Objects.equals(decisao, 'N') || Objects.equals(decisao, 'n')) == false);
		
		if(decisao == 'Y' || decisao == 'y') {
			return true;
		}
		return false;
	}
	
	public void setIdiomas(Idiomas idiomas) {
		this.idiomas = idiomas;
	}
	
//	public FichaDoPersonagem getFicha() {
//		return ficha;
//	}
	
//	public void setFicha(FichaDoPersonagem ficha) {
//		getFicha() = ficha;
//	}
	
//Antecedentes
	//Acolito
	private List<String> tracoAcolito = Arrays.asList("Eu idolatro um herói particular da minha fé, e constantemente me refiro a seus feitos e exemplos.",
			"Eu consigo encontrar semelhanças mesmo entre os inimigos mais violentos, com empatia e sempre trabalhando pela paz.",
			"Eu vejo presságio em cada evento e ação. Os deuses estão falando conosco, nós apenas temos de ouvi-los.",
			"Nada pode abalar minha atitude otimista.",
			"Eu cito (corretamente ou não) textos sagrados e provérbios em quase qualquer situação.",
			"Eu sou tolerante (ou intolerante) a qualquer outra fé, e respeito (ou condeno) a adoração a outros deuses",
			"Eu aprecio comida requintada, bebidas e a elite entre o alto escalão de meu templo. Uma vida dura me irrita.",
			"Eu passei tanto tempo no templo que possuo pouca prática em lidar com as pessoas mundo a fora.");

	private List<String> idealAcolito = Arrays.asList("Tradição. As tradições de adoração e sacrifício devem ser preservadas e perpetradas. (Leal)",
			"Caridade. Eu sempre tento ajudar aqueles em necessidade, não importando o custo pessoal. (Bom)",
			"Mudança. Nós devemos ajudar a conduzir as mudanças que os deuses estão constantemente trabalhando para o mundo. (Caótico)",
			"Poder. Eu espero que um dia eu consiga chegar ao topo na hierarquia da minha religião. (Leal)",
			"Fé. Eu acredito que minha divindade guia minhas ações. Eu tenho fé que, se eu trabalhar duro, coisas boas acontecerão. (Leal)",
			"Aspiração. Eu busco ser digno de graça do meu deus ao corresponder minhas ações aos seus ensinamentos. (Qualquer)");

	private List<String> vinculoAcolito = Arrays.asList("Eu morreria para recuperar um relíquia ancestral de minha fé, perdida há muito tempo.",
			"Eu ainda terei minha vingança contra o trmpo corrupto que me acusou de heresia.",
			"Eu devo minha vida ao sacerdote que me acolheu quando meus pais morreram.",
			"Tudo o que faço, faço pelo povo.",
			"Eu farei qualquer coisa para proteger o templo que sirvo.",
			"Eu busco guardar um texto sagrado que meus inimigos dizem ser herético e tentam destruí-lo.");
	
	private List<String> defeitoAcolito = Arrays.asList("Eu julgo os outros severamente, e a mim mesmo mais ainda.",
			"Eu deposito muita confiança naqueles que detêm o poder na hierarquia de meu templo.",
			"Minha devoção muitas vezes me cega perante aqueles que professam a fé do meu deus.",
			"Meu pensamento é inflexível.",
			"Eu suspeito de estranhos e sempre espero o pior deles.",
			"Depois de escolher um objetivo, eu fico obcecado em cumpri-lo, até mesmo em detrimento de qualquer outra coisa em minha vida.");

	//Artesão de guilda
	private List<String> tracoArtesao = Arrays.asList("Eu acredito que tudo que valha a pena fazer, vale a pena ser feito direito. Eu não posso evitar - Eu sou perfeccionista.",
			 "Eu sou um esnobe que olha de cima a baixo aqueles que não sabem apreciar artes requintadas.",
			 "Eu sempre quero aprender como as coisas funcionam e o que deixa as pessoas motivadas.",
			 "Eu sou cheio de aforismos espituosos e tenho um proverbio para cada ocasião",
			 "Eu sou grosso com as pessoas que não tem o mesmo comprometimento que eu com o trabalho duro e honesto.",
			 "Eu gosto de falar longamente sobre minha profissão.",
			 "Eu não gasto meu dinheiro facilmente e vou barganhar incansavelmente para conseguir o melhor acordo possível.",
			 "Eu sou bem conhecido pelo meu trabalho e quero ter certeza que todos o apreciam. Eu sempre fico surpreso quando conheço pessoas que não ouviram falar de mim.");

	private List<String> idealArtesao = Arrays.asList("Comunidade. É dever de todo cidadão civilizado fortalecer os elos da comunidade e a segurança da civilização. (Leal)",
			"Generosidade. Meus talentos me foram dados para que eu pudesse usá-los para beneficiar o mundo. (Bom)",
			"Liberade. Todo deveriam ser livres para perseguir seus próprios meios de vida. (Caótico)",
			"Ganância. Eu só estou aqui pelo dinheiro. (Mau)",
			"Povo. Eu sou cometido com o povo com quem me importo, não com ideias. (Neutro)",
			"Aspiração. Eu trabalho duro para ser o melhor no meu ofício. (Qualquer)");
	
	private List<String> vinculoArtesao = Arrays.asList("A oficina onde aprendi meu negócio é o local mais importante do mundo pra mim.",
			"Eu criei um trabalho incrível para alguém, mas descobri que ele não era merecedor de recebê-lo. Ainda estou à procurar de alguém que seja merecedor.",
			"Eu tenho uma grande dívida para com minha guilda por fazer de mim a pessoa que eu sou hoje.",
			"Eu busco riqueza para conseguir o amor de alguém.",
			"Um dia eu voltarei para a minha guilda e provarei que sou o maior artesão dentre eles.",
			"Eu irei me vingar das forças malignas que destruíram meu local de negócios e arruinaram meu estilo de vida.");

	private List<String> defeitoArtesao = Arrays.asList("Eu farei de tudo para pôr minhas mãos em algo raro ou inestimável.",
			"Eu rapidamente presumo que alguém está tentando me trapacear",
			"Ninguém nunca poderá saber que eu, certa vez, roubei dinheiro dos cofres da guilda.",
			"Eu nunca estou satisfeito com o que eu tenho - eu sempre quero mais.",
			"Eu mataria para adquirir um título de nobreza.",
			"Eu sou terrivelmente invejoso com qualquer um que possa ofuscar meu oficio. Todo lugar que eu vou, estou cercado de rivais.");

	//Artista
	private List<String> tracoArtista = Arrays.asList("Eu conheço uma história relevante de praticamente todas as situações.",
			"Sempre que eu chego em um lugar novo, eu coleto os rumores locais e espalho fofocas.",
			"Eu sou um romântico incorrigível, sempre em busca daquele \"alguém especial\"",
			"Ninguém fica com raiva de mim ou perto de mim por muito tempo, já que eu posso acabar com qualquer tipo de tensão.",
			"Eu amo um bom insulto, até os direcionados a mim.",
			"Eu fico sentido se eu não for o centro das atenções.",
			"Eu mudo de ânimo ou de pensamento tão rápido quando mudo eu mudo de nota em uma canção.");
	
	private List<String> idealArtista = Arrays.asList("Beleza. Quando eu atuo, eu torno o mundo um lugar melhor. (Bom)",
			"Tradição. As histórias, lendas e canções do passado nunca devem ser esquecidas, pois elas nos ensinam quem nós somo. (Leal)",
			"Criatividade. O mundo precisa de novas ideias e ações ousadas. (Caótico)",
			"Ganância. Eu só estou aqui pelo dinheiro e pela fama. (Mau)",
			"Povo. Eu gosto de ver os sorrisos nos rostos das pessoas quando eu atuo. Isso é tudo que importa. (Neutro)",
			"Honestidade. A arte deve refletir a alma; ela deve vir de dentro e revelar quem realmente somos. (Qualquer)");
	
	private List<String> vinculoArtista = Arrays.asList("Meu instrumento é meu bem mais valioso e ele me lembra de alguém que eu amo.",
			"Alguém roubou meu precioso instrumento e, algum dia, eu vou pegá-lo de volta.",
			"Eu quero ser famoso, custe o que custar.",
			"Eu idolatro um herói dos contos antigos e mensuro meus feitos baseados nessa personalidade.",
			"Eu vou fazer tudo para provar que sou superior ao meu odiado rival.",
			"Eu faria qualquer coisa pelos membros da minha antiga trupe.");
	
	private List<String> defeitoArtista = Arrays.asList("Eu farei de tudo para ganhar fama e renome.",
			"Eu viro um idiota quando vejo um rosto bonito.",
			"Um escândalo me impede de voltar para casa novamente. Esse tipo de problema parece me perseguir por ai.",
			"Eu certa vez, satirizei um nobre que ainda quer minha cabeça. Foi um erro que eu adoraria repetir.",
			"Eu tenho problemas em esconder meu verdadeiros sentimentos. Minha língua afiada me mete em confusão.",
			"Apesar dos meus melhores esforços, meus amigos não me consideram confiável.");
	
	//Charlatão
	private List<String> tracoCharlatao = Arrays.asList("Eu me apaixono e desapaixono facilmente, e estou sempre em busca de alguém.",
			"Eu tenho uma piada para cada ocasião, especialmente ocasiões sem que o humor é inapropriado.",
			"Bajulação é meu truque predileto para conseguir o que eu quero.",
			"Eu sou um jogador nato que não consegue resistir a se arriscar por uma possível recompensa.",
			"Eu minto sobre quase tudo, mesmo quando não existe qualquer boa razão.",
			"Sarcasmo e insultos são minhas armas prediletas.",
			"Eu tenho vários símbolos sagrados comigo, e invoco a divindade que seja mais útil em cada dado momento.",
			"Eu furto qualquer coisa que eu vejo que possa ter algum valor.");
	
	private List<String> idealCharlatao = Arrays.asList("Independência. Sou um espirito livre - ninguém me diz o que fazer. (Caótico)",
			"Justiça. Eu nunca roubo de pessoas que não podem perder algumas moedas. (Leal)",
			"caridade. Eu distribuo o dinheiro que adquiro com as pessoas que realmente precisam. (Bom)",
			"Criatividade. Eu nunca faço a mesma trapaça duas vezes. (Caótico)",
			"Amizade. Bens materiais vem e vão. Os laços de amizade duram pra sempre. (Bom)",
			"Aspiração. Eu estou determinado a fazer algo por mim mesmo. (Qualquer)");
	
	private List<String> vinculoCharlatao = Arrays.asList("Eu exotorqui a pessoa errada e devo trabalhar para que esse indivíduo nunca mais cruze meu caminho ou a das pessoas com quem me importo.",
			"Eu devo tudo ao meu mentor - uma pessoa terrível que, provavelmente, está apodrecendo na cadeia em algum lugar.",
			"Em algum lugar por ai, eu tenho um filho que não me conhece. Eu estou tornando o mundo melhor para ele.",
			"Eu vim de uma familia nobre e, um dia, irei reivindicar minhas terras e título daqueles que o roubaram de mim.",
			"Uma pessoa poderosa matou alguém que eu amava. Algum dia, em breve, terei minha vingança.",
			"Eu enganei e arruinei a vida de uma pessoa que não merecia. Eu busco reparar meus erros, mas talvez nunca seja capaz de me perdoar.");
	
	private List<String> defeitoCharlatao = Arrays.asList("Não resisto um rostinho bonito.",
			"Estou sempre com dividas. Eu gasto meus lucros ilícitos com luxurias decadentes mais rápido do que os ganho...",
			"Estou convencido que ninguém pode me enganar da forma que eu engano os outros.",
			"Eu sou ganancioso demais pra meu próprio bem. Eu não consigo resistir a me arriscar se tiver dinheiro envolvido.",
			"Eu não resisto a enganar pessoas que são mais poderosas que eu.",
			"Eu odeio admitir e vou me odiar por isso, mas, eu vou correr e salvar minha própria oele se as coisas engrossarem.");
	//Criminoso
	private List<String> tracoCriminoso = Arrays.asList("Eu sempre tenho um plano para quando as coisas dão errado.",
			"Eu estou sempre calmo, não importa a situação. Eu nunca levanto minha voz ou deixo minhas emoções me controlarem.",
			"A primeira coisa que faço ao chegar a um novo local é decorar a localização de coisas valiosas - ou onde essas coisas podem estar escondidas.",
			"Eu prefiro fazer um novo amigo a um novo inimigo.",
			"Eu sou incrivelmente receoso em confiar. Aqueles que parecem mais amigáveis geralmente têm mais a esconder.",
			"Eu não presto atenção aos riscos envolvidos em uma situação, nunca me alerte sobre as probabilidades de fracasso.",
			"A melhor maneira de me levar a fazer algo é dizendo que eu não posso fazer.",
			"Eu explodo ao menor insulto.");
	
	private List<String> idealCriminoso = Arrays.asList("Honra. Eu não roubo de irmãos de profissão. (Leal)",
			"Liberdade. Correntes foram feitas para serem partidas, assim como aqueles que as forjaram. (Caótico)",
			"Caridade. Eu roubo dos ricos para dar aos que realmente precisam. (Bom)",
			"Ganância. Eu farei qualquer coisa para me tornar rico. (Mal)",
			"Povo. Eu sou leal aos meus amigos, não a qualquer ideal, e todos sabem que posso viajar até o Estige por aqueles que me importo. (Neutro)",
			"Rendenção. Há uma centelha de bondade em todo mundo. (Bom)");
	
	private List<String> vinculoCriminoso = Arrays.asList("Eu estou tentando quitar uma dívida que tenho com um generoso benfeitor.",
			"Meu ganhos, honestos ou não, são para sustentar minha família.",
			"Algo importante foi roubado de mim, e eu vou recuperá-lo.",
			"Eu me tornarei o maior ladrão que já existiu.",
			"Alguém que amo morreu por causa de um erro que cometi. Isso nunca acontecerá novamente.");
	
	private List<String> defeitoCriminoso = Arrays.asList("Quando vejo algo valioso, não consigo pensar em mais nada, além de roubá-lo.",
			"Quando confrontado com uma escolha entre dinheiro e amigo, eu bem que escolho o dinheiro.",
			"Se há um plano, eu vou esquecê-lo. Se eu não esquecê-lo, vou ignorá-lo.",
			"Eu tenho um \"tique\" que revela se estou mentindo.",
			"Eu viro as costas em corro quando as coisas começam a ficar ruins.",
			"Um inocente foi preso por um crime que eu cometi. Por mim tudo bem.");
	//Eremita
	private List<String> tracoEremita = Arrays.asList("Eu fiquei tanto tempo isolado que raramente falo, preferindo gestos e grunhidos ocasionais.",
			"Eu sou absurdamente sereno, mesmo em face do desespero.",
			"O líder da minha comunidade tem algo sábio a dizer sobre cada tópico, eu estou ansioso para partilhar dessa sabedoria.",
			"Eu sinto uma empatia tremenda por todos que sofrem.",
			"Eu estou alheio a etiqueta e expectativas sociais.",
			"Eu relaciono tudo que acontece comigo a um grande plano cósmico.",
			"Eu, muitas vezes, me perco em meus pensamentos e contemplação me tornando alheio ao meu redor.",
			"Eu estou trabalhando em uma grande teoria filosófica e adoro partilhar minhas ideias.");
	
	private List<String> idealEremita = Arrays.asList("Bem Maior. Meus dons devem ser partilhados com todos, não usados em benefício próprio (Bom)",
			"Lógica. Emoções não podem obscurecer meus sentidos do que é certo e verdade, ou meu pensamento lógico. (Leal)",
			"Pensamento Livre. Questionamentos e curiosidade são os pilares do progresso. (Caótico)",
			"Poder. Isolamento e contemplação são caminhos para poderes místicos e mágicos. (Mau)",
			"Viva e Deixe Viver. Se intrometer nos assuntos dos outros só traz problemas. (Neutro)",
			"Autoconhecimento. Se você conhece a si mesmo, não a mais nada para saber. (Qualquer)");
	
	private List<String> vinculoEremita = Arrays.asList("Nada é mais importante que os outros membros do eremitério, ordem ou associação.",
			"Eu entrei em reclusão para me esconder daqueles que ainda devem estar me caçando. Algum dia irei confrontálos.",
			"Eu ainda busco o esclarecimento que eu perseguia durante meu isolamento e continuo a me iludir.",
			"Eu entrei em reclusão porque eu amava alguém que eu não podia ter.",
			"Se minha descoberta vir à tona, ela poderá trazer destruição ao mundo.",
			"Meu isolamento me deu grande discernimento sobre um grande mal que apenas eu posso destruir.");
	
	private List<String> defeitoEremita = Arrays.asList("Agora que voltei ao mundo, eu desfruto de seus prazeres um pouco demais.",
			"Eu escondo nas sombras, pensamentos sanguinários que meu isolamento e meditação não conseguiram apagar.",
			"Eu sou dogmático em meus pensamentos e filosofia.",
			"Eu deixo meu desejo de vencer discussões ofuscar amizades e harmonia.",
			"Eu me arrisco muito para descobrir um pouco de conhecimento perdido.\r\n",
			"Eu gosto de guardar segredos e não os partilho com ninguém.");
	
	//Forasteiro
	private List<String> tracoForasteiro = Arrays.asList("Eu fui guiado por uma sede de viagens que me levou a abandonas meu lar.",
			"Eu cuido dos meus amigos como se eles fossem filhotes recém-nascidos.\r\n",
			"Certa vez, eu corri quarenta quilômetros sem parar alertar meu clã da aproximação de uma horda orc. Eu faria de novo se fosse necessário.",
			"Eu tenho uma lição pra cada situação, aprendida observando a natureza.",
			"Eu não vejo lugar para o povo rico e educado. Dinheiro e modos não vão salvá-lo de um urso-coruja faminto.",
			"Estou sempre pegando coisas, distraidamente brincando com elas e, às vezes, quebrando-as.",
			"Eu me sinto muito mais confortável entre animais que entre pessoas.",
			"Eu fui, de fato, criado por lobos.");
	
	private List<String> idealForasteiro = Arrays.asList("Mudança. A vida é como as estações, em constante mudança, e nós devemos mudar com ela. (Caótico)",
			"Bem maior. É responsabilidade de todos trazer a maior felicidade para toda a tribo. (Bom)",
			"Honra. Se eu me desonrar, eu desonrarei todo o meu clã. (Leal)",
			"Força. O mais forte deve governar. (Mau)",
			"Natureza. O mundo natural é mais importante que todas as construções da civilização. (Neutro)",
			"Gloria. Eu devo adquirir gloria em batalha, para mim e para meu clã. (Qualquer)");
	
	private List<String> vinculoForasteiro = Arrays.asList("Minha família, clã ou tribo é a coisa mais importante na minha vida, mesmo quando eles estão longe.\r\n",
			"Uma ofensa a natureza intocada do meu lar é uma ofensa a mim.",
			"Eu trarei uma fúria terrível aos malfeitores que destruíram minha terra natal.",
			"Eu sou o último da minha tribo e cabe a mim garantir que seus nomes façam parte das lendas.",
			"Eu sofro de visões terríveis de um desastre vindouro, e farei qualquer coisa para impedi-lo.",
			"É meu dever prover filhos para sustentar minha tribo.");
	
	private List<String> defeitoForasteiro = Arrays.asList("Sou muito apaixonado por cerveja, vinho e outras bebidas.",
			"Não existe lugar para precaução em uma vida vivida ao máximo.",
			"Eu lembro de cada insulto que sofri e nutro um ressentimento silencioso contra qualquer um que já tenha me insultado.",
			"Eu tenho dificuldade em confiar em membros de outras raças, tribos ou sociedades.",
			"A violência é minha resposta para quase todos os obstáculos.",
			"Não espere que eu salve aqueles que não conseguem se virar sozinhos. É a lei da natureza que os fortes prosperem e os fracos pereçam.");
	
	//Heroi do povo
	private List<String> tracoHeroi = Arrays.asList("Eu julgo as pessoas por suas ações, não por suas palavras.",
			"Se alguém está em apuros, eu estou sempre pronto para ajudar.",
			"Quando eu fixo minha mente em algo, eu sigo esse caminho, não importa o que fique no caminho.",
			"Eu possuo um forte senso de justiça e sempre tento encontrar a solução mais equilibrada para as discussões.",
			"Eu confio em minhas habilidades e farei o que for necessário para que os outros confiem também.",
			"Pensar é para os outros, eu prefiro agir.",
			"Eu abuso de palavras longas na tentativa de soar inteligente.",
			"Eu me entedio fácil. Para onde devo ir para me encontrar com meu destino?");
	
	private List<String> idealHeroi = Arrays.asList("Respeito. As pessoas merecem ser tratadas com dignidade e respeito. (Bom)",
			"Justiça. Ninguém merece tratamento diferenciado perante a lei, muito menos estar acima dela. (Leal)",
			"Liberdade. Não pode haver permissão para tiranos oprimirem o povo. (Caótico)",
			"Força. Se eu ficar forte, eu posso pegar tudo o que eu quiser – o que eu desejar. (Mal)",
			"Sinceridade. Não há nada de bom em fingir ser algo que não sou. (Neutro)",
			"Destino. Nada, nem ninguém, pode me manter longe do meu chamado. (Qualquer)");
	
	private List<String> vinculoHeroi = Arrays.asList("Eu tenho família, embora não faça a mínima ideia de onde eles estão, espero encontrá-los um dia.",
			"Eu trabalho a terra, eu amo a terra e eu vou defender a terra.",
			"Um nobre orgulhoso me deu uma bela surra, e eu vou ter minha vingança em qualquer valentão que encontrar.",
			"Minhas ferramentas são símbolo de minha vida passada, eu as carregarei para nunca me esquecer de minhas origens.",
			"Eu devo proteger aqueles que não podem se defender.",
			"Gostaria que meu amor viesse comigo para seguir meu destino.");
	
	private List<String> defeitoHeroi = Arrays.asList("O tirano que comanda minha terra não vai parar até ver meu cadáver.",
			"Eu estou convencido sobre o significado do meu destino, e cego aos riscos e falhas.",
			"As pessoas que me conhecem desde criança sabem de um vergonhoso segredo meu, eu não poderei voltar para casa nunca.",
			"Eu tenho uma fraqueza pelos vícios da cidade, especialmente a bebedeira.",
			"Secretamente, eu acredito que as coisas estariam melhores se algum tirano comandasse a região.",
			"Eu tenho dificuldades em confiar em meus aliados.");
	
	//Marinheiro
	private List<String> tracoMarinheiro = Arrays.asList("Meus amigos sabem que podem contar comigo pro que der e vier.",
			"Eu trabalho duro para que possa me divertir muito quando o trabalho estiver pronto.",
			"Eu gosto de navegar para novos portos e fazer novas amizades acompanhado de uma jarra de cerveja.",
			"Eu modifico alguns fatos para o bem de uma boa história.",
			"Pra mim, uma briga de taverna é uma ótima forma de conhecer uma nova cidade.",
			"Eu nunca deixo passar uma aposta amigável.",
			"Meu vocabulário é tão sujo quanto o covil de um otyugh.",
			"Eu gosto de trabalhos bem feitos, especialmente se eu puder convencer alguém a fazê-los.");
	
	private List<String> idealMarinheiro = Arrays.asList("Respeito. A coisa que mantem um navio unido é o respeito mútuo entre o capitão e a tripulação. (Bem)",
			"Justiça. Todos nós fazemos o trabalho, portanto, todos partilhamos os espólios. (Leal)",
			"Liberdade. O mar é liberdade – a liberdade de ir aonde quiser. (Caótico)",
			"Domínio. Eu sou um predador e os outros navios no mar são minhas presas. (Mau)",
			"Povo. Eu sou apegado aos meus companheiros de tripulação, não a ideais. (Neutro)",
			"Aspiração. Algum dia eu serei dono do meu próprio navio e traçarei meu próprio destino. (Qualquer)");
	
	private List<String> vinculoMarinheiro = Arrays.asList("Eu sou leal ao meu capitão, primeiramente, o resto vem em segundo.",
			"O navio é o mais importante – tripulantes e capitães vem e vão.",
			"Eu sempre me lembrarei do meu primeiro navio.",
			"Em uma cidade portuária, eu tenho uma amante que quase me roubou do mar.",
			"Eu fui enganado na divisão dos espólios e eu quero o que me é devido.",
			"Cruéis piratas mataram meu capitão e companheiros de tripulação, saquearam nosso navio e me deixaram para morrer. A vingança será minha.");
	
	private List<String> defeitoMarinheiro = Arrays.asList("Eu sigo ordens, mesmo que eu ache que estão erradas.",
			"Eu direi qualquer coisa para evitar trabalho extra.",
			"Certa vez, alguém duvidou da minha coragem, eu nunca recuo, não importa o quão perigosa seja a situação.",
			"Quando começo a beber, é difícil pra mim parar.",
			"Eu não resisto a uma sacolinha de moedas dando sopa ou outras bugigangas que encontro.",
			"Meu orgulho provavelmente levará a minha destruição");
	
	//Nobre
	private List<String> tracoNobre = Arrays.asList("Minha bajulação eloquente faz com que todos com quem eu converse se sintam a pessoa mais maravilhosa e importante do mundo.",
			"As pessoas comuns me amam por minha bondade e generosidade.",
			"Ninguém pode duvidar, olhando para o meu porte real, que estou acima das massas plebeias.",
			"Eu tenho grande cuidado de sempre estar no meu melhor e seguir as últimas modas.",
			"Eu não gosto de sujar minhas mãos, e eu não vou ser pego em acomodações inadequadas.",
			"Apesar da minha origem nobre, eu não estou acima dos outros. O sangue é um só.",
			"Meu apoio, uma vez perdido, não volta.",
			"Se você me ferir, eu irei esmagá-lo, arruinar seu nome, e salgar seus campos.");
	
	private List<String> idealNobre = Arrays.asList("Respeito. O respeito a mim é devido por causa da minha posição, mas todas as pessoas, independentemente da posição merecem ser tratados com dignidade. (Bom)",
			"Responsabilidade. É o meu dever respeitar a autoridade daqueles acima de mim, assim como aqueles abaixo de mim devem me respeitar. (Leal)",
			"Independência. Devo provar que posso me cuidar sem os mimos da minha família. (Caótico)",
			"Poder. Se eu puder alcançar mais poder, ninguém vai me dizer o que fazer. (Mau)",
			"Família. O sangue corre mais grosso que a água. (Qualquer)",
			"Obrigação Nobre. É o meu dever proteger e cuidar das pessoas abaixo de mim. (Bom)");
	
	private List<String> vinculoNobre = Arrays.asList("Eu vou encarar qualquer desafio para ganhar a aprovação da minha família.",
			"A aliança da minha casa com outra família nobre deve ser mantida a todo custo.",
			"Nada é mais importante do que os outros membros da minha família.",
			"Eu sou apaixonado pela herdeira de uma família que a minha família despreza.",
			"Minha lealdade ao meu soberano é inabalável.",
			"As pessoas comuns devem me ver como um herói do povo");
	
	private List<String> defeitoNobre = Arrays.asList("Eu secretamente acredito que todos estão abaixo de mim.",
			"Eu escondo um segredo verdadeiramente escandaloso que poderia arruinar minha família para sempre.",
			"Muitas vezes eu ouço insultos e ameaças veladas em cada palavra dirigida a mim, e me irrito muito rápido.",
			"Eu tenho um desejo insaciável por prazeres carnais.",
			"Na verdade, o mundo gira ao meu redor.",
			"Pelas minhas palavras e ações, muitas vezes, envergonho minha família.");
	
	//Órfão
	private List<String> tracoOrfao = Arrays.asList("Eu escondo pedaços de comida e bugigangas em meus bolsos.",
			"Eu pergunto um monte e coisas.",
			"Eu gosto de me espremer em locais pequenos onde ninguém possa me alcançar.",
			"Eu durmo encostado em um muro ou árvore, abraçado com todas as minhas posses.",
			"Eu como feito um porco e tenho maus modos.",
			"Eu acho que todos que são gentis comigo tem segundas intenções.",
			"Eu não gosto de tomar banho.",
			"Eu digo na cara o que as outras pessoas insinuam ou escondem.");
	
	private List<String> idealOrfao = Arrays.asList("Respeito. Todas as pessoas, ricas ou pobres, merecem respeito. (Bom)",
			"Comunidade. Nós temos que tomar conta uns dos outros, porque ninguém mais o fará. (Leal)",
			"Mudança. Os baixos se erguerão e os altos irão tombar. A mudança é a natureza das coisas. (Caótico)",
			"Retribuição. Os ricos precisam ver como a vida e morte é nas sarjetas. (Mau)",
			"Povo. Eu ajudo as pessoas que me ajudam – é isso que nos mantem vivos. (Neutro)",
			"Aspiração. Eu vou provar que sou merecedor de uma vida melhor. (Qualquer)");
	
	private List<String> vinculoOrfao = Arrays.asList("Minha cidade ou vila é meu lar, e eu vou lutar para defendê-lo.",
			"Eu patrocino um orfanato para que outros não passem pelo que fui forçado a passar.",
			"Eu devo minha sobrevivência a outros órfão que me ensinou a vida nas ruas.",
			"Eu tenho uma dívida que nunca poderei pagar com uma pessoa que teve pena de mim.",
			"Eu sai da minha vida de pobreza roubando uma pessoa importante, eu sou procurado por isso.",
			"Ninguém deveria ter suportar as dificuldades pelas quais passei.");
	
	private List<String> defeitoOrfao = Arrays.asList("Se eu estiver em desvantagem, eu vou fugir de uma briga.",
			"Ouro parece ser muito dinheiro pra mim, e eu faria praticamente qualquer coisa por mais dele.",
			"Eu nunca vou confiar em ninguém plenamente, além de mim mesmo.",
			"Eu prefiro matar alguém enquanto dorme que uma luta justa",
			"Não é roubo se eu preciso mais que outra pessoa.",
			"As pessoas que não podem se virar sozinhas, tem o que merecem.");
	
	//Sabio
	private List<String> tracoSabio = Arrays.asList("Eu uso palavras polissilábicas para endossar minha impressão de grande erudição.",
			"Eu já li todos os livros das grandes bibliotecas – ou gosto de me vangloriar e dizer que li.",
			"Eu costumo ajudar os outros que não são tão inteligentes quanto eu, e pacientemente explico tudo quantas vezes forem necessárias.",
			"Nada para mim é melhor que um bom mistério.",
			"Eu voluntariamente escuto cada lado, e seus argumentos, antes de tomar uma decisão final.",
			"Eu...falo...lentamente...ao...conversar...com idiotas...que tentam...se comparar...comigo.",
			"E sou horrível e estranho em situações sociais",
			"Estou convencido de que todos tentam roubar os meus segredos de mim");
	
	private List<String> idealSabio = Arrays.asList("Conhecimento. O caminho para o poder e o auto aperfeiçoamento é através do conhecimento. (Neutro)",
			"Beleza. O que é belo nos mostra o que está além disso perto do que é verdadeiro. (Bom)",
			"Logica. Emoções não devem nublar seu pensamento lógico. (Leal)",
			"Sem Limites. Nada pode apaziguar a possibilidade infinita de toda a existência. (Caótico)",
			"Poder. Conhecimento é o caminho para o poder e a dominação. (Mau)",
			"Auto Aperfeiçoamento. O objetivo de uma vida de estudos é a melhoria de si mesmo. (Qualquer)");
	
	private List<String> vinculoSabio = Arrays.asList("É meu dever proteger meus estudantes.",
			"Eu guardo um texto ancestral que contém terríveis segredos que não podem cair em mãos erradas.",
			"Eu trabalho para preservar uma biblioteca, universidade, arquivo de escribas ou monastério.",
			"O trabalho a da minha vida é uma série de tomos relatando um campo de conhecimento específico.",
			"Eu venho procurando a minha vida inteira pela resposta de certa questão.",
			"Eu vendi minha alma por conhecimento. Espero realizar grandes feitos para ganhá-la de volta.");
	
	private List<String> defeitoSabio = Arrays.asList("Eu me distraio facilmente com a promessa de informação.",
			"Muitas pessoas gritam e correm quando veem um corruptor. Eu paro e tomo notas de sua anatomia.",
			"Desvendar um mistério ancestral pode muito bem valer o preço e uma civilização.",
			"E prefiro soluções óbvias a complicadas.",
			"Eu falo sem antes pensar em minhas palavras, invariavelmente insultando outros.",
			"Eu não consigo guardar um segredo para salvar minha vida. Ou a vida de qualquer outra pessoa.");
	
	//Soldado
	private List<String> tracoSoldado = Arrays.asList("Eu sou sempre polido e respeitoso.",
			"Eu sou assombrado pelas memórias da guerra. Não consigo tirar aquelas imagens da minha cabeça.",
			"Eu perdi muitos amigos, e sou muito devagar para fazer novos.",
			"Eu tenho muitas histórias de inspiração e cautela da época de minha experiência militar que são relevantes em todas as situações de combate.",
			"Eu não consigo encarar um cão infernal sem vacilar",
			"Eu gosto de ser forte e de quebrar coisas.",
			"Eu tenho um senso de humor grosseiro.",
			"Eu enfrento os problemas de frente. Uma solução direta é o melhor caminho para o sucesso.");
	
	private List<String> idealSoldado = Arrays.asList("Bem Maior. Nosso destino é dar nossas vidas em defesa de terceiros. (Bom)",
			"Responsabilidade. Eu faço o que tenho que fazer e obedeço apenas a autoridade. (Leal)",
			"Independência. Quando pessoas seguem ordens cegas elas apoiam um tipo de tirania. (Caótico)",
			"Força. A vida é como uma guerra, o mais forte vence. (Mau)",
			"Viva e Deixa Viver. Ideais não valem a pena se você matar, ou for à guerra por eles. (Neutro)",
			"Aspiração. Minha cidade, nação ou meu povo, são tudo o que importa para mim. (Qualquer)");
	
	private List<String> vinculoSoldado = Arrays.asList("Eu ainda daria a minha vida pelas pessoas com quem servi.\r\n",
			"Alguém salvou minha vida no campo de batalha. Desde aquele dia eu nunca deixo nenhum amigo para trás.",
			"Minha honra é minha vida.",
			"Eu nunca esquecerei a destruidora derrota que minha companhia sofreu ou os inimigos que a causaram.",
			"Aqueles que lutam ao meu lado são aqueles por quem vale a pena morrer.",
			"Eu luto por aqueles que não podem lutar por si mesmos.");
	
	private List<String> defeitoSoldado = Arrays.asList("O inimigo monstruoso que enfrentei em uma batalha ainda me deixa tremendo de medo.",
			"Eu tenho pouco respeito por aqueles que não se provam bons combatentes.",
			"Eu cometi um terrível erro em batalha, o que custou muitas vidas – eu farei de tudo para manter esse erro em segredo.",
			"Meu ódio por meus inimigos é cego e irracional.",
			"Eu obedeço a lei, mesmo se a lei trouxer a angústia.",
			"Eu prefiro comer minha armadura a admitir que estou errado.");
	
}
