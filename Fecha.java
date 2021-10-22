public class Fecha{
  private int dia;
  private int mes;
  private int anio;

  public Fecha(){}
  public Fecha(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
  }
  
  public int getDia(){
    return dia;
  }
  public void setDia(int dia){
    if(dia>31 || dia<1){
      System.out.println("ERROR no existe ese numero de dia en un mes");
    }else{
      this.dia=dia;
    }
  }
  public int getMes(){
    return mes;
  }
  public void setMes(int mes){
    if(mes<1 || mes>12){
      System.out.println("ERROR no exiten meses negativos o mayores a la numeracion 12");
    }else{
      this.mes=mes;
    }
  }
  public int getanio(){
    return anio;
  }
  public void setAnio(int anio){
    if(anio<0){
      System.out.println("ERROR no existen años negativos");
    }else{
    this.anio=anio;
    }
  }
  @Override
  public String toString(){
    return " Fecha{ dia= "+dia+" mes= "+mes+" anio= "+anio+"";
  }

}