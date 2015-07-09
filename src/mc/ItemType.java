package mc;

import org.bukkit.Material;
import org.bukkit.potion.PotionType;

public enum ItemType {
	SWORD(ItemLib._WEAPON, Material.DIAMOND),
	HELMET(ItemLib._EQUIPMEMT ,Material.DIAMOND_HELMET),
	CHESTPLATE(ItemLib._EQUIPMEMT, Material.DIAMOND_CHESTPLATE),
	LEGGINGS(ItemLib._EQUIPMEMT, Material.DIAMOND_LEGGINGS),
	BOOTS(ItemLib._EQUIPMEMT, Material.DIAMOND_BOOTS),
	HEAL_POTION(ItemLib._POTION ,PotionType.INSTANT_HEAL, 2),
	SPEED_POTION_1(ItemLib._POTION ,PotionType.SPEED, 1),
	SPEED_POTION_2(ItemLib._POTION ,PotionType.SPEED, 2),
	FIRE_POTION(ItemLib._POTION ,PotionType.FIRE_RESISTANCE, 1),
	BOW(ItemLib._BOW ,Material.BOW),
	ARROW(ItemLib._OTHER ,Material.ARROW),
	MILK(ItemLib._OTHER, Material.MILK_BUCKET),
	BEEF(ItemLib._OTHER, Material.COOKED_BEEF),
	CHICKEN(ItemLib._OTHER, Material.COOKED_CHICKEN),
	POTATO(ItemLib._OTHER, Material.BAKED_POTATO),
	CARROT(ItemLib._OTHER, Material.GOLDEN_CARROT),
	PEARL(ItemLib._OTHER, Material.ENDER_PEARL);
	
	Material m;
	ItemType(int kind, Material m) {
		this.m = m;
		this.kind = kind;
	}
	
	PotionType type;
	int level;
	int kind;
	ItemType(int kind, PotionType pType, int level) {
		m = Material.POTION;
		this.type = pType;
		this.level = level;
		this.kind = kind;
	}
	
	public PotionType getPotionType() {
		return type;
	}
	
	public Material getMaterial() {
		return m;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getKind() {
		return kind;
	}
}