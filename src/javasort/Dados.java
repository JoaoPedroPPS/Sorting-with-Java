
package javasort;
import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private int chapter;
   private int volume;
   private String name;
   private String romanizedTitle;
   private int pages;



    /**
     * @return the data
     */
    public int getChapter() {
        return chapter;
    }

    /**
     * @param data the data to set
     */
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    /**
     * @return the cidade
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the condicao
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the condicao to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the temperatura_Tendencia
     */
    public String getRomanizedTitle() {
        return romanizedTitle;
    }


    public void setRomanizedTitle(String romanizedTitle) {
        this.romanizedTitle = romanizedTitle;
    }

    /**
     * @return the temperaturaMinima
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the temperaturaMinima to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    
  
    @Override
    public int compareTo(Dados outroDado){
      return this.getName().compareTo(outroDado.getName());
    }
    
//    
//     @Override
//    public String toString(){
//        return getCidade()+ " : " + getName() ;
//    }// fim toString;
    
}
