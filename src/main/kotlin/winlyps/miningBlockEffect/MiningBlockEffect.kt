package winlyps.miningBlockEffect

import org.bukkit.plugin.java.JavaPlugin

class MiningBlockEffect : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(BlockBreakListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}