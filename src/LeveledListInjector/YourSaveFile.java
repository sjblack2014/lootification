/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeveledListInjector;

import skyproc.SkyProcSave;

/**
 *
 * @author Justin Swanson
 */
public class YourSaveFile extends SkyProcSave {

    @Override
    protected void initSettings() {
	//  The Setting,	    The default value,	    Whether or not it changing means a new patch should be made
	Add(Settings.IMPORT_AT_START,		false,	    false);
        Add(Settings.PROCESS_WEAPONS, false, true);
        Add(Settings.PROCESS_ARMORS, false, true);
        Add(Settings.PROCESS_OUTFITS, false, true);
        Add(Settings.TEST, 0, true);
        Add(Settings.LOOTIFY_MOD, true, true);

    }

    @Override
    protected void initHelp() {

	helpInfo.put(Settings.IMPORT_AT_START,
		"If enabled, the program will begin importing your mods when the program starts.\n\n"
		+ "If turned off, the program will wait until it is necessary before importing.\n\n"
		+ "NOTE: This setting will not take effect until the next time the program is run.\n\n"
		+ "Benefits:\n"
		+ "- Faster patching when you close the program.\n"
		+ "- More information displayed in GUI, as it will have access to the records from your mods."
		+ "\n\n"
		+ "Downsides:\n"
		+ "- Having this on might make the GUI respond sluggishly while it processes in the "
		+ "background.");

	helpInfo.put(Settings.OTHER_SETTINGS,
		"These are other settings related to this patcher program.");
        
        helpInfo.put(Settings.PROCESS_WEAPONS, 
                "Process the weapons");
        
        helpInfo.put(Settings.PROCESS_ARMORS, 
                "Process the armors");
        helpInfo.put(Settings.PROCESS_OUTFITS, 
                "Process the outfits. NOTE: this probably will make them mismatched in game");
        helpInfo.put(Settings.LOOTIFY_MOD, 
                "Enchant and distribute weapons and armor from mod");
        
        helpInfo.put(Settings.TEST, 
                "Test help info");
    }

    // Note that some settings just have help info, and no actual values in
    // initSettings().
    public enum Settings {
	IMPORT_AT_START,
	OTHER_SETTINGS,
        PROCESS_WEAPONS,
        PROCESS_ARMORS,
        PROCESS_OUTFITS,
        LOOTIFY_MOD,
        TEST;
    }
}
