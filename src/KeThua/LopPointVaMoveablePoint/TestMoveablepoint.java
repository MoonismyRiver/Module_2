package KeThua.LopPointVaMoveablePoint;

public class TestMoveablepoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2.0f, 1.3f, 2.0f, 1.5f);
        moveablePoint.setArrSpeed();
        System.out.println(moveablePoint);
    }
}
