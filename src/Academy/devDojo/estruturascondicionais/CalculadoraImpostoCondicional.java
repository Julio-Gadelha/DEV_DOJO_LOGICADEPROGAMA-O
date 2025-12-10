package Academy.devDojo.estruturascondicionais;

public class CalculadoraImpostoCondicional {
    public static void main(String[] args) {
        float salario = 7000.00F;
        if (salario > 4500) {
            float trintaPorcento = salario * 0.3F;
            System.out.println("O seu salario e : " + trintaPorcento);
        } else if (salario < 4500) {
            float quinzePorcento = salario * 0.15F;
            System.out.println("O seu salario com 15% ficou " + quinzePorcento);
        }

    }
}


