import java.util.ArrayList;
import java.util.Scanner;
class Pessoa {
    String nome;
    String sexo;
    int anoNasc;

    public Pessoa(String nome, String sexo, int anoNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNasc = anoNasc;
    }

    public boolean MilitarAprovado() {
        int idade = 2023 - anoNasc; // faz uma subtração do ano atual com o ano de nascimento


        return idade >= 18; // Verifica se a pessoa tem 18 anos ou mais
    }
}

public class RegistradorExercito {
    public static void main(String[] args) {
        Scanner militar = new Scanner(System.in);

        System.out.print("Qual número de pessoas que serão analisadas? ");
        int Npessoa = militar.nextInt();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (int i = 1; i <= Npessoa; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Nome: ");
            String nome = militar.next();
            System.out.print("Sexo (Masculino ou Feminino): ");
            String sexo = militar.next();
            System.out.print("Ano de nascimento: ");
            int anoNascimento = militar.nextInt();

            Pessoa pessoa = new Pessoa(nome, sexo, anoNascimento);
            pessoas.add(pessoa);
        }

        System.out.println("Pessoas aptas ao serviço militar:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.MilitarAprovado()) {
                System.out.println(pessoa.nome);
            }
        }
    }
}