package main.models;

public abstract class Cuenta {
    private double saldo;
    private String numeroCuenta;

    public Cuenta(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    // Métodos públicos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + monto);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    // Getters y Setters con validaciones básicas
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("No se puede establecer un saldo negativo directamente.");
        } else {
            this.saldo = saldo;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // Métodos estático de transferencia
    public static void transferir(Cuenta origen, Cuenta destino, double monto) {
        if (origen.getSaldo() >= monto) {
            origen.retirar(monto);
            destino.depositar(monto);
            System.out.println("Transferencia de $" + monto + " realizada con éxito.");
        } else {
            System.out.println("No hay suficiente saldo para transferir $" + monto);
        }
    }
}
