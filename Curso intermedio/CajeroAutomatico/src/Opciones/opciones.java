package Opciones;
import clases.OperacionesSuma;
import clases.OperacionesResta;

public class opciones {
    private int saldo;
    OperacionesSuma mensajerosuma;
    OperacionesResta mensajeroresta;

    public opciones(){
        saldo = 200;
        mensajerosuma = new OperacionesSuma();
        mensajerosuma.setSaldo(saldo);
        mensajeroresta = new OperacionesResta();
        mensajeroresta.setSaldo(saldo);
    }

    public void ConsultarSaldo(){
        System.out.println("Su saldo actual es: " + getSaldo());
    }
    public void Retiro(int modificador){
        mensajeroresta.ModificarSaldo(modificador);
        saldo = mensajeroresta.getSaldo();
        mensajerosuma.setSaldo(saldo);
    }
    public void Deposito(int modificador){
        mensajerosuma.ModificarSaldo(modificador);
        saldo = mensajerosuma.getSaldo();
        mensajerosuma.setSaldo(saldo);
    }
    public int getSaldo() {
        return saldo;
    }
}
