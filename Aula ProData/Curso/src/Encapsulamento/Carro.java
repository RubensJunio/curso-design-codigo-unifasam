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
		System.out.println("O veíclulo ligou!");
	}
	
	
	public void desligar() {
		ligado = false;
		System.out.println("O veículo desligou!");
	}
	
	public void acelerar() {
		if(!ligado) {
			try {
				throw new Exception("O carro não pode acelerar, pois ele está desligado.");
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

