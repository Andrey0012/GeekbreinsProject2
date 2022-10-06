package Task5;
// TODO разделяй пустыми строками логику, так более читабельно
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
// TODO тоже пустая строка
public class CalculatorThree {
  JPanel windowContent;
  JTextField displayField;
  // Создаём кнопки, используя конструктор класса JButton, который принимает текст кнопки в качестве
  // параметра

  // TODO строка
  // В конструкторе создаются все компоненты и добавляются на фрейм с помощью комбинации
  // Borderlayout и Gridlayout
  //TODO вот его задачи
  CalculatorThree() {
    windowContent = new JPanel(); // создаем панель
    displayField = new JTextField(50); // создаем и отображаем поле
  }

  // TODO конструктор этим не должен заниматься
  public void initGraphicWindow() {
    // Задаём схему для этой панели
    // TODO не используй такие имена, здесь что то типа mainContainer или что то такое
    BorderLayout bl = new BorderLayout(); // Установить менеджер расположения для панели
    windowContent.setLayout(bl);
    displayField.setHorizontalAlignment(JTextField.RIGHT); // Выравниваем по правому краю
    windowContent.add("North", displayField); // Добавляем поле его в Северную область окна

    // Помещаем панель p2 в западную область окна
    // Создаём фрейм и задаём его основную панель
    // TODO имена
    JFrame frame = new JFrame("Калькулятор");
    frame.setContentPane(windowContent);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // делаем размер окна достаточным для того, чтобы вместить все компоненты
    frame.pack();
    // Наконец, отображаем окно
    frame.setVisible(true);
    // Прикрепляем класс CalculatorEngine к кнопкам
    CalculatorEngine calcEngine = new CalculatorEngine(this);
    // TODO имена
    JPanel p1 = initNumberButton(calcEngine); // TODO что это такое?????
    JPanel p2 = initSymbolButtons(calcEngine);

    windowContent.add("Center", p1);
    windowContent.add("West", p2);
  }

  private JPanel initSymbolButtons(CalculatorEngine engine) {
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivision = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDegree = new JButton("степень");
    // создаем вторую панель с GridLayout
    // TODO имена,
    JPanel p2 = new JPanel();
    GridLayout gl2 = new GridLayout(5, 1);
    p2.setLayout(gl2);
    // Добавляем кнопки на панель p2
    p2.add(buttonPlus);
    p2.add(buttonMinus);
    p2.add(buttonDivision);
    p2.add(buttonMultiply);
    p2.add(buttonDegree);

    buttonPlus.addActionListener(engine);
    buttonMinus.addActionListener(engine);
    buttonDivision.addActionListener(engine);
    buttonMultiply.addActionListener(engine);
    buttonDegree.addActionListener(engine);

    return p2;
  }

  private JPanel initNumberButton(CalculatorEngine engine) {
    // Создаём панель с GridLayout которая содержит 12 кнопок - 10 кнопок с числами и кнопки с
    // точкой и знаком равно
    JPanel p1 = new JPanel();
    // TODO имена, примерно buttonContainer
    // TODO такие вещи лучше выносить в метод
    GridLayout gl = new GridLayout(4, 3);
    p1.setLayout(gl);
    // Добавляем кнопки на панель p1
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    p1.add(button1);
    p1.add(button2);
    p1.add(button3);
    p1.add(button4);
    p1.add(button5);
    p1.add(button6);
    p1.add(button7);
    p1.add(button8);
    p1.add(button9);
    p1.add(button0);

    p1.add(buttonPoint);
    p1.add(buttonEqual);

    button0.addActionListener(engine);
    button1.addActionListener(engine);
    button2.addActionListener(engine);
    button3.addActionListener(engine);
    button4.addActionListener(engine);
    button5.addActionListener(engine);
    button6.addActionListener(engine);
    button7.addActionListener(engine);
    button8.addActionListener(engine);
    button9.addActionListener(engine);

    buttonPoint.addActionListener(engine);
    buttonEqual.addActionListener(engine);
    // Помещаем панель p1 в центральную область окна
    return p1;
  }
}
