
package jogorpg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class jogorpg {
    
         private static void exibirInformacoes(ArrayList<?> elementos) {git commit -m "first commit" git commit -m "first commit" 
    for (Object elemento : elementos) {
        System.out.println(elemento);
    }
}

private static Personagem buscarPersonagemPorNome(ArrayList<Personagem> personagens, String nome) {
    for (Personagem p : personagens) {
        if (p != null && p.getNome() != null && p.getNome().trim().equalsIgnoreCase(nome.trim())) {
            return p;
        }
    }
    return null;
}

private static Armas buscarArmaPorNome(ArrayList<Armas> armas, String Tipo) {
    for (Armas a : armas) {
        if (a != null && a.getTipo().equalsIgnoreCase(Tipo)) {
            return a;
        }
    }
    return null;
}


    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        ArrayList<Armas> armas = new ArrayList<>();
        ArrayList<Habilidade> habilidades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("Bem-Vindo ao RPG: ");
            System.out.println("1. Criar Personagem");
            System.out.println("2. Criar Arma");
            System.out.println("3. Adicionar Habilidade Especial");
            System.out.println("4. Visualizar Informações de um Personagem");
            System.out.println("5. Trocar de Arma");
            System.out.println("6. Batalhar");
            System.out.println("7. Criar Mago, Arqueiro ou Guerreiro");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Nome do Personagem: ");
                String nome = scanner.next();
                System.out.println("Idade do Personagem: ");
                int idade = scanner.nextInt();
                System.out.println("Nível do Personagem: ");
                int nivel = scanner.nextInt();
                System.out.println("Descrição do Personagem: ");
                String descricaoP = scanner.next(); 
                System.out.println("Força do Personagem (1 a 10): ");
                int forca = scanner.nextInt();
                System.out.println("Vitalidade do Personagem (1 a 10): ");
                int vitalidade = scanner.nextInt();
                System.out.println("Destreza do Personagem (1 a 10): ");
                int destreza = scanner.nextInt();
                System.out.println("Poder do Personagem (1 a 10): ");
                int poder = scanner.nextInt();
                System.out.println("Insira o nome da habilidade do seu personagem: ");
                String nome_hab1 = scanner.next();
                System.out.println("Insira a descrição da habilidade: ");
                String desc_hab = scanner.nextLine();
                System.out.println("Insira o poder mínimo da habilidade: ");
                int poderMinimo = scanner.nextInt();
             
                Personagem p = new Personagem(nome, idade, nivel, descricaoP, forca, vitalidade, destreza, poder, nome_hab1, desc_hab, poderMinimo);
                personagens.add(p);
                p.PreencheAtributos(scanner);
                
            } else if (opcao == 2) {
                System.out.println("Tipo da Arma Primária: ");
                String tipo = scanner.next();
                System.out.println("Dano da Arma Primária: ");
                 int danoArma = scanner.nextInt();
                System.out.println("Peso da Arma Primária: ");
                double peso = scanner.nextDouble();
                System.out.println("Tipo da Arma Secundária: ");
                String tipo2 = scanner.next();
                System.out.println("Dano da Arma Secundária: ");
                int dano2 = scanner.nextInt();
                System.out.println("Peso da Arma Secundária: ");
                int peso2 = scanner.nextInt();
                Armas a = new Armas(tipo, danoArma, peso, tipo2, dano2, peso2);
                armas.add(a);
                
            } else if (opcao == 3) {
                System.out.println("Insira o nome do seu personagem: ");
                String nomePersonagem = scanner.next();
                System.out.println("Insira o nome da sua habilidade especial: ");
                String hab_especial = scanner.next();
                System.out.println("Insira a descrição da habilidade: ");
                String descricao_hab = scanner.next();
                System.out.println("Insira o poder mínimo da sua habilidade: ");
                int poderHab = scanner.nextInt();
                Habilidade h = new Habilidade(hab_especial, descricao_hab, poderHab);
                habilidades.add(h);
                
            } else if (opcao == 4) {
             System.out.println("Insira o nome do seu personagem: ");
             String nome = scanner.next();

             Personagem personagemSelecionado = buscarPersonagemPorNome(personagens, nome);

                if (personagemSelecionado != null) {
                    System.out.println("\nInformações sobre Personagem:");
                    System.out.println(personagemSelecionado);

                    System.out.println("\nInformações sobre Armas:");
                    exibirInformacoes(armas);

                    System.out.println("\nInformações sobre Habilidades:");
                    exibirInformacoes(habilidades);
                    
                    
             } else {
                 System.out.println("Personagem não encontrado. Crie um novo personagem!");
             }


                
        } else if(opcao == 5) {
    System.out.println("Insira o nome do seu personagem: ");
    String nomePersonagem = scanner.next();

    Personagem personagemSelecionado = buscarPersonagemPorNome(personagens, nomePersonagem);

    if (personagemSelecionado != null) {
        System.out.println("Insira qual arma deseja trocar: \nPrimária ou Secundária? ");
        String tipoArma = scanner.next();
        
        System.out.println("Insira o nome da arma antiga: ");
        String nomeArmaAntiga = scanner.next();

        if (tipoArma.equalsIgnoreCase("Primária")) {
        
            Armas novaArmas = buscarArmaPorNome(armas, nomeArmaAntiga);
            if (novaArmas != null) {
                personagemSelecionado.setArmaPrimaria(novaArmas);
                System.out.println("Arma primária trocada com sucesso!");
            } else {
                System.out.println("Arma não encontrada!");
            }
        } else if (tipoArma.equalsIgnoreCase("Secundária")) {
            // Trocar a arma secundária (implemente conforme necessário)
        } else {
            System.out.println("Tipo de arma inválido. Escolha 'Primária' ou 'Secundária'.");
        }
    } else {
        System.out.println("Personagem não encontrado. Crie um novo Personagem!");
    }
    
    } else if (opcao == 6) {

    System.out.println("Insira o nome do seu personagem: ");
    String nomePersonagem = scanner.next();

    Personagem personagemSelecionado = buscarPersonagemPorNome(personagens, nomePersonagem);

    if (personagemSelecionado != null) {
        if (!personagemSelecionado.isAtributosAlocados()) {
            personagemSelecionado.alocarPontosDeAtributo();
            personagemSelecionado.setAtributosAlocados(true);
            System.out.println("Atributos alocados com sucesso!");
        }

        int xpGanho = (int) (Math.random() * 1000);
        System.out.println("\nBatalha!");
        System.out.println("XP Ganho: " + xpGanho);
        personagemSelecionado.ganharXP(xpGanho);

        System.out.println("-------------------------------------------------------");
        System.out.println("\nInformações do Personagem após a Batalha:");
        System.out.println(personagemSelecionado);
        System.out.println("\n--------------------------------------------------------");

        personagemSelecionado.subirDeNivel();
    } else {
        System.out.println("Personagem não encontrado.");
    }
    
    }else if (opcao == 7) {
    System.out.println("Escolha o tipo de personagem que deseja criar:");
    System.out.println("1 - Guerreiro");
    System.out.println("2 - Mago");
    System.out.println("3 - Arqueiro");
    System.out.print("Escolha o número correspondente: ");

    int escolhaPersonagem = scanner.nextInt();
    scanner.nextLine(); 

    Personagem novoPersonagem = null;

    switch (escolhaPersonagem) {
        case 1:
            novoPersonagem = imprimirTextoArqueiro();
            break;
        
        default:
            System.out.println("Escolha inválida. Tente novamente.");
            break;
    }

    if (novoPersonagem != null) {
        personagens.add(novoPersonagem);
        System.out.println("Personagem criado com sucesso!");
    }

       } else if (opcao == 8) {
              System.out.println("Jogo Encerrado com Sucesso!");
              break;
         }
       }
     }

    private static Personagem imprimirTextoArqueiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   }

   



