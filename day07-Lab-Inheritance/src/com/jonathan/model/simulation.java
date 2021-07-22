package com.jonathan.model;

public class simulation {

	public static void main(String[] args) {
		//missing something here, my simulation class is not working somehow!
		flyingcar fv = new flyingcar((short)4, new Engine());
        fv.setName("A New Flying Vehicle");
        System.out.println(fv.getName());

        airplane boeing = new airplane((short)4, (short)5);
        boeing.move(15);
	}

}
