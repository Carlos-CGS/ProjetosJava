import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroDigitado = leitor.nextInt();
        
        if (numeroDigitado % 2 == 0){
          System.out.println("O numero " numeroDigitado " é par.");
        }else{
            System.out.println("O numero " numeroDigitado " é impar.");
        }
        
    }
}