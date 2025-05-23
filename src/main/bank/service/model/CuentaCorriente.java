package main.bank.service.model;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(double saldoInicial, String numeroCuenta) {
        super(saldoInicial, numeroCuenta);
    }

    // Sobreescribir para permitir saldo negativo (hasta -1000)
    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto >= -1000) {
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro realizado (Cuenta Corriente): $" + monto);
        } else {
            System.out.println("Límite de sobregiro excedido. No se puede retirar $" + monto);
        }
    }
}
