package com.exercicios;

import java.util.stream.IntStream;

public class LacosDeRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(1,2,3,4,5).forEach(n->{
			System.out.println(n);
		});
		
		IntStream.range(0, 3).forEach(n -> {
			System.out.println("Número = "+n);
		});
	}

}
