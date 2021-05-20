package machina.client.data;

import machina.Machina;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
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


    }
}
