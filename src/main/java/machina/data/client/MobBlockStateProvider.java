package machina.data.client;

import machina.Machina;
import machina.common.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MobBlockStateProvider extends BlockStateProvider {
    public MobBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper){
        super(gen, Machina.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.TITANIUM_BLOCK.get());
        simpleBlock(ModBlocks.TITANIUM_ORE.get());
    }
}
