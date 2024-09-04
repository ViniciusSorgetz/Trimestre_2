package Projeto_04_09.Exemplo_Abstract;

/**
 * Representa uma lista de Strings com métodos para adicionar e remover elementos
 * @author Vinícius Sorgetz
 * @version 1
 */

public class Vetor implements Lista {

    private int tamanho;
    private String[] elementos;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Adiciona um elemento a lista
     * @param elemento elemento que será adicionado a lista
     */

    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public String remove() {
        if(tamanho > 0){
            return elementos[tamanho--];
        }
        else{
            return null;
        }
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    /**
     * Retorna a lista em formato de conunto
     * @return [] = vazio ou [elemento1, elemento2, elemento3] se tiver elementos
     */

    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho > 0){
            for(int i=0; i<tamanho-1; i++){
                retorno += elementos[i] + ", ";
            }
            retorno += elementos[tamanho-1];
        }
        retorno += "]";
        return retorno;
    }
}
