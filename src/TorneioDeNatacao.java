public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Gabriel";
        int idade = 17;
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
