### This mod uses Forge 47.2.0+ _(Forge 1.20.1)_
### We test on the latest Forge versions
This mod offers a variety of music discs and new blocks.

A couple of things this mod adds:

An Advanced Jukebox for playing custom discs
- Custom Music Discs.
- Entities:
- McAlec (me)
- TESTIFICATE (>1.9 snapshots Villager) 
- Boykisser (it's overrated, I know)
- Structures (soon).
- Biomes (2 currently).
- A semi-proper "MusicUI" for playing different sounds in Minecraft.



### How to make an addon

Put this code in the "repositories" block in build.gradle

```gradle
maven {
    // McAlec's Mod repo
    name = "McAlecs"
    url = "https://raw.githubusercontent.com/McAlec1/mcalecsmod/master/mcmodsrepo/"
}
```

Then put this code in the "dependencies" block just below the "repositories" one in build.gradle

```gradle
implementation fg.deobf("net.mcalec.mcalecs:mcalecsmod-0.7:0.7") // McAlec's Mod Repo
```

Now add this block of code under everything in your mods.toml 
Make sure to replace the "{MODID}" after dependencies below.

```toml
[[dependencies.{MODID}]]
    modId="mcalecs"
    mandatory=true
    versionRange="[0.7]" # Replace with the latest version
    ordering="NONE"
    side="BOTH"
```

**I do not own/claim any music, pictures, items, or textures that may be deemed to be mine. I own all the assets I have created.**

If you have any problems, please don't hesitate to contact me.
McAlec
