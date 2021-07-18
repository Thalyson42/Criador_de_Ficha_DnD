package Classes;

import CriadorDeFicha.Classes;

public interface ChosingClass {

	Barbaro barbaro = new Barbaro();
	Bardo bardo = new Bardo();
	Bruxo bruxo = new Bruxo();
	Clerigo clerigo = new Clerigo();
	Druida druida = new Druida();
	Feiticeiro feiticeiro = new Feiticeiro();
	Guerreiro guerreiro = new Guerreiro();
	Ladino ladino = new Ladino();
	Mago mago = new Mago();
	Monge monge = new Monge();
	Paladino paladino = new Paladino();
	Patrulheiro patrulheiro = new Patrulheiro();
	
	static String getDescriptionClass(int i) {
		String txt;
		switch(i) {
		case 0:
			txt = (barbaro.barbaroDescricao()+"\n\n"+barbaro.barbaroCaracteristicasClasse()+"\n\n"+barbaro.barbaroTabela());
			return txt;
			
		case 1:
			txt = (bardo.bardoDescricao()+"\n\n"+bardo.bardoCaracteristicas());
			return txt;
		
		case 2:
			txt = (bruxo.bruxoDescricao()+"\n\n"+bruxo.bruxoCaracteristicas());
			return txt;
		
		case 3:
			txt = (clerigo.clerigoDescricao()+"\n\n"+clerigo.clerigoCaracteristicasClasse());
			return txt;
			
		case 4:
			txt = (druida.druidaDescricao()+"\n\n"+druida.CaracteristicasClasse());
			return txt;
			
		case 5:
			txt = (feiticeiro.feiticeiroDescricao()+"\n\n"+feiticeiro.caracteristicasClasse());
			return txt;
			
		case 6:
			txt = (guerreiro.guerreiroDescricao()+"\n\n"+guerreiro.guerreiroCaracteristicas());
			return txt;
			
		case 7:
			txt = (ladino.ladinoDescricao()+"\n\n"+ladino.ladinoCaracteristicas());
			return txt;
		
		case 8:
			txt = (mago.magoDescricao()+"\n\n"+mago.magoCaracteristicas());
			return txt;
			
		case 9:
			txt = (monge.mongeDescricao()+"\n\n"+monge.mongeCaracteristicas());
			return txt;
			
		case 10:
			txt = (paladino.paladinoDescricao()+"\n\n"+paladino.paladinoCaracteristicas());
			return txt;
			
		case 11:
			txt = (patrulheiro.patrulheiroDescricao()+"\n\n"+patrulheiro.patrulheiroCaracteristicas());
			return txt;
		}
		
		return null;
	}
	

	
//	static void salvaClasse(String classe) {
//		switch(classe) {
//		case "Barbaro":
//			for(int i = 0; i < checklist.length; i++) {
//				if (checklist[i].isSelected())
//					Classes.getProficiencia().aplicandoPericia(checklist[i].getText());
//			}
//			if(!comboBox_1.isEnabled()) {
//				ButtonModel b = buttonGroup.getSelection();
//				String t = b.getActionCommand();
//				Classes.getFicha().setEquipamentos(t);
//			}else {
//				Classes.getFicha().setEquipamentos(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
//			}
//			
//			if(!comboBox_2.isEnabled()) {
//				ButtonModel b = buttonGroup.getSelection();
//				String t = b.getActionCommand();
//				Classes.getFicha().setEquipamentos(t);
//			}else {
//				Classes.getFicha().setEquipamentos(comboBox_2.getItemAt(comboBox_2.getSelectedIndex()));
//			}
//			
//			barbaro.setBarbaro();
//		break;
//		
//		case "Bardo":
//			for(int i = 0; i < checklist.length; i++) {
//				if (checklist[i].isSelected())
//					Classes.getProficiencia().aplicandoPericia(checklist[i].getText());
//			}
//			Classes.getFicha().setEquipamentos(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
//			Classes.getFicha().setEquipamentos(comboBox_2.getItemAt(comboBox_2.getSelectedIndex()));
//			Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(comboBox_3.getItemAt(comboBox_3.getSelectedIndex())));
//			
//			bardo.setBardo();
//		}
//	}
}
