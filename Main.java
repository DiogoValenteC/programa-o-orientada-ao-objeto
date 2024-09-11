import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Tarefa {

    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor 1
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    // Construtor 2
    public Tarefa(String titulo, String prazo) {
        this.titulo = titulo;
        this.prazo = prazo;
        this.descricao = "";
        this.prioridade = 0;
    }

    // Métodos getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getPrazo() {
        return this.prazo;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Método para exibir detalhes da tarefa
    public void exibirDetalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Prazo: " + this.getPrazo());
        System.out.println("Prioridade: " + this.getPrioridade());
    }

    //Método para calcular dias restantes
    public long calcularDiasRestantes () {
        LocalDate dataPrazo = LocalDate.parse
        (this.prazo);
        LocalDate hoje = LocalDate.now() ;

        return ChronoUnit.DAYS.between(hoje, dataPrazo);

    }
}

public class Main {

    public static void main(String[] args) {
        // Criando primeira tarefa
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar conceitos de classes e objetos", "24-09-05", 4);
        tarefa1.exibirDetalhes();

        // Criando segunda tarefa com o segundo construtor
        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-12-15");
        tarefa2.exibirDetalhes();

        System.out.println("Dias restantes para a tarefa 1: " + tarefa2.calcularDiasRestantes());   
     }
}
