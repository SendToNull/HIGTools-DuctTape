package higtools.modules.main;

import higtools.modules.HIGTools;
import higtools.utils.HTArmorUtils;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.ItemStack;

public class ArmorNotify extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();


    private final Setting<Double> threshold = sgGeneral.add(new DoubleSetting.Builder().name("durability").description("How low an armor piece needs to be to alert you (in %).").defaultValue(2).min(1).sliderMin(1).sliderMax(100).max(100).build());


    public ArmorNotify() {
        super(HIGTools.HIG, "armor-notify", "Notifies you when your armor pieces are low.");
    }

    private boolean alertedHelm;
    private boolean alertedChest;
    private boolean alertedLegs;
    private boolean alertedBoots;

    @Override
    public void onActivate() {
        alertedHelm = false;
        alertedChest = false;
        alertedLegs = false;
        alertedBoots = false;
    }

    @EventHandler
    private void onTick(TickEvent.Post event) {
        Iterable<ItemStack> armorPieces = mc.player.getArmorItems();
        for (ItemStack armorPiece : armorPieces) {

            if (HTArmorUtils.checkThreshold(armorPiece, threshold.get())) {
                if (HTArmorUtils.isHelm(armorPiece) && !alertedHelm) {
                    warning("Your helmet dura is low!");
                    alertedHelm = true;
                }
                if (HTArmorUtils.isChest(armorPiece) && !alertedChest) {
                    warning("Your chestplate dura is low!");
                    alertedChest = true;
                }
                if (HTArmorUtils.isLegs(armorPiece) && !alertedLegs) {
                    warning("Your leggings dura is low!");
                    alertedLegs = true;
                }
                if (HTArmorUtils.isBoots(armorPiece) && !alertedBoots) {
                    warning("Your boots dura is low!");
                    alertedBoots = true;
                }
            }
            if (!HTArmorUtils.checkThreshold(armorPiece, threshold.get())) {
                if (HTArmorUtils.isHelm(armorPiece) && alertedHelm) alertedHelm = false;
                if (HTArmorUtils.isChest(armorPiece) && alertedChest) alertedChest = false;
                if (HTArmorUtils.isLegs(armorPiece) && alertedLegs) alertedLegs = false;
                if (HTArmorUtils.isBoots(armorPiece) && alertedBoots) alertedBoots = false;
            }
        }
    }
}