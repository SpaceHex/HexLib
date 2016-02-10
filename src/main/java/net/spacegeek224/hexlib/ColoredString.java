package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;

public class ColoredString {
  /**
     * Creates a new ColoredString
     * @param string String to convert
     */
  public ColoredString(String string) {
    this.original = s;
    this.res = ChatColor.translateAlternateColorCodes('&',s);
  }
  public String getResult() {
    return this.res;
  }
  public String getOriginal() {
    return this.original;
  }
}
