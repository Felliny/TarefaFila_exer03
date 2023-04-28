package View;

import Biblioteca.FilaObject.Fila;
import Controller.OperacaoController;
import Model.Cliente;

public class Main {
    public static void main(String[] args) {
        Fila fila= new Fila();

        fila.insert(new Cliente("Marcio", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Mario", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Leandro", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Luan", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Cleude", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Regina", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Cleyton", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));
        fila.insert(new Cliente("Vladimir", (int) (Math.random() * 31) + 20, (float)  (Math.random() * 96) + 5));

        OperacaoController op= new OperacaoController();

        op.Caixa(fila);
    }
}
