
package jogorpg;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
    
    private Scanner scan;
    private String nome;
    private int nivel;
    private String descricaoP;
    private int idade;
    private String habilidadesEspeciais;
    private int forca;
    private int vitalidade;
    private int destreza;
    private int poder;
    private int pontosDisponiveis;
    private Armas arma;
    private String desc_hab1;
    private int poderMinimo;
    private Habilidade desc_hab;
    private String nome_hab1;
    private int xp;
    private int pontosDeAtributo;
    private boolean atributosAlocados;
    private int xpParaProximoNivel = 1000; 
    private Habilidade Habilidade;


     public Personagem(String nome, int idade, int nivel, String descricaoP, int forca, int vitalidade, int destreza, int poder, String nome_hab1, String desc_hab1, int poderMinimo) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
        this.descricaoP = descricaoP;
        this.forca = forca;
        this.vitalidade = vitalidade;
        this.destreza = destreza;
        this.poder = poder;
        this.nome_hab1 = nome_hab1;
        this.desc_hab1 = desc_hab1;
        this.poderMinimo = poderMinimo;
        this.xp = 0;
        this.pontosDeAtributo = pontosDeAtributo;
        this.scan = new Scanner(System.in);
    }


     public Personagem() {
        this.pontosDeAtributo = 10;
        inicializarAtributos(); 
        this.scan = new Scanner(System.in);
    }


    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescricaoP() {
        return descricaoP;
    }

    public void setDescricaoP(String descricaoP) {
        this.descricaoP = descricaoP;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidadesEspeciais() {
        return habilidadesEspeciais;
    }

    public void setHabilidadesEspeciais(String habilidadesEspeciais) {
        this.habilidadesEspeciais = habilidadesEspeciais;
    }


    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPontosDisponiveis() {
        return pontosDisponiveis;
    }

    public void setPontosDisponiveis(int pontosDisponiveis) {
        this.pontosDisponiveis = pontosDisponiveis;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public String getDesc_hab1() {
        return desc_hab1;
    }

    public void setDesc_hab1(String desc_hab1) {
        this.desc_hab1 = desc_hab1;
    }

    public int getPoderMinimo() {
        return poderMinimo;
    }

    public void setPoderMinimo(int poderMinimo) {
        this.poderMinimo = poderMinimo;
    }

    public Habilidade getDesc_hab() {
        return desc_hab;
    }

    public void setDesc_hab(Habilidade desc_hab) {
        this.desc_hab = desc_hab;
    }

    public String getNome_hab1() {
        return nome_hab1;
    }

    public void setNome_hab1(String nome_hab1) {
        this.nome_hab1 = nome_hab1;
    }
    
    public void PreencheAtributos(Scanner scanner) {

        while (this.pontosDisponiveis > 0) {
            System.out.println("Você tem " + this.pontosDisponiveis + "pontos disponíveis para utilizar");

            System.out.println("Em qual atributo você deseja preencher\n"
                    + "1- Forca\n"
                    + "2- Vitalidade\n"
                    + "3- Destreza\n"
                    + "4- Poder");
            int resp = scan.nextInt();
            switch (resp) {
                case 1:
                    if (forca > 10) {
                        this.forca++;
                        this.pontosDisponiveis--;
                        System.out.println("Força aumentou em 1 ponto.\n"
                                + " Forca: " + this.forca);
                    } else {
                        System.out.println("Forca nao pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 2:
                    if (vitalidade > 10) {
                        this.vitalidade++;
                        this.pontosDisponiveis--;
                        System.out.println("Vitalidade aumentou em 1 ponto.\n"
                                + " Vitalidade: " + this.vitalidade);
                    } else {
                        System.out.println("Vitalidade nao pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 3:
                    if (destreza > 10) {
                        this.destreza++;
                        this.pontosDisponiveis--;
                        System.out.println("Destreza aumentou em 1 ponto.\n"
                                + " Destreza: " + this.destreza);
                    } else {
                        System.out.println("Destreza nao pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 4:
                    if (poder > 10) {
                        this.poder++;
                        this.pontosDisponiveis--;
                        System.out.println("Poder aumentou em 1 ponto.\n"
                                + " Poder: " + this.poder);
                    } else {
                        System.out.println("Poder nao pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;
                    
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nNível " + nivel + "\nDescrição do Personagem: " + descricaoP + 
                "\nForça: " + forca + "\nVitalidade: " + vitalidade + "\nDestreza: " + destreza + "\nPoder: " + poder + "\nHabilidade: " + nome_hab1 +
                "\nDescrição da Habilidade: " + desc_hab1 + "\nPoder Mínimo da Habilidade: " + poderMinimo; 
    }

    void setArmaPrimaria(Armas novaArmas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        private void inicializarAtributos() {
        forca = 1;
        destreza = 1;
        poder = 1;
        vitalidade = 1;
        pontosDeAtributo -= 4;
    }

    public void subirDeNivel() {
        int xpParaProximoNivel = calcularXPParaProximoNivel();
        if (xp >= xpParaProximoNivel) {
            nivel++;
            xp -= xpParaProximoNivel;
            pontosDeAtributo++;
            System.out.println(nome + " subiu para o nível " + nivel + "!");
        }
    }

    
    public void PreencheAtributos() {
        while (this.pontosDisponiveis > 0) {
            System.out.println("Você tem " + this.pontosDisponiveis + " pontos disponíveis para utilizar");

            System.out.println("Em qual atributo você deseja preencher\n" + "1- Forca\n" + "2- Vitalidade\n" + "3- Destreza\n"
                    + "4- Poder");
            int resp = scan.nextInt();
            switch (resp) {
                case 1:
                    if (forca < 10) {
                        this.forca++;
                        this.pontosDisponiveis--;
                        System.out.println("Força aumentou em 1 ponto.\n" + " Forca: " + this.forca);
                    } else {
                        System.out.println("Força não pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 2:
                    if (vitalidade < 10) {
                        this.vitalidade++;
                        this.pontosDisponiveis--;
                        System.out.println("Vitalidade aumentou em 1 ponto.\n" + " Vitalidade: " + this.vitalidade);
                    } else {
                        System.out.println("Vitalidade não pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 3:
                    if (destreza < 10) {
                        this.destreza++;
                        this.pontosDisponiveis--;
                        System.out.println("Destreza aumentou em 1 ponto.\n" + " Destreza: " + this.destreza);
                    } else {
                        System.out.println("Destreza não pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                case 4:
                    if (poder < 10) {
                        this.poder++;
                        this.pontosDisponiveis--;
                        System.out.println("Poder aumentou em 1 ponto.\n" + " Poder: " + this.poder);
                    } else {
                        System.out.println("Poder não pode receber mais pontos");
                        System.out.println("Escolha outro atributo;");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void ganharXP(int xp) {
        this.xp += xp;
        subirDeNivel();
    }

    public int getXP() {
        return xp;
    }

    private int calcularXPParaProximoNivel() {
        return 1000 + (nivel - 1) * 2000;
    }

    public boolean precisaSubirDeNivel() {
        return xp >= calcularXPParaProximoNivel();
    }

    public void batalhar() {
        Random r = new Random();
        int xpGanho = r.nextInt(100);
        System.out.println("\nSeu personagem atacou, ganhou: " + xpGanho + " nesse ataque!");
        this.xp += xpGanho;
        System.out.println("Seu xp atual é: " + xp);

        subirDeNivel();
    }

    public void Dano() {
        Random r = new Random();
        int xpLost = r.nextInt(100);
        System.out.println("\nSeu personagem sofreu um dano de: " + xpLost + " xp\n");
        this.xp -= xpLost;
        System.out.println("Seu xp atual é: " + xp);
    }
    
    public int calcularXPTotal() {
    int xpTotal = 0;
    for (int i = 1; i <= nivel; i++) {
        xpTotal += calcularXPParaProximoNivel();
    }
    return xpTotal;
}
 public void alocarPontosDeAtributo() {
    int pontosIniciais = 10; // Pontos iniciais disponíveis para alocação

    System.out.println("Antes da Batalha, aloque pontos iniciais para os atributos do personagem:");
    System.out.println("Você possui 10 pontos para alocar entre Força, Destreza, Poder e Vitalidade.");

    while (pontosIniciais > 0) {
        System.out.println("\nAlocar Pontos de Atributo (Pontos disponíveis: " + pontosIniciais + ")");
        System.out.println("1. Força: " + forca);
        System.out.println("2. Destreza: " + destreza);
        System.out.println("3. Poder: " + poder);
        System.out.println("4. Vitalidade: " + vitalidade);

        System.out.println("Escolha uma opção (1-4): ");
        int opcao = scan.nextInt();

        if (opcao >= 1 && opcao <= 4) {
            System.out.println("Quantos pontos deseja alocar para esta característica? (Máximo: " + pontosIniciais + ")");
            int pontosAlocar = scan.nextInt();

            if (pontosAlocar <= pontosIniciais && pontosAlocar > 0) {
                switch (opcao) {
                    case 1:
                        forca += pontosAlocar;
                        break;
                    case 2:
                        destreza += pontosAlocar;
                        break;
                    case 3:
                        poder += pontosAlocar;
                        break;
                    case 4:
                        vitalidade += pontosAlocar;
                        break;
                }
                pontosIniciais -= pontosAlocar;
                System.out.println("Alocados " + pontosAlocar + " pontos para o atributo escolhido.");
            } else {
                System.out.println("Número de pontos inválido!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }

    System.out.println("Alocação de pontos concluída. Atributos iniciais do personagem:");
    System.out.println("Força: " + forca);
    System.out.println("Destreza: " + destreza);
    System.out.println("Poder: " + poder);
    System.out.println("Vitalidade: " + vitalidade);
}

  public boolean isAtributosAlocados() {
        return atributosAlocados;
    }

    public void setAtributosAlocados(boolean atributosAlocados) {
        this.atributosAlocados = atributosAlocados;
    }
   
     public Habilidade HabilidadesArqueiros() {
        System.out.println("\nHabilidades disponíveis para Arqueiros;\n"
                + "1 - Tiro certeiro(4 pontos em forca);\n"
                + "2 - Velocidade(5 pontos em poder);\n"
                + "3 - Super Defesa (6 pontos em destreza);\n");
        System.out.println("Digite qual habilidade quer selecionar: ");
        int t = 0;
        t = scan.nextInt();
        Habilidade hab = new Habilidade("", "", 0);

        switch (t) {
            case 1:
                hab.setHab_especial("Tiro certeiro");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera causar maior dano em seu adversário");
                hab.setAtributo("forca");
                hab.setPoderHab(4);
                if (hab.getPoderHab() > this.forca) {
                    System.out.println("\nForca insuficiente para atribuir a habilidade\n");
                } else {
                    this.Habilidade = hab;
                }
                break;

            case 2:
                hab.setHab_especial("Velocidade");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera atirar flexas com mais velocidade;");
                hab.setAtributo("poder");
                hab.setPoderHab(5);
                if (hab.getAtributo().equalsIgnoreCase("poder")) {
                    if (hab.getPoderHab() > this.poder) {
                        System.out.println("\nPoder insuficiente para atribuir a habilidade\n");
                    } else {
                        this.Habilidade = hab;
                    }
                }
                break;

            case 3:
                hab.setHab_especial("Super Defesa");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera ter o seu dano reduzido quando for atacado");
                //hab.getAtributo().equalsIgnoreCase("destreza");
                hab.setAtributo("destreza");
                hab.setPoderHab(6);
                if (hab.getAtributo().equalsIgnoreCase("destreza")) {
                    if (hab.getPoderHab() > this.destreza) {
                        System.out.println("\nPoder insuficiente para atribuir a habilidade\n");
                    } else {
                        this.Habilidade = hab;
                    }
                }
                break;
        }
        Habilidade ha = hab;
        return ha;
    }

    public String imprimirTextoArqueiro() {
        System.out.println("\nParabens! Voce esta criando seu personagem, agora distribua seus pontos!\n"
                + "Voce tem que distribuit entre Forca, Destreza, Poder e Vitalidade;\n"
                + "Voce possui 1 ponto em cada caracteristica ja inseridos em seu personagem, restam 6 pontos para distribuir \n"
                + "Pressione 'Enter' para continuar");
        scan.nextLine();
        System.out.println("Habilidades disponíveis para Arqueiros;\n"
                + "1 - Tiro certeiro(4 pontos em forca);\n"
                + "2 - Velocidade(5 pontos em poder);\n"
                + "3 - Super Defesa (6 pontos em destreza);"
                + "\nPressione 'Enter' para continuar");
        scan.nextLine();
        System.out.println("Voce podera adicionar essas habilidades em breve, conforme os pontos inseridos, leia com atencao!\n"
                + "Pressione 'Enter' para continuar");
        return null;
    }

    
    public Habilidade HabilidadesMagos() {
        System.out.println("\nHabilidades disponíveis para magos:\n"
                + "1 - Encantamento(4 pontos em poder);\n"
                + "2 - Envenenamento(5 pontos em forca);\n"
                + "3 - Confundus(6 pontos em destreza);\n "
                + "4 - Protego(6 pontos em vitalidade);\n");
        int t = 0;
        System.out.println("Digite qual habilidade quer selecionar: ");
        t = scan.nextInt();

        Habilidade hab = new Habilidade("", "", 0);

        switch (t) {
            case 1:
                hab.setHab_especial("Encantamento");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera causar maior dano em seu adverssario");
                hab.setAtributo("poder");
                hab.setPoderHab(4);
                if (hab.getAtributo().equalsIgnoreCase("poder")) {
                    if (hab.getPoderHab() > this.poder) {
                        System.out.println("\nPoder insuficiente para atribuir a habilidade\n");
                    } else {
                        this.Habilidade = hab;
                    }
                }
                break;

            case 2:
                hab.setHab_especial("Envenenamento");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera atirar flexas com mais velocidade;");
                hab.setAtributo("forca");
                hab.setPoderHab(5);
                if (hab.getPoderHab() > this.forca) {
                    System.out.println("\nForca insuficiente para atribuir a habilidade\n");
                } else {
                    this.Habilidade = hab;
                }
                break;

            case 3:
                hab.setHab_especial("Confundus");

                hab.setDescricao_hab("Com esta habilidade o seu personagem podera ter o seu dano reduzido quando for atacado");
                hab.setAtributo("destreza");
                hab.setPoderHab(6);
                if (hab.getAtributo().equalsIgnoreCase("destreza")) {
                    if (hab.getPoderHab() > this.destreza) {
                        System.out.println("\nPoder insuficiente para atribuir a habilidade\n");
                    } else {
                        this.Habilidade = hab;
                    }
                }
                break;

            case 4:
                hab.setHab_especial("Protego");
                hab.setDescricao_hab("Com esta habilidade o seu personagem podera ter o seu dano reduzido quando for atacado");
                //hab.getAtributo().equalsIgnoreCase("destreza");
                hab.setAtributo("vitalidade");
                hab.setPoderHab(6);
                if (hab.getPoderHab() > this.vitalidade) {
                    System.out.println("\nVitalidade insuficiente para atribuir a habilidade\n");
                } else {
                    this.Habilidade = hab;
                }
                break;
        }
        Habilidade hm = hab;
        return hm;
    }

    public String imprimirTextoMago() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParabens! Voce esta criando seu personagem, agora distribua seus pontos!\n"
                + "Voce tem que distribuir entre Forca, Destreza, Poder e Vitalidade;\n"
                + "Voce possui 1 ponto em cada caracteristica ja inseridos em seu personagem, restam 6 pontos para distribuir \n"
                + "Pressione 'Enter' para continuar");
        scan.nextLine();
        System.out.println("Habilidades disponíveis para magos:\n"
                + "1 - Encantamento(4 pontos em poder);\n"
                + "2 - Envenenamento(5 pontos em forca);\n"
                + "3 - Confundus(6 pontos em destreza);\n "
                + "4 - Protego(6 pontos em vitalidade);"
                + "\nPressione 'Enter' para continuar");
        scan.nextLine();
        System.out.println("Voce podera adicionar essas habilidades em breve, conforme os pontos inseridos, leia com atencao!\n"
                + "Pressione 'Enter' para continuar");
        return null;

    }
}

