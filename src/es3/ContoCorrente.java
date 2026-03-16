package es3;

public class ContoCorrente {

    protected String titolare; // Protetti per permettere a ContoOnLine di vederli
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }


    //da modificare
    public void preleva(double x) throws BancaException {


            if (nMovimenti < maxMovimenti) {
                saldo = saldo - x;
            } else {
                // Se superi i movimenti massimi, sottrae il prelievo + 0.50€ di commissione
                saldo = saldo - x - 0.50;
            }
            nMovimenti++;
        if(saldo < 0){
            throw new BancaException("il conto è in rosso");
        }

    }

    public double restituisciSaldo() {
        return saldo;
    }
}
