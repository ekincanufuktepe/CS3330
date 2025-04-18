package factory.abstractdp.lotrweapons;

import java.util.ArrayList;
import java.util.List;

import factory.abstractdp.lotrweapons.weaponfactory.ElfWeaponFactory;
import factory.abstractdp.lotrweapons.weaponfactory.OrcWeaponFactory;
import factory.abstractdp.lotrweapons.weaponfactory.WeaponFactory;
import factory.abstractdp.lotrweapons.weapons.OrcSword;
import factory.abstractdp.lotrweapons.weapons.Sword;
import factory.abstractdp.lotrweapons.weapons.Weapon;

public class Main {

	public static void main(String[] args) {
		WeaponFactory factory = new ElfWeaponFactory();
		List<Weapon> weaponList = new ArrayList<Weapon>();
		weaponList.add(factory.createSword());
		weaponList.add(factory.createSpear());
		weaponList.add(factory.createSword());
		weaponList.add(factory.createSword());
		factory = new OrcWeaponFactory();
		weaponList.add(factory.createSword());
		weaponList.add(factory.createSpear());
		
		for(Weapon sword : weaponList) {
//			System.out.println(sword.getClass());
			if(sword instanceof Sword) {
				System.out.println("I found an orc sword");
				sword.attack();
			}
		}
		
		Weapon rock = new Sword() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void swing() {
				// TODO Auto-generated method stub
				
			}
		};
		rock.attack();
		
	}

}
