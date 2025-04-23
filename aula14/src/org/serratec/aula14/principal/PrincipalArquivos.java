package org.serratec.aula14.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.serratec.aula14.modelos.Produto;

public class PrincipalArquivos {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		Path path = Paths.get(".\\src\\teste.csv");
				
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String linha = reader.readLine(); //ignora o cabeçalho
			
			while ((linha = reader.readLine()) != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				double valor = Double.parseDouble(campos[1]);
				produtos.add(new Produto(nome, valor));	
			}
			
			System.out.println("Produtos lidos do arquivo csv:");
			produtos.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
