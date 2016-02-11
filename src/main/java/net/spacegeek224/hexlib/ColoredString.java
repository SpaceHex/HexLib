package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;

public class ColoredString {
  
	private String original;
	private String res;
	/**
	* Creates a new ColoredString
	* @param string String to convert
	*/
	public ColoredString(String string) {
		this.original = string;
		this.res = ChatColor.translateAlternateColorCodes('&',string);
	}
	/**
	* Creates a new ColoredString
	* @return String res
	*/
	public String getResult() {
		return this.res;
	}
	/**
	* Creates a new ColoredString
	* @return String original
	*/
	public String getOriginal() {
		return this.original;
	}
}
