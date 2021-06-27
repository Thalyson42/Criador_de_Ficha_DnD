package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Criminoso extends Classes{

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

	public String getCriminoso() {
		String descricao = "CRIMINOSO\r\n"
				+ "Você é um criminoso experiente com um histórico de\r\n"
				+ "contravenções. Você gastou um bom tempo entre outros\r\n"
				+ "criminosos e ainda mantém contato com eles e com o\r\n"
				+ "submundo do crime. Você está mais perto do que a\r\n"
				+ "maioria do submundo do assassinato, roubo e violência\r\n"
				+ "que prevalece no ventre da sociedade, e você sobreviveu\r\n"
				+ "até esse ponto desprezando a lei e os regulamentos da\r\n"
				+ "sociedade.\r\n"
				+ "Proficiência em Perícias: Enganação, Furtividade\r\n"
				+ "Proficiência em Ferramentas: Um tipo de kit de jogo,\r\n"
				+ "ferramentas de ladrão\r\n"
				+ "Equipamento: Um pé de cabra, um conjunto de roupas\r\n"
				+ "escuras comuns com capuz e uma algibeira contendo\r\n"
				+ "15 po";
		return descricao;
	}
	
	public void setCriminoso() {
		getFicha().setAntecedente("Criminoso");
		List<String> profPericias = Arrays.asList("Enganação", "Furtividade");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogo");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladrão");
		List<String> equipamentos = Arrays.asList("Pé de cabra", "Conjunto de roupas escuras comuns com capuz", "Algibeira 15po");
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
