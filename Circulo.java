public class Circulo{
 private float radio;
  // a pi ya lo conoce la pc
  public Circulo(){}

  public float perimetro(){
    return 2 * (float)Math.PI * radio;//Se transforma el double a float
  }
  public float area(){
    return (float) Math.PI * radio * radio;
  }
  public float getRadio(){
    if(radio<0){
      this.radio=Math.abs(radio);
    }else{
      this.radio=radio;
    }
    return radio;
  }
  public void setRadio(float radio){
  if(radio<0){
    this.radio=Math.abs(radio);
  }else{
  this.radio=radio;
  }
}
  @Override
  public String toString(){//importante juntar toString
    return "Circulo{ radio= "+radio+" } ";//importante no olvidar el + al final si se quiere agregar algo
  }
}