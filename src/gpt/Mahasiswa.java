package gpt;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  Jempol
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

import java.util.*;

/** @pdOid 2f417d7b-cd66-4207-857f-554a9cefd7ca */
public class Mahasiswa {
   /** @pdOid 16bd1bdc-00bb-4dbc-a0c9-5fe7bc28572c */
   private String NIM;
   /** @pdOid 9497529a-a163-40bb-b4cc-b92bbd5d9ed2 */
   private String Nama_Mahasiswa;
   /** @pdOid f405d16c-e240-422e-b97a-ce13755c7fff */
   private String Alamat_Asal;
   /** @pdOid 86bbebce-febc-48ea-9b62-9a4127b13684 */
   private String Nomor_Handphone;
   
   /** @pdRoleInfo migr=no name=ProgramStudi assc=Association_1 coll=java.util.Collection mult=1..1 side=A */
   private ProgramStudi programStudi;
   
   /** @pdOid 46b00124-75ba-4282-b374-8c8211d3d5b3 */
   public String getNIM() {
      return NIM;
   }
   
   /** @param newNIM
    * @pdOid 769ba5d7-abc1-49f7-ae5a-536d5e4143fe */
   public void setNIM(String newNIM) {
      NIM = newNIM;
   }
   
   /** @pdOid 9c971796-c6ca-41b4-8147-a38b70ad6492 */
   public String getNama_Mahasiswa() {
      return Nama_Mahasiswa;
   }
   
   /** @param newNama_Mahasiswa
    * @pdOid a008c5ec-f8dd-46c9-90af-980e9c78b167 */
   public void setNama_Mahasiswa(String newNama_Mahasiswa) {
      Nama_Mahasiswa = newNama_Mahasiswa;
   }
   
   /** @pdOid d3e1e358-6189-446e-bd63-2a732002aa41 */
   public String getAlamat_Asal() {
      return Alamat_Asal;
   }
   
   /** @param newAlamat_Asal
    * @pdOid abd46105-3af3-4692-83e4-9e17196ca1f2 */
   public void setAlamat_Asal(String newAlamat_Asal) {
      Alamat_Asal = newAlamat_Asal;
   }
   
   /** @pdOid 84172af7-1f6f-47ee-8ee0-5fa4821086a4 */
   public String getNomor_Handphone() {
      return Nomor_Handphone;
   }
   
   /** @param newNomor_Handphone
    * @pdOid 13d48f32-bc99-482d-9675-358e431f082c */
   public void setNomor_Handphone(String newNomor_Handphone) {
      Nomor_Handphone = newNomor_Handphone;
   }
   
   
   /** @pdGenerated default parent getter */
   public ProgramStudi getProgramStudi() {
      return programStudi;
   }
   
   /** @pdGenerated default parent setter
     * @param newProgramStudi */
   public void setProgramStudi(ProgramStudi newProgramStudi) {
      if (this.programStudi == null || !this.programStudi.equals(newProgramStudi))
      {
         if (this.programStudi != null)
         {
            ProgramStudi oldProgramStudi = this.programStudi;
            this.programStudi = null;
            oldProgramStudi.removeMahasiswa(this);
         }
         if (newProgramStudi != null)
         {
            this.programStudi = newProgramStudi;
            this.programStudi.addMahasiswa(this);
         }
      }
   }

}