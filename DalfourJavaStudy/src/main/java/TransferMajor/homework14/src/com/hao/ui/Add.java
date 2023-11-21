package TransferMajor.homework14.src.com.hao.ui;

import TransferMajor.homework14.src.com.hao.dao.AddrDao;
import TransferMajor.homework14.src.com.hao.dao.StuDao;
import TransferMajor.homework14.src.com.hao.entity.Student;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.List;

public class Add extends Application {

	// 姓名
	Label name = new Label("姓名:");
	TextField tname = new TextField();
	// 性别
	Label lsex = new Label("性别:");
	RadioButton rboy = new RadioButton("男");
	RadioButton rgirl = new RadioButton("女");
	// 分组
	ToggleGroup tg = new ToggleGroup();
	Label lage = new Label("年龄:");
	TextField tage = new TextField();
	// 地址
	Label laddress = new Label("地址:");
	ComboBox<String> com = new ComboBox<>();
	// 按钮
	Button bok = new Button("确定");
	Button bno = new Button("取消");
	private Index index;
	private ObservableList<String> addrItems = FXCollections.observableArrayList();
	// 写一个有参构造，接收Index参数
	public Add(Index index) {
		this.index = index;
	}

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// 标题
		primaryStage.setTitle("添加学生");
		// 布局
		GridPane gp = new GridPane();
		// 设置行距
		gp.setVgap(5);
		// 布局 居中
		gp.setAlignment(Pos.CENTER);

		// 第一行：姓名
		gp.add(name, 0, 0);
		gp.add(tname, 1, 0);

		// 第二行：性别
		// 单选按钮分组
		rboy.setToggleGroup(tg);
		rgirl.setToggleGroup(tg);
		gp.add(lsex, 0, 1);
		gp.add(rboy, 1, 1);
		gp.add(rgirl, 2, 1);
		// 设置默认选中男
		rboy.setSelected(true);

		gp.add(lage, 0, 2);
		gp.add(tage, 1, 2);

		// ：地址
		gp.add(laddress, 0, 3);
		gp.add(com, 1, 3);
		// 给下拉框添加元素
		AddrDao ad = new AddrDao();
		List<String> list = ad.all();

		com.getItems().addAll(list);//初始化列表项目

		com.getSelectionModel().select(1);//默认选择第1项

		//com.getItems().addAll("长沙", "北京", "深圳", "上海", "杭州", "广州");
		// 设置选中第一个
		//com.setValue("长沙");
		gp.add(bok, 0, 4);
		gp.add(bno, 1, 4);
		// 场景
		Scene sc = new Scene(gp, 400, 400);
		// 设置场景
		primaryStage.setScene(sc);
		// 显示
		primaryStage.show();
		// 给确定按钮添加事件
		bok.setOnAction(ok -> {
			// 获取窗体控件的值
			// 姓名
			String sname = tname.getText();
			// 性别
			String ssex = "男";
			// 判断单选按钮（女）是否被选中
			if (rgirl.isSelected()) {
				ssex = "女";
			}
			// 年龄
			String age = tage.getText();
			int sage = Integer.valueOf(age);
			// 地址
			String saddress = com.getValue();

			// 把控件的值 封装为学生对象
			Student stu = new Student(sname, ssex, sage, saddress);

			// 实例化一个学生dao对象
			StuDao dao = new StuDao();
			// 调用添加学生的方法
			int i = dao.add(stu);
			// 判断添加是否成功，大于0说明成功
			if (i > 0) {
				// 弹框
				new Alert(Alert.AlertType.INFORMATION, "添加成功").showAndWait();
				// 刷新主窗体数据，调用主窗体中的绑定数据方法进行更新数据
				index.ShowTable("stu_name", "");
				// 关闭本窗体
				primaryStage.close();
//				a.hide();//隐藏

			} else {
				new Alert(Alert.AlertType.ERROR, "添加失败").showAndWait();
			}
		});
		bno.setOnAction(a -> {
			primaryStage.close();
		});
	}
}
