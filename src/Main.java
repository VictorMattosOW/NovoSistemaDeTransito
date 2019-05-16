import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc = 0, num = 9, numC = 9;

		Metodos metodos = new Metodos();
		ClasseTransito[] transito = new ClasseTransito[2];
		ClasseVeiculos[] veiculo = new ClasseVeiculos[2];

		for (int i = 0; i < 2; i++) {
			transito[i] = new ClasseTransito();
		}

		for (int i = 0; i < 2; i++) {
			veiculo[i] = new ClasseVeiculos();
		}

		while (opc != 9) {

			opc = Integer
					.parseInt(JOptionPane.showInputDialog("1- Cadastro Estatisticas \n2- Consulta por tipo de veículo"
							+ "							\n3- Consulta por quantidade de acidentes \n4 - Consulta todos as cidades"
							+ "							\n5 - Consulta maior menor média de acidentes \n6- gravação dos arquivos gerados \n9- sair"));

			switch (opc) {

			case 1:
				transito = Metodos.fCadastra(transito);
				veiculo = Metodos.fCadastraV(veiculo);
				break;

			case 2:
				while (numC != 0) {
					numC = Integer.parseInt(
							JOptionPane.showInputDialog("[ Digite o tipo de pesquisa ] \n1- Carros \n2- Motocicletas"
									+ " \n3- Caminhão \n0- Sair"));
					Metodos.mostraVeiculos(transito, veiculo, numC);
				}
				break;

			case 3:
				while (num != 0) {
					num = Integer.parseInt(JOptionPane.showInputDialog(
							"[ Digite o tipo de pesquisa ] \n1- Cidades abaixo de 100 acidentes \n2- Cidades abaixo de 500 acidentes"
									+ " \n3- Cidades acima de 500 acidentes \n0- Sair"));
					Metodos.mostraAcidentes(transito, veiculo, num);
				}
				break;

			case 4:
				Metodos.pConsultaCidade(veiculo, transito);
				
			case 5:
				Metodos.pMaiorMenor(veiculo, transito);
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Você saiu do sistema");
				break;
			}

		}
	}

}
