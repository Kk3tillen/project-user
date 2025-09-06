
package br.universidade.biblio;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Ana Silva", "Engenharia");
        Usuario u2 = new Usuario("Carlos Souza", "Direito");

        // Exibindo informações

        //descomente as linhas abaixo para testar os métodos criados
        
        System.out.println("Usuário 1:");
        //System.out.println("Nome: " + u1.getNome());
        //System.out.println("Curso: " + u1.getCurso());
        //System.out.println("Matrícula: " + u1.getMatricula());

        System.out.println("\nUsuário 2:");
        //System.out.println("Nome: " + u2.getNome());
        //System.out.println("Curso: " + u2.getCurso());
        //System.out.println("Matrícula: " + u2.getMatricula());
    }
}

