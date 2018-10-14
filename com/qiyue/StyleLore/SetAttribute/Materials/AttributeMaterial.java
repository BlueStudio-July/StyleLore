package com.qiyue.StyleLore.SetAttribute.Materials;

public enum AttributeMaterial {
	
	Damage("Damage",1),
	Armor("Armor",2),
	CritJudge("CritJudge",3),
	CritDamage("CritDamage",4),
	HealthSteal("HealthSteal",5),
	DodgeJudge("DodgeJudge",6),
	HitJudge("HitJudge",7),
	SunderJudge("SunderJudge",8),
	BlindEff("BlindEff",9),
	WitherEff("WitherEff",10),
	FatalJudge("FatalJudge",11),
	Thorns("Thorns",12),
	PVPDamage("PVPDamage",13),
	PVEDamage("PVEDamage",14),
	RemotelyDamage("RemotelyDamage",15),
	IgniteJudge("IgniteJudge",16),
	KnockJudge("KnockJudge",17),
	LightJudge("LightJudge",18);
	
    
	
	// 成员变量
	private String name;
	private int index;
	// 构造方法
	private AttributeMaterial(String name, int index) {
		this.name = name;
		this.index = index;
	}
	// 普通方法
	public static String getName(int index) {
		for (AttributeMaterial c : AttributeMaterial.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}
	// get set 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
