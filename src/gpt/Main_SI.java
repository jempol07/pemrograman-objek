/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpt;

/**
 *
 * @author Jempol
 */
public class Main_SI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sekolah skla = new Sekolah();
        Sekolah sklb = new Sekolah();
        
        skla.setId_Sekolah(1);
        skla.setNama_Sekolah("SMP 12");
        
        sklb.setId_Sekolah(2);
        sklb.setNama_Sekolah("SMP 19");
        
        Kepala_Sekolah kepsek1 = new Kepala_Sekolah();
        kepsek1.setId_Kepsek(1);
        kepsek1.setNama_Kepsek("Andi,M.pd");
        
        Kepala_Sekolah kepsek2 = new Kepala_Sekolah();
        kepsek2.setId_Kepsek(2);
        kepsek2.setNama_Kepsek("Rini,M.pd");
        
        skla.setKepala_Sekolah(kepsek1);
        sklb.setKepala_Sekolah(kepsek2);
        
        System.out.println("Sekolah : "+skla.getNama_Sekolah());
        System.out.println("Kepala Sekolah : "+skla.getKepala_Sekolah().getNama_Kepsek());
        
        System.out.println("Sekolah : "+sklb.getNama_Sekolah());
        System.out.println("Kepala Sekolah : "+sklb.getKepala_Sekolah().getNama_Kepsek());
    }
    
}
