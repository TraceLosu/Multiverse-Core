package com.onarandombox.MultiVerseCore.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.onarandombox.MultiVerseCore.MVCommandHandler;
import com.onarandombox.MultiVerseCore.MultiVerseCore;
import com.onarandombox.utils.LocationManipulation;

public class MVCoord extends MVCommandHandler {

    private LocationManipulation locMan = new LocationManipulation();
    
    public MVCoord(MultiVerseCore plugin) {
        super(plugin);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean perform(CommandSender sender, String[] args) {
        // TODO: Add Permissions
        if(sender instanceof Player){
            Player p = (Player) sender;
            
            p.sendMessage(ChatColor.RED + "World: " + ChatColor.WHITE + p.getWorld().getName());
            p.sendMessage(ChatColor.RED + "Compression: " + ChatColor.WHITE + plugin.worlds.get(p.getWorld().getName()).compression);
            p.sendMessage(ChatColor.RED + "Coordinates: " + ChatColor.WHITE + locMan.strCoords(p.getLocation()));
            p.sendMessage(ChatColor.RED + "Direction: " + ChatColor.WHITE + locMan.getDirection(p.getLocation()));
            p.sendMessage(ChatColor.RED + "Block: " + ChatColor.WHITE + Material.getMaterial(p.getWorld().getBlockTypeIdAt(p.getLocation())));
        }
        return true;
    }

}
