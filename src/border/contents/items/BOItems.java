package border.contents.items;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class BOItems implements ContentList{
	
	//Load Mod Items
	
	public static Item 
	sinkStarAlloy, sporeAlloy;
	
	@Override
	public void load(){
		sinkStarAlloy = new Item("sinkstar-alloy", Color.valueOf("#BE91FF"));
		sporeAlloy = new Item("spore-alloy", Color.valueOf("1D1E23"));

	}
	
}
