package com.qiyue.StyleLore.SetAttribute;

import com.qiyue.StyleLore.SetAttribute.Materials.AttributeMaterial;

public class CaluAttributeDelete {

	public static void updata() {
		for(AttributeMaterial node : AttributeEvent.Attributes.keySet()) {
			if( 
			   ( 
			   node == AttributeMaterial.CritJudge ||
			   node == AttributeMaterial.DodgeJudge ||
			   node == AttributeMaterial.SunderJudge ||
			   node == AttributeMaterial.HitJudge 
			   ) 
			   
			   &&
			   (AttributeEvent.Attributes.get(node) < 0.0 || AttributeEvent.Attributes.get(node) > 100.0)) {
				  AttributeEvent.Attributes.put(node, 100.0);
			}
		}
	}
	
	
}
