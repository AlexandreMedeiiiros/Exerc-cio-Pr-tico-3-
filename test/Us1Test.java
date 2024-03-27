package test;
import Biblioteca.Biblioteca;
import Biblioteca.Livro;
import junit.framework.*;

public class Us1Test extends TestCase {

    public void testeGetLivrosByTitulo(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.criarLivro("livro1");
        biblioteca.criarLivro("livro2");
        biblioteca.criarLivro("livro3");

        Livro livro = biblioteca.buscarLivros("livro2");

        assertEquals(livro.getTitulo(), "livro2");
    }
}