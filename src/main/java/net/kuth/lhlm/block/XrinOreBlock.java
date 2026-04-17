package net.kuth.lhlm.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class XrinOreBlock extends Block {
	public XrinOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(7.5f, 6.2441490555f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}