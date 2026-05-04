
public class TesteSistema {
    public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia da Informação");
        System.out.println("Departamento criado: " + ti.getNomeDepartamento() + "\n");

       
        Funcionario f1 = new Funcionario("Roberto Carlos", "123.456.789-00", "Desenvolvedora", 5000.0);
        Funcionario f2 = new Funcionario("João Felipe", "987.654.321-00", "Analista", 4500.0);
        Funcionario f3 = new Funcionario("Maria Teixeira", "111.222.333-44", "Gerente", 8000.0);
        Funcionario f4 = new Funcionario(); 

        f4.alterarDados("Pedro Oliveira", "555.666.777-88", "Estagiário", 1200.0);

        
        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f2);
        ti.adicionarFuncionario(f3);
        ti.adicionarFuncionario(f4);

        f1.aplicarReajuste(15.0);

        f3.demitir();

        ti.listarFuncionarios();

        double folha = ti.calcularFolhaSalarial();
        System.out.println("FOLHA SALARIAL TOTAL (ATIVOS): R$ " + String.format("%.2f", folha));
    }
}
