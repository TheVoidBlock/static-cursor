package io.github.thevoidblock.staticcursor.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.cursor.Cursor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrawContext.class)
public class DrawContextMixin {
    @Inject(method = "setCursor", at = @At("HEAD"), cancellable = true)
    public void setCursor(Cursor cursor, CallbackInfo ci) {
        ci.cancel();
    }
}
