package Atv1ExtraInterface;

public class ColaboradorMain {

	public static void main(String[] args) {
		IColaborador cordenador= new Cordenador("José", 40, 80);
		IColaborador professor= new Professor("Joao", 30, 120);
		IColaborador diretor= new Cordenador("Leonarod", 50, 60);
		System.out.println("Carga horária de "+cordenador.nome()+ " : "+ cordenador.cargaHoraria()+ " Salário : "+cordenador.obtemSalario());
		System.out.println("Carga horária de "+professor.nome()+ " : "+professor.cargaHoraria()+ " Salário : "+ professor.obtemSalario());
		System.out.println("Carga horária de "+diretor.nome()+ " : "+diretor.cargaHoraria()+ " Salário : "+ diretor.obtemSalario());
	}
}
