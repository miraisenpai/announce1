package love.chihuyu.announce1

import org.bukkit.plugin.java.JavaPlugin

class Announce1 : JavaPlugin() {
    override fun onEnable() {
        println()
        logger.info("起動しましたっ！")
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}