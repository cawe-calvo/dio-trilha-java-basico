public class TiposVariaveis {
    public static void main(String[] args) {
       double salarioMinimo = 2500; //Aqui, salarioMinimo é uma variável do tipo double, que permite armazenar números com casas decimais. No entanto, mesmo que o valor atribuído seja um número inteiro, ele é tratado como um double.

       short numeroCurto = 1;//O valor 1 é atribuído a numeroCurto, que é do tipo short (um tipo de dado que armazena inteiros de 16 bits). Em seguida, este valor é atribuído à variável numeroNormal, que é do tipo int (um tipo de dado que armazena inteiros de 32 bits). Esta conversão é feita automaticamente porque um int pode conter qualquer valor que um short contenha.
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal;//Aqui, o valor da variável numeroNormal (do tipo int) é convertido para short. Este tipo de conversão requer casting explícito porque um int pode armazenar valores maiores do que um short pode conter. Se o valor de numeroNormal for maior do que o valor máximo que um short pode conter, ocorrerá perda de dados.
    }
}
