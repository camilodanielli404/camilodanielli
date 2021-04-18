import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int selector=entrada.nextInt();
  	  vuelo[] vuelos = new vuelo[10];
  	  aeropuertos[] aeropuerto= new aeropuertos[5];
System.out.println("bienvenido a control de vuelos");
System.out.println("que desea hacer?");
System.out.println("1: mostrar lista de aeropuertos");
System.out.println("2: mostrar lista de vuelos");
      selector=entrada.nextInt();
      switch (selector) {
      case 1:
    	  for(int i =0;i<vuelos.length;i++) {
    		  System.out.println(aeropuerto[i]);
    	  }
      }
}
}
