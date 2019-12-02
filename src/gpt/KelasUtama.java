package gpt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jempol
 */
public class KelasUtama {
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa maha = new Mahasiswa();
        Mahasiswa maha2 = new Mahasiswa();
        Mahasiswa maha3 = new Mahasiswa();
        Mahasiswa maha4 = new Mahasiswa();
        
        maha.setNIM("2018420002");
        maha.setNama_Mahasiswa("jon");
        maha.setAlamat_Asal("rungkut");
        maha.setNomor_Handphone("0810000000002");
        
        maha2.setNIM("2018420001");
        maha2.setNama_Mahasiswa("adi");
        maha2.setAlamat_Asal("sby");
        maha2.setNomor_Handphone("0810");
        
        maha3.setNIM("2018420003");
        maha3.setNama_Mahasiswa("rud");
        maha3.setAlamat_Asal("sda");
        maha3.setNomor_Handphone("09989");
        
        maha4.setNIM("2018420003");
        maha4.setNama_Mahasiswa("roy");
        maha4.setAlamat_Asal("jbg");
        maha4.setNomor_Handphone("09333");
        
        ProgramStudi prodi = new ProgramStudi();
        prodi.setId_Prodi(42);
        prodi.setNama_Prodi("infor");
        
        ProgramStudi prodi1 = new ProgramStudi();
        prodi1.setId_Prodi(41);
        prodi1.setNama_Prodi("sipil");

        maha.setProgramStudi(prodi);
        maha2.setProgramStudi(prodi);
        maha3.setProgramStudi(prodi);
        maha4.setProgramStudi(prodi1);
        
        Iterator listmaha = prodi.getIteratorMahasiswa();
        Mahasiswa eachmaha;
        System.out.println("nama prodi : " + prodi.getNama_Prodi());
        int i = 0;
        while(i<prodi.getMahasiswa().size())
        {
          eachmaha = (Mahasiswa) listmaha.next();
            System.out.println(eachmaha.getNama_Mahasiswa()+"-"+eachmaha.getNIM());
            i++;
        }
        System.out.println("=================");
        System.out.println("total mahasiswa : " + prodi.getMahasiswa().size());
        System.out.println();
        System.out.println("nama prodi : " + prodi1.getNama_Prodi());
        Iterator listmaha4 = prodi1.getIteratorMahasiswa();
        Mahasiswa eachmaha4;
        
        while(listmaha4.hasNext())
        {
          eachmaha4 = (Mahasiswa) listmaha4.next();
            System.out.println(eachmaha4.getNama_Mahasiswa()+"-"+eachmaha4.getNIM());
            
        }
        System.out.println("=================");
        System.out.println("total mahasiswa : " + prodi1.getMahasiswa().size());
    }        
}
    
