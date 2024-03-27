package test;

import Biblioteca.Biblioteca;
import junit.framework.TestCase;

class Us2Test  extends TestCase {
    public void listaLivrosDisponiveis(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.criarLivro("livro1");
        biblioteca.criarLivro("livro2");
        biblioteca.criarLivro("livro3");

        String[] livrosDisponiveis = biblioteca.getLivrosDisponiveis();
        String[] livrosDisponiveisTeste = new String[0];
        livrosDisponiveisTeste[0] = "livro1";
        livrosDisponiveisTeste[1] = "livro2";
        livrosDisponiveisTeste[2] = "livro3";

        assertEquals(livrosDisponiveis, livrosDisponiveisTeste);
    }
}
