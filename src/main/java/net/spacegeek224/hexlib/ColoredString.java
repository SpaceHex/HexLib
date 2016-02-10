package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;

public class ColoredString {
  public ColoredString(String s) {
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
