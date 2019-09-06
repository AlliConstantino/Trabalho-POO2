import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Jogo extends Roleta {
     Roleta r = new Roleta(nome);//cria nova roleta
    
    public static void main(String[] args){
    int n = 0;
    ArrayList<String> jogadores = new ArrayList();
   //Jogador[] jogadores = new Jogador[n];
   Scanner sc = new Scanner(System.in);
      
        
        
      System.out.println("Bem vindo a Roleta.Deseja jogar Roleta EuropÃ©ia,Francesa ou Americana?");
      
      ArrayList<String> opcoes = new ArrayList();//criacao do array de opcoes que serao usados como opcoes do menu
       opcoes.add("Europeia"); 
       opcoes.add("Americana");
       opcoes.add("Francesa");
       
       if(sc.next() == "Europeia"){
          r.nome = "Europeia";
         System.out.println("==================================================");
         System.out.println("|       1. Apostar em vermelho                   |");
         System.out.println("|       2. Apostar em preto                      |");
         System.out.println("|       3. Apostar em numero                     |");
         System.out.println("|       4. Apostar 1st 12                        |");
         System.out.println("|       5. Apostar 2nd 12                        |");
         System.out.println("|       6. Apostar 3rd 12                        |");
         System.out.println("|       7. Apostar 1 a 18                        |");
         System.out.println("|       8. Apostar 19 a 36                       |");
         System.out.println("|       9. Apostar em 0                          |");
         System.out.println("|       10. Apostar 3rd 12                       |");
         System.out.println("|  * Digite o nÃºmero da opÃ§ao desejada *         |");
         System.out.println(" =================================================");
       }else if(sc.next() == "Francesa"){
          r.nome = "Francesa";
         System.out.println(" =================================================");
         System.out.println("|       1. Apostar em vermelho                   |");
         System.out.println("|       2. Apostar em preto                      |");
         System.out.println("|       3. Apostar em numero                     |");
         System.out.println("|       4. Apostar 1st 12                        |");
         System.out.println("|       5. Apostar 2nd 12                        |");
         System.out.println("|       6. Apostar 3rd 12                        |");
         System.out.println("|       7. Apostar 1 a 18                        |");
         System.out.println("|       8. Apostar 19 a 36                       |");
         System.out.println("|       9. Apostar em 0                          |");
         System.out.println("|       10. Apostar 00                           |");
         System.out.println("|       11. Nao apostar                          |");
         System.out.println("|       * Digite o numero da opcao desejada *      |");

       }else{
          r.nome = "Americana";
         System.out.println("==================================================");
         System.out.println("|       1. Apostar em vermelho                   |");
         System.out.println("|       2. Apostar em preto                      |");
         System.out.println("|       3. Apostar em numero                     |");
         System.out.println("|       4. Apostar 1st 12                        |");
         System.out.println("|       5. Apostar 2nd 12                        |");
         System.out.println("|       6. Apostar 3rd 12                        |");
         System.out.println("|       7. Apostar 1 a 18                        |");
         System.out.println("|       8. Apostar 19 a 36                       |");
         System.out.println("|       9. Apostar em 0                          |");
         System.out.println("|       10. Apostar em 5 (0,00,1,2,3)            |");
         System.out.println("|       11. Nao apostar                          |");
         System.out.println("|       * Digite o numero da opcao desejada *    |");
         System.out.println("==================================================");
       }//fim do else
       
       System.out.println("");
    }
    
    
   
   public Jogo(){
      //System.out.println("Bem vindo a Roleta.Deseja jogar Roleta EuropÃ©ia,Francesa ou Americana?");
       // String[] opcoes = new String[3]{"Europeia", "Francesa","Americana"};
       
   }//fim metodo contrutor
  
}//fim classe
