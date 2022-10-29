package br.com.gjofre;

public class Ventilador {
	private static boolean LIGA = true;
	private static boolean DESLIGA = false;
	private static int VELOCIDADE_MAX = 3;
	private static int VELOCIDADE_MIN = 0;
	
	private String marca;
	private String modelo;
	private int potencia;
	private boolean estadoVentilador;
	private int velocidade;
	private String tipoVentilador;


	public Ventilador(String marca, String modelo, int potencia, String tipoVentilador) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.estadoVentilador = DESLIGA;
		this.velocidade = 0;
		this.tipoVentilador = tipoVentilador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isEstadoVentilador() {
		return estadoVentilador;
	}

	public void setEstadoVentilador(boolean estadoVentilador) {
		this.estadoVentilador = estadoVentilador;
	}

	public int getVelocidade() {
		return velocidade;
	}

	private void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipoVentilador() {
		return tipoVentilador;
	}

	public void setTipoVentilador(String tipoVentilador) {
		this.tipoVentilador = tipoVentilador;
	}

	public void ligarVentilador() {
		setEstadoVentilador(LIGA);
	}

	public void desligarVentilador() {
		setEstadoVentilador(DESLIGA);
	}

	public void aumentarVelocidade() {
		if (isEstadoVentilador()) {
			int novaVelocidade = getVelocidade() + 1;
			alterarVelocidade(novaVelocidade);
		}
	}

	public void diminuirVelocidade() {
		if (isEstadoVentilador()) {
			int novaVelocidade = getVelocidade() - 1;
			alterarVelocidade(novaVelocidade);
		}
	}

	private void alterarVelocidade(int novaVelocidade) {
		if (validaMudancaVelocidade(novaVelocidade))
			setVelocidade(novaVelocidade);
	}

	private boolean validaMudancaVelocidade(int velocidadeSolicidata) {
		if (velocidadeSolicidata > VELOCIDADE_MAX || velocidadeSolicidata < VELOCIDADE_MIN)
			return false;

		return true;
	}

	public String vento() {
		return tipoVento();
	}

	private String tipoVento() {
		String vento;
		int velocidadeAtual = getVelocidade();
		if (!isEstadoVentilador() || velocidadeAtual == 0) {
			vento = "Sem vento";
		} else if (velocidadeAtual == 1) {
			vento = "Vento fraco";
		} else if (velocidadeAtual == 2) {
			vento = "Vento médio";
		} else {
			vento = "Vento forte";
		}

		return vento;
	}

	@Override
	public String toString() {
		return "Ventilador ligado: " + isEstadoVentilador() + " \n" + "Velocidade definida: " + getVelocidade() + " \n"
				+ "------------------------";
	}

}
