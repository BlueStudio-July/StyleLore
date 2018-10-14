package com.qiyue.StyleLore;

import com.qiyue.StyleLore.LoreAttribute.Armor;
import com.qiyue.StyleLore.LoreAttribute.CritDamage;
import com.qiyue.StyleLore.LoreAttribute.CritJudge;
import com.qiyue.StyleLore.LoreAttribute.Damage;
import com.qiyue.StyleLore.LoreAttribute.DodgeJudge;
import com.qiyue.StyleLore.LoreAttribute.FatalJudge;
import com.qiyue.StyleLore.LoreAttribute.HealthSteal;
import com.qiyue.StyleLore.LoreAttribute.HitJudge;
import com.qiyue.StyleLore.LoreAttribute.IgniteJudge;
import com.qiyue.StyleLore.LoreAttribute.KnockJudge;
import com.qiyue.StyleLore.LoreAttribute.LightJudge;
import com.qiyue.StyleLore.LoreAttribute.PVEDamage;
import com.qiyue.StyleLore.LoreAttribute.PVPDamage;
import com.qiyue.StyleLore.LoreAttribute.RemotelyDamage;
import com.qiyue.StyleLore.LoreAttribute.SunderJudge;
import com.qiyue.StyleLore.LoreAttribute.Thorns;
import com.qiyue.StyleLore.LoreAttribute.WitherEff;
import com.qiyue.StyleLore.SetAttribute.AttributeEvent;

public class Ther {

	public static void updata(AttributeEvent event) {
		new Damage(event);
		new CritJudge(event);
		new CritDamage(event);
		new Armor(event);
		new HealthSteal(event);
		new DodgeJudge(event);
		new HitJudge(event);
		new SunderJudge(event);
		new WitherEff(event);
		new FatalJudge(event);
		new IgniteJudge(event);
		new KnockJudge(event);
		new LightJudge(event);
		new PVEDamage(event);
		new PVPDamage(event);
		new RemotelyDamage(event);
		new Thorns(event);
		new WitherEff(event);
		new FatalJudge(event);
	}
	
	
}
