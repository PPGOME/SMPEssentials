package me.ppgome.smpessentials.home;

import me.ppgome.smpessentials.SMPEssentials;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.naming.Name;

public class playerClickEvent implements Listener {
    @EventHandler
    public void wshardClick(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getItem() != null) {
                if (p.isSneaking()) {
                    if (event.getItem().getType() == Material.AMETHYST_SHARD) {
                        if (event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(SMPEssentials.getPlugin(),
                                "warpshard"), PersistentDataType.STRING) != null) {
                            if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(SMPEssentials.getPlugin(),
                                    "warpshard"), PersistentDataType.STRING)) {
                                event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',
                                        SMPEssentials.getPlugin().getConfig().getString("Prefix")) + ChatColor.YELLOW +
                                        " Warping in 5 seconds...");
                                Location loc = p.getLocation();
                                ItemStack currentitem = p.getInventory().getItem(EquipmentSlot.HAND);
                                if (currentitem.getAmount() > 0) {
                                    currentitem.setAmount(currentitem.getAmount() - 1);
                                    p.getInventory().setItem(EquipmentSlot.HAND, currentitem);
                                }

                                Bukkit.getScheduler().scheduleSyncDelayedTask(SMPEssentials.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Location check = p.getLocation();
                                        if (loc.getX() == check.getX() || loc.getZ() == check.getZ()) {
                                            Location bedloc = p.getBedSpawnLocation();
                                            bedloc.setDirection(p.getLocation().getDirection());
                                            p.teleport(bedloc);
                                        } else {
                                            p.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                                    SMPEssentials.getPlugin().getConfig().getString("Prefix")) +
                                                    " You moved. Teleport cancelled.");
                                            p.getInventory().addItem(warpHomeItem.getWarpShard());
                                        }
                                    }
                                }, 20 * 5);

                            }
                        }
                    }
                }
            }
        }
    }
}
