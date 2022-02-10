package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Google", Tamanho.GRANDE);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(1);

        List<ItemIncluso> itensInclusos = new ArrayList<>();
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 7);

        itensInclusos.add(primeiroItemIncluso);
        itensInclusos.add(segundoItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        for(ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("done");

        ProdutoNacional pn = new ProdutoNacional("Misael", Tamanho.GRANDE);
        pn.setImpostoNacional(0.575);
        pn.setNome("Teste");
        System.out.println(pn.getImpostoNacional());
        System.out.println(pn.getDadosFavoritos());

        ProdutoInternacional pi = new ProdutoInternacional("QA", Tamanho.MEDIO);
        pi.setTaxaDeImportacao(1.9);
        pi.setNome("Test");
        pi.setValor(0);
        System.out.println(pi.getTaxaDeImportacao());
        System.out.println(pi.getDadosFavoritos());
    }
}
