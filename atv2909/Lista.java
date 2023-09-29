import java.util.ArrayList;

public class Lista {
    
    private String nome;
    private ArrayList<Produto> produtos;


    public Lista(String nome, Produto produtos){
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(Produto produtos){
        this.produtos.add(produtos);
    }
















}
