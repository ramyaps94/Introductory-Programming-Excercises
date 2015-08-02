public class Main {
    public static void main(String args[]) {
        PrintAnAsterisk asterisk = new PrintAnAsterisk();
        HorizontalLine nAsterisk = new HorizontalLine();
        VerticalLine asteriskPerLine = new VerticalLine();
        asterisk.printAnAsterisk();
        int number = 8;
        nAsterisk.printNAsterisk(number);
        asteriskPerLine.printAnAsteriskPerLine(number);
    }
}