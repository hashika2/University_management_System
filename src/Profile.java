
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        //String idnO = "SE/2016/024";
        try{
           String query="select username,address,s_id,email from all_students where s_id='" + id +"'";
           con= (Connection) new SetConnection().getConnection();
          
           Statement state = con.createStatement();
           rs = state.executeQuery(query);
             System.out.println(rs);
           
             
           
           if(rs.next()){
//                byte[] img =rs.getBytes("profile");
//                ImageIcon image=new ImageIcon(img);
//                Image im =image.getImage();
//                Image myImg=im.getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH);
//                ImageIcon newImage =new ImageIcon(myImg);
//                profile.setIcon(newImage);
                
                name.setText(rs.getString("username"));
                email.setText(rs.getString("email"));
                indexno.setText(rs.getString("s_id"));
                address.setText(rs.getString("address"));
              //prfl=rs.getString("profile");
           }
           else{
               System.out.println("error");
           }
           //new Profile().setImage(id);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no data");
        }
//         JFileChooser chooser =new JFileChooser();
//         chooser.showOpenDialog(null);
//         File f =chooser.getSelectedFile();
//         profile.setIcon(new ImageIcon(prfl));
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
        username = new javax.swing.JLabel();
        indexno = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        indexno.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        indexno.setForeground(new java.awt.Color(51, 255, 255));
        indexno.setText("jLabel2");

        email.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        email.setForeground(new java.awt.Color(51, 255, 255));
        email.setText("jLabel2");

        address.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        address.setForeground(new java.awt.Color(51, 255, 255));
        address.setText("jLabel2");

        name.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(51, 255, 255));
        name.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(show)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(indexno, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(show)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(path))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name)
                        .addGap(34, 34, 34)
                        .addComponent(indexno)
                        .addGap(18, 18, 18)
                        .addComponent(email)
                        .addGap(30, 30, 30)
                        .addComponent(address)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
      filename = f.getAbsolutePath();
      path.setText(filename);
      
      try{
//          File image =new File(filename);
//          FileInputStream fis =new FileInputStream(image);
//          ByteArrayOutputStream bos =new ByteArrayOutputStream();
//          byte[] buf =new byte[1024];
//            for(int readNum; (readNum=fis.read(buf))!= -1;){
//              bos.write(buf,0,readNum);
//          }
//            photo =bos.toByteArray();
        Connection connection = null;
        PreparedStatement statement = null;
        FileInputStream inputStream = null;
        File image = new File("C:/Users/Click/Pictures/FB_IMG_1509886395445.jpg");
            inputStream = new FileInputStream(image);
 
            statement = connection.prepareStatement("insert into all_students(image)" + "values(?)");
            statement.setString(1, "Honda Car");
            statement.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));
 
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "save");
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
    private javax.swing.JLabel address;
    private javax.swing.JLabel email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel indexno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel path;
    private javax.swing.JLabel profile;
    private javax.swing.JButton show;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
