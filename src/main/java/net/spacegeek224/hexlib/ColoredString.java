package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;

public class ColoredString extends String {
  private String original = "";
  private String res = "";
  public ColoredString(String s) {
    original = s;
    res = ChatColor.translateAlternateColorCodes('&',s);
  }
  public String getResult() {
    return res;
  }
  public String getOriginal() {
    return original;
  }
}
