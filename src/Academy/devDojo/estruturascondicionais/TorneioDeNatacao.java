package Academy.devDojo.estruturascondicionais;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite sua idade : ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " Participara do torneio de categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participara da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participara da categoria Prè-dulto");
        } else if (idade >= 20) {
            System.out.println(nome + " Participara da categorai adulto");
        }
    }
}
