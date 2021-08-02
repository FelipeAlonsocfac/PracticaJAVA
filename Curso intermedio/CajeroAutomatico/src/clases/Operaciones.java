package clases;

public abstract class Operaciones {

    protected int saldo;
 
    public abstract void ModificarSaldo(int modificador);

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
