package br.com.gojofre;

import java.time.Period;
import java.time.ZoneId;

import java.util.Date;

import java.util.HashMap;

public class Cidadao extends Pessoa {

	private HashMap<Integer, Date> datasDoseVacina = new HashMap<Integer, Date>();

	public void setDataDoseVacina(int dose, Date data) {
		datasDoseVacina.put(dose, data);
	}

	public HashMap<Integer, Date> getDatasDoseVacina() {
		return datasDoseVacina;
	}

	public Date getDataVacina(int dose) {
		return datasDoseVacina.get(dose);
	}

	public boolean validaData(int i, Date dataAtual) {
		int doseAnterior = i - 1;
		if (doseAnterior == 0)
			return true;
		Date anterior = getDataVacina(doseAnterior);

		Period p = Period.between(anterior.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				dataAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

		if (p.getYears() > 0)
			return true;
		if (p.getMonths() < 4)
			return false;

		return true;
	}
}
