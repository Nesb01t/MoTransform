package com.nesb01t.motransname.api;

import org.bukkit.Material;

import java.util.LinkedList;

import static com.nesb01t.motransname.MoTransname.core;

public class Materials {
    public final static LinkedList<String> transNames = getTransNameOfMaterials();

    public static LinkedList<String> getRowNameOfMaterials() {
        LinkedList<String> list = new LinkedList<>();
        Material[] materials = Material.values();
        for (int i = 0; i < materials.length; i++) {
            Material material = materials[i];
            String name = material.name();
            list.add(name);
        }
        return list;
    }

    public static LinkedList<String> getTransNameOfMaterials() {
        LinkedList<String> list = new LinkedList<>();
        Material[] materials = Material.values();
        for (int i = 0; i < materials.length; i++) {
            Material material = materials[i];
            String name = MaterialTransMap.mapEn2Cn.get(material.name());

            if (name != null) {
                list.add(name);
                core.getLogger().info(name);
            }
        }
        return list;
    }
}
