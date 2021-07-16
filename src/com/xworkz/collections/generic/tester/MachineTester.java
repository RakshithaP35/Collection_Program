package com.xworkz.collections.generic.tester;

import com.xworkz.collection.constants.Type;
import com.xworkz.collection.generic.examples.MachineDto;

public class MachineTester {

	public static void main(String[] args) {
		MachineDto machine = new MachineDto("India", Type.straightener, "Steel", 2000);
		System.out.println(machine);

		MachineDto machine1 = new MachineDto("G&N", Type.SweingMacine, "Metal", 20000);
		System.out.println(machine1);
		System.out.println(machine.equals(machine1));
	}
}
