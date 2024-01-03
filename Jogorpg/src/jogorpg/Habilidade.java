
package jogorpg;

public class Habilidade {
  private String hab_especial;
  private String descricao_hab;
  private int poderHab;

    public Habilidade(String hab_especial, String descricao_hab, int poderHab) {
      this.hab_especial = hab_especial;
      this.descricao_hab = descricao_hab;
      this.poderHab = poderHab;
    }

     public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    
    private String atributo;
            
    public String getHab_especial() {
        return hab_especial;
    }

    public void setHab_especial(String hab_especial) {
        this.hab_especial = hab_especial;
    }

    public String getDescricao_hab() {
        return descricao_hab;
    }

    public void setDescricao_hab(String descricao_hab) {
        this.descricao_hab = descricao_hab;
    }

    public int getPoderHab() {
        return poderHab;
    }

    public void setPoderHab(int poderHab) {
        this.poderHab = poderHab;
    }
    
      @Override
    public String toString() {
        return "Habilidade Especial: " + hab_especial + "\nDescrição da Habilidade: " + descricao_hab + "\nPoder Mínimo da Habilidade: " + poderHab; 
    }
}

