package com.github.syari.plugin.joinquit

import com.github.syari.spigot.api.event.EventRegister
import com.github.syari.spigot.api.event.Events
import com.github.syari.spigot.api.string.toColor
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

object EventListener : EventRegister {
    override fun Events.register() {
        event<PlayerJoinEvent> {
            it.joinMessage = "&a&lJoin &f${it.player.displayName}".toColor()
        }
        event<PlayerQuitEvent> {
            it.quitMessage = "&c&lQuit &f${it.player.displayName}".toColor()
        }
    }
}
