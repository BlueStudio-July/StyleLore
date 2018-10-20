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
import com.qiyue.StyleLore.Utils;
import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;
@SuppressWarnings("all")
public class AttributeCalculation implements Listener {

	@EventHandler
	public void onStats(EntityDamageByEntityEvent event) {
		if(event.getDamager().getType().toString().equals("LIGHTNING")) {
			return;
		}
		
		Entity damger = Skills.getEntity(event.getDamager());  Entity entity = event.getEntity();
		Bukkit.getPluginManager().callEvent(new AttributeEvent(damger,entity));
		Double damage = event.getDamage() + Skills.getAttribute(AttributeMaterial.Damage);
		//CaluAttributeDelete.updata();
	      if(Utils.of(Skills.getAttribute(AttributeMaterial.DodgeJudge)) && !Utils.of(Skills.getAttribute(AttributeMaterial.HitJudge))|| event.isCancelled()) {
            Message.dodge(damger, entity);
			event.setCancelled(true);
			return;
		} if (Utils.of(Skills.getAttribute(AttributeMaterial.FatalJudge))) {
            Message.blindeff(damger, entity);
            ((Damageable)entity).setHealth(0.0);
			event.setCancelled(true);
			return;
	    } if (!Utils.of(Skills.getAttribute(AttributeMaterial.SunderJudge))) {
           damage = damage - Skills.getAttribute(AttributeMaterial.Armor);
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.CritJudge))) {
           damage = damage + (damage * (Skills.getAttribute(AttributeMaterial.CritDamage) + Main.config.getDouble("Attribute.CritJudge.damage")));
        } if (Skills.getAttribute(AttributeMaterial.HealthSteal) != 0.0) {
        	Skills.addHealthSteal(damger, entity, Skills.getAttribute(AttributeMaterial.HealthSteal));
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.BlindEff))) {
        	Skills.addBindEff(entity);
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.WitherEff))) {
        	Skills.addWitherEff(entity);
        } if (Skills.getAttribute(AttributeMaterial.Thorns) != 0.0) {
        	Skills.addThorns(damger, damage, Skills.getAttribute(AttributeMaterial.Thorns));
        } if (Skills.byPVP(damger, entity) && Skills.getAttribute(AttributeMaterial.PVPDamage) != 0.0) {
        	damage = damage + Skills.getAttribute(AttributeMaterial.PVPDamage);
        } if (Skills.byPVE(damger, entity) && Skills.getAttribute(AttributeMaterial.PVEDamage) != 0.0) {
        	damage = damage + Skills.getAttribute(AttributeMaterial.PVEDamage);
        } if (Skills.byPro(event.getDamager()) && Skills.getAttribute(AttributeMaterial.RemotelyDamage) != 0.0) {
        	damage = damage + Skills.getAttribute(AttributeMaterial.RemotelyDamage);
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.IgniteJudge))) {
        	Skills.addIgniteJudge(entity);
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.KnockJudge))) {
        	Skills.addKnockJudge(entity);
        } if (Utils.of(Skills.getAttribute(AttributeMaterial.LightJudge))) {
        	Skills.addLightJudge(entity);
        } 
        Message.damage(damger, entity, damage);
		event.setDamage(damage);
	}
	
	
}
