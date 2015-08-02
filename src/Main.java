public class Main {
    public static void main(String args[]) {
        Separator separator = new Separator();
        AnAsterisk asterisk = new AnAsterisk();
        HorizontalLine nAsterisk = new HorizontalLine();
        VerticalLine asteriskPerLine = new VerticalLine();
        RightTriangle asteriskTriangle = new RightTriangle();
        separator.drawSeparation("prints an asterisk");
        asterisk.printAnAsterisk();
        int number = 8;
        separator.drawSeparation("prints horizontal line of asterisk");
        nAsterisk.printNAsterisk(number);
        separator.drawSeparation("prints vertical line of asterisk");
        asteriskPerLine.printAnAsteriskPerLine(number);
        separator.drawSeparation("prints a right triangle with asterisk in each line in ascending order");
        asteriskTriangle.drawRightTriangle(number);
    }
}