public class Aluno {
    
    private String nome;    
    private String matricula;
    private double nota1, nota2, nota3;  

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public Aluno() {
        this.nome = "Sem Nome";
        this.matricula = "000";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    
    public void lancarNotas(double n1, double n2, double n3) {
        if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10 && n3 >= 0 && n3 <= 10) {
            this.nota1 = n1;
            this.nota2 = n2;
            this.nota3 = n3;
            System.out.println("Notas lançadas para " + this.nome);
        } else {
            System.out.println("ERRO: Notas devem estar entre 0 e 10!");
        }
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return "APROVADO";
        } else if (media >= 4.0) {
            return "RECUPERAÇÃO";
        } else {
            return "REPROVADO";
        }
    }

    public void exibirBoletim() {
        System.out.println("\n=== BOLETIM ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota 1: " + String.format("%.1f", this.nota1));
        System.out.println("Nota 2: " + String.format("%.1f", this.nota2));
        System.out.println("Nota 3: " + String.format("%.1f", this.nota3));
        System.out.println("Média: " + String.format("%.1f", calcularMedia()));
        System.out.println("Situação: " + verificarSituacao());
        System.out.println("==============\n");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

