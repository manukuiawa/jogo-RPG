package jogorpg;

public class Arqueiro extends Personagem {

    protected String porteFisico;

    public Arqueiro(String nome, int idade, int nivel, String descricao, int forca, int vitalidade, int destreza, int poder, String habilidade, String descHabilidade, int poderHabilidade, String porteFisico) {
        super(nome, idade, nivel, descricao, forca, vitalidade, destreza, poder, habilidade, descHabilidade, poderHabilidade);
        this.porteFisico = porteFisico;
    }

    public String getPorteFisico() {
        return porteFisico;
    }

    public void setPorteFisico(String porteFisico) {
        this.porteFisico = porteFisico;
    }
}
