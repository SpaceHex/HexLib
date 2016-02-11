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
	
	/**
	   * This method is used to add two integers. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param string  This is the second parameter to addNum method
	   */
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
