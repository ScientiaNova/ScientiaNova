package com.scientianovateam.scientianova;

import com.emosewapixel.pixellib.proxy.IModProxy;
import com.scientianovateam.scientianova.proxy.ClientProxy;
import com.scientianovateam.scientianova.proxy.ServerProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ScientiaNova.MOD_ID)
public class ScientiaNova {
	public static final String MOD_ID = "scientianova";
	
	private static IModProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public ScientiaNova() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void enqueueIMC(InterModEnqueueEvent e) {
		proxy.enque(e);
	}
	
	public void processIMC(InterModProcessEvent e) {
		proxy.process(e);
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
	
	}
}