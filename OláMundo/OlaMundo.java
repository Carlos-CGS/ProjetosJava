public class OlaMundo{

    //Método principal
    public static void main(String [] args){
        System.out.print("Olá Mundo!");
    
        String primeiroNome = "Carlos";
        String segundoNome = "Garcia";
    
        //Abaixo o primeiro nomeCompleto é variavel, o segundo nomeCompleto da mesma linha 
        //é o Método sendo chamado, e dentro dos parenteses estão os parâmetros
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
    
        System.out.print(nomeCompleto);
    }
    
    //Método nomeCompleto
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Seu nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
    }