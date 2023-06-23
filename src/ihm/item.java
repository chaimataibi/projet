
package ihm;


public class item {
    private String idm;
     private String nom;
     private String pathe;
      private byte [] lbl_img;
      public item(String idm,String nom,String path, byte[] file){
      this.idm=idm;
      this.nom=nom;
      this.pathe=path;
      this.lbl_img=file;
      
      }
     
       public String getId(){return idm;}
        public String getnom(){return nom;}
         public String getpath(){return pathe;}
          public byte[] getimage(){return lbl_img;}
}
