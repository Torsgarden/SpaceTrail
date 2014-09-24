import java.util.Random;

public class NameBank {
	
	static String[] HumanNames = {
		"Catia",
		"Nero",
		"Sandra",
		"Athene",
		"Antonia",
		"Jaasau",
		"Shafiqa",
		"Cassius",
		"Hildiberht",
		"Mona",
		"Christine",
		"Gotama",
		"Gore",
		"Damian",
		"Breixo",
		"Samuel",
		"Margalita",
		"Shavonne",
		"Madalina",
		"Ladislas",
		"Asher",
		"Fido",
		"Jaleh",
		"Storm",
		"Heinrike",
		"Wob",
		"Rocco",
		"Nolan",
		"Ruslan",
		"Durada",
		"Biel",
		"Hermenegildo",
		"Markos",
		"Donovan",
		"Etta",
		"Ingridr",
		"Estella",
		"Jasmine",
		"Valerian",
		"Nadege",
		"Winton",
		"Sigge",
		"Aintzane",
		"Valeria",
		"Emiliana",
		"Lincoln",
		"Manuela",
		"Elcin",
		"Lavena",
		"Maarika",
		"Zsolt",
		"Adrastos",
		"Kaiden",
		"Linzi",
		"Katrina",
		"Grazia",
		"Morgan",
		"Vladmir",
		"Ansel",
		"Tad",
		"Mahsa",
		"Liliana",
		"Orsola",
		"Sveto",
		"Fadia",
		"Ea",
		"Summer",
		"Asaf",
		"Verner",
		"Amabilia",
		"Luca",
		"Helga",
		"Mai",
		"Reva",
		"Gosse",
		"Gyneth",
		"Pierce",
		"Truls",
		"Amber"
	};

	static String[] PolemianNames = {
		"Goran",
		"Yular",
		"Malkoman",
		"Jud",
		"Peram",
		"Adrum",
		"Goll",
		"Lodel",
		"Kalgrum",
		"Pedrom",
		"Undrom",
		"Dromok",
		"Bramend",
		"Dolrem",
		"Codven",
		"Rebtomen"
	};
	
	static String[] ImnarNames = {
		"Yksal",
		"Uorias",
		"Eoliamir",
		"Aduselian",
		"Urunomidan",
		"Olisias",
		"Barumaden",
		"Erdumallen",
		"Umiolendai",
		"Joramne",
		"Uridanos",
		"Erihomendai"
	};
	
	static String[] ShipNames = {
		"Sparrow", 
		"Valiant", 
		"Quadley", 
		"Tanzania", 
		"Void", 
		"Seer",
		"Old Reliable",
		//TODO: OTHER SHIP NAMES
	};
	
	// this method generates a random ship name
	public static String randomizeShipName() {
		Random rand = new Random();
		return ShipNames[rand.nextInt(ShipNames.length)];
	}
	
	// this method generates a random human's name
	public static String randomizeHumanName() {
		Random rand = new Random();
		return HumanNames[rand.nextInt(HumanNames.length)];
	}
	
	// this method generates a random Polemian name
	public static String randomizePolemianName() {
		Random rand = new Random();
		return PolemianNames[rand.nextInt(PolemianNames.length)];
	}
	
	// this method generates a random Imnar name 
	public static String randomizeImnarName() {
		Random rand = new Random();
		return ImnarNames[rand.nextInt(ImnarNames.length)];
	}
	
	// this method generates a random krid name
	public static String randomizeKridName() {
		Random rand = new Random();
		// generates a random boolean value
		// then based on that, it will choose between the
		// human names or Polemian names
		return rand.nextBoolean() ? HumanNames[rand.nextInt(HumanNames.length)] : PolemianNames[rand.nextInt(PolemianNames.length)];
	}


}
