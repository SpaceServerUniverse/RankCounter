package space.yurisi.rankcounter;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.rankcounter.manager.CounterModelManager;
import space.yurisi.rankcounter.manager.EventManager;

public final class RankCounter extends JavaPlugin {

    private CounterModelManager counterManager;

    @Override
    public void onEnable() {
        this.counterManager = new CounterModelManager();
        new EventManager(this);
    }

    public CounterModelManager getCounterManager() {
        return counterManager;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
