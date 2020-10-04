package newhorizon;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import newhorizon.contents.items.*;

public class NewHorizon extends Mod{
	

	
    public NewHorizon(){
        Log.info("Loaded ExampleJavaMod constructor.");
    }

    @Override
    public void loadContent(){
		Log.info("Loading some example content.");
		new NHItems().load();
		
    }
	
}
