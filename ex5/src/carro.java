public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velAt;


    public carro(String marca, String modelo, int ano, String placa, float velAt){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velAt = velAt;
    }

    public void acelerar(int aceleracao){
        if ( aceleracao > 0){
            velAt += aceleracao;
            System.out.println("Acelerando...velocidade atual: " + velAt + "km/h");            
        }
    }

    public void frear(int desaceleracao){
        if ( desaceleracao > 0 && velAt >= desaceleracao ){
            velAt -= desaceleracao;
            System.out.println("Freando...velocidade atual: " + velAt + "km/h");
        } else if (desaceleracao > 0 && velAt < desaceleracao ){
            velAt = 0;
            System.out.println("O carro esta parado.");
        }
    }

    public void exibirInfo(){
        System.out.println("marca:" + marca);
        System.out.println("modelo:" + modelo);
        System.out.println("ano:" + ano);
        System.out.println("placa:" + placa);
        System.out.println("velocidade atual:" + velAt + "km/h");
    }
}

