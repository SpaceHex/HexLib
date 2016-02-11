package net.spacegeek224.hexlib;

import org.bukkit.ChatColor;
/**
 * All coordinates which appear as arguments to the methods of this
 * Graphics object are considered relative to the translation origin
 * of this Graphics object prior to the invocation of the method.
 * All rendering operations modify only pixels which lie within the
 * area bounded by both the current clip of the graphics context
 * and the extents of the Component used to create the Graphics object.
 * 
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @version     %I%, %G%
 * @since       1.0
 */

public class ColoredString {
  
	private String original;
	private String res;
	/**
	 * Creates a new ColoredString
	 * 
	 * @param string string to convert
	 */
	public ColoredString(String string) {
		this.original = string;
		this.res = ChatColor.translateAlternateColorCodes('&',string);
	}
	/**
	* Creates a new ColoredString
	* 
	* @return res
	*/
	public String getResult() {
		return this.res;
	}
	/**
	* Creates a new ColoredString
	* 
	* @return original
	*/
	public String getOriginal() {
		return this.original;
	}
}
