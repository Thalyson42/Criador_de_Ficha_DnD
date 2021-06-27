package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Criminoso extends Classes{

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
	
	public void setCriminoso() {
		getFicha().setAntecedente("Criminoso");
		List<String> profPericias = Arrays.asList("Engana��o", "Furtividade");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogo");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladr�o");
		List<String> equipamentos = Arrays.asList("P� de cabra", "Conjunto de roupas escuras comuns com capuz", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoCriminoso() {
		return tracoCriminoso;
	}

	public List<String> getIdealCriminoso() {
		return idealCriminoso;
	}

	public List<String> getVinculoCriminoso() {
		return vinculoCriminoso;
	}

	public List<String> getDefeitoCriminoso() {
		return defeitoCriminoso;
	}
	
}
