package Biblioteca;

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
}
