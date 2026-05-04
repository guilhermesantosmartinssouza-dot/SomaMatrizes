public class GerenciadorTurma {
    
    private String nomeTurma; 
    private Aluno[] alunos;    
    private int contador;     

    
    public GerenciadorTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new Aluno[4];
        this.contador = 0;
    }

    public void cadastrarAluno(Aluno a) {
        if (contador < 4) {
            this.alunos[contador] = a;
            contador++;
            System.out.println("Aluno " + a.getNome() + " cadastrado na turma.");
        } else {
            System.out.println("Turma cheia! Máximo 4 alunos.");
        }
    }

    public void emitirBoletins() {
        System.out.println("\n=== BOLETINS DA TURMA " + this.getNomeTurma() + " ===\n");
        for (int i = 0; i < contador; i++) {
            System.out.println("ALUNO " + (i + 1) + ":");
            this.alunos[i].exibirBoletim();
        }
    }

    public int contarAprovados() {
        int aprovados = 0;
        for (int i = 0; i < contador; i++) {
            if (this.alunos[i].verificarSituacao().equals("APROVADO")) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public void exibirMaiorMedia() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        int indiceMaior = 0;
        double maiorMedia = this.alunos[0].calcularMedia();

        for (int i = 1; i < contador; i++) {
            double mediaAtual = this.alunos[i].calcularMedia();
            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                indiceMaior = i;
            }
        }

        System.out.println("Maior média: " + String.format("%.1f", maiorMedia));
        System.out.println("Aluno: " + this.alunos[indiceMaior].getNome());
    }

    public String getNomeTurma() {
        return this.nomeTurma;
    }

    
    public Aluno getAluno(int indice) {
        if (indice >= 0 && indice < contador) {
            return this.alunos[indice];
        }
        return null;
    }
}
