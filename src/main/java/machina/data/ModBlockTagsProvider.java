package machina.data;

import machina.Machina;
import machina.common.block.ModBlocks;
import machina.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Machina.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
    tag(ModTags.Blocks.ORES_TITANIUM).add(ModBlocks.TITANIUM_ORE.get());
    tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TITANIUM);
    tag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM).add(ModBlocks.TITANIUM_BLOCK.get());
    tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM);
    }
}
