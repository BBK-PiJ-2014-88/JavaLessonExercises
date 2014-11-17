public class Guitar2{
	MusicalInstrument guitarPlay = new MusicalInstrument();
	WoodenObject guitarWood = new WoodenObject();

	public static void main(String[] args){
		Guitar2 Ibanez = new Guitar2();
		Ibanez.guitarPlay.play();
		Ibanez.guitarWood.burn();
	}
}