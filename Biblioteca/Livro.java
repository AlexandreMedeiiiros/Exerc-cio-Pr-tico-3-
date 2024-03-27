package Biblioteca;

import java.util.Objects;

public class Livro {
    private String titulo;
    private boolean disponivel;

    private int id;

    public Livro(String titulo, int id){
        this.disponivel = true;
        this.titulo = titulo;
        this.id = id;
    }

    public boolean verificaLivro(String titulo){
        return Objects.equals(this.titulo, titulo);
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getId() {
        return id;
    }
}
