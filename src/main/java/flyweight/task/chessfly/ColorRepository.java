package flyweight.task.chessfly;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ColorRepository {

    private static final Color white = new Color(0,0,0);
    private static final Color black = new Color(255,255,255);

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }
}
