package mc;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class ItemLib {
	final public static int _POTION = 0;
	final public static int _WEAPON = 1;
	final public static int _EQUIPMEMT = 2;
	final public static int _BOW = 3;
	final public static int _OTHER = 4;
	
	public static ItemStack getItem(ItemType type) {
		if (type.getKind() == _POTION) {
			return getPotion(type.getPotionType(), type.getLevel());
		} else if (type.getKind() == _WEAPON) {
			return getDiamondSword();
		} else if (type.getKind() == _EQUIPMEMT) {
			return getDiamondEquipment(type.getMaterial());
		} else if (type.getKind() == _BOW) {
			return getBow();
		} else {
			return getOtherItem(type.m);
		}
	}
	
	/**
	 * ポーションを取得
	 * @param type
	 * @param level
	 * @return
	 */
	private static ItemStack getPotion(PotionType type, int level) {
		Potion potion = new Potion(type);
		potion.setLevel(level);
		
		if (type.equals(PotionType.INSTANT_HEAL)) {
			potion.setSplash(true);
		} else {
			potion.setSplash(false);
		}
		return potion.toItemStack(1);
	}
	
	private static ItemStack getDiamondSword() {
		ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
		itemStack.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		itemStack.addEnchantment(Enchantment.DAMAGE_ALL, 2);
		return itemStack;
	}
	
	private static ItemStack getDiamondEquipment(Material m) {
		ItemStack itemStack = new ItemStack(m);
		itemStack.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		return itemStack;
	}
	
	private static ItemStack getBow() {
		ItemStack itemStack = new ItemStack(Material.BOW);
		itemStack.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		itemStack.addEnchantment(Enchantment.ARROW_FIRE, 1);
		itemStack.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
		return itemStack;
	}
	
	private static ItemStack getOtherItem(Material m) {
		ItemStack stack = new ItemStack(m);
		int size = stack.getMaxStackSize();
		stack.setAmount(size);
		return stack;
	}
	
	
}
