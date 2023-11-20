package space.yurisi.rankcounter.manager;

import org.bukkit.Bukkit;
import space.yurisi.rankcounter.RankCounter;
import space.yurisi.rankcounter.event.KillDeathCountEvents;
import space.yurisi.rankcounter.event.LifeCountEvents;
import space.yurisi.rankcounter.event.OreCountEvents;
import space.yurisi.rankcounter.event.PlayerCountEvents;
import space.yurisi.rankcounter.event.player.LoginEvent;
import space.yurisi.rankcounter.event.player.QuitEvent;

public class EventManager {

    public EventManager(RankCounter main){
        init(main);
    }

    public void init(RankCounter main){
        CounterModelManager manager = main.getCounterManager();
        Bukkit.getPluginManager().registerEvents(new LoginEvent(manager), main);
        Bukkit.getPluginManager().registerEvents(new QuitEvent(manager), main);

        Bukkit.getPluginManager().registerEvents(new KillDeathCountEvents(manager), main);
        Bukkit.getPluginManager().registerEvents(new LifeCountEvents(manager), main);
        Bukkit.getPluginManager().registerEvents(new OreCountEvents(manager), main);
        Bukkit.getPluginManager().registerEvents(new PlayerCountEvents(manager), main);
    }
}
