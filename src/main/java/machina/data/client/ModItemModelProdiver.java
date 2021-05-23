package machina.data.client;

import machina.Machina;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class ModItemModelProdiver extends ItemModelProvider {
    public ModItemModelProdiver(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, Machina.MOD_ID, existingFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void registerModels() {
        withExistingParent("titanium_block", modLoc("block/titanium_block"));
        withExistingParent("titanium_ore", modLoc("block/titanium_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemGenerated, "titanium_ingot");
        builder(itemGenerated, "titanium_chunk");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
