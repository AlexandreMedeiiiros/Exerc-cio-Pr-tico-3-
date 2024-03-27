package Biblioteca;

import java.util.Objects;

public class Livro {
    private String titulo;
    private boolean disponivel;

    public Livro(String titulo){
        this.disponivel = true;
        this.titulo = titulo;
    }

    public boolean verificaLivro(String titulo){
        return Objects.equals(this.titulo, titulo);
    }

    public String getTitulo() {
        return titulo;
    }
}
