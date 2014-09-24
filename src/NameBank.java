import java.util.Random;

public class NameBank {
	static Random rand = new Random();
	
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
	
	public static String getShipName() {
		int i;
		i = rand.nextInt(ShipNames.length);
		return ShipNames[i];
	}
	
	public static String getHumanName() {
		int i = rand.nextInt(HumanNames.length);
		return HumanNames[i];
	}
	
	public static String getPolemianName() {
		int i = rand.nextInt(PolemianNames.length);
		return PolemianNames[i];
	}
	
	public static String getImnarName() {
		int i = rand.nextInt(ImnarNames.length);
		return ImnarNames[i];
	}
	
	public static String getKridName() {
		int i = rand.nextInt(2);
		if (i == 1) {
			int j = rand.nextInt(HumanNames.length);
			return HumanNames[j];
		} else {
			int j = rand.nextInt(PolemianNames.length);
			return PolemianNames[j];
		}
			
	}


}
