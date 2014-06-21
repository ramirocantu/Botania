package vazkii.botania.common.item.equipment.armor.elementium;

import net.minecraft.item.ItemStack;
import vazkii.botania.common.lib.LibItemNames;

public class ItemElementiumLegs extends ItemElementiumArmor {

	public ItemElementiumLegs() {
		super(2, LibItemNames.ELEMENTIUM_LEGS);
	}

	@Override
	public float getPixieChance(ItemStack stack) {
		return 7F / (25F / 24F) * 1.5F;
	}

}
