package Academy.devDojo.estruturascondicionais;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = input.next();


        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrado")){
            System.out.println(nome +  " Usuário invalido");
        } else{
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
