package net.kuth.lhlm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BonzOreBlock extends Block {
	public BonzOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2.1f, 2.25527594f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}