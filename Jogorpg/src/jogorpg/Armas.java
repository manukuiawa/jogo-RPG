
package jogorpg;

import java.util.Scanner;

public class Armas {
    
    Scanner scan = new Scanner(System.in);
    
    protected String tipo;
    protected int danoArma;
    protected double peso;
    protected String tipo2;
    protected int dano2;
    protected int peso2;
   
     
    Armas(String tipo, int danoArma, double peso, String tipo2, int dano2, int peso2) {
     this.tipo = tipo;
     this.danoArma = danoArma;
     this.peso = peso;
     this.tipo2 = tipo2;
     this.dano2 = dano2;
     this.peso2 = peso2;
     
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanoArma() {
        return danoArma;
    }

    public void setDanoArma(int danoArma) {
        this.danoArma = danoArma;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getDano2() {
        return dano2;
    }

    public void setDano2(int dano2) {
        this.dano2 = dano2;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }

    /*
    public void CriarArma() {
        int dano = 0;
        int defesa = 0;
        int peso = 0;
        String tipo;
        tipo = new String();
        String PouS;
        PouS = new String();
        int t = 0;

        System.out.println("Escolha o tipo da sua arma: "
                + "1 - Espada\n"
                + "2 - Machado\n"
                + "3 - Pistola\n"
                + "4 - Escopeta\n"
                + "5 - Escudo\n");
        t = scan.nextInt();
        switch (t) {
            case 1:
                System.out.println("Capacidade de dano de 1 a 10\n");
                System.out.println("Defina o dano de sua arma: ");
                dano = scan.nextInt();
                System.out.println("Capacidade de defesa de 1 a 5\n");
                System.out.println("\nDefina o seu potencial de defesa: ");
                defesa = scan.nextInt();
                System.out.println("Peso entre 6kg - 10kg");
                System.out.println("\nDefina o o peso de sua arma: ");
                peso = scan.nextInt();
                System.out.println("Voce escolheu uma Espada.\n"
                        + "\nSeu dano eh: " + dano
                        + "\nA defesa eh: " + defesa
                        + "\nO peso dela eh: " + peso);
                break;

            case 2:
                System.out.println("Capacidade de dano de 1 a 10\n");
                System.out.println("Defina o dano de sua arma: ");
                dano = scan.nextInt();
                System.out.println("Capacidade de defesa de 1 a 5\n");
                System.out.println("\nDefina o seu potencial de defesa: ");
                defesa = scan.nextInt();
                System.out.println("Peso entre 6kg - 9kg");
                System.out.println("\nDefina o o peso de sua arma: ");
                peso = scan.nextInt();
                System.out.println("Voce escolheu um Machado.\n"
                        + "\nSeu dano eh: " + dano
                        + "\nA defesa eh: " + defesa
                        + "\nO peso dela eh: " + peso);
                break;

            case 3:
                System.out.println("Capacidade de dano de 1 a 7\n");
                System.out.println("Defina o dano de sua arma: ");
                dano = scan.nextInt();
                System.out.println("Capacidade de defesa de 1 a 3\n");
                System.out.println("\nDefina o seu potencial de defesa: ");
                defesa = scan.nextInt();
                System.out.println("Peso entre 300g - 1kg");
                System.out.println("\nDefina o o peso de sua arma: ");
                peso = scan.nextInt();
                System.out.println("Voce escolheu uma Pistola.\n"
                        + "\nSeu dano eh: " + dano
                        + "\nA defesa eh: " + defesa
                        + "\nO peso dela eh: " + peso);
                break;

            case 4:
                System.out.println("Capacidade de dano de 1 a 9\n");
                System.out.println("Defina o dano de sua arma: ");
                dano = scan.nextInt();
                System.out.println("Capacidade de defesa de 1 a 6\n");
                System.out.println("\nDefina o seu potencial de defesa: ");
                defesa = scan.nextInt();
                System.out.println("Peso entre 2kg - 5kg");
                System.out.println("\nDefina o o peso de sua arma: ");
                peso = scan.nextInt();
                System.out.println("Voce escolheu uma Escopeta.\n"
                        + "\nSeu dano eh: " + dano
                        + "\nA defesa eh: " + defesa
                        + "\nO peso dela eh: " + peso);
                break;

            case 5:
                System.out.println("Capacidade de dano de 1 a 3\n");
                System.out.println("Defina o dano de sua arma: ");
                dano = scan.nextInt();
                System.out.println("Capacidade de defesa de 1 a 15\n");
                System.out.println("\nDefina o seu potencial de defesa: ");
                defesa = scan.nextInt();
                System.out.println("Peso entre 5kg - 12kg");
                System.out.println("\nDefina o o peso de sua arma: ");
                peso = scan.nextInt();
                System.out.println("Voce escolheu um Escudo.\n"
                        + "\nSeu dano eh: " + dano
                        + "\nA defesa eh: " + defesa
                        + "\nO peso dela eh: " + peso);
                break;

        }
*/
    
      @Override
    public String toString() {
        return "Tipo da Arma Primária: " + tipo + "\nDano da Arma Primária: : " + danoArma + "\nPeso da Arma Primária:  " + peso + "\nTipo da Arma Secundária:  " + tipo2 + "Dano da Arma Secundária: " + dano2 
                + "\nPeso da Arma Secundária: ";
    }

    Object getArma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }



