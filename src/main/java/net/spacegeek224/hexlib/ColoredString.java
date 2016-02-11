package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;
/**
* A class to help with ChatColors.
* @author  Maris Usis
* @version 0.1
* @since   2016-02-11
*/

public class ColoredString {
  
	private String original;
	private String res;
	public ColoredString(String string) {
		this.original = string;
		this.res = ChatColor.translateAlternateColorCodes('&',string);
	}
	public String getResult() {
		return this.res;
	}

	public String getOriginal() {
		return this.original;
	}
}
