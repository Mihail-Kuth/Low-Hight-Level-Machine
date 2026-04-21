package net.kuth.lhlm.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class FligBlockBlock extends IronBarsBlock {
	public FligBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops());
	}
}