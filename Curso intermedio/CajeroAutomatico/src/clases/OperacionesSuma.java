package clases;

public class OperacionesSuma extends Operaciones {
    @Override
    public void ModificarSaldo(int modificador){
        System.out.println("\nDepositaste: " + modificador);
        saldo = saldo + modificador;
        System.out.println("\nTu saldo actual es de: " + saldo);
    }
}
