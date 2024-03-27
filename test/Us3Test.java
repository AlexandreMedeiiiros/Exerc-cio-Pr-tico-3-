package test;

import Biblioteca.Biblioteca;
import junit.framework.TestCase;

public class Us3Test extends TestCase {
    public void reservaLivros(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.criarLivro("livro1");
        biblioteca.criarLivro("livro2");
        biblioteca.criarLivro("livro3");

        biblioteca.reservaLivro("livro2", 1);
        biblioteca.reservaLivro("livro3", 3);

        assertEquals(biblioteca.getReservas().length, 2);
    }
}
