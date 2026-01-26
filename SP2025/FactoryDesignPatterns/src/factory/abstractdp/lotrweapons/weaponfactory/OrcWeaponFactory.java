package factory.abstractdp.lotrweapons.weaponfactory;

import factory.abstractdp.lotrweapons.weapons.OrcSpear;
import factory.abstractdp.lotrweapons.weapons.OrcSword;
import factory.abstractdp.lotrweapons.weapons.Spear;
import factory.abstractdp.lotrweapons.weapons.Sword;

public class OrcWeaponFactory implements WeaponFactory {

	@Override
	public Spear createSpear() {
		return new OrcSpear();
	}

	@Override
	public Sword createSword() {
		return new OrcSword();
	}

}
