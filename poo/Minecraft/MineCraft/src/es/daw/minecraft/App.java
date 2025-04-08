package es.daw.minecraft;

import es.daw.minecraft.model.GestorHerramientas;
import es.daw.minecraft.model.Hacha;
import es.daw.minecraft.model.Herramienta;
import es.daw.minecraft.model.PicoDiamante;
import es.daw.minecraft.model.PicoHierro;

public class App {    public static void main(String[] args) throws Exception {
        GestorHerramientas gestor = new GestorHerramientas();

        PicoDiamante pico1 = new PicoDiamante("Pico Pro", 250);
        PicoDiamante pico3 = new PicoDiamante("Pico Pro plus", 500, "Diamante");
        PicoHierro pico2 = new PicoHierro("Pico Normal", 150);
        Hacha hacha1 = new Hacha("Hacha Rápida", 200, 1.5f);

        gestor.addHerramienta(pico1);
        gestor.addHerramienta(pico2);
        //gestor.addHerramienta(pico3);
        gestor.addHerramienta(hacha1);

        pico1.minar();
        pico2.minar();

        System.out.println("Total de herramientas creadas: " + Herramienta.getTotalHerramientas());

        System.out.println("*TODAS LAS HERRAMIENTAS:");
        System.out.println(gestor.pintaHerramientas());
    }
}
