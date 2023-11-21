package TransferMajor.homework11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class cube extends Application {
	@Override
	public void start(Stage stage) {

		//设置场景和舞台
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400, Color.WHITE);
		stage.setTitle("JavaFX Cube Example");
		stage.setScene(scene);

		//创建长方体
		Box cube = new Box(100, 100, 100);
		cube.setTranslateX(150);
		cube.setTranslateY(150);
		cube.setTranslateZ(200);

		//将长方体添加到根组中并显示舞台
		root.getChildren().add(cube);
		stage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
