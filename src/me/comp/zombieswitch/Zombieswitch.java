package me.comp.zombieswitch;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Zombieswitch extends JavaPlugin {
	public static Zombieswitch plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	 
	   public void onDisable() {
		  PluginDescriptionFile pdffile = this.getDescription();
		  this.logger.info(pdffile.getName() + "is now disabled.");
	   }
	 
	   public void onEnable() {
		  PluginDescriptionFile pdffile = this.getDescription();
		  this.logger.info(pdffile.getName() + "is now enabled.");
		  getConfig().options().copyDefaults(true);
		  this.saveDefaultConfig();
	   }
	   //version will not build correctly, need to update.. fun.. not..
}
