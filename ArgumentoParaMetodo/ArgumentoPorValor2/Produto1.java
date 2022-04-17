package ArgumentoPorValor2;

public class Produto1 {
    void precoProduto1 (Preco preco, double percentualImpostos, double margemLucro) {
        preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
        preco.valorLucro = preco.valorCustos * (margemLucro / 100);
        preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
    }
}
