public class Funcionario {
    
    private String nome;   
    private String cpf;       
    private String cargo;     
    private double salario;   
    private boolean ativo;  

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;  
    }
    public Funcionario() {
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.cargo = "Indefinido";
        this.salario = 0.0;
        this.ativo = false;  
    }
    public void alterarDados(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        
    }
    public void aplicarReajuste(double percentual) {
        if (this.ativo) {
            // Converte % para valor decimal: 15% = 0.15
            this.salario += this.salario * (percentual / 100.0);
        } else {
            System.out.println("Funcionário inativo! Não pode receber reajuste.");
        }
    }
    public void demitir() {
        if (this.ativo) {
            this.ativo = false;
            System.out.println("Funcionário " + this.nome + " foi demitido.");
        } else {
            System.out.println("Funcionário já está inativo.");
        }
    }
    public void exibirDados() {
        System.out.println("=== DADOS DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
        System.out.println("Status: " + (this.ativo ? "ATIVO" : "INATIVO"));
        System.out.println("=============================");
    }
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean isAtivo() {
        return this.ativo;
    }
}
