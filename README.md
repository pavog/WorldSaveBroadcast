# WorldSaveBroadcast
WorldSaveBroadcast is a plugin for [Bukkit](https://bukkit.org), [Spigot](https://spigotmc.org) or [Paper](https://papermc.io) that broadcasts a message to all players when the server is saving the world.

# About
This is a very simple plugin for your Minecraft server.
It sends a message to all players when the server saves a world.
It creates a configuration file with a default message that you can change.

The message also supports the placeholder `%name%`, which is replaced by the name of the world.

Please note that this plugin sends a message for each world / dimension that is saved.
This means, if you have `world`, `world_nether` and `world_the_end`, the message will be sent 3 times.

# Features
* Lightweight
* Easy to use
* Plug and play
* Customizable message
* Placeholder support
* Supports color codes and formatting codes
* Supports multiple worlds / dimensions
* Supports Bukkit, Spigot and Paper
* Works on pretty much all versions of Minecraft
* Open source and free

# How to use
* Download the plugin
* Put the plugin in your plugins folder
* (Re)start your server
* Open the config file to edit the message
* (Re)start or reload your server

# Config
```yaml
message: "&o[Server: Saved the world %name%]"
```

# License
This plugin is open source software released under the MIT license, see [license](LICENSE).
