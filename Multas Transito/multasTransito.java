import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        if (velocidade > 80 ){
          multas ++;
        }
        
        if (multas >= 3){
          System.out.println(multas + " multas. Perderá pontos na CNH");
        }else{
          System.out.println(multas + " multas. Receberá uma adverência via e-mail.");
        }
    }
}