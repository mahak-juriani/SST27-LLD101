public class Demo02 {
    public static void main(String[] args) {
        Player p = new Player(new PassthroughDecoder(), new ConsoleRenderer(), new LastFrameCache());
        p.play(new byte[]{1,2,3,4});
    }
}