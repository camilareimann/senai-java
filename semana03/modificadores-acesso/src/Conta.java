 public class Conta {
        private int numeroConta;
        private String nomeCorrentista;
        private double saldo;

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public String getNomeCorrentista() {
            return nomeCorrentista;
        }

        public void setNomeCorrentista(String nomeCorrentista) {
            this.nomeCorrentista = nomeCorrentista;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double depositar(double deposito) {
            this.saldo += deposito;
            return this.saldo;
        }

        public double sacar(double saque) {
            this.saldo -= saque;
            return this.saldo;
        }

        public void imprimirSaldo() {
            System.out.println("Saldo: " + this.saldo);
        }


    }
