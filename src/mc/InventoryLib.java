package mc;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryLib {
	public static Inventory getPotionInv() {
		Inventory inventory = Bukkit.createInventory(null, 36, "Potion Inventory");
		inventory.setItem(0, ItemLib.getItem(ItemType.SPEED_POTION_1));
		inventory.setItem(1, ItemLib.getItem(ItemType.SPEED_POTION_1));
		inventory.setItem(2, ItemLib.getItem(ItemType.SPEED_POTION_1));
		inventory.setItem(3, ItemLib.getItem(ItemType.FIRE_POTION));
		inventory.setItem(4, ItemLib.getItem(ItemType.FIRE_POTION));
		inventory.setItem(5, ItemLib.getItem(ItemType.FIRE_POTION));
		inventory.setItem(6, ItemLib.getItem(ItemType.SPEED_POTION_2));
		inventory.setItem(7, ItemLib.getItem(ItemType.SPEED_POTION_2));
		inventory.setItem(8, ItemLib.getItem(ItemType.SPEED_POTION_2));

		for (int i = 9; i < 36; i ++) {
			inventory.setItem(i, ItemLib.getItem(ItemType.HEAL_POTION));
		}
		return inventory;
	}

	public static Inventory getItemInv() {
		Inventory inventory = Bukkit.createInventory(null, 27, "Item Inventory");

		ArrayList<ItemStack> arrayList = new ArrayList<>();

		for (ItemType type : ItemType.values()) {
			if (type.getKind() == ItemLib._POTION) {
				continue;
			}
			arrayList.add(ItemLib.getItem(type));
		}

		inventory.addItem(arrayList.toArray(new ItemStack[0]));

		return inventory;
	}
}
