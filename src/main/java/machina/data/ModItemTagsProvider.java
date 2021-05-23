package machina.data;

import machina.Machina;
import machina.common.item.ModItems;
import machina.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, Machina.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        copy(ModTags.Blocks.ORES_TITANIUM, ModTags.Items.ORES_TITANIUM);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_TITANIUM, ModTags.Items.STORAGE_BLOCKS_TITANIUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_TITANIUM).add(ModItems.TITANIUM_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TITANIUM);

        tag(ModTags.Items.CHUNKS_TITANIUM).add(ModItems.TITANIUM_CHUNK.get());
        tag(Tags.Items.GEMS).addTag(ModTags.Items.CHUNKS_TITANIUM);
    }
}
