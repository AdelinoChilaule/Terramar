
public class Usuario {
	private String nome;
	private int senha;
	public Usuario(String nome, int cod) {
		this.nome=nome;
		this.senha=cod;
	}
	public Usuario() {
		this("",0);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return nome;
	}
	
	
}
