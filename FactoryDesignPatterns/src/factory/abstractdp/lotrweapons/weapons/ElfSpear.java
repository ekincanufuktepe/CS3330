package factory.abstractdp.lotrweapons.weapons;

public class ElfSpear implements Spear {

	@Override
	public void poke() {
		System.out.println("Poking with an elegant Elf spear");
	}

	@Override
	public void attack() {
		poke();
	}

}
