public class Persona{
  //Atributos
  private String nombre;
  private String apellido;
  private Fecha fNacimiento;
  //Construcotres
  public Persona(){}
  public Persona(String nombre,String apellido,int dia,int mes, int anio){
    this.nombre=nombre;
    this.apellido=apellido;
    /*   //Esta forma es la mas larga de escribir y mas extensa
    fNacimiento=new Fecha();
    this.fNacimiento.setDia(dia);
    this.fNacimiento.setMes(mes);
    this.fNacimiento.setAnio(anio);
    */
    //Forma corta pero con la misma funcion
    fNacimiento=new Fecha(dia,mes,anio);
  }
  public Persona(String nombre,String apellido, Fecha fNacimiento){
    this.nombre=nombre;
    this.apellido=apellido;
    this.fNacimiento=fNacimiento;
  }
    //Procesos
  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getApellido(){
    return apellido;
  }
  public void setApellido(String apellido){
    this.apellido=apellido;
  }
  public Fecha getfNacimiento(){
    return fNacimiento;
  }
  public void setFNacimiento(Fecha fNacimiento){
    this.fNacimiento=fNacimiento;
  }


  @Override
  public String toString(){
    return "Persona{ Nombre="+nombre+" Apellido="+apellido+" Fecha de nacimiento="+fNacimiento+"}";
  }
}