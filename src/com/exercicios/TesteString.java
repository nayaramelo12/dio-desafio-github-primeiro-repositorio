package com.exercicios;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A B C D E F G".toCharArray()); //Converte uma string em um array de char
		
		var texto = "Aula de Java";
		System.out.println(texto.split("\\s")); //Separa o texto em linhas de acordo com uma regra; devolve um array de String (??)
		System.out.println("Aula".concat(" de Java ")); //Faz a concatenação 
		String exemplo = "1234 asda qw";
		System.out.println(exemplo.replaceAll("[0-9]", "#")); // Substitui os caracteres selecionados por outros
		
		//Exemplo de toCharArray()
		/*String str = new String("Welcome to BeginnersBook.com");
			char[] array= str.toCharArray();
			System.out.print("Content of Array:");
			for(char c: array){
			    System.out.print(c);
			    }*/
			  
		
	}

}
