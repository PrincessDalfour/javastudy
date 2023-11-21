package DesignPattern.damn05;

public class Summer implements AbstractSkinFactory{
	@Override
	public Button createButton() {
		return new BlueButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new BlueComboBox();
	}

	@Override
	public TextBox createTextBox() {
		return new BlueTextBox();
	}
}
