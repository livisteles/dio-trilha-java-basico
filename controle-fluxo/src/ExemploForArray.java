public class ExemploForArray {
    public static void main(String[] args) {
        // em arrays o indeci inicia em Zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /*
         * for (int x = 0; x < alunos.length; x++){
         * System.out.println("O aluno no indeci x = " + x + " é " + alunos[x]);
         * }
         */

        //forma abreviada
         for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
         }
    }
}
