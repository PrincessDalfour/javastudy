package TransferMajor.homework14.src.com.hao.ui;

import TransferMajor.homework14.src.com.hao.dao.StuDao;
import TransferMajor.homework14.src.com.hao.entity.Student;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.List;

public class Index extends Application {

	// 模糊查询下拉框
	ComboBox<String> com = new ComboBox<>();
	// 文本框
	TextField t1 = new TextField();
	// 确定查询按钮
	Button be = new Button("查询");

	// 上 流式布局
	FlowPane top = new FlowPane(com, t1, be);

	// 中 表格
	TableView<Student> table = new TableView<>();

	TableColumn<Student, Integer> c1 = new TableColumn<>("学号");
	TableColumn<Student, String> c2 = new TableColumn<>("姓名");
	TableColumn<Student, String> c3 = new TableColumn<>("性别");
	TableColumn<Student, Integer> c4 = new TableColumn<>("年龄");
	TableColumn<Student, String> c5 = new TableColumn<>("地址");

	// 按钮
	Button add = new Button("添加");
	Button del = new Button("删除");
	Button up = new Button("修改");
	Button exit = new Button("退出");

	// 下流式布局
	FlowPane button = new FlowPane(add, del, up, exit);

	@Override
	public void start(Stage primaryStage) throws Exception {

		// 设置窗体名
		primaryStage.setTitle("主窗体");
		// 边框布局
		BorderPane border = new BorderPane();

		// 把组件放到边框布局中
		border.setTop(top);// 上
		border.setCenter(table);// 中
		border.setBottom(button);// 下

		// 设置上下两个布局居中
		top.setAlignment(Pos.TOP_CENTER);
		button.setAlignment(Pos.TOP_CENTER);

		// 给模糊查询下拉框赋值
		com.getItems().addAll("学号", "地址");

		com.getSelectionModel().select(1);// 设置默认选择第一个学号

		// 设置表格不可被编辑
		c1.setResizable(false);
		c2.setResizable(false);
		c3.setResizable(false);
		c4.setResizable(false);
		c4.setResizable(false);

		// 给中间的表格添加标题列名
		table.getColumns().addAll(c1, c2, c3, c4, c5);

		// 设置表格数据源
		c1.setCellValueFactory(new PropertyValueFactory<>("sid"));
		c2.setCellValueFactory(new PropertyValueFactory<>("sname"));
		c3.setCellValueFactory(new PropertyValueFactory<>("ssex"));
		c4.setCellValueFactory(new PropertyValueFactory<>("sage"));
		c5.setCellValueFactory(new PropertyValueFactory<>("saddress"));

		ShowTable("stu_name", "");

		// 场景
		Scene sc = new Scene(border, 450, 450);
		// 设置场景
		primaryStage.setScene(sc);
		// 设置显示
		primaryStage.show();

		// 给模糊查询按钮添加事件
		be.setOnAction(all -> {
			// 获取下拉框选中的选项值:字段名
			String col = com.getValue();
			// 判断转换字段为 数据库表字段
			if ("学号".equals(col)) {
				col = "stu_id";
			} else {
				col = "stu_address";
			}
			String value = t1.getText();
			ShowTable(col, value);
		});

		// 给添加按钮添加事件
		add.setOnAction(aa -> {
			try {
				// 打开添加窗体,把本窗体传过去
				new Add(this).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		// 删除按钮事件
		del.setOnAction(d -> {
			// 获取选中行的学生对象
			Student stu = table.getSelectionModel().getSelectedItem();
			if (stu != null) {
				StuDao dao = new StuDao();
				int i = dao.del(stu.getSid());
				if (i > 0) {
					// 弹框
					new Alert(Alert.AlertType.INFORMATION, "删除成功").showAndWait();
					ShowTable("stu_name", "");
				} else {
					new Alert(Alert.AlertType.ERROR, "删除失败").showAndWait();
				}
			} else {
				new Alert(Alert.AlertType.ERROR, "先选择需要删除的行").showAndWait();
			}
		});
		up.setOnAction(u -> {
			// 获取选中行的学生对象
			Student stu = table.getSelectionModel().getSelectedItem();
			if (stu != null) {
				try {
					// 打开修改窗体，并把学生传过去 把本窗体传过去
					new Update(stu, Index.this).start(new Stage());

					ShowTable("stu_name", "");

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				new Alert(Alert.AlertType.ERROR, "先选择需要修改的行").showAndWait();
			}
		});

		// exit退出按钮
		exit.setOnAction(as -> {
			primaryStage.close();
		});
	}


	/**
	 * 给表格添加数据
	 *
	 * @param key   属性
	 * @param value 内容
	 */
	public void ShowTable(String key, String value) {
		// 创建list集合存放数据
		//List<Student> list = new ArrayList<>();
		// 创建StuDao对象
		StuDao dao = new StuDao();
		List<Student> list = dao.all(key, value);// 执行all方法
		// 清空表格数据
		table.getItems().clear();
		// 把list中的数据放到表格中
		table.getItems().addAll(list);
	}
}
