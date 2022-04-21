package me.ppgome.smpessentials.funkyItems.beeBoots;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class BeeBoots {
    public static ItemStack getBeeBoots() {
        ItemStack beeBoots = new ItemStack(Material.GOLDEN_BOOTS);
        ItemMeta beebootmeta = beeBoots.getItemMeta();

        beebootmeta.setDisplayName(ChatColor.YELLOW + "MOTHERFUCKIN BEE BOOTS HELL YEAH");
        beebootmeta.setUnbreakable(true);

        PersistentDataContainer beebootdata = beebootmeta.getPersistentDataContainer();

        beebootdata.set(new NamespacedKey(SMPEssentials.getPlugin(), "beeboots"), PersistentDataType.STRING, "beeboots");

        beeBoots.setItemMeta(beebootmeta);
        return beeBoots;
    }
}
