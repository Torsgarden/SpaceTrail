public class ShipPart {
	private int mass;
	private int powerUse;
	private Boolean peripheral;
	
	private enum Type {
		ENGINE, HULL, CARGOBAY, NAVS, 
	}
	private Type type;
	
	public Type getType() {
		return type;
	}
	public void setType(String newType) {
		if (newType.equalsIgnoreCase("Engine") || (newType.equalsIgnoreCase("Engines")) ) {
			this.type = Type.ENGINE;
		} else if (newType.equalsIgnoreCase("Hull")) {
			this.type = Type.HULL;
		} else if (newType.equalsIgnoreCase("Cargobay")) {
			this.type = Type.CARGOBAY;
		} else if (newType.equalsIgnoreCase("Navs")) {
			this.type = Type.NAVS;
		}
		else {
			this.type = Type.ENGINE;
		}
	}
	
}