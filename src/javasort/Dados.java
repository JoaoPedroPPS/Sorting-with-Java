
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String data;
   private String cidade;
   private String condicao;
   private String temperaturaTendencia;
   private int temperaturaMinima;
   private int temperaturaMaxima;
   private int ventoVelocidadeMinima;
   private int ventoVelocidadeMaxima;
   private String ventoDirecao;



    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the condicao
     */
    public String getCondicao() {
        return condicao;
    }

    /**
     * @param condicao the condicao to set
     */
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    /**
     * @return the temperatura_Tendencia
     */
    public String getTemperaturaTendencia() {
        return temperaturaTendencia;
    }


    public void setTemperaturaTendencia(String temperaturaTendencia) {
        this.temperaturaTendencia = temperaturaTendencia;
    }

    /**
     * @return the temperaturaMinima
     */
    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    /**
     * @param temperaturaMinima the temperaturaMinima to set
     */
    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    /**
     * @return the temperaturaMaxima
     */
    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    /**
     * @param temperaturaMaxima the temperaturaMaxima to set
     */
    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    /**
     * @return the ventoVelocidadeMinima
     */
    public int getVentoVelocidadeMinima() {
        return ventoVelocidadeMinima;
    }

    /**
     * @param ventoVelocidadeMinima the ventoVelocidadeMinima to set
     */
    public void setVentoVelocidadeMinima(int ventoVelocidadeMinima) {
        this.ventoVelocidadeMinima = ventoVelocidadeMinima;
    }

 
    public int getVentoVelocidadeMaxima() {
        return ventoVelocidadeMaxima;
    }


    public void setVentoVelocidadeMaxima(int ventoVelocidadeMaxima) {
        this.ventoVelocidadeMaxima = ventoVelocidadeMaxima;
    }

 
    public String getVentoDirecao() {
        return ventoDirecao;
    }


    public void setVentoDirecao(String ventoDirecao) {
        this.ventoDirecao = ventoDirecao;
    }
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getCidade().
              compareTo(outroDado.getCidade());
    }
    
    
     @Override
    public String toString(){
        return getCidade()+ " : " + getCondicao() ;
    }// fim toString
    
}
