package mc;

import java.io.Serializable;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerInv implements Serializable{

	UUID id;

	ItemType[] equipment = new ItemType[4];

	ItemType[] inventory = new ItemType[36];



	public PlayerInv(Player p) {
		id = p.getUniqueId();

	}
}
