/**
*@EduardoCruzMartinez
*/
class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f); 
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);
    float var=-8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("************Composicion************");
    Persona persona1=new Persona();
    System.out.println(persona1);
    persona1.setNombre("Tamara");
    persona1.setApellido("Barrera");
    Fecha fecha=new Fecha(22,7,2002);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getfNacimiento().getanio());
    System.out.println("********Composicion2*******");
    Persona persona2=new Persona("Eduardo","Cruz",13,10,2001);
    System.out.println(persona2);
    System.out.println("*******Actividad extra*******");
    Persona persona3=new Persona("Maxim","Hernandez",9,5,2005);
    Persona persona4=new Persona("Enrique","Madrigal",2,6,2006);
    Carro carro1=new Carro("Mazda",1998,"Negro",4,true,800,persona1,persona2,persona3,persona4);
    System.out.println(carro1);
    Carro carro2=new Carro("Subaru",1995,"Azul",4,false,700,"Eduardo","Cruz",13,10,2001,"Nicole","Todd",14,2,2002,"Dante","Zepeda",19,2,2002,"Sergio","Madrigal",26,5,2002);
    System.out.println(carro2);
  }
}