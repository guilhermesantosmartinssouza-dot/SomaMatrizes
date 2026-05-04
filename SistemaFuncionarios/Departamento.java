public class Departamento {

    private String nomeDepartamento; 
    private Funcionario[] funcionarios; 
    private int contador;  

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new Funcionario[5];  
        this.contador = 0;
    }
    public void adicionarFuncionario(Funcionario f) {
        if (contador < 5) {
         this.funcionarios[contador] = f;
         contador++;
         System.out.println("Funcionário " + f.getNome() + " adicionado ao departamento.");
        } else {
          System.out.println("LIMITE MÁXIMO ATINGIDO! Departamento cheio.");
        }
    }
    public void listarFuncionarios() {
        System.out.println("\nFUNCIONÁRIOS - " + this.nomeDepartamento + " ===");
        for (int i = 0; i < contador; i++) {
        System.out.println("\nFuncionário " + (i + 1) + ":");
        this.funcionarios[i].exibirDados();
        }
        System.out.println("Total de funcionários: " + contador);
        System.out.println("==============================\n");
    }
    public double calcularFolhaSalarial() {
        double total = 0.0;
        for (int i = 0; i < contador; i++) {
            if (this.funcionarios[i].isAtivo()) {  
                total += this.funcionarios[i].getSalario();
            }
        }
        return total;
    }
    public String getNomeDepartamento() {
        return this.nomeDepartamento;
    }
}
