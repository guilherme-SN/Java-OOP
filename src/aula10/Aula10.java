package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Guilherme", 18, 'M');
        Aluno p2 = new Aluno("Pedro", 19, 'M');
        Professor p3 = new Professor("Maria", 22, 'F');
        Funcionario p4 = new Funcionario("Carlos", 35, 'M');

        p3.setSalario(1500f);
        p3.setEspecialidade("Matemática");
        System.out.println(p3.getSalario());
        p3.receberAumento(400.65f);
        System.out.println(p3.getNome());
        System.out.println(p3.getSalario());
        System.out.println(p3.getEspecialidade());

    }
}
