package Encapsulamento;

public class Carro {
	public String modelo;
	public String marca;
	public String cor;
	private String placa;
	private boolean ligado;
	
	
	public Carro() {
		ligado = false;
	}
	
	public void ligar() {
		ligado = true;
		System.out.println("O ve�clulo ligou!");
	}
	
	
	public void desligar() {
		ligado = false;
		System.out.println("O ve�culo desligou!");
	}
	
	public void acelerar() {
		if(!ligado) {
			try {
				throw new Exception("O carro n�o pode acelerar, pois ele est� desligado.");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("O carro foi acelerado");	
			
		}
	
		}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}

