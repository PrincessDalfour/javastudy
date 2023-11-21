package TransferMajor.homework14.src.com.hao.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SimpleMenu extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {

		AnchorPane an = new AnchorPane();
		//创建menubar
		MenuBar menuBar = new MenuBar();
		Menu menu1 = new Menu("学生维护");
		Menu menu2 = new Menu("用户维护");
		Menu menu3 = new Menu("住宿登记");

		MenuItem item1 = new MenuItem("用户列表");
		MenuItem item2 = new MenuItem("用户列表");
		//点击事件
		item1.setOnAction(e -> {
			try {
				// 打开添加窗体,把本窗体传过去
				new Index().start(new Stage());
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		});
		item2.setOnAction(e -> {
			try {
				// 打开添加窗体,把本窗体传过去
				new Index().start(new Stage());
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		});

		menu1.getItems().addAll(item1, item2);

		//绑定menu
		menuBar.getMenus().addAll(menu1, menu2, menu3);

		an.getChildren().add(menuBar);
		//an.setStyle("-fx-background-color: deepskyblue");
		Scene s = new Scene(an);
		primaryStage.setScene(s);
		primaryStage.setTitle("主界面");
		primaryStage.setWidth(500);
		primaryStage.setHeight(300);
		//设置窗口不可拉伸
		primaryStage.setResizable(false);
		primaryStage.show();
		menuBar.setPrefWidth(primaryStage.getWidth());


	}

}


 