package com.skidsdev.fyrestone.item.swordeffect;

import net.minecraft.entity.EntityLivingBase;

public class SwordEffectFire implements ISwordEffect
{
	private int duration;
	
	public SwordEffectFire(int duration)
	{
		this.duration = duration;
	}
	
	@Override
	public void ApplyEffect(EntityLivingBase entity)
	{
		entity.setFire(duration);
	}
}