package com.novumscientiateam.novumscientia;

import com.emosewapixel.pixellib.proxy.IModProxy;
import com.novumscientiateam.novumscientia.proxy.ClientProxy;
import com.novumscientiateam.novumscientia.proxy.ServerProxy;
import com.novumscientiateam.novumscientia.registry.NSMaterialRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NovumScientia.MOD_ID)
public class NovumScientia {
	public static final String MOD_ID = "novumscientia";
	
	private static IModProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public NovumScientia() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		NSMaterialRegistry registry = NSMaterialRegistry.INSTANCE;
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