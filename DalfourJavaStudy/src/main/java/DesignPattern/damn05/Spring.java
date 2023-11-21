package DesignPattern.damn05;

public class Spring implements AbstractSkinFactory{
	@Override
	public Button createButton() {
		return new GreenButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new GreenComboBox();
	}

	@Override
	public TextBox createTextBox() {
		return new GreenTextBox();
	}
}
