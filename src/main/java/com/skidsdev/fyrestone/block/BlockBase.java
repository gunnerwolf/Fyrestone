package com.skidsdev.fyrestone.block;

import com.skidsdev.fyrestone.FyrestoneCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block
{
	public BlockBase(String regName, Material material, float hardness, float resistance)
	{
		super(material);
		this.setRegistryName(regName);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(FyrestoneCreativeTabs.tabFyrestone);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
}
