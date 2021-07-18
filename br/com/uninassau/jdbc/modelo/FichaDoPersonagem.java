package br.com.uninassau.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FichaDoPersonagem {
		
	private int idpersonagem = 1;
	private String nome_jogador;
	private String nome_personagem;
	private String classe;
	private int nivel = 1;
	private String raca;
	private String alinhamento;
	private String antecedente;
	private double exp = 0;
	private int bonus_proficiencia = 0;
	private boolean inspiracao = false;
	private String deslocamento;
	private int pontos_vida = 0;
	private int classeDeArmadura = 0;
	private String iniciativa;
//Atributos
	private int idatributo;
	private int forca = 0;
	private int destreza = 0;
	private int constituicao = 0;
	private int inteligencia = 0;
	private int sabedoria = 0;
	private int carisma = 0;
//Atributos modificadores
	private int idatributos_modificadores;
	private int forca_mod = 0;
	private int destreza_mod = 0;
	private int constituicao_mod = 0;
	private int inteligencia_mod = 0;
	private int sabedoria_mod = 0;
	private int carisma_mod = 0;

//Teste de resistencia
	private int idteste_resistencia;
	private int teste_forca = 0;
	private int teste_destreza = 0;
	private int teste_constituicao = 0;
	private int teste_inteligencia = 0;
	private int teste_sabedoria = 0;
	private int teste_carisma = 0;
//Tem resistencia
	private int idCteste;
	private boolean tem_resForca = false;
	private boolean tem_resDestreza = false;
	private boolean tem_resConstituicao = false;
	private boolean tem_resInteligencia = false;
	private boolean tem_resSabedoria = false;
	private boolean tem_resCarisma = false;
//
//Pericias
	private int idpericias;
	private int acrobacia = 0;
	private int adestrar_animais = 0;
	private int arcanismo = 0;
	private int atletismo = 0;
	private int enganacao = 0;
	private int historia = 0;
	private int intuicao = 0;
	private int intimidacao = 0;
	private int investigacao = 0;
	private int medicina = 0;
	private int natureza = 0;
	private int percepcao = 0;
	private int atuacao = 0;
	private int performance = 0;
	private int persuasao = 0;
	private int religiao = 0;
	private int prestidigitacao = 0;
	private int furtividade = 0;
	private int sobrevivencia = 0;
//
//Confirmar se ja tem proficiencia na pericia
	private int idCpericia;
	private boolean tem_acrobacia = false;
	private boolean tem_adestrar_animais = false;
	private boolean tem_arcanismo = false;
	private boolean tem_atletismo = false;
	private boolean tem_enganacao = false;
	private boolean tem_historia = false;
	private boolean tem_intuicao = false;
	private boolean tem_intimidacao = false;
	private boolean tem_investigacao = false;
	private boolean tem_medicina = false;
	private boolean tem_natureza = false;
	private boolean tem_percepcao = false;
	private boolean tem_atuacao = false;
	private boolean tem_performance = false;
	private boolean tem_persuasao = false;
	private boolean tem_religiao = false;
	private boolean tem_prestidigitacao = false;
	private boolean tem_furtividade = false;
	private boolean tem_sobrevivencia = false;
//caracteristicas
	private int idcaracteristica;
	private int percepcao_passiva = 0;
	private ArrayList<Integer> idtracos_personalidade = new ArrayList<Integer>();
	private ArrayList<String> tracos_personalidade = new ArrayList<String>();
	private String ideal;
	private String vinculo;
	private String defeito;
	private ArrayList<Integer> idtracos_raciais = new ArrayList<Integer>();
	private ArrayList<String> tracos_raciais = new ArrayList<String>();
	private ArrayList<Integer> idclasse_feats = new ArrayList<Integer>();
	private ArrayList<String> classe_feats = new ArrayList<String>();
	private ArrayList<Integer> idequipamentos = new ArrayList<Integer>();
	private ArrayList<String> equipamentos = new ArrayList<String>();	
	private ArrayList<Integer> ididiomas = new ArrayList<Integer>();
	private ArrayList<String> idiomas = new ArrayList<String>();
	private ArrayList<Integer> idprofi_ferramentas_peri = new ArrayList<Integer>();
	private ArrayList<String> profi_ferramentas_peri= new ArrayList<String>();
	private ArrayList<Integer> idprofi_equips = new ArrayList<Integer>();
	private ArrayList<String> profi_equips = new ArrayList<String>();
	private double peso_total = 0;
//
//Magias
	private int idMagias;
	private ArrayList<Integer> idtruques = new ArrayList<Integer>();
	private ArrayList<String> truques = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV1 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV1 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV2 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV2 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV3 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV3 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV4 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV4 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV5 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV5 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV6 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV6 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV7 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV7 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV8 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV8 = new ArrayList<String>();
	private ArrayList<Integer> idmagiasLV9 = new ArrayList<Integer>();
	private ArrayList<String> magiasLV9 = new ArrayList<String>();
	private String habilidade_conjuracao;
	private int cd_resistencia_magia = 0;
	private int bonus_ataque_magia = 0;
//
//Bio
	private int bio_cod;
	private String idade;
	private String tamanho;
	private String altura;
	private String peso;
	private String olhos;
	private String Cabelo;
	private String pele;
	private String aparencia_personagem;
	private String aliados_organizacoes;
	private String historia_personagem;
	private String caracteristicas_tracos_adicionais;
	private String tesouro;
//
	
	public int getBio_cod() {
		return bio_cod;
	}

	public void setBio_cod(int bio_cod) {
		this.bio_cod = bio_cod;
	}
	
	public String getNome_jogador() {
		return nome_jogador;
	}
	
	public void setNome_jogador(String nome_jogador) {
		this.nome_jogador = nome_jogador;
	}
	
	public String getNome_personagem() {
		return nome_personagem;
	}
	
	public void setNome_personagem(String nome_personagem) {
		this.nome_personagem = nome_personagem;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getAlinhamento() {
		return alinhamento;
	}
	
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	
	public String getAntecedente() {
		return antecedente;
	}
	
	public void setAntecedente(String antecedente) {
		this.antecedente = antecedente;
	}
	
	public double getExp() {
		return exp;
	}
	
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public int getBonus_proficiencia() {
		return bonus_proficiencia;
	}
	
	public void setBonus_proficiencia(int bonus_proficiencia) {
		this.bonus_proficiencia = bonus_proficiencia;
	}
	
	public boolean getInspiracao() {
		return inspiracao;
	}
	
	public void setInspiracao(boolean inspiracao) {
		this.inspiracao = inspiracao;
	}
	
	public String getDeslocamento() {
		return deslocamento;
	}
	
	public void setDeslocamento(String deslocamento) {
		this.deslocamento = deslocamento;
	}
	
	public String getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(String iniciativa) {
		this.iniciativa = iniciativa;
	}
	
	public int getPontos_vida() {
		return pontos_vida;
	}
	
	public void setPontos_vida() {
		if(Objects.equals(new String("Barbaro"), this.classe)) {
			this.pontos_vida = this.pontos_vida+12+getConstituicao_mod();
			
		}else if(Objects.equals(new String("Bardo"), this.classe) || Objects.equals(new String("Bruxo"), this.classe) || Objects.equals(new String("Clérigo"), this.classe) || 
				 Objects.equals(new String("Druida"), this.classe) || Objects.equals(new String("Ladino"), this.classe) || Objects.equals(new String("Monge"), this.classe)) {
			this.pontos_vida = this.pontos_vida+8+getConstituicao_mod();
			
		}else if(Objects.equals(new String("Patrulheiro"), this.classe) || Objects.equals(new String("Guerreiro"), this.classe) || Objects.equals(new String("Paladino"), this.classe)) {
			this.pontos_vida = this.pontos_vida+10+getConstituicao_mod();
			
		}else if(Objects.equals(new String("Feiticeiro"), this.classe) || Objects.equals(new String("Mago"), this.classe)) {
			this.pontos_vida = this.pontos_vida+6+getConstituicao_mod();
		}
	}
	
	public void setPontos_vida(int vida) {
		this.pontos_vida = vida;
	}
	
	public int getClasseDeArmadura() {
		return classeDeArmadura;
	}
	
	public void setClasseDeArmadura() {
		if(Objects.equals(new String("Barbaro"), this.classe)) {
			this.classeDeArmadura = 10+getDestreza_mod()+getConstituicao_mod();;
		}else {
			this.classeDeArmadura = 10+getDestreza_mod();;
		}
		
	}
	
	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getDestreza() {
		return destreza;
	}
	
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	
	public int getConstituicao() {
		return constituicao;
	}
	
	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}
	
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public int getSabedoria() {
		return sabedoria;
	}
	
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}
	
	public int getCarisma() {
		return carisma;
	}
	
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	public int getForca_mod() {
		return forca_mod;
	}
	
	public void setForca_mod(int forca_mod) {
		this.forca_mod = forca_mod;
	}
	
	public void setForca_mod() {
		double forca_mod = this.forca;
		double mod = (forca_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.forca_mod = resultado;
		if(this.tem_resForca == true) {
			this.teste_forca = this.forca_mod + this.bonus_proficiencia;
		}else {
			this.teste_forca = this.forca_mod;
		}
		setAtletismo(resultado);
	}
	
	public int getDestreza_mod() {
		return destreza_mod;
	}
	
	public void setDestreza_mod(int destreza_mod) {
		this.destreza_mod = destreza;
	}
	
	public void setDestreza_mod() {
		double destreza_mod = this.destreza;
		double mod = (destreza_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.destreza_mod = resultado;
		if(this.tem_resDestreza == true) {
			this.teste_destreza = this.destreza_mod + this.bonus_proficiencia;
		}else {
			this.teste_destreza = this.destreza_mod;
		}
		setAcrobacia(resultado);
		setPrestidigitacao(resultado);
		setFurtividade(resultado);
	}
	
	public int getConstituicao_mod() {
		return constituicao_mod;
	}
	
	public void setConstituicao_mod(int constituicao_mod) {
		this.constituicao_mod = constituicao_mod;
	}
	
	public void setConstituicao_mod() {
		double constituicao_mod = this.constituicao;
		double mod = (constituicao_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.constituicao_mod = resultado;
		if(this.tem_resConstituicao == true) {
			this.teste_constituicao = this.constituicao_mod + this.bonus_proficiencia;
		}else {
			this.teste_constituicao = this.constituicao_mod;
		}
	}
	
	public int getInteligencia_mod() {
		return inteligencia_mod;
	}
	
	public void setInteligencia_mod(int inteligencia_mod) {
		this.inteligencia_mod = inteligencia_mod;
	}
	
	public void setInteligencia_mod() {
		double inteligencia_mod = this.inteligencia;
		double mod = (inteligencia_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.inteligencia_mod = resultado;
		if(this.tem_resInteligencia == true) {
			this.teste_inteligencia = this.inteligencia_mod + this.bonus_proficiencia;
		}else {
			this.teste_inteligencia = this.inteligencia_mod;
		}
		setArcanismo(resultado);
		setHistoria(resultado);
		setInvestigacao(resultado);
		setNatureza(resultado);
		setReligiao(resultado);
	}
	
	public int getSabedoria_mod() {
		return sabedoria_mod;
	}
	
	public void setSabedoria_mod(int sabedoria_mod) {
		this.sabedoria_mod = sabedoria_mod;
	}
	
	public void setSabedoria_mod() {
		double sabedoria_mod = this.sabedoria;
		double mod = (sabedoria_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.sabedoria_mod = resultado;
		if(this.tem_resSabedoria == true) {
			this.teste_sabedoria = this.sabedoria_mod + this.bonus_proficiencia;
		}else {
			this.teste_sabedoria = this.sabedoria_mod;
		}
		setIntuicao(resultado);
		setMedicina(resultado);
		setPercepcao(resultado);
		setSobrevivencia(resultado);
		setAdestrar_animais(resultado);
	}
	
	public int getCarisma_mod() {
		return carisma_mod;
	}
	
	public void setCarisma_mod(int carisma_mod) {
		this.carisma_mod = carisma_mod;
	}
	
	public void setCarisma_mod() {
		double carisma_mod = this.carisma;
		double mod = (carisma_mod-10)/2;
		int resultado = (int) Math.floor(mod);
		this.carisma_mod = resultado;
		if(this.tem_resCarisma == true) {
			this.teste_carisma = this.carisma_mod + this.bonus_proficiencia;
		}else {
			this.teste_carisma = this.carisma_mod;
		}
		setEnganacao(resultado);
		setIntimidacao(resultado);
		setAtuacao(resultado);
		setPersuasao(resultado);
	}
	
	public int getTeste_forca() {
		return teste_forca;
	}
	
	public void setTeste_forca(int teste_forca) {
		this.teste_forca = teste_forca;
	}
	
	public int getTeste_destreza() {
		return teste_destreza;
	}
	
	public void setTeste_destreza(int teste_destreza) {
		this.teste_destreza = teste_destreza;
	}
	
	public int getTeste_constituicao() {
		return teste_constituicao;
	}
	
	public void setTeste_constituicao(int teste_constituição) {
		this.teste_constituicao = teste_constituição;
	}
	
	public int getTeste_inteligencia() {
		return teste_inteligencia;
	}
	
	public void setTeste_inteligencia(int teste_inteligencia) {
		this.teste_inteligencia = teste_inteligencia;
	}
	
	public int getTeste_sabedoria() {
		return teste_sabedoria;
	}
	
	public void setTeste_sabedoria(int teste_sabedoria) {
		this.teste_sabedoria = teste_sabedoria;
	}
	
	public int getTeste_carisma() {
		return teste_carisma;
	}
	
	public void setTeste_carisma(int teste_carisma) {
		this.teste_carisma = teste_carisma;
	}
	
	public boolean getTem_resForca() {
		return tem_resForca;
	}
	
	public void setTem_resForca(Boolean tem_resforca) {
		this.tem_resForca = tem_resforca;
	}
	
	public void setTem_resForca() {
		if(this.tem_resForca == false) {
			this.tem_resForca = true;
			setTeste_forca(+getBonus_proficiencia());
		}else {
			this.tem_resForca = false;
			setTeste_forca(-getBonus_proficiencia());
		}
	}
	
	public boolean getTem_resDestreza() {
		return tem_resDestreza;
	}
	
	public void setTem_resDestreza(Boolean tem_resdestreza) {
		this.tem_resDestreza = tem_resdestreza;
	}
	
	public void setTem_resDestreza() {
		if(this.tem_resDestreza == false) {
			this.tem_resDestreza = true;
			setTeste_destreza(+getBonus_proficiencia());
		}else {
			this.tem_resDestreza = false;
			setTeste_destreza(-getBonus_proficiencia());
		}
	}
	
	public boolean getTem_resConstituicao() {
		return tem_resConstituicao;
	}
	
	public void setTem_resConstituicao(Boolean tem_resconstituicao) {
		this.tem_resConstituicao = tem_resconstituicao;
	}
	
	public void setTem_resConstituicao() {
		if(this.tem_resConstituicao == false) {
			this.tem_resConstituicao = true;
			setTeste_constituicao(+getBonus_proficiencia());
		}else {
			this.tem_resConstituicao = false;
			setTeste_constituicao(-getBonus_proficiencia());
		}
	}
	
	public boolean getTem_resInteligencia() {
		return tem_resInteligencia;
	}
	
	public void setTem_resInteligencia(Boolean tem_resinteligencia) {
		this.tem_resInteligencia = tem_resinteligencia;
	}
	
	public void setTem_resInteligencia() {
		if(this.tem_resInteligencia == false) {
			this.tem_resInteligencia = true;
			setTeste_inteligencia(+getBonus_proficiencia());
		}else {
			this.tem_resInteligencia = false;
			setTeste_inteligencia(-getBonus_proficiencia());
		}
	}
	
	public boolean getTem_resSabedoria() {
		return tem_resSabedoria;
	}
	
	public void setTem_resSabedoria(Boolean tem_ressabedoria) {
		this.tem_resSabedoria = tem_ressabedoria;
	}
	
	public void setTem_resSabedoria() {
		if(this.tem_resSabedoria == false) {
			this.tem_resSabedoria = true;
			setTeste_sabedoria(+getBonus_proficiencia());
		}else {
			this.tem_resSabedoria = false;
			setTeste_sabedoria(-getBonus_proficiencia());
		}
	}
	
	public boolean getTem_resCarisma() {
		return tem_resCarisma;
	}
	
	public void setTem_resCarisma(Boolean tem_rescarisma) {
		this.tem_resCarisma = tem_rescarisma;
	}
	
	public void setTem_resCarisma() {
		if(this.tem_resCarisma == false) {
			this.tem_resCarisma = true;
			setTeste_carisma(+getBonus_proficiencia());
		}else {
			this.tem_resCarisma = false;
			setTeste_carisma(-getBonus_proficiencia());
		}
	}
	
	public int getAcrobacia() {
		return acrobacia;
	}
	
	public void setAcrobacia(int acrobacia) {
		if(isTem_acrobacia() == true) {
			this.acrobacia = acrobacia+getBonus_proficiencia();
		}else {
			this.acrobacia = acrobacia;
			
		}
	}
	
	public int getAdestrar_animais() {
		return adestrar_animais;
	}
	
	public void setAdestrar_animais(int adestrar_animais) {
		if(isTem_adestrar_animais() == true) {
			this.adestrar_animais = adestrar_animais+getBonus_proficiencia();
		}else {
			this.adestrar_animais = adestrar_animais;		
		}
	}
	
	public int getArcanismo() {
		return arcanismo;
	}
	
	public void setArcanismo(int arcanismo) {
		if(isTem_arcanismo() == true) {
			this.arcanismo = arcanismo+getBonus_proficiencia();
		}else {
			this.arcanismo = arcanismo;		
		}
	}
	
	public int getAtletismo() {
		return atletismo;
	}
	
	public void setAtletismo(int atletismo) {
		if(isTem_atletismo() == true) {
			this.atletismo = atletismo+getBonus_proficiencia();
		}else {
			this.atletismo = atletismo;			
		}
	}
	
	public int getEnganacao() {
		return enganacao;
	}
	
	public void setEnganacao(int enganação) {
		if(isTem_enganacao() == true) {
			this.enganacao = enganação+getBonus_proficiencia();
		}else {
			this.enganacao = enganação;		
		}
	}
	
	public int getHistoria() {
		return historia;
	}
	
	public void setHistoria(int historia) {
		if(isTem_historia() == true) {
			this.historia = historia+getBonus_proficiencia();
		}else {
			this.historia = historia;		
		}
	}
	
	public int getIntuicao() {
		return intuicao;
	}
	
	public void setIntuicao(int intuicao) {
		if(isTem_intuicao() == true) {
			this.intuicao = intuicao+getBonus_proficiencia();
		}else {
			this.intuicao = intuicao;
		}
	}
	
	public int getIntimidacao() {
		return intimidacao;
	}
	
	public void setIntimidacao(int intimidacao) {
		if(isTem_intimidacao() == true) {
			this.intimidacao = intimidacao+getBonus_proficiencia();
		}else {
			this.intimidacao = intimidacao;
		}
	}
	
	public int getInvestigacao() {
		return investigacao;
	}
	
	public void setInvestigacao(int investigacao) {
		if(isTem_investigacao() == true) {
			this.investigacao = investigacao+getBonus_proficiencia();
		}else {
			this.investigacao = investigacao;
		}
	}
	
	public int getMedicina() {
		return medicina;
	}
	
	public void setMedicina(int medicina) {
		if(isTem_medicina() == true) {
			this.medicina = medicina+getBonus_proficiencia();
		}else {
			this.medicina = medicina;
		}
	}
	
	public int getNatureza() {
		return natureza;
	}
	
	public void setNatureza(int natureza) {
		if(isTem_natureza() == true) {
			this.natureza = natureza+getBonus_proficiencia();
		}else {
			this.natureza = natureza;
		}
	}
	
	public int getPercepcao() {
		return percepcao;
	}
	
	public void setPercepcao(int percepcao) {
		if(isTem_percepcao() == true) {
			this.percepcao = percepcao+getBonus_proficiencia();
		}else {
			this.percepcao = percepcao;
		}
	}
	
	public int getAtuacao() {
		return atuacao;
	}
	
	public void setAtuacao(int atuacao) {
		if(isTem_atuacao() == true) {
			this.atuacao = atuacao+getBonus_proficiencia();
		}else {
			this.atuacao = atuacao;
		}
	}
	
	public int getPerformance() {
		return performance;
	}
	
	public void setPerformance(int performance) {
		if(isTem_performance() == true) {
			this.performance = performance+getBonus_proficiencia();
		}else {
			this.performance = performance;
		}
	}
	
	public int getPersuasao() {
		return persuasao;
	}
	
	public void setPersuasao(int persuasao) {
		if(isTem_persuasao() == true) {
			this.persuasao = persuasao+getBonus_proficiencia();
		}else {
			this.persuasao = persuasao;
		}
	}
	
	public int getReligiao() {
		return religiao;
	}
	
	public void setReligiao(int religiao) {
		if(isTem_religiao() == true) {
			this.religiao = religiao+getBonus_proficiencia();
		}else {
			this.religiao = religiao;
		}
	}
	
	public int getPrestidigitacao() {
		return prestidigitacao;
	}
	
	public void setPrestidigitacao(int prestidigitacao) {
		if(isTem_prestidigitacao() == true) {
			this.prestidigitacao = prestidigitacao+getBonus_proficiencia();
		}else {
			this.prestidigitacao = prestidigitacao;
		}
	}
	
	public int getFurtividade() {
		return furtividade;
	}
	
	public void setFurtividade(int furtividade) {
		if(isTem_furtividade() == true) {
			this.furtividade = furtividade+getBonus_proficiencia();
		}else {
			this.furtividade = furtividade;
		}
	}
	
	public int getSobrevivencia() {
		return sobrevivencia;
	}
	
	public void setSobrevivencia(int sobrevivencia) {
		if(isTem_sobrevivencia() == true) {
			this.sobrevivencia = sobrevivencia+getBonus_proficiencia();
		}else {
			this.sobrevivencia = sobrevivencia;
		}
	}
	
	public boolean isTem_acrobacia() {
		return tem_acrobacia;
	}
	
	public void setTem_acrobacia(Boolean tem_acrobacia) {
		this.tem_acrobacia = tem_acrobacia;
	}
	
	public void setTem_acrobacia() {
		if(tem_acrobacia == false) {
			this.tem_acrobacia = true;
			setAcrobacia(+getBonus_proficiencia());
		}else {
			this.tem_acrobacia = false;
			setAcrobacia(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_adestrar_animais() {
		return tem_adestrar_animais;
	}
	
	public void setTem_adestrar_animais(Boolean tem_adestraranimais) {
		this.tem_adestrar_animais = tem_adestraranimais;
	}
	
	public void setTem_adestrar_animais() {
		if(tem_adestrar_animais == false) {
			this.tem_adestrar_animais = true;
			setAdestrar_animais(+getBonus_proficiencia());
		}else {
			this.tem_adestrar_animais = false;
			setAdestrar_animais(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_arcanismo() {
		return tem_arcanismo;
	}
	
	public void setTem_arcanismo(Boolean tem_arcanismo) {
		this.tem_arcanismo = tem_arcanismo;
	}
	
	public void setTem_arcanismo() {
		if(tem_arcanismo == false) {
			this.tem_arcanismo = true;
			setArcanismo(+getBonus_proficiencia());
		}else {
			this.tem_arcanismo = false;
			setArcanismo(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_atletismo() {
		return tem_atletismo;
	}
	
	public void setTem_atletismo(Boolean tem_atletismo) {
		this.tem_atletismo = tem_atletismo;
	}
	
	public void setTem_atletismo() {
		if(tem_atletismo == false) {
			this.tem_atletismo = true;
			setAtletismo(+getBonus_proficiencia());
		}else {
			this.tem_atletismo = false;
			setAtletismo(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_enganacao() {
		return tem_enganacao;
	}
	
	public void setTem_enganacao(Boolean tem_enganacao) {
		this.tem_enganacao = tem_enganacao;
	}
	
	public void setTem_enganacao() {
		if(tem_enganacao == false) {
			this.tem_enganacao = true;
			setEnganacao(+getBonus_proficiencia());
		}else {
			this.tem_enganacao = false;
			setEnganacao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_historia() {
		return tem_historia;
	}
	
	public void setTem_historia(Boolean tem_historia) {
		this.tem_historia = tem_historia;
	}
	
	public void setTem_historia() {
		if(tem_historia == false) {
			this.tem_historia = true;
			setHistoria(+getBonus_proficiencia());
		}else {
			this.tem_historia = false;
			setHistoria(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_intuicao() {
		return tem_intuicao;
	}
	
	public void setTem_intuicao(Boolean tem_intuicao) {
		this.tem_intuicao = tem_intuicao;
	}
	
	public void setTem_intuicao() {
		if(tem_intuicao == false) {
			this.tem_intuicao = true;
			setIntuicao(+getBonus_proficiencia());
		}else {
			this.tem_intuicao = false;
			setIntuicao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_intimidacao() {
		return tem_intimidacao;
	}
	
	public void setTem_intimidacao(Boolean tem_intimidacao) {
		this.tem_intimidacao = tem_intimidacao;
	}
	
	public void setTem_intimidacao() {
		if(tem_intimidacao == false) {
			this.tem_intimidacao = true;
			setIntimidacao(+getBonus_proficiencia());
		}else {
			this.tem_intimidacao = false;
			setIntimidacao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_investigacao() {
		return tem_investigacao;
	}
	
	public void setTem_investigacao(Boolean tem_investigacao) {
		this.tem_investigacao = tem_investigacao;
	}
	
	public void setTem_investigacao() {
		if(tem_investigacao == false) {
			this.tem_investigacao = true;
			setInvestigacao(+getBonus_proficiencia());
		}else {
			this.tem_investigacao = false;
			setInvestigacao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_medicina() {
		return tem_medicina;
	}
	
	public void setTem_medicina(Boolean tem_medicina) {
		this.tem_medicina = tem_medicina;
	}
	
	public void setTem_medicina() {
		if(tem_medicina == false) {
			this.tem_medicina = true;
			setMedicina(+getBonus_proficiencia());
		}else {
			this.tem_medicina = false;
			setMedicina(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_natureza() {
		return tem_natureza;
	}
	
	public void setTem_natureza(Boolean tem_natureza) {
		this.tem_natureza = tem_natureza;
	}
	
	public void setTem_natureza() {
		if(tem_natureza == false) {
			this.tem_natureza = true;
			setNatureza(+getBonus_proficiencia());
		}else {
			this.tem_natureza = false;
			setNatureza(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_percepcao() {
		return tem_percepcao;
	}
	
	public void setTem_percepcao(Boolean tem_percepcao) {
		this.tem_percepcao = tem_percepcao;
	}
	
	public void setTem_percepcao() {
		if(tem_percepcao == false) {
			this.tem_percepcao = true;
			setPercepcao(+getBonus_proficiencia());
		}else {
			this.tem_percepcao = false;
			setPercepcao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_atuacao() {
		return tem_atuacao;
	}
	
	public void setTem_atuacao(Boolean tem_atuacao) {
		this.tem_atuacao = tem_atuacao;
	}	
	
	public void setTem_atuacao() {
		if(tem_atuacao == false) {
			this.tem_atuacao = true;
			setAtuacao(+getBonus_proficiencia());
		}else {
			this.tem_atuacao = false;
			setAtuacao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_performance() {
		return tem_performance;
	}
	
	public void setTem_preformance(Boolean tem_performance) {
		this.tem_performance = tem_performance;
	}
	
	public void setTem_performance() {
		if(tem_performance == false) {
			this.tem_performance = true;
			setPerformance(+getBonus_proficiencia());
		}else {
			this.tem_performance = false;
			setPerformance(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_persuasao() {
		return tem_persuasao;
	}
	
	public void setTem_persuasao(Boolean tem_persuasao) {
		this.tem_persuasao = tem_persuasao;
	}
	
	public void setTem_persuasao() {
		if(tem_persuasao == false) {
			this.tem_persuasao = true;
			setPersuasao(+getBonus_proficiencia());
		}else {
			this.tem_persuasao = false;
			setPersuasao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_religiao() {
		return tem_religiao;
	}
	
	public void setTem_religiao(Boolean tem_religiao) {
		this.tem_religiao = tem_religiao;
	}
	
	public void setTem_religiao() {
		if(tem_religiao == false) {
			this.tem_religiao = true;
			setReligiao(+getBonus_proficiencia());
		}else {
			this.tem_religiao = false;
			setReligiao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_prestidigitacao() {
		return tem_prestidigitacao;
	}
	
	public void setTem_prestidigitacao(Boolean tem_prestidigitacao) {
		this.tem_prestidigitacao = tem_prestidigitacao;
	}
	
	public void setTem_prestidigitacao() {
		if(tem_prestidigitacao == false) {
			this.tem_prestidigitacao = true;
			setPrestidigitacao(+getBonus_proficiencia());
		}else {
			this.tem_prestidigitacao = false;
			setPrestidigitacao(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_furtividade() {
		return tem_furtividade;
	}
	
	public void setTem_furtividade(Boolean tem_furtividade) {
		this.tem_furtividade = tem_furtividade;
	}
	
	public void setTem_furtividade() {
		if(tem_furtividade == false) {
			this.tem_furtividade = true;
			setFurtividade(+getBonus_proficiencia());
		}else {
			this.tem_furtividade = false;
			setFurtividade(-getBonus_proficiencia());
		}
	}
	
	public boolean isTem_sobrevivencia() {
		return tem_sobrevivencia;
	}
	
	public void setTem_sobrevivencia(Boolean tem_sobrevivencia) {
		this.tem_sobrevivencia = tem_sobrevivencia;
	}
	
	public void setTem_sobrevivencia() {
		if(tem_sobrevivencia == false) {
			this.tem_sobrevivencia = true;
			setSobrevivencia(+getBonus_proficiencia());
		}else {
			this.tem_sobrevivencia = false;
			setSobrevivencia(-getBonus_proficiencia());
		}
	}
	
	public int getPercepcao_passiva() {
		return percepcao_passiva;
	}
	
	public void setPercepcao_passiva(int percepcao_passiva) {
		this.percepcao_passiva = percepcao_passiva;
	}
	
	public ArrayList<String> getTracos_personalidade() {
		return tracos_personalidade;
	}
	
//	public void setTracos_personalidade(List<String> tracos_personalidade) {
//		this.tracos_personalidade.addAll(tracos_personalidade);
//	}
	
	public void setTracos_personalidade(String tracos_personalidade) {
		this.tracos_personalidade.add(tracos_personalidade);
	}
	
	public String getIdeal() {
		return ideal;
	}
	
	public void setIdeal(String ideal) {
		this.ideal = ideal;
	}
	
	public String getVinculo() {
		return vinculo;
	}
	
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	
	public String getDefeito() {
		return defeito;
	}
	
	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}
	
	public ArrayList<String> getTracosraciais(){
		return tracos_raciais;
	}
	
	public void setTracosraciais(String tracos_raciais) {
		this.tracos_raciais.add(tracos_raciais);
	}
	
	public ArrayList<String> getClassefeats(){
		return classe_feats;
	}
	
	public void setClassefeats(String classe_feats) {
		this.classe_feats.add(classe_feats);
	}
	
	public ArrayList<String> getEquipamentos() {
		return equipamentos;
	}
	
	public void setEquipamentos(String equipamentos) {
		this.equipamentos.add(equipamentos);
	}
	
	public void setEquipamentos(List<String> equipamentos) {
		this.equipamentos.addAll(equipamentos);
	}
	
	public ArrayList<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas.add(idiomas);
	}
	
	public void setIdiomas(List<String> idiomas) {
		this.idiomas.addAll(idiomas);
	}
	
	public ArrayList<String> getProfi_ferramentas_peri() {
		return profi_ferramentas_peri;
	}
	
	public void setProfi_ferramentas_peri(String profi_ferramentas_peri) {
		this.profi_ferramentas_peri.add(profi_ferramentas_peri);
	}
	
	public void setProfi_ferramentas_peri(ArrayList<String> profi_ferramentas_peri) {
		this.profi_ferramentas_peri.addAll(profi_ferramentas_peri);
	}
	
	public ArrayList<String> getProfi_equips() {
		return profi_equips;
	}
	
	public void setProfi_equips(String profi_equips) {
		this.profi_equips.add(profi_equips);
	}
	
	public void setProfi_equips(List<String> profi_equips) {
		this.profi_equips.addAll(profi_equips);
	}
	
	public double getPeso_total() {
		return peso_total;
	}
	
	public void setPeso_total(double peso_total) {
		this.peso_total = peso_total;
	}
	
	public int getIdMagias() {
		return idMagias;
	}

	public void setIdMagias(int idMagias) {
		this.idMagias = idMagias;
	}
	
	public ArrayList<String> getTruques(){
		return truques;
	}
	
	public void setTruques(List<String> truques) {
		this.truques.addAll(truques);
	}
	
	public void setTruques(String truque) {
		this.truques.add(truque);
	}
	
	public ArrayList<String> getMagiasLV1(){
		return magiasLV1;
	}
	
	public void setMagiasLV1(List<String> magias) {
		this.magiasLV1.addAll(magias);
	}
	
	public void setMagiasLV1(String magia) {
		this.magiasLV1.add(magia);
	}
	
	public ArrayList<String> getMagiasLV2(){
		return magiasLV2;
	}
	
	public void setMagiasLV2(List<String> magias) {
		this.magiasLV2.addAll(magias);
	}
	
	public void setMagiasLV2(String magia) {
		this.magiasLV2.add(magia);
	}
	
	public ArrayList<String> getMagiasLV3(){
		return magiasLV3;
	}
	
	public void setMagiasLV3(List<String> magias) {
		this.magiasLV3.addAll(magias);
	}
	
	public void setMagiasLV3(String magia) {
		this.magiasLV3.add(magia);
	}
	
	public ArrayList<String> getMagiasLV4(){
		return magiasLV4;
	}
	
	public void setMagiasLV4(List<String> magias) {
		this.magiasLV4.addAll(magias);
	}
	
	public void setMagiasLV4(String magia) {
		this.magiasLV4.add(magia);
	}
	
	public ArrayList<String> getMagiasLV5(){
		return magiasLV5;
	}
	
	public void setMagiasLV5(List<String> magias) {
		this.magiasLV5.addAll(magias);
	}
	
	public void setMagiasLV5(String magia) {
		this.magiasLV5.add(magia);
	}
	
	public ArrayList<String> getMagiasLV6(){
		return magiasLV6;
	}
	
	public void setMagiasLV6(List<String> magias) {
		this.magiasLV6.addAll(magias);
	}
	
	public void setMagiasLV6(String magia) {
		this.magiasLV6.add(magia);
	}
	
	public ArrayList<String> getMagiasLV7(){
		return magiasLV7;
	}
	
	public void setMagiasLV7(List<String> magias) {
		this.magiasLV7.addAll(magias);
	}
	
	public void setMagiasLV7(String magia) {
		this.magiasLV7.add(magia);
	}
	
	public ArrayList<String> getMagiasLV8(){
		return magiasLV8;
	}
	
	public void setMagiasLV8(List<String> magias) {
		this.magiasLV8.addAll(magias);
	}
	
	public void setMagiasLV8(String magia) {
		this.magiasLV8.add(magia);
	}
	
	public ArrayList<String> getMagiasLV9(){
		return magiasLV9;
	}
	
	public void setMagiasLV9(List<String> magias) {
		this.magiasLV9.addAll(magias);
	}
	
	public void setMagiasLV9(String magia) {
		this.magiasLV9.add(magia);
	}
	
	public String getHabilidade_conjuracao() {
		return habilidade_conjuracao;
	}
	
	public void setHabilidade_conjuracao(String habilidade_conjuracao) {
		this.habilidade_conjuracao = habilidade_conjuracao;
	}
	
	public int getCd_resistencia_magia() {
		return cd_resistencia_magia;
	}
	
	public void setCd_resistencia_magia(int cd_resistencia_magia) {
		this.cd_resistencia_magia = cd_resistencia_magia;
	}
	
	public int getBonus_ataque_magia() {
		return bonus_ataque_magia;
	}
	
	public void setBonus_ataque_magia(int bonus_ataque_magia) {
		this.bonus_ataque_magia = bonus_ataque_magia;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getPeso() {
		return peso;
	}
	
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public String getOlhos() {
		return olhos;
	}
	
	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}
	
	public String getCabelo() {
		return Cabelo;
	}
	
	public void setCabelo(String cabelo) {
		this.Cabelo = cabelo;
	}
	
	public String getPele() {
		return pele;
	}
	
	public void setPele(String pele) {
		this.pele = pele;
	}
	
	public String getAparencia_personagem() {
		return aparencia_personagem;
	}
	
	public void setAparencia_personagem(String aparencia_personagem) {
		this.aparencia_personagem = aparencia_personagem;
	}
	
	public String getAliados_organizacoes() {
		return aliados_organizacoes;
	}
	
	public void setAliados_organizacoes(String aliados_organizacoes) {
		this.aliados_organizacoes = aliados_organizacoes;
	}
	
	public String getHistoria_personagem() {
		return historia_personagem;
	}
	
	public void setHistoria_personagem(String historia_personagem) {
		this.historia_personagem = historia_personagem;
	}
	
	public String getCaracteristicas_tracos_adicionais() {
		return caracteristicas_tracos_adicionais;
	}
	
	public void setCaracteristicas_tracos_adicionais(String caracteristicas_tracos_adicionais) {
		this.caracteristicas_tracos_adicionais = caracteristicas_tracos_adicionais;
	}
	
	public String getTesouro() {
		return tesouro;
	}
	
	public void setTesouro(String tesouro) {
		this.tesouro = tesouro;
	}

	public int getIdcaracteristica() {
		return idcaracteristica;
	}

	public void setIdcaracteristica(int idcaracteristica) {
		this.idcaracteristica = idcaracteristica;
	}
	
	public int getIdpericias() {
		return idpericias;
	}

	public void setIdpericias(int idpericias) {
		this.idpericias = idpericias;
	}

	public int getIdatributo() {
		return idatributo;
	}

	public void setIdatributo(int idatributo) {
		this.idatributo = idatributo;
	}

	public int getIdteste_resistencia() {
		return idteste_resistencia;
	}

	public void setIdteste_resistencia(int idteste_resistencia) {
		this.idteste_resistencia = idteste_resistencia;
	}

	public ArrayList<Integer> getIdprofi_ferramentas_peri() {
		return idprofi_ferramentas_peri;
	}

	public void setIdprofi_ferramentas_peri(ArrayList<Integer> idprofi_ferramentas_peri) {
		this.idprofi_ferramentas_peri = idprofi_ferramentas_peri;
	}

	public ArrayList<Integer> getIdequipamentos() {
		return idequipamentos;
	}

	public void setIdequipamentos(ArrayList<Integer> idequipamentos) {
		this.idequipamentos = idequipamentos;
	}

	public ArrayList<Integer> getIdidiomas() {
		return ididiomas;
	}

	public void setIdidiomas(ArrayList<Integer> ididiomas) {
		this.ididiomas = ididiomas;
	}

	public int getIdCteste() {
		return idCteste;
	}

	public void setIdCteste(int idCteste) {
		this.idCteste = idCteste;
	}

	public int getIdCpericia() {
		return idCpericia;
	}

	public void setIdCpericia(int idCpericia) {
		this.idCpericia = idCpericia;
	}

	public int getIdpersonagem() {
		return idpersonagem;
	}

	public void setIdpersonagem(int idpersonagem) {
		this.idpersonagem = idpersonagem;
	}

	public ArrayList<Integer> getIdtracos_personalidade() {
		return idtracos_personalidade;
	}

	public void setIdtracos_personalidade(ArrayList<Integer> idtracos_personalidade) {
		this.idtracos_personalidade = idtracos_personalidade;
	}

	public ArrayList<Integer> getIdtruques() {
		return idtruques;
	}

	public void setIdtruques(ArrayList<Integer> idtruques) {
		this.idtruques = idtruques;
	}

	public ArrayList<Integer> getIdmagiasLV1() {
		return idmagiasLV1;
	}

	public void setIdmagiasLV1(ArrayList<Integer> idmagiasLV1) {
		this.idmagiasLV1 = idmagiasLV1;
	}

	public ArrayList<Integer> getIdmagiasLV2() {
		return idmagiasLV2;
	}

	public void setIdmagiasLV2(ArrayList<Integer> idmagiaLV2) {
		this.idmagiasLV2 = idmagiaLV2;
	}

	public ArrayList<Integer> getIdmagiasLV3() {
		return idmagiasLV3;
	}

	public void setIdmagiasLV3(ArrayList<Integer> idmagiasLV3) {
		this.idmagiasLV3 = idmagiasLV3;
	}

	public ArrayList<Integer> getIdmagiasLV4() {
		return idmagiasLV4;
	}

	public void setIdmagiasLV4(ArrayList<Integer> idmagiasLV4) {
		this.idmagiasLV4 = idmagiasLV4;
	}

	public ArrayList<Integer> getIdmagiasLV5() {
		return idmagiasLV5;
	}

	public void setIdmagiasLV5(ArrayList<Integer> idmagiasLV5) {
		this.idmagiasLV5 = idmagiasLV5;
	}

	public ArrayList<Integer> getIdmagiasLV6() {
		return idmagiasLV6;
	}

	public void setIdmagiasLV6(ArrayList<Integer> idmagiasLV6) {
		this.idmagiasLV6 = idmagiasLV6;
	}

	public ArrayList<Integer> getIdmagiasLV7() {
		return idmagiasLV7;
	}

	public void setIdmagiasLV7(ArrayList<Integer> idmagiasLV7) {
		this.idmagiasLV7 = idmagiasLV7;
	}

	public ArrayList<Integer> getIdmagiasLV8() {
		return idmagiasLV8;
	}

	public void setIdmagiasLV8(ArrayList<Integer> idmagiasLV8) {
		this.idmagiasLV8 = idmagiasLV8;
	}

	public ArrayList<Integer> getIdmagiasLV9() {
		return idmagiasLV9;
	}

	public void setIdmagiasLV9(ArrayList<Integer> idmagiasLV9) {
		this.idmagiasLV9 = idmagiasLV9;
	}

	public ArrayList<Integer> getIdtracos_raciais() {
		return idtracos_raciais;
	}

	public void setIdtracos_raciais(ArrayList<Integer> idtracos_raciais) {
		this.idtracos_raciais = idtracos_raciais;
	}

	public ArrayList<Integer> getIdclasse_feats() {
		return idclasse_feats;
	}

	public void setIdclasse_feats(ArrayList<Integer> idclasse_feats) {
		this.idclasse_feats = idclasse_feats;
	}

	public ArrayList<Integer> getIdprofi_equips() {
		return idprofi_equips;
	}

	public void setIdprofi_equips(ArrayList<Integer> idprofi_equips) {
		this.idprofi_equips = idprofi_equips;
	}

	public int getIdatributos_modificadores() {
		return idatributos_modificadores;
	}

	public void setIdatributos_modificadores(int idatributos_modificadores) {
		this.idatributos_modificadores = idatributos_modificadores;
	}
	
}
