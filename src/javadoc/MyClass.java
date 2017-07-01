package javadoc;

/**
 * @author Tatyana
 * @version 1.0
 * on 01.07.2017.
 */
public class MyClass {
    /**
     * <p>Проверяет, допустимый ли ход.</p>
     * <p>Например, чтобы задать ход e2-e4, напишите isValidMove(5,2,5,4);
     * Чтобы записать рокировку, укажите, откуда и куда ходит король.
     * Например, для короткой рокировки чёрных запишите isValidMove(5,8,7,8);</p>
     *
     * @param fromCol Вертикаль, на которой находится фигура (1=a, 8=h)
     * @param fromRow Горизонталь, на которой находится фигура (1...8)
     * @param toCol   Вертикаль клетки, на которую выполняется ход (1=a, 8=h)
     * @param toRow   Горизонталь клетки, на которую выполняется ход (1...8)
     * @return true, если ход допустим, и false, если недопустим
     */
    public boolean isValidMove(int fromCol, int fromRow, int toCol, int toRow) {
        return true;
    }
}
