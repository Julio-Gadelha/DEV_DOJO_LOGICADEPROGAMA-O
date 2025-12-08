public class ReutilizandoVariveis {
    public static void main(String[]args){
        double salario = 4000.30;
        double porcentagem = 0.5;
        double salarioAtualizado =   salario * porcentagem;
        System.out.println("O valor do seu salario ja esta com a porcentagem " + salarioAtualizado);
        salarioAtualizado = salario * 0.15;
        System.out.println(" O valor de 15% e :" + salarioAtualizado );
        salarioAtualizado = salario * 0.05;
        System.out.println(" O valor de 5% e :" + salarioAtualizado );
    }

}
