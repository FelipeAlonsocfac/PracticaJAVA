package clases;

public class OperacionesResta extends Operaciones{
    @Override
    public void ModificarSaldo(int modificador){
        System.out.println("\nRetiraste: " + modificador);
        saldo = saldo - modificador;
        System.out.println("\nTu saldo actual es de: " + saldo);
    }
}
