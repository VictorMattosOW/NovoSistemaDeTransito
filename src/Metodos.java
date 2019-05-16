import javax.swing.JOptionPane;

public class Metodos {

	static ClasseTransito[] fCadastra(ClasseTransito[] vetor) {
		int i;
		for (i = 0; i < 2; i++) {
			vetor[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da cidade : "));
			vetor[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade :");
		}
		return vetor;
	}

	static ClasseVeiculos[] fCadastraV(ClasseVeiculos[] v) {
		int i;
		for (i = 0; i < 2; i++) {
			v[i].Carro = (int) (Math.random() * 1000);
			v[i].Motocicleta = (int) (Math.random() * 1000);
			v[i].Caminhão = (int) (Math.random() * 1000);
		}
		return v;
	}

	static void mostraVeiculos(ClasseTransito[] v, ClasseVeiculos[] vetor, int num) {
		for (int i = 0; i < 2; i++) {

			if (num == 1) {
				JOptionPane.showMessageDialog(null,
						"A quantidade de acidentes por CARRO em " + v[i].nomeCidade + " é de :" + vetor[i].Carro);
			} else if (num == 2) {
				JOptionPane.showMessageDialog(null, "A quantidade de acidentes por MOTOCICLETA em " + v[i].nomeCidade
						+ " é de :" + vetor[i].Motocicleta);
			} else if (num == 3) {
				JOptionPane.showMessageDialog(null,
						"A quantidade de acidentes por CAMINHÃO em " + v[i].nomeCidade + " é de :" + vetor[i].Caminhão);
			}
		}
	}

	static void mostraAcidentes(ClasseTransito[] vetor, ClasseVeiculos[] v, int num) {
		int i, somaAcidentes = 0;
		for (i = 0; i < 2; i++) {
			if (num == 1) {
				if (v[i].Carro + v[i].Caminhão + v[i].Motocicleta < 100) {
					somaAcidentes = v[i].Carro + v[i].Caminhão + v[i].Motocicleta;
					JOptionPane.showMessageDialog(null, "A cidade " + vetor[i].nomeCidade
							+ " possui acidentes abaixo de 100. Um total de :" + somaAcidentes);
				} else {
					somaAcidentes = v[i].Carro + v[i].Caminhão + v[i].Motocicleta;
					JOptionPane.showMessageDialog(null, "A cidade " + vetor[i].nomeCidade
							+ " possui acidentes acima de 100. Um total de : " + somaAcidentes);
				}
			}

			if (num == 2) {
				if (v[i].Carro + v[i].Caminhão + v[i].Motocicleta < 500) {
					somaAcidentes = v[i].Carro + v[i].Caminhão + v[i].Motocicleta;
					JOptionPane.showMessageDialog(null, "A cidade " + vetor[i].nomeCidade
							+ " possui acidentes abaixo de 500. Um total de :" + somaAcidentes);
				} else {
					somaAcidentes = v[i].Carro + v[i].Caminhão + v[i].Motocicleta;
					JOptionPane.showMessageDialog(null, "A cidade " + vetor[i].nomeCidade
							+ " possui acidentes acima de 500. Um total de : " + somaAcidentes);
				}

			}

			if (num == 3) {
				if (v[i].Carro + v[i].Caminhão + v[i].Motocicleta > 500) {
					somaAcidentes = v[i].Carro + v[i].Caminhão + v[i].Motocicleta;
					JOptionPane.showMessageDialog(null, "A cidade " + vetor[i].nomeCidade
							+ " possui acidentes acima de 500. Um total de :" + somaAcidentes);
				}
			}
		}
	}

	static void pConsultaCidade(ClasseVeiculos[] v, ClasseTransito[] vetor) {
		int i;
		for (i = 0; i < 2; i++) {
			JOptionPane.showMessageDialog(null,
					"[Codigo da Cidade]: " + vetor[i].codigoCidade + "\n" + "[Nome da Cidade]: " + vetor[i].nomeCidade
							+ "\n" + "[Carro]: " + v[i].Carro + "\n" + "[Motocicleta]: " + v[i].Motocicleta + "\n"
							+ "[Caminhão]: " + v[i].Caminhão);
		}
	}

	static void pMaiorMenor(ClasseVeiculos[] v, ClasseTransito[] vetor) {
		int i, maior = 0, menor = 0, somaAcidentes = 0, somaMedia = 0;
		double media = 0.0;
		int vet[] = new int[2];
		for (i = 0; i < 2; i++) {
			somaAcidentes += v[i].Caminhão + v[i].Carro + v[i].Motocicleta;
			if (i == 0) {
				maior = somaAcidentes;
				menor = somaAcidentes;
			} else if (somaAcidentes > maior) {
				maior = somaAcidentes;
			} else if (somaAcidentes < menor) {
				menor = somaAcidentes;
			}
			somaMedia += v[i].Caminhão + v[i].Carro + v[i].Motocicleta;
		}
		JOptionPane.showMessageDialog(null,
				"O maior numero de acidentes é : " + maior + "\n" + "O menor numero de acidentes é :" + menor);
		media = somaMedia / 2;
		System.out.println(media);

		for (i = 0; i < 2; i++) {
			vet[i] = v[i].Caminhão + v[i].Carro + v[i].Motocicleta;
			if (vet[i] > media) {
				JOptionPane.showMessageDialog(null, "As cidades com numero de acidentes acima da media são : "
						+ vetor[i].nomeCidade + " com " + vet[i] + " acima da media");
			}

		}
	}
}