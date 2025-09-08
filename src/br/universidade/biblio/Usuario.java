package br.universidade.biblio;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Usuario {
	private String nome;
	private String matricula;
	private String curso;
	//private Livro[] listaDeEmprestimos;
	
	// Construtor
	public Usuario(String nome, String curso) {
		this.nome = nome;
		this.matricula = geradorMatricula();
		this.curso = curso;
		//this.listaDeEmprestimos = new Usuario[10]; //COMBINAR COM OUTRO GRUPO QUANTOS EMPRESTIMOS UM USR PODE FAZER (Default: 10)
	}

	private String geradorMatricula() {
        LocalDateTime agora = LocalDateTime.now();

		//formata o anos, mês, dia e hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMddHH");
        String dataFormatada = formatter.format(agora);

        Random random = new Random();
        int numeroAleatorio = 1000 + random.nextInt(9000);

		//concatena a data formatada com o número aleatório
        return dataFormatada + numeroAleatorio;
    }

	//Setters
	public void setNome(String nome){
		this.nome = nome; 
	}
	public void setCurso(String curso){
		this.curso = curso;
	}
	/*public void setMatricula(){
		this.matricula = geradorMatricula();
	}
	*/
	
	//Getters
	public String getNome(){
		return this.nome;
	}

	public String getCurso(){
		return this.curso;
	}

	public String getMatricula(){
		return this.matricula;
	}

	/*public Usuario[] getEmprestimos(){
		return this.listaDeEmprestimos;
	}*/
}
