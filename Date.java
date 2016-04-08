public class Main {

	public static void main(String[] args) {
		Date fecha = new Date (5,5,17);
		fecha.restoMeses();
		//System.out.println(fecha.restoMeses);
		
		fecha.restoDiasMes();
		
		
		
		
		//Date fecha2 = new Date (5, 5, 17);
		//System.out.println(fecha.get_mes());
		//fecha.isSameDay(fecha2);
		
		
	}
	
	public void compruebaDia(int dia, int mes){
		if(mes == 1 && dia < 0 || dia > 31){
			System.out.println("Error en enero.");
		}
		if(mes == 2 && dia < 0 || dia > 28){
			System.out.println("Error en febrero.");
		}
		if(mes == 3 && dia < 0 || dia > 31){
			System.out.println("Error en marzo.");
		}
		if(mes == 4 && dia < 0 || dia > 30){
			System.out.println("Error en abril.");
		}
		if(mes == 5 && dia < 0 || dia > 31){
			System.out.println("Error en mayo.");
		}
		if(mes == 6 && dia < 0 || dia > 30){
			System.out.println("Error en junio.");
		}
		if(mes == 7 && dia < 0 || dia > 31){
			System.out.println("Error en julio.");
		}
		if(mes == 8 && dia < 0 || dia > 31){
			System.out.println("Error en agosto.");
		}
		if(mes == 9 && dia < 0 || dia > 30){
			System.out.println("Error en septiembre.");
		}
		if(mes == 10 && dia < 0 || dia > 31){
			System.out.println("Error en octubre.");
		}
		if(mes == 11 && dia < 0 || dia > 30){
			System.out.println("Error en noviembre.");
		}
		if(mes == 12 && dia < 0 || dia > 31){
			System.out.println("Error en diciembre.");
		}	
	}

}
