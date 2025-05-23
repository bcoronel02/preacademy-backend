package main.bank.service;

import main.bank.service.model.CajaAhorro;
import main.bank.service.model.CuentaCorriente;
import main.bank.service.model.Cuenta;

public class BankExercice {
    public static void main(String[] args) {

        // TODO: ¡Bienvenidos! Hoy van a programar para un banco en Java 😱
        // Este ejercicio les permitirá practicar herencia, encapsulamiento, métodos estáticos
        // y organización de clases aplicando Programación Orientada a Objetos.

        // CONSIGNA 1:
        // Crear una clase abstracta llamada "Cuenta" dentro del package models.
        // La clase debe tener los siguientes atributos privados:
        // - double saldo
        // - String numeroCuenta

        // CONSIGNA 2:
        // En la clase Cuenta, crear un constructor que reciba ambos atributos por parámetro
        // y los asigne correctamente.

        // CONSIGNA 3:
        // Crear métodos públicos para:
        // - depositar(double monto): suma el monto al saldo.
        // - retirar(double monto): resta el monto del saldo, si hay suficiente dinero.
        // - mostrarSaldo(): imprime el saldo actual. (Este puede ser protected)

        // CONSIGNA 4:
        // Crear los métodos getter y setter para el atributo saldo (pueden incluir controles dentro de los mismos, por ejemplo, para informar que no tiene saldo).

        // CONSIGNA 5:
        // Crear un método estático llamado transferir(Cuenta origen, Cuenta destino, double monto)
        // que reste el dinero de la cuenta origen y lo deposite en la cuenta destino.
        // Si no hay saldo suficiente, debe mostrar un mensaje de error.

        // CONSIGNA 6:
        // Crear dos clases que hereden de Cuenta:
        // - CajaAhorro
        // - CuentaCorriente
        // Cada una debe tener su constructor y heredar correctamente el comportamiento de Cuenta.

        // CONSIGNA 7:
        // Desde este método main, crear un objeto CajaAhorro y otro CuentaCorriente.
        // Probar los métodos depositar, retirar, mostrarSaldo y transferir.

        // CONSIGNA 8 (DESAFÍO EXTRA):
        // Sobreescribir el método retirar en CuentaCorriente para permitir saldo negativo
        // (por ejemplo, permitir que el saldo llegue hasta -1000)

        // TODO: ↓ Acá podés comenzar a resolver desde el main:

        // ¡A programar!

        // Crear cuentas
        CajaAhorro ahorro = new CajaAhorro(5000, "CA123");
        CuentaCorriente corriente = new CuentaCorriente(1000, "CC456");

        // Depositar dinero
        ahorro.depositar(1000);
        corriente.depositar(500);

        // Mostrar saldos
        System.out.println("\n== Saldo Caja de Ahorro ==");
        ahorro.mostrarSaldo();

        System.out.println("\n== Saldo Cuenta Corriente ==");
        corriente.mostrarSaldo();

        // Retirar dinero
        ahorro.retirar(2000);
        corriente.retirar(1500); // Permitido porque admite sobregiro

        // Mostrar saldos después del retiro
        System.out.println("\n== Saldos luego del retiro ==");
        ahorro.mostrarSaldo();
        corriente.mostrarSaldo();

        // Transferencia
        Cuenta.transferir(ahorro, corriente, 1000);

        // Mostrar saldos después de la transferencia
        System.out.println("\n== Saldos luego de transferencia ==");
        ahorro.mostrarSaldo();
        corriente.mostrarSaldo();
    }
}

