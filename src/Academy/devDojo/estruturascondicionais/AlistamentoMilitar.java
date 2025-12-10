package Academy.devDojo.estruturascondicionais;

import java.util.Scanner;

public class AlistamentoMilitar {
   public  static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite seu sexo : ");
       String name = input.next();
       System.out.println("Digite sua idade : ");
       int age = input.nextInt();

       if(name.equalsIgnoreCase("masculino")  && age >= 18 ){
           System.out.println("Alistamento obrigatório!");
       } else if(name.equalsIgnoreCase("masculino") && age <18){
           System.out.println("Alistamento não permitido pela sua idade!");
       } else if(name.equalsIgnoreCase("feminino") && age >= 18){
           System.out.println("Você quer servir o exercito brasileiro ? ");
       } else if (name.equalsIgnoreCase("feminino") && age <=18){
           System.out.println("Alistamento não permitido");
       }
    }
}
