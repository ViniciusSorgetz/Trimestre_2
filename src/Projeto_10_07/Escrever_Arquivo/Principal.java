package Projeto_10_07.Escrever_Arquivo;

import Projeto_10_07.Escrever_Arquivo.Pessoa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        p1.setNome("John");
        p1.setSobrenome("Silveira");
        File arquivo = new File("C:/Users/User/IdeaProjects/Trimestre_2_Programming" +
                "/src/Projeto_10_07/Escrever_Arquivo/exemplo.db");
        try{
            ObjectOutputStream objEscrita =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();
            System.out.println("Arquivo salvo com sucesso");

        }catch (IOException error){
            System.out.println("Erro: " + error);
        }

    }
}
