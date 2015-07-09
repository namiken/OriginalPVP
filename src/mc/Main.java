package mc;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Wool;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler(ignoreCancelled = true)
	public void openInv(PlayerInteractEvent event) {
		if (event.getAction() != Action.LEFT_CLICK_BLOCK) {
			return;
		}
		
		Block block = event.getClickedBlock();
		if (block == null) {
			return;
		}
		
		if (block.getType() == Material.CHEST) {
			Location location = block.getLocation();
			location.add(0, -1, 0);
			
			Block wool = location.getBlock();
			if (wool == null) {
				return;
			}
			if (wool.getType().equals(Material.WOOL)) {
				DyeColor color = ((Wool)wool.getState().getData()).getColor();
				Player p = event.getPlayer();
				if (color.equals(DyeColor.RED)) {
					p.openInventory(InventoryLib.getItemInv());
					event.setCancelled(true);
				} else if (color.equals(DyeColor.BLUE)) {
					p.openInventory(InventoryLib.getPotionInv());
					event.setCancelled(true);
				}
			}
		}
	}
}
