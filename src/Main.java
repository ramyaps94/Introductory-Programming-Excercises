public class Main {
    public static void main(String args[]) {
        PrintAnAsterisk asterisk = new PrintAnAsterisk();
        PrintNAsterisk nAsterisk = new PrintNAsterisk();
        PrintAnAsteriskInEachLine asteriskPerLine = new PrintAnAsteriskInEachLine();
        asterisk.printAnAsterisk();
        int number = 8;
        nAsterisk.printNAsterisk(number);
        asteriskPerLine.printAnAsteriskPerLine(number);
    }
}