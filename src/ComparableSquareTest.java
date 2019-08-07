import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare();
        squares[1] = new ComparableSquare(9.2);
        squares[2] = new ComparableSquare(5.7, "blue", false);

        System.out.println("Pre-sorted : ");
        for (ComparableSquare square : squares
        ) {
            System.out.println(square);
        }
        Arrays.sort(squares);

        System.out.println("After-sorted : ");
        for (ComparableSquare square : squares) {
            System.out.println(square);
        }
    }
}
