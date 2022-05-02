package dev.tim.chilliaxe;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TextureCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            player.setResourcePack("https://www.dropbox.com/sh/pct7l3unrpjr7va/AAC5gMDqbCJdRCDXFcGxGjjVa?dl=1");
        }

        return false;
    }
}
