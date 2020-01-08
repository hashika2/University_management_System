
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashika
 */
public class Profile extends javax.swing.JFrame {

    java.sql.Connection con=null;
    PreparedStatement pst=null;
    Statement state = null;
    ResultSet rs=null;
    //String url="jdbc:mysql://localhost:3306/se_students";
    String prfl=null;
    public Profile() {
        initComponents();
    }
    public void setImage(String id){
       
        try{
           String query="select username,id,profile from login where id='" + id +"'";
           con= (Connection) new SetConnection().getConnection();
           System.out.println("connected");
          
           Statement state = con.createStatement();
           rs = state.executeQuery(query);
             System.out.println(rs);
           
         
           
           if(rs.next()){
                byte[] img =rs.getBytes("profile");
                ImageIcon image=new ImageIcon(img);
                Image im =image.getImage();
                Image myImg=im.getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage =new ImageIcon(myImg);
                profile.setIcon(newImage);
                
              
              //prfl=rs.getString("profile");
           }
           else{
               System.out.println("error");
           }
           //new Profile().setImage(id);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no data");
        }
         JFileChooser chooser =new JFileChooser();
         chooser.showOpenDialog(null);
         File f =chooser.getSelectedFile();
         profile.setIcon(new ImageIcon(prfl));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        path = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Profile");

        jButton1.setText("change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        path.setText("jLabel2");

        show.setText("jButton2");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(show)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(show)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(path)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      JFileChooser chooser =new JFileChooser();
      chooser.showOpenDialog(null);
      File f =chooser.getSelectedFile();
      if(f==null){
          profile.setIcon(new ImageIcon(prfl));
      }
      else{
          profile.setIcon(new ImageIcon(f.toString()));
      }
      filename =f.getAbsolutePath();
      path.setText(filename);
      
      try{
          File image =new File(filename);
          FileInputStream fis =new FileInputStream(image);
          ByteArrayOutputStream bos =new ByteArrayOutputStream();
          byte[] buf =new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!= -1;){
              bos.write(buf,0,readNum);
          }
            photo =bos.toByteArray();
      }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
         try{
           String query="select username,id,profile from login where id='"+id.getText()+"'";
           con= (Connection) new SetConnection().getConnection();
           System.out.println("connected");
          
           Statement state = con.createStatement();
           rs = state.executeQuery(query);
             System.out.println(rs);
           
         
           
           if(rs.next()){
                String img =rs.getString("profile");
                ImageIcon image=new ImageIcon(img);
                Image im =image.getImage();
                Image myImg=im.getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage =new ImageIcon(myImg);
                profile.setIcon(newImage);
                
              
              //prfl=rs.getString("profile");
           }
           else{
               System.out.println("error");
           }
           //new Profile().setImage(id);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no data");
        }
    }//GEN-LAST:event_showActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Profile().setVisible(true);
               // new Profile().setImage("SE/2016/024");
            }
        });
    }
     byte[] photo =null;
     String filename =null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel path;
    private javax.swing.JLabel profile;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
