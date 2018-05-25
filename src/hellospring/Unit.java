package hellospring;

public class Unit {
	private String unitName;
	private int unitId;
	private int unitBBlvl;
	private int unitExp;
	private String unitTypeName;

	public Unit(String name, int exp, int bblvl, String type){
		this.unitBBlvl = bblvl;
		this.unitExp = exp;
		this.unitName = name;
		this.unitTypeName = type;
    }
	
	public void setId (int id) {
		this.unitId = id;
	}
	
	public int getId() {
		return unitId;
	}

    @Override
    public String toString() {
        return String.format(
                "Unit[unitId=%d, name='%s', exp='%s', bblvl='%s', type='%s']",
                unitId, unitExp, unitBBlvl,unitTypeName);
    }

    // getters & setters omitted for brevity
}
