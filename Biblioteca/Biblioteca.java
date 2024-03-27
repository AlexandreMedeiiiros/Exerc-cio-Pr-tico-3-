package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private Livro[] livros;


    public void criarLivro(String titulo){
        Livro livro = new Livro(titulo);
        this.livros[this.livros.length] = livro;
    }

    public Livro buscarLivros(String titulo){
        for (int i = 0; i < this.livros.length; i++) {
            Livro livro = this.livros[i];
            if(livro.verificaLivro(titulo)){
                return livro;
            }
        }
        return null;
    }
    
    public String[] getLivrosDisponiveis(){
        String[] disponiveis = new String[0];
        int j = 0;
        for (int i = 0; i < this.livros.length; i++) {
            Livro livro = this.livros[i];
            if(livro.isDisponivel()){
                disponiveis[j] = livro.getTitulo();
            }
        }
        return disponiveis;
    }
}
