import java.util.*;

public class TipoDias{

	public static void main(String[] args){


	System.out.println("Introduce un dia:\n");
	Scanner sc= new Scanner(System.in);
	
	String diaSemana= sc.next();
	String diaSemanaMinuscula=diaSemana.toLowerCase();

	String mensaje="";
	switch(diaSemanaMinuscula){

		case "Lunes":
			mensaje="es laborable";
			break;

		default:
			mensaje="no es laborable";
}

	System.out.printf("%s es %s\n", diaSemanaMinuscula, mensaje);


}


}
