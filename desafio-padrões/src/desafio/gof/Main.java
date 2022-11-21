package desafio.gof;

import desafio.gof.facede.Facede;
import desafio.gof.singleton.SingletonEager;
import desafio.gof.singleton.SingletonLazy;
import desafio.gof.singleton.SingletonLazyHolder;
import desafio.gof.strategy.Comportamento;
import desafio.gof.strategy.ComportamentoAgressivo;
import desafio.gof.strategy.ComportamentoDefensivo;
import desafio.gof.strategy.ComportamentoNormal;
import desafio.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facede

        Facede facede = new Facede();
        Facede.migrarCliente("Nathan", "45068421");
    }
}