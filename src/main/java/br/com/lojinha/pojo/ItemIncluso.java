package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private Integer quantidade;

    public ItemIncluso(String nomeInicial, Integer qdtInicial){
        this.nome = nomeInicial;
        this.quantidade = qdtInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
