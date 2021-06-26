package Races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import CriadorDeFicha.Classes;

public class MeioElfo extends Classes{

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
	}
	
}
