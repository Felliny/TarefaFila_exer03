package Model;

public class Cliente {

    String nome;
    int QuantidadePecas;
    float valor;

    public Cliente(String nome, int QuantidadePecas, float valor){
        this.nome= nome;
        this.QuantidadePecas= QuantidadePecas;
        this.valor= valor;
    }


    public String getNome() {
        return nome;
    }

    public int getQuantidadePecas() {
        return QuantidadePecas;
    }

    public float getValor() {
        return valor;
    }
}
