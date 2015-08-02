import com.diamond.DiamondNamedTriangle;
import com.diamond.DiamondTriangle;
import com.diamond.IsoscelesTriangle;
import com.fizzbuzz.FizzBuzz;
import com.primenumbergenerator.PrimeNumberGenerator;
import com.triangle.AnAsterisk;
import com.triangle.HorizontalLine;
import com.triangle.RightTriangle;
import com.triangle.VerticalLine;

public class Main {
    public static void main(String args[]) {
        Separator separator = new Separator();
        AnAsterisk asterisk = new AnAsterisk();
        HorizontalLine nAsterisk = new HorizontalLine();
        VerticalLine asteriskPerLine = new VerticalLine();
        RightTriangle asteriskRightTriangle = new RightTriangle();
        IsoscelesTriangle asteriskCenteredTriangle = new IsoscelesTriangle();
        DiamondTriangle asteriskDiamondCenteredTriangle = new DiamondTriangle();
        DiamondNamedTriangle asteriskNamedTriangle = new DiamondNamedTriangle();
        FizzBuzz fizzBuzzGenerator = new FizzBuzz();
        PrimeNumberGenerator generator = new PrimeNumberGenerator();
        separator.drawSeparation("prints an asterisk");
        asterisk.printAnAsterisk();
        int number = 8;
        separator.drawSeparation("prints horizontal line of asterisk");
        nAsterisk.printNAsterisk(number);
        separator.drawSeparation("prints vertical line of asterisk");
        asteriskPerLine.printAnAsteriskPerLine(number);
        separator.drawSeparation("prints a right triangle with asterisk in each line in ascending order");
        asteriskRightTriangle.drawRightTriangle(number);
        separator.drawSeparation("prints an Isosceles centered triangle of asterisk");
        number = 3;
        asteriskCenteredTriangle.drawIsoscelesTriangle(number);
        separator.drawSeparation("prints a centered diamond of asterisk");
        asteriskDiamondCenteredTriangle.drawDiamondCenteredTriangle(number);
        separator.drawSeparation("prints a centered diamond of asterisk with the name in the middle name");
        String name = "Bill";
        asteriskNamedTriangle.printNamedTriangle(number,name);
        separator.drawSeparation("FizzBuzz is a simple number game");
        number = 100;
        fizzBuzzGenerator.generateFizzBuzzSeries(number);
        separator.drawSeparation("prime number generator");
        number = 30;
        generator.generatePrimeNumbers(number);
    }
}