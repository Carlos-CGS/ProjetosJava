// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class IdadePlanetaria {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
double idadeTerrestre = scanner.nextDouble();
String planeta = scanner.next();

switch (planeta) {

  case "Marte":
    idadeTerrestre = idadeTerrestre / 1.88;
    System.out.printf("Idade equivalente em Marte: %.2f anos ", idadeTerrestre);
    break;

  case "Venus":
    idadeTerrestre = idadeTerrestre / 0.62;
    System.out.printf("Idade equivalente em Venus: %.2f anos ", idadeTerrestre);
    break;

  case "Jupiter":
    idadeTerrestre = idadeTerrestre / 11.86;
    System.out.printf("Idade equivalente em Jupiter: %.2f anos ", idadeTerrestre);
    break;

  default:
    System.out.println("Planeta invalido.");

  }

  scanner.close();

 }

}