package subsistema2cep;

public class CepApi {
    public static CepApi instancia = new CepApi() {
        
        private CepApi() {
        super();
        }

        public static CepApi getInstancia() {
            return instancia;
        }

        public String recuperarCidade(String cep) {
            return "Vitória da Conquista";
        }
        
        public String recuperarEstado(String cep) {
            return "BA";
        }
    }
}