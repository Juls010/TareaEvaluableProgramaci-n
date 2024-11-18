package cuentaBancaria;

import cuentaBancaria.CuentaB.tipoCuenta;

public class CuentaB {

	public String nombre;
	public String apellidos;
	public String numeroCuenta;
	private tipoCuenta tipoCuenta;
	public enum tipoCuenta{AHORRO,CORRIENTE}
	public int saldoCuenta = 0;
	
	public CuentaB(String nombre,String apellidos,String numeroCuenta, tipoCuenta tipoCuenta, int saldoCuenta ) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.numeroCuenta=numeroCuenta;
		this.tipoCuenta=tipoCuenta;
		this.saldoCuenta=saldoCuenta;
	}
	
	@Override
	public String toString() {
		
		return "El nombre del titular es: "+nombre+", apellidos: "+apellidos+
				", el numero de cuenta: "+numeroCuenta+", el tipo de cuenta: "+tipoCuenta+" , y el saldo es: "+saldoCuenta;
	}
	
	//metodos de todos los atributos menos del set de numero de cuenta porque no se puede cambiar:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public tipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(tipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public int getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(int saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	} 
	
	public void  saldoActual() {
		System.out.println("El saldo actual de la cuenta es: "+ saldoCuenta);
	}
	
	public void ingresoDinero(int ingreso) {
		if(saldoCuenta>=0) {
			saldoCuenta+=ingreso;
		}
		
	}
	
	public void retiroDinero(int retirada) {
		
		if(saldoCuenta>retirada) {
			saldoCuenta-=retirada;
		}else {
			System.out.println("Cantidad incorrecta");
		}
		if(retirada<=0) {
			System.out.println("Cantidad incorrecta");
		}
		if(saldoCuenta<0) {
			saldoCuenta=0;
		}
	}
	
	
		
}
