package parcialpeaje;

public class Camion2Ejes {
    private String placa;
    private String marca;
    private int valorPeaje=20000;
    
    public Camion2Ejes(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    } 
        
    public String getPlaca() {
        return placa;
    }   
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "Camion2Ejes{" + "placa=" + placa + ", marca=" + marca + ", valorPeaje=" + valorPeaje + '}';
    }    
    
}
