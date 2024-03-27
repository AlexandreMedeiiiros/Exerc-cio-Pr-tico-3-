package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private Livro[] livros;
    private int gerenciadorId = 0;
    private int[][] reservas;

    public int[][] getReservas() {
        return reservas;
    }

    public void criarLivro(String titulo){
        Livro livro = new Livro(titulo, gerenciadorId);
        this.livros[this.livros.length] = livro;
        this.gerenciadorId += 1;
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

    public void reservaLivro(String titulo, int idUsuario){
        Livro livro = this.buscarLivros(titulo);
        livro.setDisponivel(false);
        int[] reserva = new int[0];
        reserva[0] = livro.getId();
        reserva[1] = idUsuario;
    }
}
