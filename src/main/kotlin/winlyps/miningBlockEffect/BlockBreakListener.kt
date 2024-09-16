package winlyps.miningBlockEffect

import org.bukkit.Bukkit
import org.bukkit.Effect
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import java.util.concurrent.ThreadLocalRandom

class BlockBreakListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val player: Player = event.player

        // Get a random potion effect type
        val randomEffectType: PotionEffectType = getRandomPotionEffectType()

        // Get a random duration between 5 and 10 seconds
        val randomDuration: Int = ThreadLocalRandom.current().nextInt(5, 11) * 20 // 20 ticks per second

        // Apply the effect to the player
        player.addPotionEffect(PotionEffect(randomEffectType, randomDuration, 0))
    }

    private fun getRandomPotionEffectType(): PotionEffectType {
        val effectTypes = PotionEffectType.values()
        val randomIndex = ThreadLocalRandom.current().nextInt(effectTypes.size)
        return effectTypes[randomIndex]
    }
}