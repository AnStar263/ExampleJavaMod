package bordermod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import bordermod.contents.items.*;

public class BorderMod extends Mod{
	

	
    public BorderMod(){
        Log.info("Loaded ExampleJavaMod constructor.");
    }

    @Override
    public void loadContent(){
		Log.info("Loading some example content.");
                new BOItems().load();
		
    }
	
}
