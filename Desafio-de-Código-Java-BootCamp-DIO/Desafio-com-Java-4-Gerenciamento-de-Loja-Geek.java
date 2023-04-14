// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class LojaGeek {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double media = scanner.nextDouble();

    //TODO: Verifique a média lida e imprima a avaliação do funcionário.
    //Onde: "APR" é bom, "MED" é médio e "REP" é ruim.
    
    if(media < 5)
    {
      System.out.println("REP");  
    }
    else if(media >= 5 && media < 7)
    {
      System.out.println("MED");
    }
    else 
    {
      System.out.println("APR");
    }
  
    
  }
}