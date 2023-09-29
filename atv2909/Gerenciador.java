import java.util.ArrayList;

public class Gerenciador {

    
    private ArrayList<Produto> listaProdutos;
    private ArrayList<Lista> listas;


    public Gerenciador(){
        this.listaProdutos = new ArrayList<>();
        this.listas = new ArrayList<>();
    }


    public String cadastrarProduto(String nome, double valor, double peso){

        Produto produto = buscarProduto(nome);

        if (listaProdutos.add(produto)) {
            return "Produto Cadastrado";
        }
        return "Não foi possível cadastrar!";
    }


    public Produto buscarProduto(String nome) {

        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            if (produto != null) {
                if (produto.getNome().equals(nome)) {
                    return produto;
                }
            }
        }

        return null;
    }

    public String listarProdutos() {

        String str = "";

        for (Produto p : listaProdutos) {
            str += p.toString()+"\n";
        }

        return str;
    }

    public String adicionarProduto(String nomeP, String nomeL){
        Produto produto = buscarProduto(nomeP);
        Lista lista = buscarLista(nomeL);

        if (produto == null) {
            return "Produto não encontrado";            
        } if (lista == null) {
            return "Lista  não encontrado";
        }

        lista.setProdutos(produto);

        return "Adicionado";
    }
    


    public String criarLista(String nome) {

        
    }


    public Lista buscarLista(String nome) {

        for (int i = 0; i < listas.size(); i++) {
            Lista lista = listas.get(i);
            if (lista != null) {
                if (lista.getNome().equals(nome)) {
                    return lista;
                }
            }
        }

        return null;
    }


        public String listarLista() {

        String str = "";

        for (Lista l : listas) {
            str += l.getNome()+"\n";
        }

        return str;
    }

    
}