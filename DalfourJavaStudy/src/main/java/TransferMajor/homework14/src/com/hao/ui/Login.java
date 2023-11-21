package TransferMajor.homework14.src.com.hao.ui;

import TransferMajor.homework14.src.com.hao.dao.UserDao;
import TransferMajor.homework14.src.com.hao.entity.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Login extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {


		Label l_name = new Label("名字：");
		l_name.setFont(new Font(20));//字体大小
		l_name.setTooltip(new Tooltip("请输入名字"));
		Label l_pswd = new Label("密码：");
		l_pswd.setTooltip(new Tooltip("请输入密码"));
		l_pswd.setFont(new Font(20));

		TextField t_name = new TextField();

		PasswordField p_pswd = new PasswordField();

		Button login = new Button("登录");
		Button clear = new Button("清除");

		GridPane gr = new GridPane();

		gr.setStyle("-fx-background-color: #efead0");
		gr.add(l_name, 0, 0);
		gr.add(t_name, 1, 0);
		gr.add(l_pswd, 0, 1);
		gr.add(p_pswd, 1, 1);
		gr.add(clear, 0, 2);
		gr.add(login, 1, 2);

		gr.setAlignment(Pos.CENTER);
		gr.setHgap(10);//设置水平间距
		gr.setVgap(17);//设置垂直间距
		GridPane.setMargin(login, new Insets(0, 0, 0, 120));


		//清除事件
		clear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				t_name.setText("");
				p_pswd.setText("");//变空或者p.clear
			}
		});

		//登录事件
		login.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				String name = t_name.getText();
				String pswd = p_pswd.getText();

				UserDao dao = new UserDao();
				User us = dao.find(name, pswd);

				if (us != null) {//
					try {
						// 打开添加窗体,把本窗体传过去
						new SimpleMenu().start(new Stage());
					} catch (Exception e) {
						e.printStackTrace();
					}

					primaryStage.close();
				} else {
					new Alert(Alert.AlertType.ERROR, "登录失败！").showAndWait();
				}

			}

		});


		Scene scene = new Scene(gr);


		primaryStage.setScene(scene);
		primaryStage.setTitle("登录页面");
		primaryStage.setWidth(500);
		primaryStage.setHeight(300);
		primaryStage.setResizable(false); //登录窗口的大小不允许改变
		primaryStage.show();


	}


}
 
