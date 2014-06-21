/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jun 20, 2014, 6:13:45 PM (GMT)]
 */
package vazkii.botania.common.item.equipment.bauble;

import net.minecraft.item.ItemStack;
import vazkii.botania.common.core.handler.PixieHandler.IPixieSpawner;
import vazkii.botania.common.lib.LibItemNames;
import baubles.api.BaubleType;

public class ItemPixieRing extends ItemBauble implements IPixieSpawner {

	public ItemPixieRing() {
		super(LibItemNames.PIXIE_RING);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.RING;
	}

	@Override
	public float getPixieChance(ItemStack stack) {
		return 0.075F;
	}

}
