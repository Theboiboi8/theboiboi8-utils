package theboiboi8.utils.materials;

import net.minecraft.block.Blocks;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetherrackMaterial implements ToolMaterial {
	public static final NetherrackMaterial INSTANCE = new NetherrackMaterial();

	@Override
	public int getDurability() {
		return 500;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 0.75F;
	}

	@Override
	public float getAttackDamage() {
		return 1.5F;
	}

	@Override
	public int getMiningLevel() {
		return 1;
	}

	@Override
	public int getEnchantability() {
		return 2;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Blocks.NETHERRACK);
	}
}
