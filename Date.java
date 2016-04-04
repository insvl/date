
public class Date {
	
	//los atributos siempre van en private y no se inicializan
	
	private int _dia;
	private int _mes;
	private int _agno;
	
	public Date(int dia, int mes, int agno){ 
		compruebaDia(dia, mes);
		_dia = dia;
		_mes = mes;
		_agno = agno;
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
	
	public int get_dia() {
		return _dia;
	}

	public void set_dia(int _dia) {
		this._dia = _dia;
	}

	public String get_mes() {
		String mes="";
		switch(_mes)
		{
		case 1: mes = "enero";
			break;
		case 2: mes = "febrero";
			break;
		case 3: mes = "marzo";
			break;
		case 4: mes = "abril";
			break;
		case 5: mes = "mayo";
			break;
		case 6: mes = "junio";
			break;
		case 7: mes = "julio";
			break;
		case 8: mes = "agosto";
			break;
		case 9: mes = "septiembre";
			break;
		case 10: mes = "octubre";
			break;
		case 11: mes = "noviembre";
			break;
		case 12: mes = "diciembre";
			break;
		} 
		return mes;
	}

	public void set_mes(int _mes) {
		this._mes = _mes;
	}

	public int get_agno() {
		return _agno;
	}

	public void set_agno(int _agno) {
		this._agno = _agno;
	}
}

