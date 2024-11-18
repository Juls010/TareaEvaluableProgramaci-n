package cuentaBancaria;
import cuentaBancaria.CuentaB.tipoCuenta;

public class Main {

	public static void main(String[] args) {
		CuentaB cuenta1 = new CuentaB("Julia", "Naranjo", "20252593781398972893", tipoCuenta.AHORRO , 500);

		System.out.println("El numero de cuenta es: "+cuenta1.numeroCuenta);
		System.out.println("El tipo de cuenta es: "+cuenta1.getTipoCuenta());
		cuenta1.ingresoDinero(100);
		System.out.println("El saldo actual es: "+cuenta1.getSaldoCuenta());
		cuenta1.retiroDinero(700);
		System.out.println("El saldo actual es: "+cuenta1.getSaldoCuenta());
		
		
		
		
		
		
	}

}
