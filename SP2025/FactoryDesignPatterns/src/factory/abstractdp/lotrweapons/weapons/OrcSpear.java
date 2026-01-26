package factory.abstractdp.lotrweapons.weapons;

public class OrcSpear implements Spear {

	@Override
	public void poke() {
		System.out.println("Poking with an Orc Spear!");
	}

	@Override
	public void attack() {
		poke();
	}
	
	

}
