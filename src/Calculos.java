public class Calculos {
    private int primeiroNumero;
    private int segundoNumero;

    public int Soma() {
        return primeiroNumero + segundoNumero;
    }

    public int Subtracao() {
        return primeiroNumero - segundoNumero;
    }

    public int multiplicacao() {
        return primeiroNumero * segundoNumero;
    }

    public int divisao() {
        return primeiroNumero / segundoNumero;
    }


    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

}
