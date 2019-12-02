package gpt;

/***********************************************************************
 * Module:  ProgramStudi.java
 * Author:  Jempol
 * Purpose: Defines the Class ProgramStudi
 ***********************************************************************/

/** @pdOid 77733e99-eb1d-4ace-a00d-979bb5d537e2 */
public class ProgramStudi {
   /** @pdOid 5f411c4f-20da-49a5-8662-f12a5a8fc321 */
   private int Id_Prodi;
   /** @pdOid 9d7e83bc-b4fa-43aa-aea3-6274b4ede6c5 */
   private String Nama_Prodi;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=Association_1 coll=java.util.Collection impl=java.util.ArrayList mult=1..* */
   private java.util.Collection<Mahasiswa> mahasiswa;
   
   /**
     * @return  *  @pdOid f9d5543f-f1f0-4aef-865c-ebdd3ad0010e */
   public int getId_Prodi() {
      return Id_Prodi;
   }
   
   /** @param newId_Prodi
    * @pdOid 70efbb14-f888-4803-91f4-a6f6c8ddf646 */
   public void setId_Prodi(int newId_Prodi) {
      Id_Prodi = newId_Prodi;
   }
   
   /**
     * @return  *  @pdOid 8efe2f4d-5c78-4b1e-81d8-57d991a94f9c */
   public String getNama_Prodi() {
      return Nama_Prodi;
   }
   
   /** @param newNama_Prodi
    * @pdOid 667ad615-af58-4789-bb92-fc3f54fb154f */
   public void setNama_Prodi(String newNama_Prodi) {
      Nama_Prodi = newNama_Prodi;
   }
   
   
   /**
     * @return  *  @pdGenerated default getter */
   public java.util.Collection<Mahasiswa> getMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.ArrayList<>();
      return mahasiswa;
   }
   
   /**
     * @return  *  @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMahasiswa() {
      if (mahasiswa == null)
         mahasiswa = new java.util.ArrayList<>();
      return mahasiswa.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMahasiswa */
   public void setMahasiswa(java.util.Collection<Mahasiswa> newMahasiswa) {
      removeAllMahasiswa();
      for (java.util.Iterator iter = newMahasiswa.iterator(); iter.hasNext();)
         addMahasiswa((Mahasiswa)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMahasiswa */
   public void addMahasiswa(Mahasiswa newMahasiswa) {
      if (newMahasiswa == null)
         return;
      if (this.mahasiswa == null)
         this.mahasiswa = new java.util.ArrayList<>();
      if (!this.mahasiswa.contains(newMahasiswa))
      {
         this.mahasiswa.add(newMahasiswa);
         newMahasiswa.setProgramStudi(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMahasiswa */
   public void removeMahasiswa(Mahasiswa oldMahasiswa) {
      if (oldMahasiswa == null)
         return;
      if (this.mahasiswa != null)
         if (this.mahasiswa.contains(oldMahasiswa))
         {
            this.mahasiswa.remove(oldMahasiswa);
            oldMahasiswa.setProgramStudi((ProgramStudi)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMahasiswa() {
      if (mahasiswa != null)
      {
         Mahasiswa oldMahasiswa;
         for (java.util.Iterator iter = getIteratorMahasiswa(); iter.hasNext();)
         {
            oldMahasiswa = (Mahasiswa)iter.next();
            iter.remove();
            oldMahasiswa.setProgramStudi((ProgramStudi)null);
         }
      }
   }

}