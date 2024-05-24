**HIG Tools Duct-Taped Edition**: This fork of HIG Tools contains duct-taped fixes for working on Nether highway with Rusherhack and Meteor on Minecraft 1.20.4.

**Changes:**
- Backported to Minecraft version 1.20.4.
- GrimWait for block breaking.

**Setup**:
- Enable FastBreak (Rusher)
    * Mode: Packet Mode
    * InstantRebreak: True
    * AutoSwitch: True
        + Mode: Switch
        + Silent: True
        + Inventory: True
    * Blocks: All
    * Strict: True
    * Speed: 0.85
    * Confirm: True
    * Rotate: True
        + StrictDir: False
    * Range: 4.5
    * Queue: False
    * AutoRemine: False
- Enable Velocity (Rusher)
    * Pushing: True
        + Entities: True
        + Blocks: True
    * Mode: New Grim
    * Horizontal: 0
    * Vertical: 0
    * WaterSpeed: False
- Bind to One Key:
    * Killaura (Meteor)
        - Configure to attack only item frames with a custom delay of two ticks.
    * Highway Tools
    * Auto Walk HIG
    * Axis Viewer
- Configure Inventory Tweaks (Meteor):
    * Auto Drop Items: Signs, Golden Sword, Crossbow, Rotten Flesh, Spider Eye, Netherrack
    * Exclude Equipped: True
    * Exclude Hotbar: False
    * Only Full Stacks: False
- Configure Highway Builder+:
    - Width: *Depends on the highway.*
    - Height: 3
    - Floor: Replace
    - Railings: True
    - Mine Above Railings: True
    - Rotation: Both
    - Disconnect on Toggle: False
    - Pause on Lag: True
    - Resume TPS: 18
    - Don't Break Tools: True
    - Break Delay: 7
    - Blocks Per Tick: 1
    - Blocks to Place: Obsidian
    - Place Delay: 2
    - Placements Per Tick: 1
    - Trash Items: *Don't use this, use Meteor inventory tweaks instead*
    - Mine Ender Chests: True
    - Save Ender Chests: 1
    - Instamine Echests: True
    - Instamine Delay: 2
- Hotbar Loadout:
    * Keep an axe, pickaxe, and shovel in the hotbar.
    * At least one slot each for food, obsidian, and echests.
    * Try to keep as many slots empty as you can in your inventory and hotbar to avoid breaking Highway Builder's echest-mining feature.
        + Also disable auto-replenish, as it breaks the auto echest miner functionality.

*Original README below:*

---

<div align="center">
  <!-- Logo and Title -->
  <img src="/src/main/resources/assets/higtools/chat/icon.png" alt="logo" width="20%"/>
  <h1>HIG Tools</h1>
  <p>HIGTools is a utility addon for Meteor Client, specifically designed to build highways on anarchy servers.</p>

  <!-- Fancy badges -->
  <a href="https://anticope.pages.dev/addons"><img src="https://img.shields.io/badge/Verified%20Addon-Yes-blueviolet" alt="Verified Addon"></a>
  <a href="https://github.com/RedCarlos26/higtools/releases"><img src="https://img.shields.io/badge/Version-v2.8.0-blueviolet" alt="Version"></a>
  <img src="https://img.shields.io/badge/Minecraft%20Version-1.20.5/1.20.6-blueviolet" alt="Minecraft Version">
  <img src="https://img.shields.io/github/downloads/RedCarlos26/higtools/total?color=blueviolet&label=Downloads">
  <br><img src="https://img.shields.io/github/downloads/RedCarlos26/higtools/latest/total?color=blueviolet&label=Downloads for latest release">
</div>

<div align="center">
  <a href="https://discord.gg/a4jkKGJNdJ"><img src="https://invidget.switchblade.xyz/a4jkKGJNdJ" alt="HIGTools Logo"></a>
</div>

## Needed mods
- [Meteor Client](https://meteorclient.com/)
- Join the discord for more information on how to use.

*Note: Please use the [latest devbuild](https://meteorclient.com/download?devBuild=latest) of meteor while using HIGTools to avoid any issues.*

## Modules
- AfkLogout
- AutoCenter
- AutoWalkHIG
- AxisViewer
- DiscordRPC
- HandManager
- HighwayBorers
- HighwayBuilder+
- HighwayTools
- HIGPrefix
- HIGRotation
- HotbarManager
- Scaffold+

## HUD
- Binds HUD
- Welcome HUD

## Commands
- `.center`
- `.coords`
- `.toggle higtools`
