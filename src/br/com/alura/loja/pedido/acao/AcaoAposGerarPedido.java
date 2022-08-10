package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

// Observer
public interface AcaoAposGerarPedido {

    void executarAcao(Pedido pedido);
}
