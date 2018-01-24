package br.com.smileyy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MG extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin: xMinigamesGUI");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Author: Smileyy");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Status: Habilitado");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "------------------------------");
		
	}
	
	@Override
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Plugin: xMinigamesGUI");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Version: 1.0");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Author: Smileyy");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Status: Desabilitado");
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "------------------------------");
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("gui")){
			if(sender instanceof Player){
				
			}else{
				sender.sendMessage(ChatColor.RED + "[!] Comando Apenas Para Players [!]");
			}
		}
		return false;
	}

}
