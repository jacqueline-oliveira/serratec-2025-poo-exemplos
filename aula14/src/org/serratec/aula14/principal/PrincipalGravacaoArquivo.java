package org.serratec.aula14.principal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.serratec.aula14.modelos.Produto;

public class PrincipalGravacaoArquivo {
	public static void main(String[] args) {
		List<Produto> lista = List.of(
				new Produto("Vinho", 35),
				new Produto("Café", 42),
				new Produto("Pão Artesano", 9));
		
		Path path = Paths.get("testeGravacao.csv");
		
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("nome,valor");
			
			for (Produto p : lista) {
				writer.newLine();
				writer.write(p.getNome() + "," + p.getValor());
			}
			
			System.out.println("Arquivo gerado com sucesso!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
