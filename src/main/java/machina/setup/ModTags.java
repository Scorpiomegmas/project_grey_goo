package machina.setup;

import machina.Machina;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_TITANIUM = forge("ores/titanium");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_TITANIUM = forge("storage_blocks/titanium");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(Machina.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_TITANIUM = forge("ores/titanium");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_TITANIUM = forge("storage_blocks/titanium");
        public static final ITag.INamedTag<Item> INGOTS_TITANIUM = forge("ingots/titanium");
        public static final ITag.INamedTag<Item> CHUNKS_TITANIUM = forge("chunks/titanium");

        private static ITag.INamedTag<Item> forge(String path){
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }
        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.bind(new ResourceLocation(Machina.MOD_ID, path).toString());
        }
    }
}
