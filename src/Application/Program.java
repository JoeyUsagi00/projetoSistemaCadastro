package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Digite quantos pessoas serão registradas");
		Integer n = sc.nextInt();

		List<Cadastro> list = new ArrayList<>(n /* <<< TAMANHO DA LISTA */ );

		
		for(int i=1; i<= n; i++) {
			
			
			
			System.out.println("Entre com os valores: ");

			System.out.println("Digite o nome: " + "#" + (i));
			String name = sc.next();
			
			

			System.out.println("Digite a idade: ");
			Integer idade = sc.nextInt();

			System.out.println("Digite o CPF: ");
			Double cpf = sc.nextDouble();

			System.out.println();

			Cadastro cad = new Cadastro(name, idade, cpf);
			list.add(cad);

			
		}
//			for (Cadastro lista : list) {
				System.out.print(list);
//			}

	}

}
