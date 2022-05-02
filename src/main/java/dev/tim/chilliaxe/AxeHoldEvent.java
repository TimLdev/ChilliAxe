package dev.tim.chilliaxe;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AxeHoldEvent implements Listener {

    ChilliAxe main = ChilliAxe.getPlugin(ChilliAxe.class);

    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent e) {
        Player player = e.getPlayer();
        int i = e.getNewSlot();
        ItemStack item = e.getPlayer().getInventory().getItem(i); //this get the item in the selected slot (i)
        if (item != null && item.getItemMeta().getDisplayName() != null) {//check if there is an item and if the item has a lore
            if (item.getType() == Material.NETHERITE_AXE) {
                if (item.getItemMeta().getDisplayName().equals(main.chilliAxe2)) { //check if the lore contains Speed
                    PotionEffect fireRes = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100, 1, false);
                    player.addPotionEffect(fireRes);
                }
            }
        }
    }

}
