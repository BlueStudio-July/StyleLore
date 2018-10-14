package com.qiyue.StyleLore.SetAttribute;

import org.bukkit.Bukkit;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.qiyue.StyleLore.Main;
import com.qiyue.StyleLore.Message;
import com.qiyue.StyleLore.Probability;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;
@SuppressWarnings("all")
public class AttributeCalculation implements Listener {

	@EventHandler
	public void onStats(EntityDamageByEntityEvent event) {
		if(event.getDamager().getType().toString().equals("LIGHTNING")) {
			return;
		}
		Entity damger = Pro.get(event.getDamager());  Entity entity = event.getEntity();
		Bukkit.getPluginManager().callEvent(new AttributeEvent(damger,entity));
		Double damage = event.getDamage() + GetAttributeVau.get(AttributeMaterial.Damage);
		//CaluAttributeDelete.updata();
	      if(Probability.of(GetAttributeVau.get(AttributeMaterial.DodgeJudge)) && !Probability.of(GetAttributeVau.get(AttributeMaterial.HitJudge))|| event.isCancelled()) {
            Message.dodge(damger, entity);
			event.setCancelled(true);
			return;
		} if (Probability.of(GetAttributeVau.get(AttributeMaterial.FatalJudge))) {
            Message.blindeff(damger, entity);
            ((Damageable)entity).setHealth(0.0);
			event.setCancelled(true);
			return;
	    } if (!Probability.of(GetAttributeVau.get(AttributeMaterial.SunderJudge))) {
           damage = damage - GetAttributeVau.get(AttributeMaterial.Armor);
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.CritJudge))) {
           damage = damage + (damage * (GetAttributeVau.get(AttributeMaterial.CritDamage) + Main.config.getDouble("Attribute.CritJudge.damage")));
        } if (GetAttributeVau.get(AttributeMaterial.HealthSteal) != 0.0) {
        	HealthSteal.add(damger, entity, GetAttributeVau.get(AttributeMaterial.HealthSteal));
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.BlindEff))) {
        	BlindEff.add(entity);
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.WitherEff))) {
        	WitherEff.add(entity);
        } if (GetAttributeVau.get(AttributeMaterial.Thorns) != 0.0) {
        	Thorns.add(damger, damage, GetAttributeVau.get(AttributeMaterial.Thorns));
        } if (BacyPlayer.byPVP(damger, entity) && GetAttributeVau.get(AttributeMaterial.PVPDamage) != 0.0) {
        	damage = damage + GetAttributeVau.get(AttributeMaterial.PVPDamage);
        } if (BacyPlayer.byPVE(damger, entity) && GetAttributeVau.get(AttributeMaterial.PVEDamage) != 0.0) {
        	damage = damage + GetAttributeVau.get(AttributeMaterial.PVEDamage);
        } if (BacyPlayer.byPro(event.getDamager()) && GetAttributeVau.get(AttributeMaterial.RemotelyDamage) != 0.0) {
        	damage = damage + GetAttributeVau.get(AttributeMaterial.RemotelyDamage);
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.IgniteJudge))) {
        	IgniteJudge.add(entity);
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.KnockJudge))) {
        	KnockJudge.add(entity);
        } if (Probability.of(GetAttributeVau.get(AttributeMaterial.LightJudge))) {
        	LightJudge.add(entity);
        } 
        Message.damage(damger, entity, damage);
		event.setDamage(damage);
	}
	
	
}
