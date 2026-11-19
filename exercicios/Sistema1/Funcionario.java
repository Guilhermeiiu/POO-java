
package Sistema1;

public class Funcionario extends Pessoa {
	String especialidade;
	int anosExperiencia;


    public Funcionario(String nome, String telefone, String especialidade, int anosExperiencia) {
        super(nome, telefone);
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
	public void imprimirDetalhado() {
		System.out.println("O nome da pessoa "+"cujo o id : "+id + " é: "+ nome+" com  o telefone : "+ telefone);
		System.out.println("\nEspecialidade "+especialidade+ " com "+anosExperiencia+ " anos de experiencia");
	}
}