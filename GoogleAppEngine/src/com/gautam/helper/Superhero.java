/**
 * 
 */
package com.gautam.helper;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Gautam Pal
 *
 */
public class Superhero {
	
	private static List<String> characterList = Arrays.asList("A-Bomb", "Abomination",
			"Abraxas", "Agent 13", "Agent Zero", "Air-Walker", "Ammo", "Angel",
			"Angel Salvadore", "Annihilus", "Anti-Venom", "Ant-Man",
			"Ant-Man II", "Apocalypse", "Arachne", "Archangel", "Arclight",
			"Ares", "Ariel", "Armor", "Atlas", "Aurora", "Azazel", "Banshee",
			"Bantam", "Battlestar", "Beak", "Beast", "Beetle", "Beta Ray Bill",
			"Beyonder", "Big Man", "Binary", "Bird-Brain", "Bird-Man",
			"Bird-Man II", "Bishop", "Black Abbott", "Black Bolt", "Black Cat",
			"Black Goliath", "Black Knight III", "Black Mamba",
			"Black Panther", "Black Widow", "Black Widow II", "Blackout",
			"Blackwing", "Blackwulf", "Blade", "Blaquesmith", "Bling!",
			"Blink", "Blizzard", "Blizzard I", "Blizzard II", "Blob",
			"Bloodaxe", "Bloodhawk", "Bloodwraith", "Bolt", "Boom Boom",
			"Boomer", "Box", "Box III", "Box IV", "Brother Voodoo", "Bullseye",
			"Bumbleboy", "Cable", "Callisto", "Cannonball", "Captain America",
			"Captain Britain", "Captain Mar-vell", "Captain Universe",
			"Carnage", "Cat", "Cat II", "Cecilia Reyes", "Century", "Cerebra",
			"Chamber", "Changeling", "Clea", "Cloak", "Colossus", "Corsair",
			"Crimson Crusader", "Crimson Dynamo I", "Crystal", "Cyclops",
			"Cypher", "Dagger", "Daredevil", "Darkhawk", "Darkstar", "Dazzler",
			"Deadpool", "Deathlok", "Demogoblin", "Destroyer", "Doc Samson",
			"Doctor Doom", "Doctor Doom II", "Doctor Octopus",
			"Doctor Strange", "Domino", "Doppelganger", "Dormammu", "Ego",
			"Electro", "Elektra", "Emma Frost", "Evilhawk", "Exodus",
			"Fabian Cortez", "Falcon", "Fallen One II", "Feral",
			"Fin Fang Foom", "Firebird", "Firelord", "Firestar", "Fixer",
			"Forge", "Franklin Richards", "Franklin Storm", "Frenzy", "Frigga",
			"Galactus", "Gambit", "Genesis", "Ghost Rider", "Ghost Rider II",
			"Giant-Man", "Giant-Man II", "Goblin Queen", "Goliath",
			"Goliath II", "Goliath III", "Goliath IV", "Gravity",
			"Green Goblin", "Green Goblin II", "Green Goblin III",
			"Green Goblin IV", "Guardian", "Havok", "Hawkeye", "Hawkeye II",
			"Hellcat", "Hellstorm", "Hercules", "Hobgoblin", "Hollow",
			"Hope Summers", "Howard the Duck", "Hulk", "Human Torch", "Husk",
			"Hydro-Man", "Hyperion", "Iceman", "Invisible Woman", "Iron Fist",
			"Iron Man", "Iron Monger", "Ironman", "Jack of Hearts",
			"Jean Grey", "Jennifer Kale", "Jigsaw", "John Wraith", "Jolt",
			"Jubilee", "Juggernaut", "Junkpile", "Justice", "Kang", "Kingpin",
			"Kitty Pride", "Klaw", "Kraven II", "Kraven the Hunter",
			"Lady Bullseye", "Lady Deathstrike", "Leader", "Leech",
			"Living Brain", "Lizard", "Loki", "Longshot", "Luke Cage", "Luna",
			"Lyja", "Machine Man", "Mach-IV", "Magneto", "Magus", "Mandarin",
			"Man-Thing", "Man-Wolf", "Marvel Girl", "Master Chief", "Maverick",
			"Medusa", "Meltdown", "Mephisto", "Meteorite", "Mimic",
			"Mister Fantastic", "Mister Sinister", "Molten Man", "Moon Knight",
			"Moonstone", "Morlun", "Morph", "Moses Magnum", "Ms Marvel",
			"Ms Marvel II", "Multiple Man", "Mysterio I", "Mystique", "Namor",
			"Namora", "Namorita", "Nick Fury", "Nightcrawler", "Northstar",
			"Nova", "Omega Red", "Onslaught", "Penance", "Penance I",
			"Penance II", "Phoenix", "Power Man", "Professor X",
			"Proto-Goblin", "Psylocke", "Punisher", "Pyro", "Quicksilver",
			"Quill", "Razor-Fist II", "Red Hulk", "Red Skull", "Rhino",
			"Ripcord", "Rocket Raccoon", "Rogue", "Ronin", "Sabretooth",
			"Sage", "Sandman", "Sasquatch", "Scarlet Spider",
			"Scarlet Spider II", "Scarlet Witch", "Scorpia", "Scorpion",
			"Sentry", "Shadow King", "Shang-Chi", "Shatterstar", "She-Hulk",
			"She-Thing", "Shocker", "Shriek", "Sif", "Silver Surfer",
			"Silverclaw", "Siryn", "Skaar", "Snowbird", "Songbird",
			"Speedball", "Spider-Carnage", "Spider-Girl", "Spiderman",
			"Spider-Man", "Spider-Woman", "Spider-Woman II",
			"Spider-Woman III", "Spider-Woman IV", "Spyke", "Stacy X",
			"Stardust", "Storm", "Sub-Mariner", "Sunspot", "Synch", "Tempest",
			"Thanos", "Thing", "Thor", "Thor Girl", "Thunderbird",
			"Thunderbird II", "Thunderbird III", "Thunderstrike", "Thundra",
			"Tiger Shark", "Tigra", "Tinkerer", "Toad", "Toxin", "Ultragirl",
			"Ultron", "Utgard-Loki", "Vagabond", "Valkyrie", "Vanisher",
			"Venom", "Venom II", "Venom III", "Vertigo II", "Vindicator",
			"Vindicator II", "Vision", "Vision II", "Vulcan", "Vulture",
			"Walrus", "War Machine", "Warbird", "Warlock", "Warpath", "Wasp",
			"Watcher", "Weapon XI", "White Queen", "Willis Stryker",
			"Winter Soldier", "Wiz Kid", "Wolfsbane", "Wolverine",
			"Wonder Man", "Wondra", "Wyatt Wingfoot", "X-23", "X-Man",
			"Yellow Claw", "Yellowjacket", "Yellowjacket II", "Ymir");
	
	private static final int SIZE = characterList.size();
	private static final Random RANDOM = new Random();
	
	public static String get()
	{
		return characterList.get(RANDOM.nextInt(SIZE));
	}
}
