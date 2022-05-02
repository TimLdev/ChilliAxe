package dev.tim.chilliaxe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().setResourcePack("https://www.dropbox.com/sh/pct7l3unrpjr7va/AAC5gMDqbCJdRCDXFcGxGjjVa?dl=1");
    }

}
