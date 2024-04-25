package tarefa12;

public class Exercicio06 {
    
    static int cortarVogais(String nome) {
        String[] vogais = {"A", "E", "I", "O", "U"};
        int cont = 0;
        
        for (int i = 0; i < nome.length(); i++) {
            String letra = String.valueOf(nome.charAt(i));
            for (String vogal : vogais) {
                if (letra.equalsIgnoreCase(vogal)) {
                    cont++;
                    break;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        // Contar Vogais: Escreva uma função que conte o número de vogais em uma string.
        String nome = "RAFAEL";
        
        int numVogais = cortarVogais(nome);
        System.out.println("O numero de vogais em " + nome +  " = " + numVogais);
    }

}
