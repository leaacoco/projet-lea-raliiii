
public class Chien extends Animal implements Bruit {
	@Override
	public void seDeplacer(int x, int y) {
		super.seDeplacer(x,y);
		System.out.println("Je bouge, Woaf woaf");
	}
	public void faireDuBruit(){
		System.out.println("WOUUUUF"};
}
