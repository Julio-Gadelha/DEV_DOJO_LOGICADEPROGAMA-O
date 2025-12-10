package Academy.devDojo.estruturascondicionais.variaveis;

/// receba uma idade como entrada
//e for maior que 18 imprima "Adulto"
//Senão imprima "Ainda não e adulto"//


public class verificarIdade {
    public static void main() {
        int idade = 17;
        if (idade >= 18) {
            System.out.println("Você ja e adulto");
        } else {
            System.out.println("Você e adolescente");
        }
    }
}