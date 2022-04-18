package me.ppgome.smpessentials.home;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class warpHomeItem {

    public static ItemStack getWarpShard() {
        ItemStack warpShard = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta warpShardMeta = warpShard.getItemMeta();
        //Item Name
        if (SMPEssentials.getPlugin().getConfig().getString("Home.WarpShardName") != null) {
            warpShardMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
                    SMPEssentials.getPlugin().getConfig().getString("Home.WarpShardName")));
        } else {
            warpShardMeta.setDisplayName("HI YOU BROKE SOMETHING LMAO. FILL IN THE NAME IN THE CONFIG PLS TY");
        }
        //Enchant
        warpShardMeta.addEnchant(Enchantment.ARROW_INFINITE, 1 ,true);
        //Lore
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(ChatColor.translateAlternateColorCodes('&',
                SMPEssentials.getPlugin().getConfig().getString("Home.WarpShardLore")));
        warpShardMeta.setLore(lore);
        //Persistent Data
        PersistentDataContainer warpShardData = warpShardMeta.getPersistentDataContainer();
        warpShardData.set(new NamespacedKey(SMPEssentials.getPlugin(), "warpshard"), PersistentDataType.STRING,
                "warpshard");
        //Set Meta
        warpShard.setItemMeta(warpShardMeta);

        return warpShard;
    }

}
