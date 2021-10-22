class Carro{
//Seleción de atributos 
private String color;
private String marca;
private int numPuerta;
private int anio;
private int potencia;
private boolean automatico;
//ATRIBUTOS PERSONA
private Persona chofer;
private Persona copiloto;
private Persona pasajero1;
private Persona pasajero2;
private Fecha fecha; //Guardar fechas pivote
//Constructores actividad
public Carro(String marca, int anio, String color, int numPuerta, boolean automatico, int potencia,String nombre,String apellido, int dia,int mes,int año,String nombre2,String apellido2, int dia2,int mes2,int año2,String nombre3,String apellido3, int dia3,int mes3,int año3,String nombre4,String apellido4, int dia4,int mes4,int año4){
  this.marca=marca;
  this.anio=anio;
  this.color=color;
  this.numPuerta=numPuerta;
  this.automatico=automatico;
  this.potencia=potencia;
  chofer=new Persona(nombre,apellido,fecha=new Fecha(dia,mes,año));
  copiloto=new Persona(nombre2,apellido2,fecha=new Fecha(dia2,mes2,año2));
  pasajero1=new Persona(nombre3,apellido3,fecha=new Fecha(dia3,mes3,año3));
  pasajero2=new Persona(nombre4,apellido4,fecha=new Fecha(dia4,mes4,año4));
}
//Constructores anteriores
public Carro(){}
public Carro(String marca, int anio, String color, int numPuerta, boolean automatico, int potencia,Persona chofer,Persona copiloto, Persona pasajero1, Persona pasajero2){
this.marca=marca;
this.anio=anio;
this.color=color;
this.numPuerta=numPuerta;
this.automatico=automatico;
this.potencia=potencia;
this.chofer=chofer;
this.copiloto=copiloto;
this.pasajero1=pasajero1;
this.pasajero2=pasajero2;
}
//Procesos de actividad
public String getMarca(){
  return marca;
}
public void setMarca(String marca){
  this.marca=marca;
}
public int gedAnio(){
  return anio;
}
public void setAnio(int anio){
  if(anio<0){
    System.out.println("ERROR ESO NO ES POSIBLE");
  }else{
    this.anio=anio;
  }
}
public String getColor(){
  return color;
}
public void setColor(String color){
  this.color=color;
}
public int getNumpuerta(){
  return numPuerta;
}
public void setNumpuerta(int numPuerta){
  this.numPuerta=numPuerta;
}
public boolean getAutomatico(){
  return automatico;
}
public void setAutomatico(boolean automatico){
  this.automatico=automatico;
}
public int getPotencia(){
  return potencia;
}
public void setPotencia(int potencia){
  this.potencia=potencia;
}
public Persona getChofer(){
  return chofer;
}
public void setChofer(Persona chofer){
  this.chofer=chofer;
}
public Persona getCopiloto(){
  return copiloto;
}
public void setCopiloto(Persona copiloto){
  this.copiloto=copiloto;
}
public Persona getPasajero1(){
  return pasajero1;
}
public void setPasajero1(Persona pasajero1){
  this.pasajero1=pasajero1;
}
public Persona getPasajero2(){
  return pasajero2;
}
public void setPasajero2(Persona pasajero2){
  this.pasajero2=pasajero2;
}
//Procesos anteriores
public void encender(){
  System.out.println("Soy el automovil de la marca "+marca+"y estoy encendiendo");
}
public void avanzar(boolean avanza){
  if(avanza){
    System.out.println("Estoy avanzando a 10 km/h");
  }else{
    System.out.println("Voy a 0 km/h");
  }
}
public void apagar(){
  System.out.println("Soy el automovil de "+marca+" y estoy apagandome");
}
public void frenar(boolean frena){
  if(frena){
    System.out.println("Estoy frenando");
  }else{
    System.out.println("No estoy frenando");
  }
}
public void abrirpuertas(int numPuertaAbir){
if(numPuertaAbir>numPuerta){
  System.out.println("ERROR. El numero de puertas a abrir es mayor al numero de puertas del automovil");
}else{
  System.out.println("Abriendo "+ numPuertaAbir+" Puertas");
}
}


@Override
public String toString(){
  return "Automovil{"+" marca="+marca+", año="+anio+", color="+color+", numero de puertas="+numPuerta+", automatico="+automatico+",  potencia="+potencia+" Chofer= "+chofer+" copiloto= "+copiloto+" Pasajero1= "+pasajero1+" Pasajero2= "+pasajero2+" }";
}
}