package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo; //o tipo arraylist é dinâmico, não preciso me preocupar com a implementação dinâmica nas inclusões, entretanto, consome muita memória
    Biblioteca(){
        acervo = new ArrayList<Livro>();
    }

    void adicionaLivro(Livro livro){
        acervo.add(livro);
    }
    boolean removerLivro(String isbn){
        for (Livro livro : acervo) {
            if(isbn.equals(livro.getIsbn())){
                acervo.remove(livro);
                return true;
            }
        
        }
        return false;
    }

    ArrayList<Livro> listaTodos(){
    }
    ArrayList<Livro> listaLivrosEmprestados(){

    }
    ArrayList<Livro> listaDisponiveis(){
    }

}
