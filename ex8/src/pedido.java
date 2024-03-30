import java.util.ArrayList;
import java.util.Scanner;
public class pedido {
    private pizza pizza;
    private String tamanho;
    private double total;
    private String entrega;

    public pedido(pizza pizza, String tamanho, String entrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.entrega = entrega;
        this.total = pizza.getValor(); 
    }

    
    public pizza getPizza() {
        return pizza;
    }

    public void setPizza(pizza pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
}

