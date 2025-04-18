package factory.abstractdp.lotrweapons.weaponfactory;

import factory.abstractdp.lotrweapons.weapons.ElfSpear;
import factory.abstractdp.lotrweapons.weapons.ElfSword;
import factory.abstractdp.lotrweapons.weapons.Spear;
import factory.abstractdp.lotrweapons.weapons.Sword;

public class ElfWeaponFactory implements WeaponFactory {

	@Override
	public Spear createSpear() {
		return new ElfSpear();
	}

	@Override
	public Sword createSword() {
		return new ElfSword();
	}

}
