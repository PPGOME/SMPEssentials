package me.ppgome.smpessentials;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class Listeners implements Listener {

    @EventHandler
    public void onEntityDamaged(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player && e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) {
            Player p = (Player) e.getEntity();

            if (p.getInventory().getBoots() != null) {
                ItemStack bootslot = p.getInventory().getBoots();

                ItemMeta beebootmeta = bootslot.getItemMeta();

                PersistentDataContainer beebootdata = beebootmeta.getPersistentDataContainer();

                if (beebootdata.get(new NamespacedKey(SMPEssentials.getPlugin(), "beeboots"), PersistentDataType.STRING) != null) {
                    if (beebootdata.has(new NamespacedKey(SMPEssentials.getPlugin(), "beeboots"), PersistentDataType.STRING)) {
                        if (p.hasPermission("smp.beeboots")) {
                            e.setCancelled(true);
                            p.sendMessage(ChatColor.YELLOW + "*Your boots save you from the fall*");
                        } else
                            e.setCancelled(false);
                    }
                }
            } else {
                return;
            }
        }
    }
}
