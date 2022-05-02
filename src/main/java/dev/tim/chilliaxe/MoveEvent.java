package dev.tim.chilliaxe;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MoveEvent implements Listener {

    ChilliAxe main = ChilliAxe.getPlugin(ChilliAxe.class);

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getItemInHand();
        if(item.getType() == Material.NETHERITE_AXE && item.getItemMeta().getDisplayName() != null){
            if (item.getItemMeta().getDisplayName().equals(main.chilliAxe2)) {
                PotionEffect fireRes = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100, 1, false);
                player.addPotionEffect(fireRes);
            }
        }
    }

}
