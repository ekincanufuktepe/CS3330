package factory.abstractdp.lotrweapons.weapons;

public class ElfSword implements Sword {

	@Override
	public void swing() {
		System.out.println("Swinging a shiny Elf sword!");
	}

	@Override
	public void attack() {
		swing();
	}

}
