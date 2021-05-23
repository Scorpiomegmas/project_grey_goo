package machina.api.internal;

import machina.common.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class ModItemGroup extends net.minecraft.item.ItemGroup {
    private Supplier<ItemStack> displayStack;

    public static final ModItemGroup MACHINA = new ModItemGroup("machina", () -> new ItemStack(ModItems.TITANIUM_INGOT.get()));

    public ModItemGroup(String label, Supplier<ItemStack> displayStack){
        super(label);
        this.displayStack = displayStack;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack makeIcon(){
        return displayStack.get();
    }

}
