package dominio;

public class Pessoa {
	public int id;
	public String nome;
	public float mensalidade;
	public boolean bolsista;
	
	public Pessoa(){
		this.nome = "donald";
	}
	
	public Pessoa(String nome, int id, float mensalidade, boolean bolsista){
		this(nome, id);
		this.mensalidade = mensalidade;
		this.bolsista = bolsista;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, float mensalidade) {
		this(nome);
		this.mensalidade = mensalidade;
	}

	public void imprimir() {
		System.out.println(toString());	
	}
	
	public String verificaBolsista() {
		return this.bolsista ? "bolsista" : "pagante";
	}
	
	public float calculaPagamento() {
		return this.bolsista ? this.mensalidade / 2 : this.mensalidade;
	}
	
	
	@Override
	public String toString() {
		String situacao = verificaBolsista();
		Float desconto = calculaPagamento();
		return String.format("%s | %.2f | %s | %.2f | %s", nome, mensalidade, situacao, desconto, id);
	}
	
	
	
	
}