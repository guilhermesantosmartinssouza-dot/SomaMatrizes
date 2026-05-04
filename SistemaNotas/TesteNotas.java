import java.util.Scanner;
public class TesteNotas {
    public static void main(String[] args) {
        
        GerenciadorTurma turma = new GerenciadorTurma("3o Ano A");

        Aluno a1 = new Aluno("Lucas", "2024001");
        Aluno a2 = new Aluno("Fernando ", "2024002");
        Aluno a3 = new Aluno(); 
        a3.lancarNotas(7.5, 6.0, 8.5);  
        a3.setNome("Henrique");  
        a3.setMatricula("2024003");

        turma.cadastrarAluno(a1);
        turma.cadastrarAluno(a2);
        turma.cadastrarAluno(a3);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n MENU SISTEMA DE NOTAS ");
            System.out.println("1 - Emitir boletins");
            System.out.println("2 - Mostrar aprovados");
            System.out.println("3 - Mostrar maior média");
            System.out.println("4 - Lançar notas (por índice)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    turma.emitirBoletins();
                    break;
                case 2:
                    System.out.println("Alunos aprovados: " + turma.contarAprovados());
                    break;
                case 3:
                    turma.exibirMaiorMedia();
                    break;
                case 4:
                    System.out.print("Índice do aluno (1-3): ");
                    int indice = scanner.nextInt() - 1;
                    Aluno aluno = turma.getAluno(indice);
                    if (aluno != null) {
                        System.out.print("Nota 1: ");
                        double n1 = scanner.nextDouble();
                        System.out.print("Nota 2: ");
                        double n2 = scanner.nextDouble();
                        System.out.print("Nota 3: ");
                        double n3 = scanner.nextDouble();
                        aluno.lancarNotas(n1, n2, n3);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
