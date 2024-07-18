package me.libraryaddict.disguise.disguisetypes.watchers;

import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.MetaIndex;
import me.libraryaddict.disguise.utilities.reflection.annotations.MethodDescription;

public class CamelWatcher extends AbstractHorseWatcher {
    public CamelWatcher(Disguise disguise) {
        super(disguise);
    }

    public boolean isDashing() {
        return getData(MetaIndex.CAMEL_DASHING);
    }

    @MethodDescription("Is this Camel dashing?")
    public void setDashing(boolean dashing) {
        sendData(MetaIndex.CAMEL_DASHING, dashing);
    }
}
