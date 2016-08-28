package NemisysSlotChange;

import org.itxtech.nemisys.plugin.PluginBase;
import org.itxtech.nemisys.utils.TextFormat;

import org.itxtech.nemisys.event.EventHandler;
import org.itxtech.nemisys.event.EventPriority;
import org.itxtech.nemisys.event.Listener;
import org.itxtech.nemisys.event.server.QueryRegenerateEvent;

public class MainClass extends PluginBase implements Listener{

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "Slot Change enabled!");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false)
    public void onQueryRegen(QueryRegenerateEvent e){
        int total = e.getPlayerCount() + 1;
        e.setMaxPlayerCount(total);
    }
}
