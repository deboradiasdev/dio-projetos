/*Qual o valor gasto para encher o tanque do carro?
*/
public class Ex_Carro {
    
        String cor;
        String modelo;
        int capacidadeTanque;
        
        Ex_Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }

        public Ex_Carro() {
        }

        void setCor(String cor) {
            this.cor = cor;
        }

        String getCor() {
            return cor;
        }

        void setModelo(String modelo) {
            this.modelo = modelo;
        }

        String getModelo() {
            return modelo;
        }

        void setCapacidadeTanque(int capacidadeTanque) {
            this.capacidadeTanque = capacidadeTanque;
        }

        int getCapacidadeTanque() {
            return capacidadeTanque;
        }

        double totalValorTanque(double valorCombustivel) {
            return capacidadeTanque * valorCombustivel;
        }

}
