package main.java.com.example;

public class Main {
    public static void main(String[] args) {
        libro l1 = new libro();
        l1.mostrarDetalles();

        libro l2 = new libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        libro l3 = new libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(1000);

        Estudiante e1 = new Estudiante("Pedro", 21, 2.5);
        e1.mostrarInfo();

        Estudiante e2 = new Estudiante("Ana", 19, 3.8);
        e2.mostrarInfo();
    }
}
