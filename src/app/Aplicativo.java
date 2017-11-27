package app;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Telefone;

public class Aplicativo {
	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		Telefone tel = new Telefone();
		Scanner scan = new Scanner(System.in);
		
		Cliente cli2 = new Cliente();
		
		System.out.print("Informe o ID: ");
		cli.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o nome: ");
		cli.setNome(scan.nextLine());
		System.out.print("Informe a idade: ");
		cli.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do telefone: ");
		tel.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		tel.setNumero(scan.nextLine());
		
		cli.setTelefone(tel);
		
		System.out.println("O ID informado: " + cli.getId());
		System.out.println("A idade informado: " + cli.getIdade());
		System.out.println("O nome informado: " + cli.getNome());
		System.out.println("O número informado: " + cli.getTelefone().getNumero());
		
		// CLIENTE 2
		
		System.out.print("Informe o ID: ");
		cli2.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o nome: ");
		cli2.setNome(scan.nextLine());
		System.out.print("Informe a idade: ");
		cli2.setIdade(Integer.parseInt(scan.nextLine()));
		
		cli2.setTelefone(new Telefone());
		
		System.out.print("Informe o ID do telefone: ");
		cli2.getTelefone().setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		cli2.getTelefone().setNumero(scan.nextLine());
		
		scan.close();
		
		System.out.println("O ID informado: " + cli2.getId());
		System.out.println("A idade informado: " + cli2.getIdade());
		System.out.println("O nome informado: " + cli2.getNome());
		System.out.println("O número informado: " + cli.getTelefone().getNumero());
	}
}
