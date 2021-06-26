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
	}
	
}
