package me.ppgome.smpessentials.home;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class warpShardRecipe {
    public static void wShardRecipe() {
        ItemStack wshard = warpHomeItem.getWarpShard();
        ItemMeta wshardmeta = wshard.getItemMeta();
        NamespacedKey wshardkey = new NamespacedKey(SMPEssentials.getPlugin(), "warpshard");

        ShapedRecipe wshardrecipe = new ShapedRecipe(NamespacedKey.minecraft("warpshard"), wshard);

        wshardrecipe.shape(
                "IAI",
                "AGA",
                "IAI"
        );

        wshardrecipe.setIngredient('A', Material.AMETHYST_SHARD);
        wshardrecipe.setIngredient('G', Material.GLOWSTONE_DUST);
        wshardrecipe.setIngredient('I', Material.GOLD_INGOT);
        Bukkit.getServer().addRecipe(wshardrecipe);
    }
}
