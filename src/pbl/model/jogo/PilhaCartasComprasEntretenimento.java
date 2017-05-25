/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.model.jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author emerson
 */
public abstract class PilhaCartasComprasEntretenimento {
    private static final List<Carta> cartas = new ArrayList();
    private static int index = 0;
    
    /**
     * Devolve uma carta da pilha
     * @return 
     */
    public static Carta pegarCarta() {
        if(cartas.size()==0){ //se não existirem cartas, cria-se
            criarCartas();
        }
        
        if(index >= cartas.size()){ //quando a pilha de cartas chegar ao fim
            embaralharCartas();
        }
        Carta tipo =  cartas.get(index);
        index++;
        return tipo;
    }
    
    /**
     * Embaralha as cartas do monte, e zera o id da pilha de carta
     */
    private static void embaralharCartas(){
        Collections.shuffle(cartas);
        index = 0;
    }
    
    private static void criarCartas(){
        cartas.add(new Carta("CONTAS", "", 0));
        cartas.add(new Carta("PAGUE A UM VIZINHO AGORA", "", 0));
        cartas.add(new Carta("DINHEIRO EXTRA", "", 0));
        cartas.add(new Carta("DOAÇÕES", "", 0));
        cartas.add(new Carta("COBRANÇA MOSTRO", "", 0));
        cartas.add(new Carta("VÁ EM FRENTE AGORA", "", 0));
        embaralharCartas();
    }
    
    public static Carta buscarCarta(int codigo){
        for(Carta c: cartas){
            if(c.getCodigo()==codigo){
                return c;
            }
        }
        return null;
    }
}
