package gpt;

/***********************************************************************
 * Module:  Kepala_Sekolah.java
 * Author:  Jempol
 * Purpose: Defines the Class Kepala_Sekolah
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/** @pdOid 45ed401b-186d-4a76-814f-cf29e61a1374 */
public class Kepala_Sekolah {
   /** @pdOid 1e6f51b7-43e9-4658-bbbb-6328c8af8e15 */
   private int Id_Kepsek;
   /** @pdOid a7d6b910-223b-464b-affe-14219570fc83 */
   private String Nama_Kepsek;
   
   /** @pdRoleInfo migr=no name=Sekolah assc=Association_1 coll=java.util.Collection mult=1..1 side=A */
   private Sekolah sekolah;
   
    public Sekolah getSekolah() {
        return sekolah;
    }

    public void setSekolah(Sekolah sekolah) {
        this.sekolah = sekolah;
    }
    
    public void insertDb() throws Exception{
       String query = "insert into kepala_sekolah (Id_Kepsek, Nama_Kepsek) values (?,?)";
       PreparedStatement statement = SQL_SI.getConnection().prepareStatement(query);
       statement.setInt(1, getId_Kepsek());
       statement.setString(2, getNama_Kepsek());
       
       statement.execute();
       statement.close();
       
   }
   public ArrayList viewAll() throws Exception{
       ArrayList list = new ArrayList<>();
       String query = "select * from Kepala_Sekolah where Nama_Kepsek != 'default'";
       PreparedStatement statement = SQL_SI.getConnection().prepareStatement(query);
       ResultSet rs = statement.executeQuery();
       while(rs.next()){
           Kepala_Sekolah kepsek = new Kepala_Sekolah();
           kepsek.setId_Kepsek(rs.getInt("Id_Kepsek"));
           kepsek.setNama_Kepsek(rs.getString("Nama_Kepsek"));
           list.add(kepsek);
       }
       
       statement.close();
       rs.close();
       return list;
   }
   
   /** @pdOid f74f09c9-54f5-410f-b97b-37f2b4e49ae9 */
   public int getId_Kepsek() {
      return Id_Kepsek;
   }
   
   /** @param newId_Kepsek
    * @pdOid 1025147b-f697-41eb-b64f-c74fb2000328 */
   public void setId_Kepsek(int newId_Kepsek) {
      Id_Kepsek = newId_Kepsek;
   }
   
   /** @pdOid 4deebf40-e11b-4aed-8b5d-680df057e21f */
   public String getNama_Kepsek() {
      return Nama_Kepsek;
   }
   
   /** @param newNama_Kepsek
    * @pdOid 9d58edc3-0100-46fd-8b6d-8a80f0ac3018 */
   public void setNama_Kepsek(String newNama_Kepsek) {
      Nama_Kepsek = newNama_Kepsek;
   }

}