package net.kuth.lhlm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SelumOreBlock extends Block {
	public SelumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.2f, 1.4413493208f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}