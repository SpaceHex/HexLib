package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;

public class ColoredString {
  /**
     * Creates a new ColoredString
     * @param string String to convert
     */
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
