package com.xworkz.encapsulation;

public class Operatoroneplusmobie {

	OneplusmobileDTO[] operator = new OneplusmobileDTO[4];
	int index = 0;

	public void add(OneplusmobileDTO name) {
		if (index < operator.length) {
			operator[index] = name;
			index++;
		}
	}

	public void printAll() {
		for (int index = 0; index < operator.length; index++) {
			if (operator[index] != null) {
				System.out.println(operator[index].toString());
			}
		}
	}

	public OneplusmobileDTO updateRamUsingModel(String model, byte ram) {
		OneplusmobileDTO oneplus = null;
		for (int index = 0; index < operator.length; index++) {
			if (operator[index] != null) {
				if (model.equals(operator[index].getModel())) {
					operator[index].setRam(ram);
					oneplus = operator[index];
				}
			}
		}
		return oneplus;
	}

	public OneplusmobileDTO deleteByModel(String model) {
		OneplusmobileDTO oneplus = null;
		for (int index = 0; index < operator.length; index++) {
			if (operator[index] != null) {
				if (model.equals(operator[index].getModel())) {
					operator[index] = null;
					oneplus = operator[index];
				}
			}
		}
		return oneplus;
	}

}
