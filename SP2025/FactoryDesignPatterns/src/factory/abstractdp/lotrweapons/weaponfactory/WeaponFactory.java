package factory.abstractdp.lotrweapons.weaponfactory;

import factory.abstractdp.lotrweapons.weapons.Spear;
import factory.abstractdp.lotrweapons.weapons.Sword;

public interface WeaponFactory {
	public Spear createSpear();
	public Sword createSword();
}
