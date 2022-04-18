package me.ppgome.smpessentials.misc;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class buddingAmethyst implements Listener {

    //BUDDING AMETHYST SILK TOUCH
    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event) {
        if (!SMPEssentials.getPlugin().getConfig().getBoolean("SilkTouchAmethyst"))
            return;
        if (!event.getBlock().getType().equals(Material.BUDDING_AMETHYST))
            return;
        if (event.getPlayer().getGameMode().equals(GameMode.CREATIVE))
            return;
        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR))
            return;
        if (!event.getPlayer().getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.SILK_TOUCH))
            return;

        int chance = new Random().nextInt(10);

        if (chance < 7) {
            event.setExpToDrop(0);
            event.setDropItems(false);
            Location loc = event.getBlock().getLocation();
            World world = event.getBlock().getWorld();

            world.dropItemNaturally(loc, new ItemStack(Material.BUDDING_AMETHYST));
        }
    }
}
