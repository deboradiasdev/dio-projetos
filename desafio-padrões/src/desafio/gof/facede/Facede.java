package desafio.gof.facede;

import subsistema1crm.CrmService;
import subsistema2cep.CepApi;

public class Facede {
    public static void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.garvarCliente(nome, cep, nome, cep);
    }
}