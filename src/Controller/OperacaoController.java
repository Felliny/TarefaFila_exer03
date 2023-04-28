package Controller;

import Biblioteca.FilaObject.Fila;
import Model.Cliente;

public class OperacaoController {


    public OperacaoController(){
        super();
    }

    public void Caixa(Fila fila){
        Cliente cliente;
        float TotalCompra;
        while (!fila.isEmpty()){;
            try {
                cliente= (Cliente) fila.remove();
                TotalCompra= cliente.getValor() * cliente.getQuantidadePecas();
                System.out.println("O cliente "+ cliente.getNome() +" teve um gasto total de "+ TotalCompra +" de reais");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
