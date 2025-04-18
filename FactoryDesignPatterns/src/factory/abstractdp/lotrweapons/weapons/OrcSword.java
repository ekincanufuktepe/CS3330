package factory.abstractdp.lotrweapons.weapons;

public class OrcSword implements Sword {

	@Override
	public void swing() {
		System.out.println("Swinging an old rusty Orc sword...");
	}

	@Override
	public void attack() {
		swing();
	}

}
