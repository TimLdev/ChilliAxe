package dev.tim.chilliaxe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChilliAxe extends JavaPlugin {

    String chilliAxe1 = getConfig().getString("chilli-axe-name");
    public String chilliAxe2 = chilliAxe1.replace('&', '§');

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        this.getServer().getPluginManager().registerEvents(new AxeHoldEvent(), this);
        this.getServer().getPluginManager().registerEvents(new MoveEvent(), this);
        getCommand("chilliaxe").setExecutor(new TextureCommand());

        Bukkit.addRecipe(getRecipe());

        loadConfig();
    }

    private ShapedRecipe getRecipe(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(chilliAxe2);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        meta.addEnchant(Enchantment.DIG_SPEED,5, true);
        meta.setUnbreakable(true);

        meta.setCustomModelData(1234567);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "custom_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("NR ", "RM ", " M ");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('R', Material.REDSTONE_BLOCK);
        recipe.setIngredient('M', Material.MAGMA_BLOCK);

        return recipe;
    }

    private ShapedRecipe getRecipe2(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(chilliAxe2);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        meta.addEnchant(Enchantment.DIG_SPEED,5, true);
        meta.setUnbreakable(true);

        meta.setCustomModelData(1234567);

        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "custom_axe");
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("NR ", "RM ", " M ");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('R', Material.REDSTONE_BLOCK);
        recipe.setIngredient('M', Material.MAGMA_BLOCK);

        return recipe;
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
