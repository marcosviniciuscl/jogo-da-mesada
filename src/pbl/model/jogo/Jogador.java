/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.model.jogo;

import java.util.ArrayList;
import java.util.List;
import pbl.model.banco.Conta;

/**
 *
 * @author marcos
 */
public class Jogador {
    private Peao peao;
    private final String nome;
    private List<String> cartasCorreios;
    private List<String> cartasCompEntret;
    private Conta conta;

    public Jogador(String nome, Peao peao) {
        this.nome = nome;
        this.peao = peao;
        this.cartasCorreios = new ArrayList();
        this.cartasCompEntret = new ArrayList();
        conta = new Conta(3000.0);
    }
    
    public void addCartaCorreio(String carta){
        cartasCorreios.add(carta);
    }
    
    public void addCartaCompEntret(String carta){
        cartasCompEntret.add(carta);
    }

    public Peao getPeao() {
        return peao;
    }

    public void setPeao(Peao peao) {
        this.peao = peao;
    }
    
    
}