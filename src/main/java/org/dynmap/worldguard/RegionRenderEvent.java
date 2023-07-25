package org.dynmap.worldguard;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.dynmap.markers.AreaMarker;
import org.jetbrains.annotations.NotNull;

public class RegionRenderEvent extends Event {
    private final String regionName;
    private final AreaMarker areaMarker;
    private static HandlerList handlers = new HandlerList();

    public RegionRenderEvent(String regionName, AreaMarker areaMarker) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.regionName = regionName;
        this.areaMarker = areaMarker;
    }

    public String getRegionName() {
        return regionName;
    }

    public AreaMarker getAreaMarker() {
        return areaMarker;
    }

    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
