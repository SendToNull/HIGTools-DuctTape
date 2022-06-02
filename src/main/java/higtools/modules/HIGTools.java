package higtools.modules;

import higtools.commands.*;
import higtools.modules.main.*;
import higtools.modules.hud.*;
import higtools.utils.*;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.Systems;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.HUD;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HIGTools extends MeteorAddon {
	public static final Logger LOG = LoggerFactory.getLogger("HIG Tools");
    public static final Category HIG = new Category("HIG Tools", Items.NETHERITE_PICKAXE.getDefaultStack());

	@Override
	public void onInitialize() {
	    LOG.info("Initializing HIG Tools");

		MeteorClient.EVENT_BUS.registerLambdaFactory("higtools", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

        HTDamageUtils.init();

		// Modules
        Modules modules = Modules.get();
		modules.add(new AfkLogout());
        modules.add(new ArmorNotify());
        modules.add(new AutoXpPlus());
		modules.add(new ChatTweaks());
        modules.add(new DiscordRPC());
        modules.add(new KillAuraPlus());
		modules.add(new NewChunks());
        modules.add(new OffhandPlus());
        modules.add(new OldAnimations());
		modules.add(new OneClickEat());
        modules.add(new PacketFly());
        modules.add(new Strafe());
		modules.add(new TPSSync());

        //Commands
        Commands commands = Commands.get();
        commands.add(new Kick());

        // HUD
        HUD hud = Systems.get(HUD.class);
        hud.elements.add(new BaritoneHud(hud));
        hud.elements.add(new BindsHud(hud));
        hud.elements.add(new EchestHud(hud));
        hud.elements.add(new GapHud(hud));
        hud.elements.add(new ObbyHud(hud));
        hud.elements.add(new PickHud(hud));
        hud.elements.add(new XpHud(hud));
	}

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(HIG);
    }

}