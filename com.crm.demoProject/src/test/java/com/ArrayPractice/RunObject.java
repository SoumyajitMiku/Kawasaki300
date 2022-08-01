package com.ArrayPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RunObject {
	
	public static void main(String[] args) {
		EncapsulationPractice enp = new EncapsulationPractice("green","cello",20);
		System.out.println(enp.getColor());
		enp.write();
	}

}
