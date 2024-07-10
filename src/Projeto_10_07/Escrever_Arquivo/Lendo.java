package Projeto_10_07.Escrever_Arquivo;

import java.io.*;

public class Lendo {
    public static void main(String[] args){

        File arquivo = new File("C:/Users/User/IdeaProjects/Trimestre_2_Programming" +
                "/src/Projeto_10_07/Escrever_Arquivo/exemplo.db");
        try{
            ObjectInputStream objLeitura =
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = (Pessoa) objLeitura.readObject();
            System.out.println(p1.getNome() + " " + p1.getSobrenome());
            System.out.println("Arquivo lido com sucesso");

        }catch (IOException error){
            System.out.println("Erro: " + error);
        } catch (ClassNotFoundException error) {
            System.out.println("Erro: " + error);
        }

    }
}
