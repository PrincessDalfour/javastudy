package DesignPattern.damn05;

public class test {
    public static void main(String[] args) {
        Button button;
        ComboBox comboBox;
        TextBox textBox;
        AbstractSkinFactory factory = new Summer();
        button = factory.createButton();
        comboBox = factory.createComboBox();
        textBox = factory.createTextBox();
        button.showColor();
        comboBox.showComboBox();
        textBox.showTextBox();
    }
}
