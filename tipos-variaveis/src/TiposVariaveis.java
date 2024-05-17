public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        // tem que terminar com um L pra que o java intenda que é do tipo long e não do
        // tipo int
        float pi = 3.14F; // o tipo float tem que pôr um F no final (nato faz maiúsculo ou minúsculo)
        double salario = 1411.99;
    }
}
