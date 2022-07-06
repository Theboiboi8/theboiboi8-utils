package theboiboi8.utils;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import theboiboi8.utils.enchants.FreezeEnchant;
import theboiboi8.utils.enchants.FrostEnchant;
import theboiboi8.utils.items.BetterPickaxeItem;
import theboiboi8.utils.items.InstasmeltPickaxe;
import theboiboi8.utils.materials.NetherrackMaterial;

import static net.minecraft.util.Rarity.*;

public class Utils implements ModInitializer {
	public static final ItemGroup UTILS = FabricItemGroupBuilder.create(new Identifier("utils", "general"))
			.icon(() -> new ItemStack(Items.NETHERITE_PICKAXE))
			.build();
	public static final Logger LOGGER = LoggerFactory.getLogger("Theboiboi8's Utils");
	public static final InstasmeltPickaxe INSTASMELT_PICK = new InstasmeltPickaxe(ToolMaterials.NETHERITE,
			3, -5F, new Item.Settings().group(UTILS).maxCount(1)
			.fireproof().rarity(EPIC));
	public static ToolItem NETHERRACK_PICK = new BetterPickaxeItem(NetherrackMaterial.INSTANCE,
			1, -3F, new Item.Settings().group(UTILS).maxCount(1).rarity(COMMON));
	public static Enchantment FROST = new FrostEnchant();
	public static Enchantment FREEZE = new FreezeEnchant();

	@Override
	public void onInitialize() {
		//Items
		Registry.register(Registry.ITEM, new Identifier("utils", "instasmelt_pick"), INSTASMELT_PICK);
		Registry.register(Registry.ITEM, new Identifier("utils", "netherrack_pick"), NETHERRACK_PICK);
		LOGGER.info("Loaded items");
		//Enchantments
		Registry.register(Registry.ENCHANTMENT, new Identifier("utils", "frost"), FROST);
		Registry.register(Registry.ENCHANTMENT, new Identifier("utils", "freeze"), FREEZE);
		LOGGER.info("Loaded enchantments");
	}
}
