package gpt;

/***********************************************************************
 * Module:  Sekolah.java
 * Author:  Jempol
 * Purpose: Defines the Class Sekolah
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/** @pdOid 3388b2b1-5661-487a-8518-c10a940592e7 */
public class Sekolah {
   /** @pdOid 1dbd884e-d4c0-40f1-ad5b-1ce2aa1248a7 */
   private int Id_Sekolah;
   /** @pdOid b0104dac-d0e1-46d3-9149-71f1fdfbe088 */
   private String Nama_Sekolah;
   
   /** @pdRoleInfo migr=no name=Kepala_Sekolah assc=Association_1 mult=1..1 */
   private Kepala_Sekolah kepala_Sekolah;

    public Kepala_Sekolah getKepala_Sekolah() {
        return kepala_Sekolah;
    }

    public void setKepala_Sekolah(Kepala_Sekolah kepala_Sekolah) {
        this.kepala_Sekolah = kepala_Sekolah;
    }
    public void insertDb() throws Exception{
       String query = "insert into sekolah (Id_Sekolah, Nama_Sekolah, Id_Kepsek) values (?,?,?)";
       PreparedStatement statement = SQL_SI.getConnection().prepareStatement(query);
       statement.setInt(1, getId_Sekolah());
       statement.setString(2, getNama_Sekolah());
       
       String query2 = "select * from kepala_sekolah limit 1";
       PreparedStatement statement2 = SQL_SI.getConnection().prepareStatement(query2);
       ResultSet rs = statement2.executeQuery();
       
       if (rs.next())
           statement.setInt(3, rs.getInt("Id_Kepsek"));
       
       statement.execute();
       statement.close();
       
   }
   public ArrayList viewAll() throws Exception{
       ArrayList list = new ArrayList<>();
       String query = "select Id_Sekolah, Nama_Sekolah from sekolah";
       PreparedStatement statement = SQL_SI.getConnection().prepareStatement(query);
       ResultSet rs = statement.executeQuery();
       while(rs.next()){
           Sekolah skl = new Sekolah();
           skl.setId_Sekolah(rs.getInt("Id_Sekolah"));
           skl.setNama_Sekolah(rs.getString("Nama_Sekolah"));
           list.add(skl);
       }
       
       statement.close();
       rs.close();
       return list;
   }
   
   /** @pdOid 092c6238-0299-40d0-b14c-27f94e0788e7 */
   public int getId_Sekolah() {
      return Id_Sekolah;
   }
   
   /** @param newId_Sekolah
    * @pdOid 20a9e278-103e-4795-9eca-0ec6eead6219 */
   public void setId_Sekolah(int newId_Sekolah) {
      Id_Sekolah = newId_Sekolah;
   }
   
   /** @pdOid 55882bfc-cd6a-4a37-acfb-88bc4b3ec914 */
   public String getNama_Sekolah() {
      return Nama_Sekolah;
   }
   
   /** @param newNama_Sekolah
    * @pdOid e01b6346-497b-4c3f-8ee2-2bfd1c628ae4 */
   public void setNama_Sekolah(String newNama_Sekolah) {
      Nama_Sekolah = newNama_Sekolah;
   }

}