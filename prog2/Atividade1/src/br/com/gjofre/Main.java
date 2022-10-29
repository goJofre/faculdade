package br.com.gjofre;

public class Main {

	public static void main(String[] args) {

		Ventilador ventilador = new Ventilador("V", "Xyp9x", 75, "teto");
		System.out.println(ventilador.toString());

		ventilador.ligarVentilador();
		ventilador.aumentarVelocidade();
		ventilador.aumentarVelocidade();
		System.out.println(ventilador.toString());
		System.out.println(ventilador.vento());

		ventilador.diminuirVelocidade();
		ventilador.diminuirVelocidade();
		ventilador.diminuirVelocidade();
		System.out.println(ventilador.toString());
		System.out.println(ventilador.vento());

		System.out.println("-----------------");
		System.out.println("Marca: " + ventilador.getMarca());
		System.out.println("Modelo: " + ventilador.getModelo());
		System.out.println("Potência: " + ventilador.getPotencia() + "w");
		System.out.println("Ligado: " + ventilador.isEstadoVentilador());
		System.out.println("Velocidade: " + ventilador.getVelocidade());
		System.out.println("Tipo Ventilador: " + ventilador.getTipoVentilador());

	}

}
