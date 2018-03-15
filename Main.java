import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pkgfinal.project.cit285.CertificationExam;


public class Main extends Application {

  final Label message = new Label("");
  static String url = "jdbc:mysql://localhost:3306/boolauniversity?useSSL=false";
  static String user = "";
  static String password = "";
  static  TextField name = new TextField ();  
  static final PasswordField pb = new PasswordField();

  @Override
  public void start(Stage stage) throws SQLException {
    Group root = new Group();
    Scene scene = new Scene(root, 390, 200);
    stage.setScene(scene);
    Label label3 = new Label();
    label3.setText("Welcome,you have 10 minutes\n"
            + " to answer 20 questions, good luck!");
 
    stage.setTitle("User Log In");
    
    Label label = new Label("Name : ");
    Label label2 = new Label("Password : ");
    
    name.setPromptText("Enter your full name");
    
    Button btn = new Button("Enter");
    btn.setOnAction((ActionEvent e) -> { 
     try{
          info();
          CertificationExam.enter();
          name.clear();
          pb.clear();
           }catch (SQLException ex) {        
        }        
  });
    

    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    grid.setVgap(5);
    grid.setHgap(5);
    
     grid.add(label, 0, 0);
     grid.add(name, 2, 0);
     grid.add(label2, 0, 2);
     grid.add(pb, 2, 2);
     grid.add(message, 1, 3);
     grid.add(btn, 3, 2);
     grid.add(label3, 2, 4);
    
    scene.setRoot(grid);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
  
  public static void info()throws SQLException {
   PreparedStatement  mystmt = null;
  Connection connection = DriverManager.getConnection(url, user, password);
      
      try {
      System.out.println("Database connected");
      String sql = "INSERT INTO boolauniversity.info(name ,id)"+ "VALUES(?, ?)";
      connection.prepareStatement(sql);
      mystmt.setString(1, name.getText());
      mystmt.setString(2, pb.getText());
  }
    catch(Exception e) {
  
      } finally {
          connection.close();
      }  
  }

}
