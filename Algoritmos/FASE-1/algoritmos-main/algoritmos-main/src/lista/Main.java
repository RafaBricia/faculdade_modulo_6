package lista;

import javax.swing.JOptionPane;

public class Main {
	static ListaEncadeada<Livro> lista = new ListaEncadeada<>();

	public static void main(String[] args) {

		Livro testeLivro = new Livro("Coraline", "Neil Gaiman", 2002);
		lista.addLast(testeLivro);

		Livro testeLivro2 = new Livro("O Sol É Para Todos", "Harper Lee", 1960);
		lista.addLast(testeLivro2);

		Livro testeLivro3 = new Livro("É Assim que Acaba", "Colleen Hoover", 2016);
		lista.addLast(testeLivro3);

		String opcao = "1";

		while (!opcao.equals("6")) {
			opcao = JOptionPane.showInputDialog(null, lista.menu(), "Livraria Deus é bom", 1);

			if (opcao == null) {
				opcao = "5";

			} else if (opcao.equals("1")) {
				adicionarLivro();

			} else if (opcao.equals("2")) {
				listarLivros();

			} else if (opcao.equals("3")) {
				pesquisarLivro();

			} else if (opcao.equals("4")) {
				removerLivro();

			} else if (opcao.equals("5")) {
				ordenarLivros();

			} else if (opcao.equals("6")) {
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!", "Livraria Deus é bom", 1);

			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!", "Livraria Deus é bom", 2);
			}
		}

	}

	private static void adicionarLivro() {
		String titulo = (JOptionPane.showInputDialog(null, "Digite o nome do livro", "Livraria Deus é bom", 1)).trim()
				.toLowerCase();
		if (titulo == null) {
			return;
		}

		String autor = (JOptionPane.showInputDialog(null, "Digite o autor do livro", "Livraria Deus é bom", 1)).trim()
				.toLowerCase();
		if (autor == null)
			return;

		String anoStr = JOptionPane.showInputDialog(null, "Digite o ano de publicação do livro", "Livraria Deus é bom",
				1);
		if (anoStr == null)
			return;

		boolean isNumeric = anoStr.chars().allMatch(Character::isDigit);
		if (anoStr.equals("") || !isNumeric) {
			JOptionPane.showMessageDialog(null, "Digite ano válido!", "Livraria Deus é bom", 2);
			return;
		}

		int ano = Integer.parseInt(anoStr);

		Livro novoLivro = new Livro(titulo, autor, ano);
		boolean livroExiste = false;
		for (Livro livro : lista) {
			if ((livro.getAutor().equalsIgnoreCase(autor)) && (livro.getAnoPublicacao() == ano)
					&& (livro.getTitulo().equalsIgnoreCase(titulo))) {
				livroExiste = true;
				break;
			}
		}
		if (livroExiste) {
			JOptionPane.showMessageDialog(null, "Esse livro já foi cadastrado anteriormente!", "Livraria Deus é bom",
					1);

		} else {
			lista.addLast(novoLivro);
			JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Livraria Deus é bom", 1);
		}

	}

	private static void listarLivros() {
		if (lista.getSize() > 0) {
			JOptionPane.showMessageDialog(null, lista.getAllElements());
		} else {
			JOptionPane.showMessageDialog(null, "Não há livros para listar", "Livraria Deus é bom", 1);
		}
	}

	private static void pesquisarLivro() {
		if (lista.getSize() > 0) {
			String pesquisar = JOptionPane.showInputDialog(null, "Digite o titulo do livro para pesquisar",
					"Livraria Deus é bom", 1);

			JOptionPane.showMessageDialog(null, lista.searchByName(pesquisar), "Livraria Deus é bom", 1);

		} else {
			JOptionPane.showMessageDialog(null, "Não há livros cadastrados!", "Livraria Deus é bom", 1);
		}
	}

	private static void removerLivro() {
		if (lista.getSize() > 0) {
			String removerStr = JOptionPane.showInputDialog(null,
					lista.getAllElements() + "\nDigite o índice do livro para remover", "Livraria Deus é bom", 1);
			if (removerStr == null)
				return;

			boolean isNumeric = removerStr.chars().allMatch(Character::isDigit);

			if (!removerStr.equals("") && isNumeric) {
				int remover = Integer.parseInt(removerStr);
				JOptionPane.showMessageDialog(null, lista.remove(remover), "Livraria Deus é bom", 1);

			} else {
				JOptionPane.showMessageDialog(null, "Digite um número!", "Livraria Deus é bom", 2);
			}
			return;
		}
		JOptionPane.showMessageDialog(null, "Não há livros cadastrados!", "Livraria Deus é bom", 1);
	}

	private static void ordenarLivros() {

		Object[] options = { "Título", "Ano de publicação" };

		int resposta = JOptionPane.showOptionDialog(null,
				"Escolha uma opção de ordenação:",
				"Botoes de ordenacao",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				options,
				options[0]);

		if (resposta == 0) {

			if (lista.getSize() > 1) {
				// falta add ordenação por titulo
				JOptionPane.showMessageDialog(null, "Livros ordenados com sucesso!", "Livraria Deus é bom", 1);
				listarLivros();
				return;
			}
			JOptionPane.showMessageDialog(null, "Não há livros suficientes para ordenar!", "Livraria Deus é bom", 1);
		} else if (resposta == 1) {
			if (lista.getSize() > 1) {
				lista.bubbleSort();
				JOptionPane.showMessageDialog(null, "Livros ordenados com sucesso!", "Livraria Deus é bom", 1);
				listarLivros();
				return;
			}
			JOptionPane.showMessageDialog(null, "Não há livros suficientes para ordenar!", "Livraria Deus é bom", 1);
		}
	}

}
